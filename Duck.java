//Duck Number : Any Number Contain 0 (i.e: "1024" , "09" , ...)
//Non Duck Number : Number Don't contain 0 (i.e: "1234" , "2365" , ...)

import java.util.*;

class duck {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int input, cal, save = 0;
        System.out.print("Enter Number :");
        input = in.nextInt();
        while (input > 0) {
            cal = input % 10;
            if (cal == 0) {
                save = 1;
                break;
            }
            input = input / 10;
        }
        if (save == 1) {
            System.out.println("Congratulation ! You have found a Duck Number");
        } else {
            System.out.println("Sorry ! Not a Duck Number");
        }
    }
}