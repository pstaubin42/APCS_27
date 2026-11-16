

public class StepTracker {
    
    int goal;
    int days;
    int activeDays;
    int totalSteps;

    public StepTracker(int a){
        goal = a;
        days = 0;
        activeDays = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int a) {
        days ++;
        totalSteps += a;
        if(goal <= a){
            activeDays ++;
        }


    }

    public int activeDays() {
        return activeDays;
    }

   public double averageSteps(){
        return totalSteps/days;
   }


}