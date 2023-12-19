class Card{
    constructor(name,cost){
        this.name=name;
        this.cost=cost;
    }
}

class Unit extends Card{
    constructor(name,cost,power,res){
        super(name,cost)
        this.res=res;
        this.power=power;
        

    }
    attack(target){
        if( target instanceof Unit ){
            this.res-=this.power
        }
        else {
            throw new Error( "Target must be a unit!" );
        }
        
    }
}
class Effect extends Card{
    constructor(name,cost,text,stat,magnitude){
        super(name,cost)
        this.text=text;
        this.stat=stat;
        this.magnitude=magnitude;
    }
    play(target){
        if( target instanceof Unit ){
            if(this.stat=="resilience"){
                target.res+=this.magnitudes;

            }
            else{
                target.power+=this.magnitude
            }
        }
    }
}

const redBeltNinja = new Unit("redbeltninja",3,3,4)
const BlackBeltNinja = new Unit("blackbeltninja",4,5,4)

const HardAlgo= new Effect("Hard Algo",2,"increase target's resilience by 3","resilience",3)
const UnhandledPromiseRejection = new Effect("Unhandled Promise Rejection",1,"increase target's resilience by 2","resilience",-2)
const pairprogramming = new Effect("pair programming",3,"increase target's resilience by 2","resilience",+2)