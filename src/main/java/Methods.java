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

        Book triDruga = new Book();

        triDruga.setName("Tri Druga");
        triDruga.setAuthor("Pushkin");
        triDruga.setBuyPrice(-12);
        triDruga.setYearOfIssue(1950);

        String bookName=triDruga.getName();
        String bookAuthor=triDruga.getAuthor();
        int bPrice=triDruga.getBuyPrice();
        int year=triDruga.getYearOfIssue();
        System.out.println(bookName+", "+bookAuthor+", "+bPrice+", "+year+".");

        System.out.println("____________CellPhone__________");

        CellPhone galaxy = new CellPhone();

        galaxy.setBrand("Sumsung");
        galaxy.setModel("Galaxy S8");
        galaxy.setScreenSize(6);

        String brand=galaxy.getBrand();
        String model=galaxy.getModel();
        double screenSize=galaxy.getScreenSize();

        System.out.println(brand+", "+model+", "+screenSize+".");

    }
}
