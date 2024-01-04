//The controller does the C R U D for the DB
const Product = require("../models/product");


// READ ALL
module.exports.findAllProducts = (req, res) => {
  Product.find()
    .then((products) => {
      res.json(products);
    })
    .catch((err) => res.json(err));
};

// READ ONE BY ID

module.exports.findOneprodut = (req, res) => {
  Joke.findOne({ _id: req.params.id })
    .then((oneprodut) => {
      res.json(oneprodut);
    })
    .catch((err) => res.json(err));
};

// CREATE

module.exports.createNewproduct = (req, res) => {
  Joke.create(req.body)
    .then((newlyCreatedproduct) => {
      res.json(newlyCreatedproduct);
    })
    .catch((err) => res.json(err));
};

// UPDATE

module.exports.updateExisitingproduct = (req, res) => {
  Joke.findOneAndUpdate({ _id: req.params.id }, req.body, { 
    new: true,
    runValidators: true,
  })
    .then((updatedproduct) => {
      res.json(updatedproduct);
    })
    .catch((err) => res.json(err));
};

// DELETE
module.exports.deleteOneproduct = (req, res) => {
  Joke.deleteOne({ _id: req.params.id })
    .then((result) => {
      res.json(result);
    })
    .catch((err) => res.json(err));
};