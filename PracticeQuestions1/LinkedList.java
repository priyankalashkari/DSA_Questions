package PracticeQuestions1;

public class LinkedList {
    Node head;
    private int size;

    public class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Adding elements in the Linked List
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Deleting the Node
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty list, nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty list, nothing to delete");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    // Printing the List
    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    // Size of Linked List
    public int getSize() {
        return size;
    }

    // reverse a linked list
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("the");
        list.addLast("kahtras");
        list.printList();
        System.out.println();
        list.addFirst("get");
        list.addFirst("you'll");
        list.addLast("reversed");
        list.printList();
        System.out.println("\nsize of above list: " + list.getSize());
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println("\nsize of above list: " + list.getSize());
        list.removeFirst();
        //list.removeFirst();
        list.printList();
        System.out.println();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
