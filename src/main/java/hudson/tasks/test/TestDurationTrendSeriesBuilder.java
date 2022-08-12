package hudson.tasks.test;

import edu.hm.hafner.echarts.SeriesBuilder;
import java.util.HashMap;
import java.util.Map;
import org.kohsuke.accmod.Restricted;
import org.kohsuke.accmod.restrictions.NoExternalUse;

@Restricted(NoExternalUse.class)
public class TestDurationTrendSeriesBuilder extends SeriesBuilder<TestObject> {
    public static final String SECONDS = "Seconds";
    public static final String MILLISECONDS = "Milliseconds";

    @Override
    protected Map<String, Integer> computeSeries(TestObject testObject) {
        Map<String, Integer> series = new HashMap<>();

        series.put(MILLISECONDS, (int) (testObject.getDuration() * 1000.0) );

        return series;
    }
}
