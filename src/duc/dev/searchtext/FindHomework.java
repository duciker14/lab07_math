package duc.dev.searchtext;

import java.util.Scanner;

public class FindHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = new int [10];
		input(x,10);
		sort(x,10);
		show(x);
	    find(x);
	}

	/*
	 * phuong thuc nhap mang
	 */
	public static void input(int X[], int n){
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < n; i++){
			
			System.out.printf("Nhap vao gia tri thu A[%d]: ",i);
			X[i] = sc.nextInt();
		
		}	
	}
	
    /*
     * phuong thuc sap xep
     */
	
	public static void sort(int X[], int n){
		int temp = X[0];
		
		for(int i = 0; i < n; i++){
			
			for(int j = i+1  ; j < n; j++){
				
				if(X[i] > X[j]){
					
					temp = X[i];
					X[i] = X[j];
					X[j] = temp;
					
				}
			}
		}
	}
	
	static void show(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(String.format("%d \t", x[i]));
		}
	}
	/*
	 * phuong thuc dem so lan xuat hien cua cac so gan nhau, sau do so sanh tim ra gia tri lon nhat
	 */
	
//	static void resultFind(int X[], int n){
//		
//		int count = 1;
//		int numberAppear =1;
//		int tempVarible = 1;
//		int numberMax = X[0];
//		int i=0;
//		
//	while(i < n -1 ) {
//		
//		if(X[i] == X[i+1])  
//			
//				count++;
//		else{
//	
//					if(numberAppear < count){    // So sanh so lan xuat hien
//						
//						numberAppear = count; 
//						numberMax = X[i];
//						count = 1;
//						
//					}
//		} 
//		 if((i == n-2) && (count > numberAppear)){   // doi voi truong hop so xuat hien nhieu nhat la max cua day, bi day ve sau cung 
//			  										 // ko re nhanh sang else duoc
//			 numberAppear = count; 
//			 numberMax = X[i];
//				
//		 }
//	
//		 if(X[0] == X[n-1]){                          //doi voi truong hop tat ca cac gtr trong mang = 1 gia tri
//		
//			 numberMax = X[0];
//			 numberAppear = n;
//		
//		 }
//	}
	
//	System.out.printf("So xuat hien nhieu lan nhat la: %d; voi so lan xuat hien la %d",numberMax,numberAppear);
//}
	static void find(int[] x) {
		int currentIndex = 0;
		int count = 1;
		int prevValue = x[0];
		int prevCount = 0;
		
		for (int i = 0; i < x.length-1; i++) {
			if(x[i] == x[i+1]) {
				count++;
			}else {
				if(count > prevCount) {
					prevCount = count;
					prevValue = x[i];
					count = 1;
				}

				currentIndex = i;
			}
		}
		
		if(count > prevCount) {
			prevCount = count;
			prevValue = x[currentIndex + 1];
		}
		System.out.println(String.format("Phan tu %d xuat hien %d lan", prevValue, prevCount));
	}
}

	
	
	

