### Approach:

1. **Initialize two pointers**, `firstPointer` and `secondPointer`, both initially pointing to a dummy node.
2. **Move `secondPointer` n nodes ahead**.
3. **Move both pointers simultaneously** until `secondPointer` reaches the end of the list.
4. At this point, `firstPointer` is pointing to the node before the one to be removed.
5. **Remove the node** by adjusting pointers.
6. **Return the head** of the modified list.
