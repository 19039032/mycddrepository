class fact{
	static int factorial(int n){
		if(n==1)return 1;
		else{
		return n*factorial(n-1);
		}
	}
	public static void main(String[] args){
		int f=factorial(7);
		System.out.println("5 factorial is "+f);
	}
}
