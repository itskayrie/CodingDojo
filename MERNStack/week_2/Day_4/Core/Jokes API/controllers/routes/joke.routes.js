const Jokecontroller = require("../controllers/Joke.controller");

module.exports = app =>{
    app.get("/api/jokes", Jokecontroller.findAlljokes);
    app.get("/api/jokes/:id",Jokecontroller.findOnejoke);
    app.patch("/api/jokes/:id",Jokecontroller.updateExisitingjoke);
    app.post("/api/jokes",Jokecontroller.createNewjoke);
    app.delete("/api/jokes/:id",Jokecontroller.deleteOnejoke);
};