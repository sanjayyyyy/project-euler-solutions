/*
 * Project euler solutions
 * Copyright (c) project sanjay
 * @author sanjay
 * problem : multiple of 3 or 5
 */
public class ProjectEuler {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<1000;i++){
			if(i%3==0||i%5==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
