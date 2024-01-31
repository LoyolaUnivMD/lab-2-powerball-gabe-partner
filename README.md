# Lab 2 -- It is a POWER Ball!

**50 points**			

## Purpose:  

In this assignment, you will use Java predefined classes to write a program and generate lottery tickets for players.

This assignment will give you a chance to practice the following:

1. Using random number generator
2. Formating number
3. Working with String

## Problem: 
You are hired to work for a lottery company. Your task is to write a Java program for the Quick Play function from the lottery vending machine.

Your program needs to prompt the player for their name and generate 10 random lottery tickets for the.

Each lottery ticket consists of 6 numbers ranging from 0 to 99. After printing out the tickets, your program should print out a "good luck" message with the player's **first name** and their potential winning prize.

Many users may enter blank spaces before and after the name, make sure your program handles it gracefully.

The prize money is already stored in the **prize** variable. You should use the **DecimalFormat** class to format the output properly.

## Output:

The output of your program should look like this:

```
This program generates 10 lottery tickets.
What is your name?     Steve Jobs   
Here are the ticket:
24 14 62 05 04 11
30 02 23 11 00 09
37 02 63 41 33 24
28 65 61 14 49 03
01 39 06 48 18 99 
43 01 63 59 36 22
04 15 36 30 44 08
64 38 49 67 37 12
46 38 49 67 37 12
25 41 13 35 19 04
-----------------
Good luck Steve!
Estimated Jackpot:
$225,938,745
-----------------
```

It is important to have the format of the number correctly. Any number less than 10 should have a 0 preceding it. Hint: Use **DecimalFormat** class. Please refer to Sections 3.8 and 3.9 if necessary.

## Quick note:
Complete the algorithm for your program that is started in *algorithm.txt* (the first few steps are given). Fill the rest using pseudocode.

**Show me your algorithm.txt before coding.**

If you are done,  show your program running and on GitHub to the professor before leaving the classroom.

## What to Submit:

1. Commit & Push your repository to GitHub. It should include algorithm.txt and Lab2.java with all code you write and the proper introductory comments at the very top. Go to GitHub.com to check that it worked.

2. Each partner should independently write a short (min 150 words) reflection of what you learned in Lab 2, what it was like working with Java classes and with their partner. Submit to Moodle under the Lab 2 assignment. (**This is part of your participation grade**)







