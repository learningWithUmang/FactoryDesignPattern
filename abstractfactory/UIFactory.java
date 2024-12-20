package abstractfactory;

import components.Button.Button;
import components.DropDown.DropDown;
import components.Menu.Menu;

public interface UIFactory {
    //Factory methods
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
