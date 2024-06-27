package com.study.bigO;


import java.util.LinkedHashMap;

public class CheckTripletSumisZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array []= {1,0,-1,-2,3};
		getTripletZero(array);
	}
	
	public static LinkedHashMap<String,String> getTripletZero(int array[]){
		
		LinkedHashMap <String ,String> hm = new LinkedHashMap<String,String>();
		
		int size = array.length;
		int counter=1;
		for(int i=0;i<size;i++ ) {
			
			if(size>i+2) {
				if(array[i]+array[i+1]+array[i+2] ==0) {
					
					hm.put("Triplet_"+counter, " "+array[i]+","+array[i+1]+","+array[i+2]);
					counter++;
				}
			}
		}
		System.out.println(hm);
		return hm;
	}
 
}
