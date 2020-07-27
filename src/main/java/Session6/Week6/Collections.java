package Session6.Week6;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections 
{
	public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17,18,19,20));
        Custom c=new Custom();
        c.method(numbers);
    }
}
