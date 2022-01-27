import java.util.Scanner;

class replace{
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the string\n");
        String str = sc.next();
 
        System.out.println("enter the index ");
        int index=sc.nextInt();
 
        // Get the character
        System.out.println("enter the character \n");
        char ch = sc.next().charAt(0);
 
        // Print the original string
        System.out.println("Original String = " + str);
 
        str = str.substring(0, index) + ch
              + str.substring(index + 1);
 
        // Print the modified string
        System.out.println("Modified String = " + str);
    }
}
