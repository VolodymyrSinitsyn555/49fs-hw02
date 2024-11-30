package health.staff.adminictration;

import health.staff.specialists.nutrition.Physiotherapist;
import health.staff.specialists.nutrition.Trainer;
import org.springframework.beans.factory.annotation.Autowired;

public class FitnessManager {
    @Autowired
    private Trainer trainer;
    @Autowired
    private Physiotherapist physiotherapist;

public void organizeWorkouts(){
    trainer.createWorkoutPlan();
    physiotherapist.provideTherapy();
}

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Physiotherapist getPhysiotherapist() {
        return physiotherapist;
    }

    public void setPhysiotherapist(Physiotherapist physiotherapist) {
        this.physiotherapist = physiotherapist;
    }
}
