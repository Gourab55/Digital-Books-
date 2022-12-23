package mypractics;

import java.util.*;

public class practicsCollection {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> l1= new ArrayList<Integer>();
	l1.add(1);
	l1.add(2);
	l1.add(5);
	l1.add(7);
	l1.add(4);
	
	ArrayList<Integer> l2=new ArrayList<Integer>();
	l2.add(1);
	l2.add(2);
	l2.add(5);
	l2.add(3);
	l2.add(4);
	
	Iterator<Integer> it1= l1.iterator();
	Iterator<Integer> it2= l2.iterator();
	int n1,n2;
	int maxval=0;
	
	while(it1.hasNext() &&it2.hasNext() ) {
		
		n1=it1.next();
		n2=it2.next();
		
		
		if(n1== n2)
			maxval++;
			
		
		
	}
	
	
	
		
		
		
		
		int[] num= {3,34,12,98,56,7,67};
		int[] res= new int[7];
		
		int temp=0;
		int Max=0;
		
		for(int i=0;i<num.length;i++)
		{
		
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]< num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
					
				
			}
		}
		
	
			//System.out.print(num);
		
		
		
	
	List<Integer> a1= new ArrayList<Integer>();
     a1.add(40);
     a1.add(20);
     a1.add(50);
     a1.add(40);
     
     //System.out.println("array lists elements are"+a1);
     
     Iterator<Integer> it= a1.iterator();
    Integer max= it.next();
    int c=1;
    int max1=0;
     while(it.hasNext()) {
    	 
    	 max1=it.next();
    	 if(max <  max1 )
    		 max= max1;
    	   if(max == max1)
    		   c++;
    	
    	 
    	
     }
     
     System.out.println("Max elements in the arraylist"+max);
    System.out.println("Frequency of max element is:"+c);
	
	
	}

}
