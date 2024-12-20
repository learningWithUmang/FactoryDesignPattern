package abstractfactory;

import components.Button.Button;
import components.Button.WindowsButton;
import components.DropDown.DropDown;
import components.DropDown.WindowsDropDown;
import components.Menu.Menu;
import components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
