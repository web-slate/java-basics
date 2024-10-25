package algorithms.math_algorithms;

import java.util.Scanner;

public class EuclideanFindDistance {
  public static void main(String args[]) {
    int x1, y1, x2, y2;
    Scanner scannerInstance = new Scanner(System.in);

    System.out.println("Enter your input");
    // Read Input
    x1 = scannerInstance.nextInt();
    y1 = scannerInstance.nextInt();
    x2 = scannerInstance.nextInt();
    y2 = scannerInstance.nextInt();

    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);
    double distance = findDistance(p1, p2);
    System.out.println(distance);
  }

  public static double findDistance(Point p1, Point p2) {
    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + 
    (p2.y - p1.y) * (p2.y - p1.y));
  }
}

class Point {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

// Compile and Run the below command.
// javac algorithms/math/EuclideanFindDistance.java && java algorithms.math.EuclideanFindDistance