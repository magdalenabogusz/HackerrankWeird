import java.util.*;

/*Task
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
*/

    public class Weird {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter any integer and press Enter");
            int n = scan.nextInt();
            scan.close();
            String ans="";

            if(n%2==1 || (n >= 6 && n <= 20) ) {
                ans = "Weird";
            }
            else {
                ans = "Not Weird";
            }
            System.out.println(ans);

        }

    }

