package mvc;
//Project's author Yevgeny Dyachenko
public class Main {
    public static void main(String[] args) {
        // Initialization

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();

    }
}
