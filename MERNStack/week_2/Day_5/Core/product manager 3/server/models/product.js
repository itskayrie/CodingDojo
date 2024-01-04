const mongoose= require ("mongoose");

// The model 
const ProductSchema = new mongoose.Schema({
    title: {
        type: String,
        required:[true,"Title is required !"],
        minLength:[3,"{Title must be at least 3 caracters"]
    },
    price: {
        type: Number,
        required:[true,"Price is required !"],
        minLength:[3,"Price must be at least 3 caracters"]
    },
    description:{
        type:String,
        required:[true,"Description is required !"],
        minLength:[3,"Description must be at least 3 caracters"]
    }
    
}, {timestamps:true})

const Product = mongoose.model("Product",ProductSchema );

module.exports=Product;