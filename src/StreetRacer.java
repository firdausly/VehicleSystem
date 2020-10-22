public class StreetRacer extends Vehicle{

    public StreetRacer(){
        behavior=new Driving();
    }


    @Override
    public void Display() {
        System.out.print("I am StreetRacer.");
    }
}
