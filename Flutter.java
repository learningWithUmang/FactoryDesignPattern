import abstractfactory.*;

public class Flutter {
    //Non factory methods
    void refreshUI(){
        System.out.println("Refreshing UI..");
    }

    void setTheme(){
        System.out.println("Setting theme..");
    }

    //Factory method
    UIFactory createUIFactory(Platform platform){
        return UIFactoryFactory.createUIFactory(platform); //Practical Factory Design pattern
    } //OCP and SRP
}
