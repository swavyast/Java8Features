package com.ml.java8.lineOfCodes;

public class NumericArraySorting {
	public boolean contains(int num[], int x) {
		boolean flag = false;
		for(int i = 0; i<num.length; i++) {
			if(num[i]==x)
				flag = true;
		}
		return flag;
	}
	
	public void sort(int numbers[], int num1[]) {
		NumericArraySorting ac = new NumericArraySorting();
		for(int i = 0;i<numbers.length;i++) {
			if(ac.contains(num1, numbers[i])!=true) {
				if(i>0&&num1[i-1]>numbers[i]) {
					int j = i-1;
					int temp = num1[i-1];
					num1[j] = numbers[i];
					num1[i] = temp;
				}else {
					num1[i] = numbers[i];
				}
			}
		}
		for(int n = 0; n< num1.length; n++)
			System.out.println(num1[n]);
	}

	public static void main(String[] args) {
		int numbers[] = {1, 5, 2, 9, 36, 15, 22, 34, 99};
		int num1[] = new int[9];
		NumericArraySorting ac = new NumericArraySorting();
		ac.sort(numbers, num1);
	}

}
