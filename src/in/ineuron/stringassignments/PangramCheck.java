package in.ineuron.stringassignments;

public class PangramCheck {

	public static void main(String[] args) 
	{
	 	String str = "The quick brown fox jumps over the lazy dog";
	 	boolean[] arr = new boolean[30];
	 	int index = 0;
	 	int flag = 1;
	    	for (int i = 0; i < str.length(); i++) 
	    	{
	    		if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
	    		{
	    			index = str.charAt(i) - 'A';
	    		}else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
	    		{
	    			index = str.charAt(i) - 'a';
	    		}
	    		arr[index] = true;
	    	}
	    	for (int i = 0; i <= 25; i++) 
	    	{
	    		if (arr[i] == false)
	    		flag = 0;
	    	}
	    	System.out.print("Given String: " + str);
	    	if (flag == 1)
	    		System.out.print(": is a pangram.");
	    	else
	    		System.out.print(": is not a pangram.");
	}

}
