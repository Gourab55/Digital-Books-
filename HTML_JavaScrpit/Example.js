function ReverseArray(){
   
    let a=[10,20,30,40]
    for (let i=a.length-1;i>=0;i--)
    console.log(a[i])

}

function SoArray(){
    let t,i,j;
    let a=[45,70,16,35,8,99,12]
  for( i=0;i<a.length-1;i++){
      for( j=i+1;j<a.length-1;j++)
      {
        if(a[i] >a[j])
        {
            a[i]=t;
            a[i]=a[j];
            a[j]=t;

        }
    }
    console.log(a[i])

  }

}
function SumOfArray(){
    let a=[];
    a[0]=15;
    a[1]=20;
    a[2]=30;
    a[3]=40;
    a[4]=50;
 
    let sum=0;
    for(let i=0;i<a.length;i++){
    sum= sum+a[i];
    }
    console.log("The sum of array elements are "+sum);
}
function MarkNegative(){
    let a=[-3,56,-7,34.47]
    for(let i=0;i<a.length-1;i++)
     {
         if(a[i] <0 )
          console.log("negative number is"+a[i])
     }
}

function  checkdividebyten(a)
{
  if(a%10 ==0 )
  return true;
  else
  return false;
  
}

function removespace()
{
    let name="  gourab "
    console.log(name.trim())
}

removespace();
let b=checkdividebyten(35);
console.log(b);
ReverseArray();  
SoArray();  
SumOfArray();      
MarkNegative();  