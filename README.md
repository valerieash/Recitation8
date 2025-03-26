# Recitation 3 - Objects Having Objects

## Learning Outcomes

By the end of this activity, a student should be able to:

1. Implement a simple Java class that uses other classes
2. Use classes to accomplish more complex tasks

## Introduction

This recitation requires a reimplementation of the Circle class.  The class uses the Point class developed in lecture.

## Implementing a Circle Class
A circle is an object that can be described by its location and radius.  Depending on the application, a circle may have other properties like color, line width, fill color, etc...  For the purpose of this recitation, it is sufficient to describe our circle using the location and radius.  As such, our Circle class must include two fields called location and radius.  Unlike the last recitation exercise, we will use the Point class that was developed in class.

For this recitation, you will implement the following:

1. The constructors
2. The accessor method <span style="font-family:'courier',courier new;">getLocation()</span>.
3. The mutator method <span style="font-family:'courier',courier new;">setLocation()</span>.
4. The method <span style="font-family:'courier',courier new;">contains()</span>, which returns true if the point passed is in the circle.
5. The method <span style="font-family:'courier',courier new;">intersects()</span>, which returns true if this circle intersects the circle passed.

## Using the Circle Class - The Recitation3 Class

The Recitation3 class contains a main method that is the entry point into the program.  When you submit the code during development, Java will automatically invoke the main method.  You will implement this method to do the following:

1. Get an x and y coordinates from the user.
2. Create an instance of a Circle at (x,y) with radius=16.0 called circle16;
3. Create another instance of a Circle at (14,12) with radius=40.0 called circle40;
4. If the two circles intersect, print <span style="font-family:'courier',courier new; border:1px solid black; background-color:#efefef; padding:0 3px 0 3px;">true</span>; otherwise print <span style="font-family:'courier',courier new; border:1px solid black; background-color:#efefef; padding:0 3px 0 3px;">false</span>.

For example:

```
Enter x:
23
Enter y:
13
true
```
