class FindGreaterNumber3 {
  public static void main(String args[]){

    System.out.println("program to find greater number among three numbers");
	int a = 10, b = 20, c = 30;
	
	if (a>b){
	  if (a>c){
	    System.out.println("a value is greater among 3 numbers");
	} else{
	    System.out.println("c value is greater among 3 numbers");
    }
    } else{ //b>a
        if (b>c){
	    System.out.println("b value is greater among 3 numbers");
	} else {
	 
	    System.out.println("c value is greater among 3 numbers");
	 
	 }
    
    }
	}
}