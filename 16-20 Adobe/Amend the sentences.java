// https://practice.geeksforgeeks.org/problems/amend-the-sentence3235/1# 

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		while(test--!=0)
		{
			String str = scan.next();
			char ch = str.charAt(0);
			if(Character.isUpperCase(ch))
			    ch = Character.toLowerCase(ch);
			System.out.print(""+ch);
			
			for(int i=1;i<str.length();i++)
			{
	            ch = str.charAt(i);
			    if(Character.isUpperCase(ch))
			    {
			        ch = Character.toLowerCase(ch);
			        System.out.print(" " + ch);
			    }
			    else
			        System.out.print("" + ch);
			}
			
			System.out.println();
		}
	}
}
