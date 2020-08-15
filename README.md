So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
    1. `Point` class uses getters and setters.
    2. The `Point` class can have two methods, distance(Point) and direction(Point) which will return the distance and direction.
    3. Additionally, we could have an interface called GenericPoint which will have two values x and y and both the methods (distance and direction), and our `Point` class can implement that interface. 
       This way we could implement another class where the point is in 3D space, and we could extend it to any dimensions. The distance and direction methods can be overrided differently in the `3DPoint` class, and we need not make any changes to the 2DPoint class.
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.