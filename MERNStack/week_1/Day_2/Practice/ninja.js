class Ninja{
    constructor(name){
        this.health=90;
        this.speed=3;
        this.strength=3;
        this.name=name;

    }
    sayName(){
        console.log(`his name is ${this.name}`);
    }
    showStats(){
        console.log(`this ninja's are ${this.name},${this.health},${this.speed},${this.strength} `)
    }
    drinkSake(){
        this.health += 10;
    }
} 
