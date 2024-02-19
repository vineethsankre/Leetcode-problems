Initially, we have two sorted linked lists:

- **list1:** 1 -> 3 -> 5 -> 7 -> 9
- **list2:** 2 -> 4 -> 6 -> 8 -> 10



dummy -> 0
^
|
curr



**Step 1:**
list1: 1 -> 3 -> 5 -> 7 -> 9
list2: 2 -> 4 -> 6 -> 8 -> 10

We compare 1 and 2. Since 1 < 2, we append 1 to the merged list.

**Merged list:** dummy -> 1 -> ?
^
|
curr


**Step 2:**
list1: 3 -> 5 -> 7 -> 9
list2: 2 -> 4 -> 6 -> 8 -> 10

We compare 3 and 2. Since 2 < 3, we append 2 to the merged list.

**Merged list:** dummy -> 1 -> 2 -> ?
^
|
curr


**Step 3:**
list1: 3 -> 5 -> 7 -> 9
list2: 4 -> 6 -> 8 -> 10

We compare 3 and 4. Since 3 < 4, we append 3 to the merged list.

**Merged list:** dummy -> 1 -> 2 -> 3 -> ?
^
|
curr


... and so on until we exhaust one of the lists and append the remaining nodes from the other list.

The final merged list will be:

dummy -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10


... and so on until we exhaust one of the lists and append the remaining nodes from the other list.

The final merged list will be:

dummy -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
