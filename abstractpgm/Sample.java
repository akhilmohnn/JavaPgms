package abstractpgm;


public class Sample extends Hello {

    @Override
    void onText(String text) {
        System.out.println(text);
    }

    Sample() {
        TextScanner tc = new TextScanner(this);
        tc.scan();
    }

    public static void main(String[] args) {
        new Sample();
    }
}
