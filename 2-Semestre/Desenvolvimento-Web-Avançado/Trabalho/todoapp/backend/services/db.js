const MongoClient = require('mongodb').MongoClient;
const assert = require('assert');
// Connection URL
const url = 'mongodb://localhost:27017';

// Database Name
const dbName = 'to-do-db';
const client = new MongoClient(url);

var _db;
function connectToDB(callback){
    client.connect(function (err){
        console.log('Connected successfully to server');
        _db = client.db(dbName)
        callback(err)

    });
}

//find all documents
const findDocuments = async () => {
    const collection = _db.collection('to-do-collection');
    try {
        const results = await collection.find({}).toArray();
        return results
    } catch(error){
        throw new Error(error)
    } 
};

const insertDocuments = async (document)=>{
    const collection = _db.collection('to-do-collection');
    try {
        const results = await collection.insertOne(document);
        return results 
    } catch(error){
        throw new Error(error)
    } 
};

const updateDocument = async (document) => {
    const collection = _db.collection('to-do-collection');
    try {
        const results= await collection.updateOne({ _id: document._id} , {$set: document});return results
    }catch(error){
        throw new Error(error)
    }
};

const removeDocument = async(document)=>{
    const collection = _db.collection('to-do-collection');

    try{
        const results = await collection.deleteOne({_id:document._id});
        return results
    }
    catch(error){
        throw new ErrorEvent(error)
    }
};

module.exports={
    connectToDB,
    findDocuments,
    insertDocuments,
    updateDocument,
    removeDocument
}