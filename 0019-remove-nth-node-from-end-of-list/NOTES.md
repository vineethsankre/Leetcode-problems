Approach:
​Initialize two pointers, firstPointer and secondPointer, both initially pointing to a dummy node.
Move secondPointer n nodes ahead.
Move both pointers simultaneously until secondPointer reaches the end of the list.
At this point, firstPointer is pointing to the node before the one to be removed.
Remove the node by adjusting pointers.
Return the head of the modified list.
