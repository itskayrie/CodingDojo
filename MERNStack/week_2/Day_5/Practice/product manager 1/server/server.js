const express = require ("express");
const app = express ();
require("dotenv").config();
const port = process.env.port;

// grab config  
require("./server/config/mongoose.config");

//grab the routes 
require("./server/routes/product.routes")(app);

//middleware 
app.use(express.json(),express.urlencoded({extended: true }));

app.listen(port,()=>{console.log("listening to port" + port );});