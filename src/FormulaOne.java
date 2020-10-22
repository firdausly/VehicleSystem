public class FormulaOne extends Vehicle{

    public FormulaOne(){
        behavior=new Driving();
    }


    @Override
    public void Display() {
        System.out.print("I am FormulaOne.");
    }
}
