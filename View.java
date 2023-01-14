package mvc;
//Project's author Yevgeny Dyachenko
public class View {

    public static final String INPUT_STRING_DATA = "Input a word 'Hello': ";
    public static final String INPUT_STRING_DATA1 = "Input a word 'world': ";
    public static final String WRONG_INPUT_REPEAT_PLEASE = "Wrong input! Repeat please! ";
    public static final String PHRASE_IS = "Our phrase is: ";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printMessageAndOther(String message, String value){
        System.out.println(message + value);
    }
}
