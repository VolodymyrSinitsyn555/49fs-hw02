package health.staff.adminictration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Director {
    @Autowired
    private NutritionExpert nutritionExpert;
    @Autowired
    private FitnessManager fitnessManager;

    public void manageHealthProgram() {
        nutritionExpert.giveAdvice();
        fitnessManager.organizeWorkouts();
    }

    public NutritionExpert getNutritionExpert() {
        return nutritionExpert;
    }

    public void setNutritionExpert(NutritionExpert nutritionExpert) {
        this.nutritionExpert = nutritionExpert;
    }

    public FitnessManager getFitnessManager() {
        return fitnessManager;
    }

    public void setFitnessManager(FitnessManager fitnessManager) {
        this.fitnessManager = fitnessManager;
    }
}
