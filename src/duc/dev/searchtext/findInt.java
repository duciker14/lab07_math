package duc.dev.searchtext;

import java.util.Scanner;

public class findInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
    int A[] = new int[10];
    
    for(int i = 0;i < 10 ; i++) {
    	System.out.printf("Nhap vao A[%d]: ",i); 
    	A[i] = sc.nextInt();
    }
    
    int count =0;
    int result=0;
    int numberEnd=0;
    int number =0;
    
    for(int i = 0;i < 10 ; i++) {
    	if(result < count) { 
    	result = count;  
    	numberEnd = number;
    	}
    	
    	count =0;
    	
    	for (int j = i+1 ; j < 10;j++) { 
    		if(A[i] == A[j]){
    		count =+ 1;
    		number = A[i];
    		}
    	}
    }
    
    System.out.println(numberEnd);
    
	
	

	}

}
