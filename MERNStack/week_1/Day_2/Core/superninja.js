class Ninja {
    constructor(name) {
        this.health = 90;
        this.speed = 3;
        this.strength = 3;
        this.name = name;

    }
    sayName() {
        console.log(`his name is ${this.name}`);
    }
    showStats() {
        console.log(`this ninja's are ${this.name},${this.health},${this.speed},${this.strength} `)
    }
    drinkSake() {
        this.health += 10;
    }
}

class Sensei extends Ninja {
    constructor(name) {
        super(name)
        this.health = 200;
        this.speed = 10;
        this.strength = 10;
        this.wisdom = 10;
    }
    speakWisdom() {
            this.drinkSake();
            console.log("What one programmer can do in one month, two programmers can do in two months.")
            return this
        }
    
}
// example output
const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
// -> "What one programmer can do in one month, two programmers can do in two months."
superSensei.showStats();
// -> "Name: Master Splinter, Health: 210, Speed: 10, Strength: 10"
