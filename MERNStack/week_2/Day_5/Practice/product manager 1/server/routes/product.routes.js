const Productcontroller = require("../controllers/product.controller");

module.exports = app =>{
    app.get("/api/products", Productcontroller.findAllProducts);
    app.get("/api/products/:id",Productcontroller.findOneprodut);
    app.patch("/api/products/:id",Productcontroller.updateExisitingproduct);
    app.post("/api/products",Productcontroller.createNewproduct);
    app.delete("/api/products/:id",Productcontroller.deleteOneproduct);
};