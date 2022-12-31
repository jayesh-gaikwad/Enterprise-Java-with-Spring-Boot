package in.ineuron.stringassignments;

public class ReverseAString {

	public static void main(String[] args) {
				
			String str1= "iNeuron", str2="";
			char character;
				
			System.out.println("Input: iNeuron"); 
				
			for (int i=0; i<str1.length(); i++)
			{
				character= str1.charAt(i); 
				str2= character+str2; 
			}
			System.out.println("Output: "+ str2);
			}
		
	}

