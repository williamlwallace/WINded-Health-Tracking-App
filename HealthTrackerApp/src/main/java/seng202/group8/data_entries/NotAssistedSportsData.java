package seng202.group8.data_entries;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class NotAssistedSportsData extends Data {
    public NotAssistedSportsData(String newTitle, DataType dataType, ArrayList<LocalDateTime> newDateTimes, ArrayList<CoordinateData> newCoordinatesList, ArrayList<Integer> newHeartRateList) {
        super(newTitle, dataType, newDateTimes, newCoordinatesList, newHeartRateList);
    }

    public abstract double getConsumedCalories();

}
//    public NotAssistedSportsData(String newTitle, DataType activityType, ArrayList<Double> newCoordinatesList, ArrayList<Integer> newHeartRateList) {
//        super(newTitle, activityType, newCoordinatesList, newHeartRateList);
//    }
//
////    public NotAssistedSportsData(String newTitle, String activityType, ArrayList<Double> newCoordinatesList, ArrayList<Integer> newHeartRateList) {
////        super(newTitle, activityType, newCoordinatesList, newHeartRateList);
////    }
//
//    abstract double getConsumedCalories(String activityType);
//}
