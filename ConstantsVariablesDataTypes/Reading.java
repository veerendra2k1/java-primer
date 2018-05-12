package ConstantsVariablesDataTypes;

import java.io.DataInputStream;

public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataInputStream in = new DataInputStream(System.in);
		int intNumber = 0;
		float floatNumber = 0.0f;
		
		try{
			
			System.out.println("Please enter a Integer:");
			intNumber = Integer.parseInt(in.readLine());
			
			System.out.println("Please enter a Float");
			floatNumber = Float.valueOf(inreadLine()).floatValue();
		}
		
		catch (Exception e){
			
		}
		
		System.out.println("You have enter Integer :" + intNumber);
		System.out.println("You have float:" + floatNumber);

	}

}
