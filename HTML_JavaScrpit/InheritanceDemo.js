class car{
    setName(name){
        this.name=name;
        console.log(name);
    }
    drive(){
        console.log("the car named "+this.name+"is running");
         
    }
    stop(){
        console.log("this car named "+this.name+"is stopping")
    }
}
class Mercedes extends car{
    driver(driverName){
        console.log("this mercedes is driven by "+driverName);
    }
}
let w13=new Mercedes();
w13.setName("mecedez benz");
w13.drive();
w13.driver("lewis hamilton");
w13.stop();
