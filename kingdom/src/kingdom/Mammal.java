package kingdom;

public class Mammal extends Animal {

  public Mammal(int yearNamed, String name) {
    super(yearNamed, name);
    // set unassigned values from abstract class
    reproductionType = "live births";
    respirationType = "lungs";
    movementType = "walk";
    className = "Mammal";
  }
}
