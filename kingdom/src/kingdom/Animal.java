package kingdom;

import java.util.ArrayList;

public abstract class Animal
{
  private static int maximumId = 0;
  private static ArrayList<Animal> instances = new ArrayList<Animal>();
  protected int id, yearNamed;
  protected String name, reproductionType, respirationType, movementType, className;

  public Animal(int yearNamed, String name) {
    maximumId++;
    id = maximumId;
    this.yearNamed = yearNamed;
    this.name = name;
    instances.add(this);
  }

  public String toString() {
    return String.format(
      "Animals{id=%d, name=%s, yearNamed=%d}%n",
      id,
      name,
      yearNamed
    );
  }

  public String reproduce() {
    return reproductionType;
  }

  public String breath() {
    return respirationType;
  }

  public String move() {
    return movementType;
  }

  public static ArrayList<Animal> sortByYear(boolean ascending) {
    ArrayList<Animal> clone = new ArrayList<Animal>(instances);
    if (ascending) clone.sort(
      (animal1, animal2) -> animal1.yearNamed - animal2.yearNamed
    ); else clone.sort(
      (animal1, animal2) -> animal2.yearNamed - animal1.yearNamed
    );
    return clone;
  }

  public static ArrayList<Animal> sortByName(boolean ascending) {
    ArrayList<Animal> clone = new ArrayList<Animal>(instances);
    if (ascending) clone.sort(
      (animal1, animal2) -> animal1.name.compareTo(animal2.name)
    ); else clone.sort(
      (animal1, animal2) -> animal2.name.compareTo(animal1.name)
    );
    return clone;
  }

  public static ArrayList<Animal> sortByMovement(boolean ascending) {
    ArrayList<Animal> clone = new ArrayList<Animal>(instances);
    if (ascending) clone.sort(
      (animal1, animal2) -> animal1.movementType.compareTo(animal2.movementType)
    ); else clone.sort(
      (animal1, animal2) -> animal2.movementType.compareTo(animal1.movementType)
    );
    return clone;
  }

  public static ArrayList<Animal> filterByBreath(String respirationType) {
    ArrayList<Animal> filter = new ArrayList<Animal>();
    for (Animal animal : instances) if (
      animal.respirationType.equals(respirationType)
    ) filter.add(animal);
    return filter;
  }

  public static ArrayList<Animal> filterByBreathAndYear(
    String respirationType,
    int yearNamed
  ) {
    ArrayList<Animal> filter = new ArrayList<Animal>();
    for (Animal animal : instances) if (
      (animal.respirationType.equals(respirationType)) &&
      (animal.yearNamed == yearNamed)
    ) filter.add(animal);
    return filter;
  }

  public static ArrayList<Animal> filterByBreathAndReproduction(
    String respirationType,
    String reproductionType
  ) {
    ArrayList<Animal> filter = new ArrayList<Animal>();
    for (Animal animal : instances) if (
      (animal.respirationType.equals(respirationType)) &&
      (animal.reproductionType.equals(reproductionType))
    ) filter.add(animal);
    return filter;
  }

  public static ArrayList<Animal> sortByNameAndFilterByYear(int yearNamed) {
    ArrayList<Animal> filter = new ArrayList<Animal>();

    for (Animal animal : instances) if (
      (animal.yearNamed == yearNamed)
    ) filter.add(animal);

    filter.sort((animal1, animal2) -> animal1.name.compareTo(animal2.name));
    return filter;
  }

  public static ArrayList<Animal> sortByNameAndFilterByClass(String className) {
    ArrayList<Animal> filter = new ArrayList<Animal>();

    for (Animal animal : instances) if (
      (animal.className.equals(className))
    ) filter.add(animal);

    filter.sort((animal1, animal2) -> animal1.name.compareTo(animal2.name));
    return filter;
  }
}
