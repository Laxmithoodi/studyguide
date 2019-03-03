package everybody.clap.your.hands;

public class SlowClap extends Clap {

    public String clap() {
        String result = "";
        for (int i = getNumberOfClaps(); i >= 0 ; i--) {
            result += "Clap"+ createPauses(i);
        }
        return result;
    }

    public String createPauses(Integer numberOfPauses){
        String result = "";
        for (int i = numberOfPauses; i >= 0 ; i--){
            result += ".";
        }
        return result;
    }

}
