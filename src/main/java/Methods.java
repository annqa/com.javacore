public class Methods {
    public static void main(String[]args){

        carclass mashina = new carclass();
        mashina.beep();

        carclass ivanCar=new carclass();
        ivanCar.brand="BMW";
        ivanCar.color="Pink";
        ivanCar.gasVolume=18;
        ivanCar.beep();


        ivanCar.printCarInfo();

        carclass janeCar=new carclass();
        janeCar.color="Silver";
        janeCar.brand="Audi";
        janeCar.gasVolume=19;
        janeCar.printCarInfo();

        System.out.println("----------------person--------------------------");

        person mailman = new person();
        mailman.name="John";
        mailman.lastName="Jole";
        mailman.eyeColor="brown";
        mailman.weight=180;
        mailman.age=45;
        mailman.hasChildren=true;

        mailman.printFullName();
        mailman.printPhysicalConditions();

        System.out.println("____________BOOK____________");

        Book triDruga = new Book("lf");

        triDruga.setName("Tri Druga");
        triDruga.setAuthor("Pushkin");
        triDruga.setBuyPrice(-12);
        triDruga.setYearOfIssue(1950);

        String bookName=triDruga.getName();
        String bookAuthor=triDruga.getAuthor();
        int bPrice=triDruga.getBuyPrice();
        int year=triDruga.getYearOfIssue();


        System.out.println("____________CellPhone__________");

        CellPhone galaxy = new CellPhone();

        galaxy.setBrand("Sumsung");
        galaxy.setModel("Galaxy S8");
        galaxy.setScreenSize(6);

        String brand=galaxy.getBrand();
        String model=galaxy.getModel();
        double screenSize=galaxy.getScreenSize();

        System.out.println(brand+", "+model+", "+screenSize+".");
        System.out.println("__________CONSTRUCTOR CELL PHONE___________");
        CellPhone galaxy11 = new CellPhone("Sumsung", "S8", 6);
        CellPhone galaxyNew= new CellPhone();

        System.out.println("____________CONSTRUCTOR BOOK______________");

        Book book1=new Book("Anchar");
        Book book=new Book("jf");
        Book book3=new Book("buckvar", "rumyanzev", 15, 2010);

        System.out.println("_______________STUDENT CONSTRUCTOR_______________");

        String[] sub=new String[]{"Math", "History", "Biology", "Geographic"};

        Student john=new Student ("John", "Dole", "Finance", sub);
        Student jane=new Student("Jane", "Dole", "Finance", sub);
        Student boris=new Student();
        boris.setName("Boris");
        //boris.setLastName("Ivanov");
       // boris.setMajor("History");
        boris.setSubjects(sub);

        john.printStudentInfo();
        jane.printStudentInfo();
        boris.printStudentInfo();

        System.out.println("                                ");
        Dog bob=new Dog("Bob","doberman","no diseice",5);
        bob.printDog();


    }
}
