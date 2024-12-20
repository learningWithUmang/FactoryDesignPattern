package components.Button;

public class IOSButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing IOS Button...");
    }

    @Override
    public void disableButton() {
        System.out.println("Disabling IOS Button...");
    }
}
