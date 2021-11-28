Kotlin Revision
---------------------------

**Question-One:** 

- Write a function that takes two numbers (divisor number, max range number) and returns a list containing only the numbers divisible by a divisor number that are between 0 and max Range. Provide meaningful exception handling.
+--------------------------------+------------------------------------------------------------------------------------+
| Input                          | Output                                                                             |
+================================+====================================================================================+
| question1(2,10)                | [0, 2, 4, 6, 8, 10]                                                                |
+--------------------------------+------------------------------------------------------------------------------------+
| question1(10,150)              | [0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150]              |
+--------------------------------+------------------------------------------------------------------------------------+
| question1(0,10)                | "You can't enter zero as divisor"                                                  |
|                                | [-1]                                                                               |
+--------------------------------+------------------------------------------------------------------------------------+


**Question-Two:** 

- Write a function that takes two numbers. Given the two numbers output a list of multiples of that span the interval between each of the numbers. For example, given the numbers 4 and 20, your function should print the numbers 4, 8, 12, 16, and 20. This should occur even if the input were (20,4).
+--------------------------------+------------------------------------------------------------------------------------+
| Input                          | Output                                                                             |
+================================+====================================================================================+
| question2(8,60)   or           | [8, 16, 24, 32, 40, 48, 56]                                                        |
| question2(60,8)                |                                                                                    |
+--------------------------------+------------------------------------------------------------------------------------+
| question2(20,5)   or           | [5, 10, 15, 20]                                                                    |
| question2(5,20)                |                                                                                    |
+--------------------------------+------------------------------------------------------------------------------------+
| question2(30,6)   or           | [6, 12, 18, 24, 30]                                                                |
| question2(6,30)                |                                                                                    |
+--------------------------------+------------------------------------------------------------------------------------+


**Question-Three:**

- Write a function that takes two String which are search words and a paragraph and return the Map that contains each search word with the count of times it appears in the paragraph.
+---------------------------------------------------------------------+------------------------------------------------------------------------------------+
| Input                                                               | Output                                                                             |
+=====================================================================+====================================================================================+
| "likes John","John likes to watch movies. Mary likes movies too     | {likes=2, John=1}                                                                  |
+---------------------------------------------------------------------+------------------------------------------------------------------------------------+
| "the to and","Apart from counting words and characters, our online  |                                                                                    |
| editor can help you to improve word choice and writing style, and,  |                                                                                    |
| optionally, help you to detect grammar mistakes and plagiarism. to  |                                                                                    |
| check word count, simply place your cursor into the text box above  |                                                                                    |
| and start typing. You'll see the number of characters and words     |                                                                                    |
| increase or decrease as you type, delete, and edit them. You can    |                                                                                    |
| also copy and paste text from another program over into the online  |                                                                                    |
| editor above. The Auto-Save feature will make sure you won't lose   |                                                                                    |
| any changes while editing, even if you leave the site and come back |                                                                                    |
| later. "                                                            | {the=5, to=3, and=9}                                                               |
+---------------------------------------------------------------------+------------------------------------------------------------------------------------+
| "Glass of is for","Glass is a non-crystalline, often transparent    |                                                                                    |
| amorphous solid, that has widespread practical, technological, and  |                                                                                    |
| decorative use in, for example, window panes, tableware, and optics.|                                                                                    |
| Glass is most often formed by rapid cooling (quenching) of the      |                                                                                    |
| molten form; some glasses such as volcanic glass are naturally      |                                                                                    |
| occurring. The most familiar, and historically the oldest, types of |                                                                                    |
| manufactured glass are "silicate glasses" based on the chemical     |                                                                                    |
| compound silica (silicon dioxide, or quartz), the primary           |                                                                                    |
| constituent of sand. Soda-lime glass, containing around 70% silica, |                                                                                    |
| accounts for around 90% of manufactured glass. The term glass, in   |                                                                                    |
| popular usage, is often used to refer only to this type of material,|                                                                                    |
| although silica-free glasses often have desirable properties for    |                                                                                    |
| applications in modern communications technology. Some objects, such|                                                                                    |
| as drinking glasses and eyeglasses, are so commonly made of         |                                                                                    |
| silicate-based glass that they are simply called by the name of     |                                                                                    |
| the material."                                                      |      {glass=7, of=7, is=3, for=3}                                                  |
+---------------------------------------------------------------------+------------------------------------------------------------------------------------+


