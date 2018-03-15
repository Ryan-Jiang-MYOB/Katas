package algorithm.composition;

import algorithm.Measurement;

import java.util.ArrayList;
import java.util.Collection;

/// <summary>
/// Should filter out measurements with an X or Y that are less than or equal to 2
/// You'll need to implement IMeasureFilter to do the job
/// </summary>
///
public class HighPassFilter implements IMeasurementFilter {
    @Override
    public Collection<Measurement> filter(Collection<Measurement> measurements) {
        Collection<Measurement> result = new ArrayList<Measurement>();
        for (Measurement measurement: measurements) {
            if (!(measurement.getX() <= 2 || measurement.getY() <= 2)) {
                result.add(measurement);
            }
        }
        return result;
    }
}
