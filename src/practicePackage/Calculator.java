package practicePackage;

class Calculator{
	
	//Creation of calculation methods
	//Addition Method
	void add(int num1,int num2){
		int ans = num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+" is "+ans);
	}
	//Subtraction Method
	void sub(int num1,int num2){
		int ans = num1-num2;
		System.out.println("Subtraction of "+num1+" and "+num2+" is "+ans);
	}
	//Multiplication Method
	void mul(int num1,int num2){
		int ans = num1*num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+ans);
	}
	//Division Method
	void div(int num1,int num2){
		double ans = (double)num1/num2;
		System.out.println("Division of "+num1+" and "+num2+" is "+ans);
	}	
	
	//Creation of Main method
	public static void main(String[] args){
		//Creating a object of type Calculator
		Calculator cal = new Calculator();
		//Calling the calculation methods by passing parameter values
		cal.add(13,25);
		cal.sub(1,5);
		cal.mul(5,-9);
		cal.div(52,3);
	}
}
