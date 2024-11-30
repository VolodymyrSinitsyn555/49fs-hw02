package health.staff.adminictration;

import health.staff.specialists.fitness.Dietician;
import health.staff.specialists.fitness.MealPlanner;
import org.springframework.beans.factory.annotation.Autowired;

public class NutritionExpert {
    @Autowired
    private Dietician dietician;
    @Autowired
    private MealPlanner mealPlanner;

    public void giveAdvice() {
        dietician.createDietPlan();
        mealPlanner.planMeals();
    }

    public Dietician getDietician() {
        return dietician;
    }

    public void setDietician(Dietician dietician) {
        this.dietician = dietician;
    }

    public MealPlanner getMealPlanner() {
        return mealPlanner;
    }

    public void setMealPlanner(MealPlanner mealPlanner) {
        this.mealPlanner = mealPlanner;
    }
}
