package components.Button;

public class WindowsButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing Windows Button...");
    }

    @Override
    public void disableButton() {
        System.out.println("Disabling Windows Button...");
    }
}
