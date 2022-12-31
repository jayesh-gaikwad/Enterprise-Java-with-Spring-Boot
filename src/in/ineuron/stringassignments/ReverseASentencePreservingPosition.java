package in.ineuron.stringassignments;


class ReverseString
{
	 public void ReverseString(String str)
	  {
		String[] strArray = str.split(" ");
		String outPut = "";
		for (int i = 0; i < strArray.length; i++)
	       {
	           String word = strArray[i]; 
	           String reverse = "";
	           for (int j = word.length()-1; j >= 0; j--) 
	           {
	        	   reverse = reverse + word.charAt(j);
	           }
	           outPut = outPut + reverse + " ";
	        }
			System.out.println(str);
			System.out.println(outPut);
	   	}
}


public class ReverseASentencePreservingPosition
{
	
		public static void main(String[] args) 
		 {
			  ReverseString obj = new ReverseString();
			  obj.ReverseString("Think Twice");
		  }
}


