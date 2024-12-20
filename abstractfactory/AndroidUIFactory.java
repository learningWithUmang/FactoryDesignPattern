package abstractfactory;

import abstractfactory.UIFactory;
import components.Button.AndroidButton;
import components.Button.Button;
import components.DropDown.AndroidDropDown;
import components.DropDown.DropDown;
import components.Menu.AndroidMenu;
import components.Menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
