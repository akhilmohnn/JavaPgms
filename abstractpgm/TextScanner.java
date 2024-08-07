package abstractpgm;

public class TextScanner {

    Hello obj;

    public TextScanner(Hello obj) {
        this.obj = obj;
    }

    void scan() {
        String text = "Scanned text";
        obj.onText(text);  // Correctly passing the variable text
    }
}
