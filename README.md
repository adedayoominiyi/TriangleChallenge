<b>The Triangle challenge</b>

A program that will determine the type of a triangle. It should take the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.
<br />
<br />
<b>Design</b>: 
1) An immutable Triangle class is used to represent a triangle. The constructor of this class takes as input, an integer array of exactly 3 sides. To avoid the "AnemicDomainModel" antipattern (refer to https://www.martinfowler.com/bliki/AnemicDomainModel.html), the Triangle class is responsible for computing its own type via a "computeTriangleType" method. 

2) An enum is used to represent the 3 types of triangles namely: Equilateral, Isosceles and Scalene.

3) Units tests can be found in the class TriangleTest. 
<br />
<br />
<b>Technical Specs</b>: 
Java, Netbeans IDE 8.0.2, Apache Maven 3.5.2, Junit 4
