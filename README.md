# Garden of Plenty
>The garden contains the secrets to victory.

## Objectives required to complete
This quest has us working with methods and ArrayLists.

## Quest Requirements

### Objective 1 - The methods
Create a class that stores an `ArrayList` of `String`s.

The `String`s store 2 bits of information about flowers.

The `String`s store a count and a name.

You will need to use `ParseInt`.

`“14 Daisy”`   there are 14 daisies.

`“01 Rose”`  there is one rose.

There are numerous methods.

In order for this program to work correctly, several of the methods must call other methods.

For this problem, you need to make a `FlowerGarden` class.

The first and only instance variable will be an `ArrayList < String >`.
The `FlowerGarden` class will have one constructor that creates a new ArrayList.
The ArrayList stores Strings that store Flower information.
Each String has a count and a flower name.  
`"14 rose"`   there are 14 rose flowers in the garden.

The `FlowerGarden` class will have 8 methods.
- The `addFlower` method adds a new flower to the arraylist    -   adds   “00 flower name”
- The `findFlower` will return the position in the arraylist where the flower is found
- The `getCount` method returns how many of the particular flower is in the garden
- The `getFlowerName` method returns the flower name at a particular position
- The `maxFlower` method returns the name of the flower that exists the garden the most
- The `inRange` method checks to see if a value is in a specified range
- The `ToString` method will return the arraylist instance variable.

### Objective 2 - Pushing
Reminder to push code from `IntelliJ` back to GitHub.  Another reminder to merge back into master before making the final push.

There is no autograding on this lab -- I will be manually grading them against another Main class myself.

### Sample Output
The following is the output you should expect to see based upon the provided sample main program.
```
[01 rose, 01 poppy, 01 sunflower, 02 daisy]
3
-1
2
0
rose
out of range
02 daisy
[01 sunflower, 03 rose, 03 poppy, 02 gardenia, 06 daisy, 03 lily]
5
-1
6
0
gardenia
out of range
06 daisy

```