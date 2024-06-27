
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
package com.study.bigO;

public class OperationsCheck {

	
	
public int finalValueAfterOperations(String[] operations) {
    
	int x=0;
	for(int i=0;i<operations.length;i++) {
		String opr=operations[i];
		if(opr.trim().startsWith("++") || opr.endsWith("++") ) {
			x=x+1;
		}else {
			x=x-1;
		}
	}
	
	System.out.println(x);
	return x;
    }

public static void main(String[] args) {
	String[] operations= {"++X","++X","X++"};
	OperationsCheck obj = new OperationsCheck();
	obj.finalValueAfterOperations(operations);
}
}
