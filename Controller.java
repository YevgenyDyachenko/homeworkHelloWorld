package mvc;

import java.util.Scanner;

public class Controller {


    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){

        Scanner sc = new Scanner(System.in);

        model.setValue1(inputStringValueWithScanner(sc));

        model.setValue2(inputStringValue2WithScanner(sc));

        view.printMessageAndOther(View.PHRASE_IS, model.getValue2());

    }

    public String inputStringValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_STRING_DATA);
        while( ! sc.hasNext("Hello")) {
            view.printMessage(View.WRONG_INPUT_REPEAT_PLEASE + View.INPUT_STRING_DATA);
            sc.next();
        }
        String value1= sc.next();
        return value1;

    }
    public String inputStringValue2WithScanner(Scanner sc) {
        view.printMessage(View.INPUT_STRING_DATA1);
        while( ! sc.hasNext("world")) {
            view.printMessage(View.WRONG_INPUT_REPEAT_PLEASE + View.INPUT_STRING_DATA1);
            sc.next();
        }
        String value2= sc.next();
        return value2;

    }

}
