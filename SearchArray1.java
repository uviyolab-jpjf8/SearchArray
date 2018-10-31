/*
A static predicate, searchArray, that takes as parameters an array of strings and a string
It returns true, if the string is present in the array
It returns false otherwise.
*/
public class SearchArray1 {

  public static void main(String[] args) {
    // creation of an array x of 3 strings
    String[] x = { "one", "two", "three" };
    // search the string "two" in the array x
    if (searchArray(x, "two"))
      System.out.println("present");
    else
      System.out.println("not present"); // this will not be printed out
  }

  public static boolean searchArray(String[] v, String e) {
    for (int i = 0; i < v.length; i++)
      if (e.equals(v[i]))
        return true;
        return false;
  }	
}
