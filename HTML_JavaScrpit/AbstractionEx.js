function Employee(name,age, basesalary ){
    this.name=name;
    this.age=age;
    this.basesalary=basesalary;
    this.monthlybonus=10000;

    this.getEmployeeDetails = function(){
        console.log("Name:"+this.name+" ,age:"+this.age+"basesalary"+this.basesalary);
        
    }
    this.calculatefinalSal= function(){
        let finalsal=this.basesalary+this.monthlybonus;
        console.log("Final salary is"+finalsal)
    }

}
let emp1=new Employee("john",30,10000);
emp1.getEmployeeDetails();
emp1.calculatefinalSal();