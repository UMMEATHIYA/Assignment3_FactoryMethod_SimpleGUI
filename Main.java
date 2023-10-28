package Question2;

import java.util.Scanner;

// Abstract Widget Classes
abstract class AbstractTextField {
    public abstract void render();
}

abstract class AbstractPushButton {
    public abstract void render();
}

abstract class AbstractListBox {
    public abstract void render();
}

// Concrete Widgets for Windows
class WinTextField extends AbstractTextField {
    @Override
    public void render() {
        System.out.println("Rendering a Windows text field.");
    }
}

class WinPushButton extends AbstractPushButton {
    @Override
    public void render() {
        System.out.println("Rendering a Windows push button.");
    }
}

class WinListBox extends AbstractListBox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows list box.");
    }
}

// Concrete Widgets for macOS
class MacTextField extends AbstractTextField {
    @Override
    public void render() {
        System.out.println("Rendering a macOS text field.");
    }
}

class MacPushButton extends AbstractPushButton {
    @Override
    public void render() {
        System.out.println("Rendering a macOS push button.");
    }
}

class MacListBox extends AbstractListBox {
    @Override
    public void render() {
        System.out.println("Rendering a macOS list box.");
    }
}

// Concrete Widgets for Linux
class LinuxTextField extends AbstractTextField {
    @Override
    public void render() {
        System.out.println("Rendering a Linux text field.");
    }
}

class LinuxPushButton extends AbstractPushButton {
    @Override
    public void render() {
        System.out.println("Rendering a Linux push button.");
    }
}

class LinuxListBox extends AbstractListBox {
    @Override
    public void render() {
        System.out.println("Rendering a Linux list box.");
    }
}

// Abstract Factory Interface
interface GUIFactory {
    AbstractTextField createTextField();
    AbstractPushButton createPushButton();
    AbstractListBox createListBox();
}

// Concrete Factories
class WinFactory implements GUIFactory {
    @Override
    public AbstractTextField createTextField() {
        return new WinTextField();
    }

    @Override
    public AbstractPushButton createPushButton() {
        return new WinPushButton();
    }

    @Override
    public AbstractListBox createListBox() {
        return new WinListBox();
    }
}

class MacFactory implements GUIFactory {
    @Override
    public AbstractTextField createTextField() {
        return new MacTextField();
    }

    @Override
    public AbstractPushButton createPushButton() {
        return new MacPushButton();
    }

    @Override
    public AbstractListBox createListBox() {
        return new MacListBox();
    }
}

class LinuxFactory implements GUIFactory {
    @Override
    public AbstractTextField createTextField() {
        return new LinuxTextField();
    }

    @Override
    public AbstractPushButton createPushButton() {
        return new LinuxPushButton();
    }

    @Override
    public AbstractListBox createListBox() {
        return new LinuxListBox();
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        GUIFactory factory = getFactoryFromUserInput();

        AbstractTextField textField = factory.createTextField();
        AbstractPushButton pushButton = factory.createPushButton();
        AbstractListBox listBox = factory.createListBox();

        textField.render();
        pushButton.render();
        listBox.render();
    }

    private static GUIFactory getFactoryFromUserInput() {
        //int platform = 2; // Assume user chose macOS
        System.out.println("Choose a platform (1=Windows, 2=macOS, 3=Linux):");
        Scanner sc =  new Scanner(System.in);
        int platform = sc.nextInt();

        switch (platform) {
            case 1:
                return new WinFactory();
            case 2:
                return new MacFactory();
            case 3:
                return new LinuxFactory();
            default:
                throw new IllegalArgumentException("Invalid platform choice.");
        }
    }
}
