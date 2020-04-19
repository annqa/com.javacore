package extralesson;

public class lesson {
    public static void main(String[] args) {

//INTERVIEW QUESTIONS STRING
        //string НЕ МЕНЯЕТСЯ. появляются переменные, стринг остается той же
        String str = "Some String";
        int length = str.length();

       char firstLetter= str.charAt(0);
for (int i=str.length()-1;i>=0;i--) {
    System.out.print(str.charAt(i));
}

//COMPARISON STRING
if(str.equals("Some String")) {
    System.out.println("they are equal");
}

    //SPLIT STRING
        String[] strArray=str.split(" ");
String[] strArray1 = str.split("g");
//INTERVIEW QUESTIONS



Fish goldFish=new Fish (30, "karas", true);


boolean contain = str.contains("for");

String lower = str.toLowerCase();

String capitalO = str.replace("o", "O");

String triLetter=str.replace("tr", "TR");

String substr=str.substring(4,6);

 double goldFishSizeInInches=goldFish.calculateSizeInInches();
        System.out.println("Goldfish size "+goldFishSizeInInches);

    }
}
