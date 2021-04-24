package pl.radekcholuj.webinarcollection;

import java.util.Comparator;

public class WebinarComparator implements Comparator<Webinar> {
    @Override
    public int compare(Webinar w1, Webinar w2) {
        if (w1 == null) {
            return 1;
        }

        double w1Result = (double) w1.getPresent() / w1.getSignedUp();
        double w2Result = (double) w2.getPresent() / w2.getSignedUp();

        if (w1Result > w2Result) {
            return -1;
        } else if (w1Result == w2Result) {
            return 0;
        } else {
            return 1;
        }
    }
}
