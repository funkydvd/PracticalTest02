package ro.pub.cs.systems.eim.practicaltest02;

/**
 * Created by student on 5/20/16.
 */
public class ClockInformation {

    private String info;


    public ClockInformation() {
        this.info = null;

    }

    public ClockInformation(
            String info) {
        this.info =info;
    }


    public void setInfo(String info) {
        this.info= info;
    }

    public String getInfo() {
        return this.info;
    }

    @Override
    public String toString() {

        return info + "\n";
    }

}
