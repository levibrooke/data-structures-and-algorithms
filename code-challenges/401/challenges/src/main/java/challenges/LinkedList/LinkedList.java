package challenges.LinkedList;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int inputData) {
            data = inputData;
            next = null;
        }
    }

    Node head;

    public void LinkedList() {
        this.head = null;
    }

    public LinkedList insert(int insertData) {

        // create node & set next
        Node newNode = new Node(insertData);
        newNode.next = null;

        // set new node to head

        // if empty list
        if (this.head == null) {
            this.head = newNode;
        }

        // if non-empty list
        else {
            Node tempPointer = this.head;
            this.head = newNode;
            newNode.next = tempPointer;
        }
        return this;
    }

    public boolean includes(int searchValue) {

        Node current = this.head;

        // while the node.next != null
        while (current != null) {
            if (current.data == searchValue) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String print() {
        // help from https://stackoverflow.com/a/19283312

        String result = "";
        Node current = this.head;

        while(current != null){
            result += current.data;

            if(current.next != null){
                result += " -> ";
            }
            current = current.next;
        }
        result += " -> null";
        return "LinkedList: " + result;
    }

    public LinkedList append(int insertData) {
        // create node & set next
        Node newNode = new Node(insertData);
        newNode.next = null;

        // if empty list
        if (this.head == null) {
            this.head = newNode;
        }

        // if non-empty list
        else {
            Node current = this.head;
            while (current != null) {

                if (current.next == null) {
                    current.next = newNode;
                    return this;
                }
                current = current.next;
            }
        }
        return this;
    }

    public LinkedList insertBefore(int targetValue, int newVal) {
        // if empty list
        if (this.head == null) {
            throw new IllegalStateException("cannot insertBefore on an empty list");
        }

        Node current = this.head;
        while (current.next != null) {

            Node next = current.next;

            if (next.data == targetValue) {
                // create node & set next
                Node newNode = new Node(newVal);

                current.next = newNode;
                newNode.next = next;
                return this;
            }
            current = current.next;
        }
        throw new IllegalArgumentException("targetValue was not contained in list");
    }

    // add insertAfter method

    public int valueFromEnd(int k) {
        // handle empty list
        if (this.head == null) {
            throw new IllegalStateException("Linked List is empty");
        }

        int length = 0;
        Node previous = null;
        Node next;
        Node current = this.head;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            length++;
        }

        System.out.println(length);

        System.out.println(this.print());

        // handle k is larger than length of list
        if (length < k) {
            throw new IllegalArgumentException("Linked List is shorter than k");
        }

        int i = 0;
        while (i < k) {
            current = current.next;
            i++;
        }
        return current.data;
    }

    public static LinkedList mergeLists(LinkedList one, LinkedList two) {
        Node oneCurrent = one.head;
        Node twoCurrent = two.head;

        while (oneCurrent != null && twoCurrent != null) {
            Node oneNext = oneCurrent.next;
            oneCurrent.next = twoCurrent;
            oneCurrent = oneNext;

            if (oneCurrent != null) {
                Node twoNext = twoCurrent.next;
                twoCurrent.next = oneCurrent;
                twoCurrent = twoNext;
            }
        }
        return one;
    }
}
