package hudson.tasks.junit;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import static hudson.tasks.test.TestDurationTrendSeriesBuilder.MILLISECONDS;

public class TestDurationResultSummary implements Serializable {

    private final int buildNumber;
    private final float duration;

    public TestDurationResultSummary(int buildNumber, float duration) {
        this.buildNumber = buildNumber;
        this.duration = duration;
    }

    public Map<String, Integer> toMap() {
        Map<String, Integer> series = new HashMap<>();
        series.put(MILLISECONDS, (int) (duration * 1000.0) );
        return series;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public String getDisplayName() {
        return "#" + buildNumber;
    }

    public float getDuration() {
        System.out.println("TestDurationResultSummary: duration = " + duration);
        return duration;
    }
}
