package learnerlab;

public abstract class Instructor extends  Person implements Learner{
    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learners, double numberOfHours) {

    }

    public void learn(double numberOfHours,Learner[]learners) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
    }

    public double getTotalStudyTime() {

        return 0;
    }
}
