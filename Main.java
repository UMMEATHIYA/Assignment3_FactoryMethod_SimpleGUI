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
        Scanner input = new Scanner(System.in);

        // Ask the user to choose a platform
        System.out.println("Choose a platform (1=Windows, 2=macOS, 3=Linux): ");
        int platform = input.nextInt();

        // Create a factory object based on the user's choice of platform
        GUIFactory factory;
        switch (platform) {
            case 1:
                factory = new WinFactory();
                break;
            case 2:
                factory = new MacFactory();
                break;
            case 3:
                factory = new LinuxFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid platform choice.");
        }

        // Use the factory object to create and render GUI elements for the selected platform
        AbstractTextField textField = factory.createTextField();
        AbstractPushButton pushButton = factory.createPushButton();
        AbstractListBox listBox = factory.createListBox();

        textField.render();
        pushButton.render();
        listBox.render();
    }
}
