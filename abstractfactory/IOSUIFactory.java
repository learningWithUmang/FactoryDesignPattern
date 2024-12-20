package abstractfactory;

import components.Button.Button;
import components.Button.IOSButton;
import components.DropDown.DropDown;
import components.DropDown.IOSDropDown;
import components.Menu.IOSMenu;
import components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
