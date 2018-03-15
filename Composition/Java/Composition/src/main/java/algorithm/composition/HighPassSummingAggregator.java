package algorithm.composition;

import algorithm.Measurement;

import java.util.ArrayList;
import java.util.Collection;

public class HighPassSummingAggregator extends PointsAggregator{
    public HighPassSummingAggregator(Collection<Measurement> measurements) {
        super(measurements, new HighPassFilter(), new SummingStrategy());
    }
}
