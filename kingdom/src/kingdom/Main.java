package kingdom;

public class Main
{

  public static void main(String[] args)
  {
    Mammal panda = new Mammal(1869, "Panda");
    Mammal zebra = new Mammal(1778, "Zebra");
    Mammal koala = new Mammal(1816, "Koala");
    Mammal sloth = new Mammal(1804, "Sloth");
    Mammal armadillo = new Mammal(1758, "Armadillo");
    Mammal racoon = new Mammal(1758, "Raccoon");
    Mammal bigfoot = new Mammal(2021, "Bigfoot");

    Bird pigeon = new Bird(1837, "Pigeon");
    Bird peacock = new Bird(1821, "Peacock");
    Bird toucan = new Bird(1758, "Toucan");
    Bird parrot = new Bird(1824, "Parrot");
    Bird swan = new Bird(1758, "Swan");

    Fish salmon = new Fish(1758, "Salmon");
    Fish catfish = new Fish(1817, "Catfish");
    Fish perch = new Fish(1758, "Perch");

    System.out.printf(
      "*** MVP ***%n%n*** List all the animals in descending order by year named ***%n%s%n%n",
      Animal.sortByYear(false)
    );
    System.out.printf(
      "*** List all the animals alphabetically ***%n%s%n%n",
      Animal.sortByName(true)
    );
    System.out.printf(
      "*** List all the animals order by how they move ***%n%s%n%n",
      Animal.sortByMovement(true)
    );
    System.out.printf(
      "*** List only those animals the breath with lungs ***%n%s%n%n",
      Animal.filterByBreath("lungs")
    );
    System.out.printf(
      "*** List only those animals that breath with lungs and were named in 1758 ***%n%s%n%n",
      Animal.filterByBreathAndYear("lungs", 1758)
    );
    System.out.printf(
      "*** List only those animals that lay eggs and breath with lungs ***%n%s%n%n",
      Animal.filterByBreathAndReproduction("lungs", "eggs")
    );
    System.out.printf(
      "*** List alphabetically only those animals that were named in 1758 ***%n%s%n%n",
      Animal.sortByNameAndFilterByYear(1758)
    );
    System.out.printf(
      "*** Stretch Goal ***%n%n*** For the list of animals, list alphabetically those animals that are mammals ***%n%s%n",
      Animal.sortByNameAndFilterByClass("Mammal")
    );
  }
}
