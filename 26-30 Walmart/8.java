class GFG
 {
	public static void main (String[] args)
	 {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
	   int input,height; 
	   
	   for(int i=0;i<n;i++){
	       input = in.nextInt();
	       height = (input * 8) + 1;
	       height = ((int)Math.sqrt(height) - 1 ) / 2;
	       System.out.println(height);
	   }
	 }
}
