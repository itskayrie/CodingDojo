//The controller does the C R U D for the DB
const Joke = require("../models/Joke");
const Movie = require("../models/Joke");

// READ ALL
module.exports.findAlljokes = (req, res) => {
  Joke.find()
    .then((jokes) => {
      res.json(jokes);
    })
    .catch((err) => res.json(err));
};

// READ ONE BY ID

module.exports.findOnejoke = (req, res) => {
  Joke.findOne({ _id: req.params.id })
    .then((onejoke) => {
      res.json(onejoke);
    })
    .catch((err) => res.json(err));
};

// CREATE

module.exports.createNewjoke = (req, res) => {
  Joke.create(req.body)
    .then((newlyCreatedjoke) => {
      res.json(newlyCreatedjoke);
    })
    .catch((err) => res.json(err));
};

// UPDATE

module.exports.updateExisitingjoke = (req, res) => {
  Joke.findOneAndUpdate({ _id: req.params.id }, req.body, { 
    new: true,
    runValidators: true,
  })
    .then((updatedjoke) => {
      res.json(updatedjoke);
    })
    .catch((err) => res.json(err));
};

// DELETE
module.exports.deleteOnejoke = (req, res) => {
  Joke.deleteOne({ _id: req.params.id })
    .then((result) => {
      res.json(result);
    })
    .catch((err) => res.json(err));
};