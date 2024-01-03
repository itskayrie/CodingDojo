// import the mongoos 
const mongoose= require ("mongoose");

// The model 
const JokesSchema = new mongoose.Schema({
    setup: {
        type: String,
        required:[true,"{path} is required !"],
        minLength:[3,"{path} must be at least 3 caracters"]
    },
    punchline: {
        type: String,
        required:[true,"{path} is required !"],
        minLength:[3,"{path} must be at least 3 caracters"]
    }
    
}, {timestamps:true})

const Joke = mongoose.model("Joke",JokesSchema )

module.exports=Joke;