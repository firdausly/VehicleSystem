public abstract class Vehicle {
    moveBehavior behavior;

    public Vehicle(){};

    public void performMove(){
        behavior.move();
    }
    public abstract void Display();

    public void setBehavior(moveBehavior behavior){
        this.behavior=behavior;
    }
}
