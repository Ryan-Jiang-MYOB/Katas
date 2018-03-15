package algorithm.inheritance;

/// <summary>
/// Should filter out measurements with an X or Y that are less than or equal to 2
/// You'll need to inherit and override methods from other classes in the inheritance folder
/// </summary>

import algorithm.Measurement;

import java.util.ArrayList;
import java.util.Collection;

public class HighPassSummingAggregator extends SummingAggregator {
    public HighPassSummingAggregator(Collection<Measurement> measurements) {
        super(measurements);
    }

    @Override
    protected Collection<Measurement> filterMeasurements() {
        Collection<Measurement> result = new ArrayList<Measurement>();
        for (Measurement measurement: this.measurements) {
            if (!(measurement.getX() <= 2 || measurement.getY() <= 2)) {
                result.add(measurement);
            }
        }
        return result;
    }
}
