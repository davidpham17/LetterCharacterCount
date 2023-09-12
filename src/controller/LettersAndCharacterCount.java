
package controller;

import common.Algorithsm;
import common.Library;
import model.Element;
import view.Menu;

public class LettersAndCharacterCount extends Menu<String>{
    static String[] mc = {"Letters count", "Character count", "Exit"};
    
    protected Library library;
    protected Algorithsm algorithsm;
    protected Element element;
    protected String s;

    public LettersAndCharacterCount(Element element) {
        super("PROGRAMING", mc);
        library = new Library();
        algorithsm = new Algorithsm();
        s = element.getS();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                s = library.inputString("string: ");
                algorithsm.countLetters(s);
                break;
            case 2:
                s = library.inputString("string: ");
                algorithsm.countCharacter(s);
                System.out.println(s);
                
                break;
            case 3:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }
}
