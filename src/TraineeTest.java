/*public class House1 {*/public class TraineeTest {
    public static void main(String args[]){
        System.out.println("First create a Trainee object via the no-argument constructor...");
        Trainee p1 = new Trainee();
        System.out.println("Values of Trainee p1:\n" + p1.toString());
        System.out.println("\n\nNow create a second Trainee, this time via arguments passed to the constructor...");
        Trainee p2 = new Trainee("Jerry McGuire", "Tralee",  25, 1.8, 15, 10);

        System.out.println("Values of Trainee object p2 :\n" + p2.toString());
        System.out.println("\n\nWill now attempt to check the functionality of the setAddress() method separately by setting the address of p1 to \"Ballyheigue\"");
        p1.setAddress("Ballyheigue");
        System.out.println("The address of the Trainee object p1 ( obtained using getAddress() ) is now " + p1.getAddress());

        System.out.println("\n\nWill now attempt to check the functionality of the getStartWeight() method separately on p2");
        System.out.println("Starting weight of the Trainee p2 is " + p2.getStartWeight().toString());

        System.out.println("\n\nCan also set the starting weight of p2 to 14 st 12 lb ");
        p2.setStartWeight(14,12);
        System.out.println("New starting weight of the Trainee p2 is " + p2.getStartWeight().toString());

        //Trainee p2 = new Trainee("Jerry McGuire", "Tralee", 25, 1.8, 15, 10);

// change the starting weight to 14 st 6 lbs
        p2.setStartWeight(14 , 6);


    }
}


