import abstractfactory.UIFactory;
import components.Button.Button;
import components.DropDown.DropDown;
import components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        flutter.refreshUI();
        flutter.setTheme();

        UIFactory uiFactory = flutter.createUIFactory(Platform.WINDOWS);
        Button button = uiFactory.createButton();
        button.showButton();
        button.disableButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.showDropDown();


    }
}
