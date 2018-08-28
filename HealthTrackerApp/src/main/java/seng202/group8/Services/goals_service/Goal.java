package seng202.group8.Services.goals_service;

import seng202.group8.Services.goals_service.goal_types.GoalType;
import seng202.group8.User.User;

import java.util.Date;

public abstract class Goal {

    private Date startDate;
    private GoalType goalType;
    private User user;
    private boolean isCompleted;


    public Goal(User user) {
        this.user = user;
        this.startDate = new Date();
    }

    /**
     *
     * @return the type of the Goal object
     */
    public GoalType getGoalType() {
        return goalType;
    }

    /**
     *
     * @param goalType a new GoalType parameter
     */
    public void setGoalType(GoalType goalType) {
        this.goalType = goalType;
    }

    /**
     *
     * @return the User parameter
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user a new User object
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return a boolean value representing if the Goal is now complete
     */
    public boolean getIsCompleted() {
        return isCompleted;
    }


    /**
     *
     * @param isCompleted new boolean value to assign to isCompleted parameter
     */
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    /**
     *
     * @return the goal startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate a new Date object for startDate parameter
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public abstract void checkIsCompleted();

}