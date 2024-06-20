public class sumofodde {
    int odd;
    int even;

    void sumoddev(int a) {
        odd = 0;
        even = 0;

        for (int i=0; i<=a; i++) {
            if (a%2 == 1) {
                odd = odd + i;
            }
            else {
                even = even + i;
            }
        }

        System.out.println("Sum of odd numbers is: ");
        System.out.println(odd);
        System.out.println("Sum of even numbers is: ");
        System.out.println(even);

    }

    
    public static void main (String args[]) {
        sumofodde obj1 = new sumofodde();
        int b;

        System.out.println("NEW BRANCH");

        System.out.println("Enter any number: ");
        // b = toInt(System.out.readln());
        b=3;





        obj1.sumoddev(b);

    }
}

