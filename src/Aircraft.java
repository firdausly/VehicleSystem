public class Aircraft extends Vehicle{

    public Aircraft(){
        behavior=new Flying();
    }


    @Override
    public void Display() {
        System.out.print("I am Aircraft.");
    }
}
