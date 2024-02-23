package com.keyword.example;

public class CounterDemoStatic {
	static int count = 0 ;
	
	 CounterDemoStatic(){
		count++;
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterDemoStatic c1 = new CounterDemoStatic();
		CounterDemoStatic c2 = new CounterDemoStatic();
		CounterDemoStatic c3 = new CounterDemoStatic();
		CounterDemoStatic c4 = new CounterDemoStatic();
		CounterDemoStatic c5 = new CounterDemoStatic();
		

	}

}
