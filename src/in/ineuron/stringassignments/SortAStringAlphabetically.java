package in.ineuron.stringassignments;

public class SortAStringAlphabetically 
{

	public static void main(String[] args) 
	{
        String string = "enterprise java";
        char array[] = string.toCharArray();
        char temp;
        int i = 0;
        while (i < array.length) 
        {
        	int j = i + 1;
            while (j < array.length) 
            {
                if (array[j] < array[i]) 
                {
                	temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;  
                }
                j=j+1;
            }
            i=i+1;
        }
        System.out.print("Sorted String in alphabetical order is:");
        System.out.println(array);	      
	}
}
