
public class method2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 8;

        int summa = getNumbers(a, b, c);
        System.out.println(summa);

        sayHi();
        sayHi(666);
        sayHi("Misha");
        sayHi("Boris", 8);
    }
        private static void sayHi() {
            System.out.println("Hi");
        }
        private static void sayHi(int x) {
            System.out.println("Hi "+x);
        }
        private static void sayHi(String name, int xx) {
            System.out.println("Hi "+name+" "+xx);
        }
        private static void sayHi(String name) {
            System.out.println("hello "+name);
        }



    private static int getNumbers(int a, int b, int c) {
        return a + b + c;
    }


}

