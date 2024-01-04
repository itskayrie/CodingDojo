const mongoose= require ("mongoose");

// The model 
const ProductSchema = new mongoose.Schema({
    title: {
        type: String,
        required:[true,"{path} is required !"],
        minLength:[3,"{path} must be at least 3 caracters"]
    },
    price: {
        type: Number,
        required:[true,"{path} is required !"],
        minLength:[3,"{path} must be at least 3 caracters"]
    },
    Description:{
        type:String,
        required:[true,"{path} is required !"],
        minLength:[3,"{path} must be at least 3 caracters"]
    }
    
}, {timestamps:true})

const Product = mongoose.model("Product",ProductSchema );

module.exports=Product;