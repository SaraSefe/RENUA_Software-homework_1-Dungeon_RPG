package utilities.menu;

import utilities.errors.Errors;

import java.util.Scanner;

public class Menu<T> {

    // Menu options
    private final MenuOption<T>[] options;
    // Display title
    private final String title;
    // Question before user input
    private final String question;

    public Menu(MenuOption<T>[] options, String title, String question) {
        this.options = options;
        this.title = title;
        this.question = question;
    }

    public T display() {

        // If there are no options null is returned
        if(options.length == 0) return null;

        final var scanner = new Scanner(System.in);
        // One based index (starts at 1 for user-friendly reasons)
        int selected = 0;

        System.out.println("---[ " + title + " ]---");
        do {
            try {
                System.out.print("\n" + question + ": ");
                selected = scanner.nextInt();
                if(selected <= 0 || selected > options.length) {
                    selected = 0;
                    Errors.logError("Please, provide a valid number between 1 and " + options.length + ".");
                }
            } catch (Exception ignored) {
                Errors.logError("Please, provide a valid number.");
            }
        } while(selected == 0);

        // Converts the selected value into a 0 based index value (starts at 0)
        return options[selected - 1].getValue();
    }
}