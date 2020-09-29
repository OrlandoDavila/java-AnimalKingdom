package kingdom;

public class Fish extends Animal
{

  public Fish(int yearNamed, String name)
  {
    super(yearNamed, name);

    reproductionType = "eggs";
    respirationType = "gills";
    movementType = "swim";
    className = "Fish";
  }
}
