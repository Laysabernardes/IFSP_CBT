var express = require('express');
var router = express.Router();
const db = require("../services/db");

db.connectToDB((err) => {
    //Definindo as rotas pelo Express
    if(err) console.log(err)

    router.get("/list", async (req, res) => {
        const results = await db.findDocuments()
        res.send(results);
    });

    router.post("/add", async (req, res) => {
        const results = await db.insertDocuments(req.body)
        res.send(results);
    });

    router.patch("/update", (req, res) => {
        res.send();
    });

    router.delete("/delete", (req, res) => {
        res.send();
    });
})

module.exports = router
