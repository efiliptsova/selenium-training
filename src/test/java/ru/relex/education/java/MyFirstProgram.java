package ru.relex.education.java;

public class MyFirstProgram {

  /**
   * Task 1.9
   * @param args
   */
  public static void main(String[] args) {
    Point p1 = new Point(3,5);
    Point p2 = new Point(3,6);
    System.out.println("3. Расстояние между точками (" + p1.x + ";" + p1.y + ") и (" + p2.x + ";" + p2.y + ") = " +
            distance(p1, p2));
    System.out.println("4. Расстояние между точками (" + p1.x + ";" + p1.y + ") и (" + p2.x + ";" + p2.y + ") = " +
                                                                                                                                                                                                                                                                                                                                                                                 p1.distance(p2));
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
  }
}
