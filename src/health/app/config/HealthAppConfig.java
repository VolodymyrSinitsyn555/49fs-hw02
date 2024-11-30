package health.app.config;

import health.staff.adminictration.Director;
import health.staff.adminictration.FitnessManager;
import health.staff.adminictration.NutritionExpert;
import health.staff.specialists.fitness.Dietician;
import health.staff.specialists.fitness.MealPlanner;
import health.staff.specialists.nutrition.Physiotherapist;
import health.staff.specialists.nutrition.Trainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HealthAppConfig {

    @Bean
    public Director director() {
        return new Director();
    }

    @Bean
    public FitnessManager fitnessManager() {
        return new FitnessManager();
    }

    @Bean
    public NutritionExpert nutritionExpert() {
        return new NutritionExpert();
    }

    @Bean
    public Dietician dietician() {
        return new Dietician();
    }

    @Bean
    public MealPlanner mealPlanner() {
        return new MealPlanner();
    }

    @Bean
    public Physiotherapist physiotherapist() {
        return new Physiotherapist();
    }

    @Bean
    public Trainer trainer() {
        return new Trainer();
    }
}
