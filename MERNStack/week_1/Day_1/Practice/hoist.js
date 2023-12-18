// snippet 1 :
console.log(hello);                                   
var hello = 'world'; 

var hello;
console.log(hello); 
hello = 'world';

// snippet 2 :
var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}


var needle;


function test(){
    var needle; 
    console.log(needle);
}


needle = 'haystack'; 
test();

// snippet 3 :
var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);


var brendan; 


function print(){
    
}


brendan = 'super cool'; 

console.log(brendan); 

// snippet 4 :
var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}

var food; 


function eat(){
    var food; 
    food = 'half-chicken'; 
    console.log(food);
    food = 'gone';
}


food = 'chicken'; 
console.log(food); 
eat(); 

// snippet 5 :
mean();
console.log(food);
var mean =function(){
    food=chicken;
    console.log(food);
    var food="fish";
    console.log(food);

}
console.log(food);

var mean; 
var food; 


mean(); 

console.log(food); 

mean = function() {
    
    var food; 
    food = "chicken";
    console.log(food);
    food = "fish";
    console.log(food);
};

console.log(food);

// snippet 6 :
console.log(genre);
var genre="disco";
rewind();
function rewind(){
    genre="rock";
    console.log(genre);
    genre="r&b"
    console.log(genre);

}
console.log(genre);


var genre;


console.log(genre); 
genre = "disco"; 
rewind(); 

function rewind() {
    
    var genre;

   
    genre = "rock"; 
    console.log(genre); 
    
    genre = "r&b";
    console.log(genre); 
}

console.log(genre); 

// snippet 7 :
dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);



dojo = "san jose"; 

console.log(dojo); 

learn(); 

function learn() {
    
    var dojo;

   
    dojo = "seattle"; 
    console.log(dojo);

    dojo = "burbank"; 
    console.log(dojo); 
}

console.log(dojo);