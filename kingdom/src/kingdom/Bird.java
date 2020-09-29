package kingdom;

public class Bird extends Animal
{

  public Bird(int yearNamed, String name)
  {
    super(yearNamed, name);

    reproductionType = "eggs";
    respirationType = "lungs";
    movementType = "fly";
    className = "Bird";
  }
}
