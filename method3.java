public class method3 {
    public static void main(String[]args) {

int[] numbers= new int[]{1,3,5,6,16};
int[] age=new int[]{14,17,56,85};
int[] temperature=new int[]{87,88,65,43};

printEven(numbers);
        System.out.println("_______________________");
printEven(age);
        System.out.println("________________________");
printEven(temperature);


        System.out.println(cylinderVolume(10,5));
    }



//8-12
    private static void printEven(int[] numbersorn) {
        for (int number:numbersorn) {
            if(number%2==0){
                System.out.println(number);
            }
        }
    }

    private static double sqRound(double radius){
        //math.pow = radius*radius
        return Math.PI*Math.pow(radius,2);
    }
    private static double cylinderVolume(double radius, double height) {
        double sq=sqRound(radius);
    return sq*height;
    }

}

