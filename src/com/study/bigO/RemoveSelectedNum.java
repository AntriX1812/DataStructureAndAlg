package com.study.bigO;

public class RemoveSelectedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {2,3,2,2,3};
		removeNum(array,2);
	}
	
	public static void removeNum(int [] array ,int target){
		
	    int i=0;
		for(int j=0;j<array.length;j++) {
			if(array[j]!=target) {
				array[i] = array[j];
				i++;
			}
		}

		for(int k=0;k<i;k++) {
			System.out.println(array[k]);
		}
	}

}
