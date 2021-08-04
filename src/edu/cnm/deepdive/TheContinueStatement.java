package edu.cnm.deepdive;

public class TheContinueStatement {

  public static void main(String[] args) {

    String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

    for (String animal : animals) {
      System.out.println(animal);
    }
    System.out.println();
    MY_LOOP:
    for (String animal : animals) {
      if (animal.equals("Cat")) {
        continue MY_LOOP;
      }
      System.out.println(animal);
    }
    System.out.println();
    animal:
//it is legal to use animal as a label but it only adds to confusing code.
    for (String animal : animals) {
      if (animal.equals("Lizard")) {
        continue animal;
      }
      System.out.println(animal);
    }
    System.out.println();
    //without a label
    for (String animal : animals) {
      if (animal.equals("Bird")) {
        continue;
      }
      System.out.println(animal);
    }
    System.out.println();

    //with more than one condition:
    for (String animal : animals) {
      if (animal.equals("Cat") || animal.equals("Bird")) {
        continue;
      }
      System.out.println(animal);
    }
    System.out.println();

    //continue in a while loop
//    int index = 0;
//    while (index < animals.length) {
//      String animal = animals[index];
//
//      if (animal.equals("Lizard")) {
//        continue;//careful because this creates an infinite loop. After continue, we go back to the
//        //start of the while loop, meaning that we don't pass the index++ statement. Index stays zero
//        //and the loop never ends because 0 is smaller than animals.length.
//      }
//
//      System.out.println(animal);
//      index++;
//    }

    System.out.println();
    //the way to solve this is to get index++ inside the while loop:
    int index1 = 0;
    while (index1 < animals.length) {
      String animal = animals[index1];
      index1++;
      
      if (animal.equals("Lizard")) {
        continue;
      }

      System.out.println(animal);
    }

  }

}
