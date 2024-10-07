public class InheritanceDemo {

    public static void main(String[] args) {
        Browser b1 = new Browser();
        Object ob = new Browser();

        Chromium c1 = new Chromium();
        c1.devTools();
        
        Browser oc = new Chromium();
        Object o2  = new Chromium();

        Chrome ch1 = new Chrome();
        ch1.devTools();
        ch1.cliInspect();
        ch1.openUrl();

       NonChromium c2 = new NonChromium();
       Browser c22 = new NonChromium();
       Object cs = new Object();
    }
}
