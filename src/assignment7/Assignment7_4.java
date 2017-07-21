package assignment7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*This program for the given set of words, forms a ArrayList ,takes the first element and compares with the rest for anagram.
if anagram pair is found, adds the same to the AnagramList and removes from the original list too avoid comparison in the next iteration.This will be repeated 
till there are only two elements left in the original list which are not anagrams.*/
public class Assignment7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();		// Create a list of string given by the user
		System.out.println("Enter elements for list");
		Scanner in=new Scanner(System.in);
		str.add(in.next());
		str.add(in.next());
		str.add(in.next());
		str.add(in.next());
		str.add(in.next());
		str.add(in.next());
		str.add(in.next());
		str.add(in.next());
		str.add(in.next());
		str.add(in.next()); 
		str.add(in.next()); 
		str.add(in.next());
		System.out.println("Original List: "+str);
		do
		{
			int flag =0;
			String First= str.get(0);
			ArrayList<String> anagramList = new ArrayList<String>();	//Define anagram list using ArrayList
			for (int k= 1; k<str.size(); k++)
			{
				String Next = str.get(k);
				if (First.length()== Next.length())
				{
					boolean isAnagram = AnagramCheck(First,Next);
					if (isAnagram)
					{
						anagramList.add(Next);		//add to the list of anagram .
						str.remove(Next);		// remove the anagram pair of first element from the original list
						flag =1;
					}
				}
			}
			if(flag==1)		//if first string is having anagrams in the list, remove the first from the original list
			{
				anagramList.add(First);		// add first to the anagram list
				str.remove(First);		//remove first from the original list
				System.out.println("Anagram list is" +anagramList);
			}	
		}
		while ((str.size()>2));		//check whether there are only two elements in the list to check for anagram and or not anagram
	}
				

			



		static boolean AnagramCheck(String s1,String s2)
		{
			//Changing the case of characters of both s1 and s2 and converting them to char array
			 
		    char[] s1Array = s1.toLowerCase().toCharArray();

		    char[] s2Array = s2.toLowerCase().toCharArray();

		    //Sorting both s1Array and s2Array

		    Arrays.sort(s1Array);

		    Arrays.sort(s2Array);

		    //Checking whether s1Array and s2Array are equal

		    if( Arrays.equals(s1Array, s2Array)) return true;
		    else return false;
	}
}
