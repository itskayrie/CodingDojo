function pizzaoven(crust_type,sauce_type,cheeses,toppings){
    var pizza= {};
    pizza.CrusType=crustType;
    pizza.SauceType=SauceType;
    pizza.Cheeses=Cheeses;
    pizza.Toppings=Toppings;
    return pizza;
}
var pizza1= pizzaoven( "deep dish", "traditional","mozzarella", "pepperoni", "sausage")
console.log(pizza1);
var pizza2= pizzaoven( "hand tossed", "marinara", ["mozzarella", "feta"], and ["mushrooms", "olives", "onions"])
console.log(pizza2)