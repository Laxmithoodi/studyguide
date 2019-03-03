package everybody.clap.your.hands;

public class Applause extends Clap {

    public String clap() {
        String result = "";
        for (int i = 1; i <=  getNumberOfClaps(); i++) {
            result += "Clap!..";
        }
        return result;
    }

}
