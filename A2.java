class A2 {
    public static void main(String args[]){
		int dailyWage = 4;
		int number_of_days = 5;
		int salary = number_of_days++ * --dailyWage * dailyWage++ * number_of_days--;
		salary =- dailyWage;
		System.out.println(dailyWage + " " + number_of_days + " " + salary);
	}
}