class Employee{
    setEmployee(name, id, position)
    {
        this.name=name;
        this.id=id;
        this.position=position;

    }
    getEmployeeName(){
        return this.name;
    }
    getEmployeeId(){
        return this.id; 

    }
    getEmployeeposition(){
        return this.position;
    }
    

}
let e1= new Employee();
let e2=new Employee();
e1.setEmployee("Gourab",24,"Developer");
e1.setEmployee("ankit",25,"Senior-Developer");

console.log(e1.getEmployeeId()+" "+e1.getEmployeeName()+" "+e1.getEmployeeposition());

// let e1= new Employee("Gourab",24,"Developer");
// let e2= new Employee("ankit",25,"Senior-Developer");  
// console.log(e1.name+" "+e1.id);  