# StudentCompare
Comparators are used to compare two objects. In this question, you'll create a comparator and use it to sort an array. Start with
creating a Student class with two fields, a name (String) and a score (integer).
Given an array of Student objects, write a comparator that sorts them in order of decreasing score; if 2 or more students have the
same score, sort those students alphabetically by name in reverse order (so B before A). To do this, you must create a Checker class
that implements the Comparator interface, then write an int compare(Student a, Student b) method implementing
the Comparator.compare(T o1, T o2) method.

Input Format
-------------
Input from stdin will need to be handled by your code. The format of the input is as follows:
The first line contains an integer, n, denoting the number of students.
Each of the subsequent lines contains a student's name and score, respectively.

Constraints
-------------
• 0 ≤ 𝑠𝑐𝑜𝑟𝑒 ≤ 100
• 2 students can have the same name.
• Student names consist of lowercase English letters.

Output Format
--------------
Your code will also need to print the output to stdout in a defined format. Your code will create the Checker object, use it to sort
the Student array, and print the sorted elements.

Sample Input
-----------
5
aimee 100
dave 100
gerard 50
antoine 75
alexey 150

Sample Output
------------
alexey 150
dave 100
aimee 100
antoine 75
gerard 50
