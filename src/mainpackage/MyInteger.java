package mainpackage;



///jon garcia

public class MyInteger {
	public static void main(String[] args){
		private int value;
	}

		public MyInteger(int value){
			this.value=value;
		}
	  
			    public Integer getValue() {
				        return this.value;
		    
				       }
			    public boolean isEven() {
			    		return value%2==0;
			    	}
			    public boolean isOdd() {
			    		return value% 2!=0;
			    	}
			    
			    public boolean isPrime() {
			    	if(value<=1){
			    		return false;
			    	}
			    	for(int x=2; x<Math.sqrt(value);x++){
			    		if(value%x==0){
			    			return false;
			    		}
			    	}
			    	return true;
			    	}
			    public static boolean isEven(int value) {
			    	if (value % 2 == 0) {
			    		return true;
			    	}
			    	return false;
			    	}
			    public static boolean isOdd(int value) {
	
			    	if (value % 2 != 0) {
			    		return true;
			    	}
			    	return false;
			    	}
			    public static boolean isPrime(int value) {
			    	if(value<=1){
			    	 return false;
			    }
			    	for(int x=2; x< Math.sqrt(value);x++){
			    		if(value % x==0){
			    			return false;
			    		}
			    		return true;
	
			    	}
					return false;
			    }
//			    public static boolean isEven(MyInt myInt){
//			    	 return  (MyInt.value % 2==0);
//			    	 
//			    }
//			    public static boolean isOdd(MyInt myInt){
//			    	 return  (MyInt.value % 2!=0);
//			    }
//			    public static boolean isPrime(MyInt myInt){
//			    	 return  MyInt.isPrime(MyInt.GetValue());
//			    }
			    public boolean equals(int num){
			    	if(num== this.value){
			    		return true;
			    		
			    	}
			    }
			    private boolean equals(myInt num){
			    	if (num.value==value){
			    		return true;
			    	}else{
			    		return false;
			    	}
			    
			    }
			    public static int paseInt(char[] a){
			    	int total=0;
			    	for(int x=0 ; x<a.length; x++ ){
			    		suml=a[x];
			    		sum++;
			    	}
			    	return total;
			    }
			    public static int parseInt(String x){
			    	return x.length();
			    }
}