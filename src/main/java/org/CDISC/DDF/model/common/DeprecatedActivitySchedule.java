package org.CDISC.DDF.model.common;

import java.util.List;

/**
 * org.CDISC.DDF.model.common.ActivitySchedule is a collection class for Activity objects.
 *
 * @author Chris Upkes
 */

public class DeprecatedActivitySchedule {


    private Activity firstActivity;
    private List<Activity> activityList;


    public DeprecatedActivitySchedule(Activity firstActivity) {
        this.firstActivity = firstActivity;
    }

    public Activity getFirstActivity() {
        return firstActivity;
    }

    public Activity getNextActivity(Activity fromActivity) {

        // TO_DO implement
        return null;
    }

    public Activity getPreviousActivity(Activity fromActivity) {

        // TO_DO implement
        return null;
    }

    public List<Activity> getAllActivities() {

        // TO_DO implement
        return null;
    }

    public void setFirstActivity(Activity firstActivity) {
        this.firstActivity = firstActivity;
    }

    public void addNextActivity(Activity nextActivity) {
        // TO_DO implement

    }

    public void removeActivity(Activity activity) {

        //TO_DO implement
    }


}
