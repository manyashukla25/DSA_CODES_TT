import java.util.*;
class Node {
    int data;
    Node next;
    Node child;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }
}

public class FlattenLinkedList {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;

        while (current != null) {
            // If there is a child list, flatten it first
            if (current.child != null) {
                Node nextNode = current.next;
                Node childTail = current.child;
                
                // Find the tail of the child list
                while (childTail.next != null) {
                    childTail = childTail.next;
                }

                // Connect the child list to the current node's next
                current.next = current.child;
                current.child = null;
                
                // Connect the tail of the child list to the previous next node
                if (nextNode != null) {
                    childTail.next = nextNode;
                }
            }

            // Move to the next node
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        // Create the linked list with some nested nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.child = new Node(5);
        head.child.next = new Node(6);
        head.next.next.child = new Node(7);
        head.next.next.child.next = new Node(8);
        head.next.next.child.next.child = new Node(9);

        FlattenLinkedList flattenLinkedList = new FlattenLinkedList();
        Node flattenedHead = flattenLinkedList.flatten(head);

        // Print the flattened linked list
        Node current = flattenedHead;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

