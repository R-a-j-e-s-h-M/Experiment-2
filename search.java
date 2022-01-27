import java.util.Scanner;

class search{
  
    // Function to get the specific character
    public static char
    getCharFromString(String str, int index)
    {
        return str.charAt(index);
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string\n");
        String str = sc.next();
  System.out.println("enter the index \n");
        // Get the index
        int index = sc.nextInt();
  
        // Get the specific character
        char ch = getCharFromString(str, index);
  
        System.out.println("Character from " + str
                           + " at index " + index
                           + " is " + ch);
    }
}
