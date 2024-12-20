package abstractfactory;

import components.Button.Button;
import components.DropDown.DropDown;
import components.Menu.Menu;

public class DefaultUIFactory implements UIFactory{
    @Override
    public DropDown createDropDown() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Button createButton() {
        return null;
    }
}
