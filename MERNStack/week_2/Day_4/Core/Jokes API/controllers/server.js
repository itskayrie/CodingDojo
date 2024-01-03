const express = require ("express");
const app = express ();
require("dotenv").config();
const port = process.env.port;
// grab config  
require("./config/mongoose.config");

require('./routes/joke.routes')(app);

//MIDDLEWARE
app.use(express.json(),express.urlencoded({extended: true }));

app.listen(port,()=>{console.log("listening to port" + port );});