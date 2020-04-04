public class method {
 public static void main(String[] args) {
        int age1=30;
        int age2=66;
        int age3=1;

        int price=1000;

        double price1=0;
        double price2=0;
        double price3=0;
/*Ниже мы повторяем циклы для трех разных возрастов, пользуясь теми же
* данными, чтобы не повторять код три раза мы должны пользоваться методами*/
        if(age1>12) {
            if (age1 > 65) {
                price1 = price * 0.8;
            } else {
                price1 = price * 1;
            }
        } else {
            if (age1 < 2) {
                price1 = 0 * price;
            } else {
                price1=price*0.6;
            }
        }

        //age 2

        if(age2>2) {
            if (age2 > 65) {
                price2 = price * 0.8;
            } else {
                price2 = price * 1;
            }
        } else {
            if (age2 < 2) {
                price2 = 0 * price;}
             else {
                price2=price*0.6;
            }
        }
        if(age3>2) {
            if (age3 > 65) {
                price3 = price * 0.8;
            } else {
                price3 = price * 1;
            }
        } else {
            if (age3 < 2) {
                price3 = 0 * price;}
            else {
                price3=price*0.6;
            }
        }
        System.out.println(price1);
        System.out.println(price2);
        System.out.println(price3);

        sayHi();

        double spher1=getSpheraVolume(12);
        System.out.println(spher1);




        getSumOfNumbers(3, 9, 35);

     System.out.println(getNumbers(7, 5, 6));


    }

    public static double getPrice(int age) {
        int price = 1000;
        double finalPrice;
        if (age > 12) {
            if (age > 65) {
                finalPrice = price * 0.8;
            } else {
                finalPrice = price * 1;
            }
        } else {
            if (age < 2) {
                finalPrice = 0 * price;
            } else {
                finalPrice = price * 0.6;
            }
        }
        return finalPrice;
        //после ретерна код не считывается
    }
    //функцию ниже мы должны вызвать, написав сэйХай();
    public static void sayHi() {
        System.out.println("hi");
    }


    /////////////////////////////////////////double radius - argument 62 stroka

    public static double getSpheraVolume(double radius) {
        return Math.PI*radius;
    }


    // 68 string
    public static void getSumOfNumbers(int a, int b, int c) {
        System.out.println(a+b+c);
    }


    //Spring 70
    public static int getNumbers(int a, int b, int c) {
     return a+b+c;
    }

}
