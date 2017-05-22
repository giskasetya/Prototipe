package giska_setya.p;

/**
 * Created by User on 20/05/2017.
 */

public class Data {
    private String TrCode;
    public Data (){
    }

    public Data (String TrCode) {
        this.TrCode = TrCode;
    }
    public String getTrCode(){
        return TrCode;
    }
    public void setTrCode(String TrCode) {
        this.TrCode = TrCode;
    }

}
