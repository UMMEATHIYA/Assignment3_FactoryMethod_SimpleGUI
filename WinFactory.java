package Q2;

// WinFactory.java
public class WinFactory implements GUIFactory {
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
