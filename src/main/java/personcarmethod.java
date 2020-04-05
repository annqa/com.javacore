public class personcarmethod {
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



    }
}
