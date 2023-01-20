Scrabble Challenge - Java
=========================
```
                    _     _     _      
                   | |   | |   | |     
 ___  ___ _ __ __ _| |__ | |__ | | ___ 
/ __|/ __| '__/ _` | '_ \| '_ \| |/ _ \
\__ \ (__| | | (_| | |_) | |_) | |  __/
|___/\___|_|  \__,_|_.__/|_.__/|_|\___|
                                       
                                       
```

The attached source code has been created in Java to pass the given tests.

## About the project
---
### Why does this project exist?
This project was created to test my knowledge working with Java classes and functions to build software that passes tests to ensure the software works for its purpose.
This project was developed 4 weeks into the Digital Futures academy.

## Built with
---
The source code was created following Test Driven Development, and was written in Java.

## Getting started
---
The source code for all classes are located within the ../scrabble-challenge-java/src/ folder.
The test code for the source codes are located within the ../scrabble-challenge-java/ folder.
To test the code:
1. Right-click on the project and then select `Run all Tests`
2. Right-click on the `ScrabbleTest` and click `Run ScrabbleTest`
3. Open the class file `ScrabbleTest` and click the "Play" button to the left of the class declaration

## Problem statements
---
## Task

Given a word, compute the scrabble score for that word.

##### Letter Values

You'll need these:

| Letter                        | Value  |
| ----                          |  ----  |
| A, E, I, O, U, L, N, R, S, T  |     1  |
| D, G                          |     2  |
| B, C, M, P                    |     3  |
| F, H, V, W, Y                 |     4  |
| K                             |     5  |
| J, X                          |     8  |
| Q, Z                          |     10 |

Example
"cabbage" should be scored as worth 14 points:

- 3 points for C
- 1 point for A, twice
- 3 points for B, twice
- 2 points for G
- 1 point for E

And to total:

```
3 + 2x1 + 2x3 + 2 + 1
= 3 + 2 + 6 + 3
= 14
```

### Acceptance Criteria

```java

class ScrabbleRunner {

   public static void main(String[] args) {
      Scrabble scrabble = new Scrabble("");
      scrabble.score();   // => 0

      scrabble = new Scrabble(null);
      scrabble.score();   // => 0

      scrabble = new Scrabble("a");
      scrabble.score(); // => 1

      scrabble = new Scrabble("f");
      scrabble.score(); // => 4

      scrabble = new Scrabble("street");
      scrabble.score(); // =>, 6

      scrabble = new Scrabble("quirky");
      scrabble.score(); // => 22

      scrabble = new Scrabble("OXYPHENBUTAZONE");
      scrabble.score(); // => 41
   }
}
```

### Extended Acceptance Criteria
> Each `Scrabble` method should be no more than 5 lines and contain no more than 5 operations.

> You can play a double or a triple letter.

> You can play a double or a triple word. 


## Project Review and Roadmap
---
### Main takeaways from the project


### Directions for this project


## Acknowledgments

I found the following resources useful:
https://stackoverflow.com/questions/16458564/convert-character-to-ascii-numeric-value-in-java#:~:text=Very%20simple.,first%20and%20then%20cast%20it.
https://www.w3schools.com/java/

