/*
 * Project euler solutions
 * Copyright (c) project sanjay
 * @author sanjay
 * problem : Even fibonacci numbers
 * Two approaches : 1.naive approach
 * 					2.using array.
 *
 */
public class ProjectEuler {

	public static void main(String[] args) {
		//normal approach code starts here
		int first =1;
		int second=2;
		int sum=0;
		int third=0;
		while(first<4000000){
			if(first%2==0){
				sum+=first;
			}
			third=first+second;
			first=second;
			second=third;
		}
		System.out.println(sum);
		//normal code ends here..
		
		
		//array approach code starts here
		int arr[]=new int[4000000];
		arr[0]=1;
		arr[1]=2;
		int j=2;
		int sum1=2;
		for(int i=2;j<4000000;i++){
			arr[i]=arr[i-1]+arr[i-2];
			if(arr[i]%2==0){
				sum1+=arr[i];
			}
			j=arr[i];
		}
		System.out.println(sum1);
		//array approach code ends here

	}

}
