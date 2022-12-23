class animal{
    constructor(name){
        this.name=name;
        console.log(this.name)
    }
    eats(){
        console.log(this.name+"eats food")
    }
}
class lion extends animal{
    eats(){
        console.log(this.name+" eats meats");
    }
}
let john= new lion("john");
john.eats();