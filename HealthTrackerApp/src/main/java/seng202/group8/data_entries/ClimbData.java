package seng202.group8.data_entries;

import seng202.group8.user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ClimbData extends NotAssistedSportsData {
    public ClimbData(String newTitle, DataType dataType, ArrayList<LocalDateTime> newDateTimes, ArrayList<CoordinateData> newCoordinatesList, ArrayList<Integer> newHeartRateList, User theCurrentUser) {
        super(newTitle, dataType, newDateTimes, newCoordinatesList, newHeartRateList, theCurrentUser);
    }

    public double getConsumedCalories() {

        double calories = calculateCaloriesFromUserStatsAndHeartRateAndTime();

        return calories;
        //if (this.getHeartRateList() == 0);
    }
}
//    public ClimbData(String newTitle,DataType activityType, ArrayList<Double> newCoordinatesList, ArrayList<Integer> newHeartRateList) {
//        super(newTitle, activityType, newCoordinatesList, newHeartRateList);
//    }
//
//    double getConsumedCalories(String activityType) {
//        return 0;
//    }
//}
