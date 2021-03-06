# Stacks and Queues
Implement a Stack and a Queue Data Structure

## Challenge
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
- Create a Stack class that has a top property. It creates an empty Stack when instantiated.
- This object should be aware of a default empty value assigned to top when the stack is created.
- Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
- Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
- Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
- Create a Queue class that has a front property. It creates an empty Queue when instantiated.
- This object should be aware of a default empty value assigned to front when the queue is created.
- Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
- Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
- Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
- At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
- Be sure to follow your languages best practices for naming conventions.

## Approach & Efficiency
- Create a linked list class
- Create a subclass for creating each node
- This implementation has Big O of O(1) except the insert and includes have O(n).

## API
- Stacks
  - Create empty stack
  - Push
  - Pop
  - Peek
- Queues
  - Create empty queue
  - Enqueue
  - Dequeue
  - Peek

## Solution
- [Link to code](../challenges/src/main/java/challenges/stacksandqueues.java)
- [Link to tests](../challenges/src/test/java/challenges/stacksandqueues.java)