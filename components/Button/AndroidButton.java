package components.Button;

public class AndroidButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing Android Button...");
    }

    @Override
    public void disableButton() {
        System.out.println("Disabling Android Button...");
    }
}
