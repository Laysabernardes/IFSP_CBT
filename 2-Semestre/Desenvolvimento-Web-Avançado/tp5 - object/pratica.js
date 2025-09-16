const chave = "author";

const database = {
    tables: {
        [chave]: {
            columns: {}
        }
    }
}

const tabela = {
    id: 'number',
    name: 'string',
    age: 'number',
    city: 'string',
    state: 'string',
    country: 'string'
};

for (const columnName of Object.keys(tabela)) {
    database.tables[chave].columns[columnName] = tabela[columnName];
}

console.log(JSON.stringify(database, undefined, " "));