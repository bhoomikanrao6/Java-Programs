class AssignmentOperator {
     public static void main (String args[]){
		 
		 System.out.println("Example to illustrate AssignmentOperator");
		 
		 int sum = 10;
		 sum = sum + 10;
		 System.out.println("the value of sum is : " + sum);
		 sum += 20;
		 System.out.println("the new value is : " + sum);
		 
		 int sub = 100;
		 sub = sub - 10;
		 System.out.println("the value of sub is : " + sub);
		 sub -= 20;
		 System.out.println("the new value is : " + sub);
		 
		 int div = 18;
		 div = div / 6;
		 System.out.println("the value of div is : " + div);
		 div /= 3;
		 System.out.println("the new value is : " + div);
		 
		 int mul = 20;
		 mul = mul * 10;
		 System.out.println("the value of mul is : " + mul);
		 mul *= 20;
		 System.out.println("the new value is : " + mul);
		 
		 int mod = 120;
		 mod = mod % 7;
		 System.out.println("the value of mod is : " + mod);
		 mod %= 2;
		 System.out.println("the new value is : " + mod);
		 
	 }
	 
}