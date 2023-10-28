# GUI Widget Framework

This project demonstrates a GUI widget framework that provides native look and feel on different platforms (Windows, macOS, Linux) using the Abstract Factory design pattern.

## Usage

1. Run the program.

    ```
    Choose a platform (1=Windows, 2=macOS, 3=Linux):
    2
    Rendering a macOS text field.
    Rendering a macOS push button.
    Rendering a macOS list box.

    Process finished with exit code 0
    ```
     ![image](https://github.com/UMMEATHIYA/Assignment3_FactoryMethod_SimpleGUI/assets/43459908/91569b70-d344-4462-8414-39d78308e92a)

    ![image](https://github.com/UMMEATHIYA/Assignment3_FactoryMethod_SimpleGUI/assets/43459908/3a35330e-c3df-4cb1-83e7-0f77c6a5fdee)



2. The program prompts the user to choose a platform (1=Windows, 2=macOS, 3=Linux).

3. Based on the user's choice (in this example, we assume the user chose macOS), the program creates and renders GUI elements for macOS.

   - Rendering a macOS text field.
   - Rendering a macOS push button.
   - Rendering a macOS list box.

## How It Works

- Abstract Widget Classes (`AbstractTextField`, `AbstractPushButton`, `AbstractListBox`) provide a blueprint for different types of GUI widgets.

- Concrete Widget classes are implemented for each supported platform (Windows, macOS, Linux).

- Factories (`WinFactory`, `MacFactory`, `LinuxFactory`) implement the `GUIFactory` interface, providing methods to create platform-specific widgets.

- The `Main` class prompts the user to choose a platform and uses the corresponding factory to create and render GUI elements.

## Contributing

If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with descriptive messages.
4. Push your changes to your fork.
5. Open a pull request to the main repository's `master` branch.

## License

This project is licensed under the [MIT License](LICENSE).
