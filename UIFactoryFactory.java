

import abstractfactory.*;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(Platform platform){
        //platform
        switch (platform){
            case ANDROID:
                return new AndroidUIFactory();
            case IOS:
                return new IOSUIFactory();
            case WINDOWS:
                return new WindowsUIFactory();
        }
        return new DefaultUIFactory();
    }
}
