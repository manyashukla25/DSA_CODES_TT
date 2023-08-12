class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class EndOfSLL {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node findNthNodeFromEnd(int n) {
        if (head == null || n <= 0) {
            return null;
        }

        Node slowPtr = head;
        Node fastPtr = head;

        // Move fastPtr n positions ahead of slowPtr
        for (int i = 0; i < n; i++) {
            if (fastPtr == null) {
                // If the LinkedList is smaller than n elements, return null
                return null;
            }
            fastPtr = fastPtr.next;
        }

        // Move both pointers until fastPtr reaches the end
        while (fastPtr != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        return slowPtr;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n = 2; // Find the 2nd node from the end
        Node nthNodeFromEnd = list.findNthNodeFromEnd(n);
        if (nthNodeFromEnd != null) {
            System.out.println("Node " + n + " from the end: " + nthNodeFromEnd.data);
        } else {
            System.out.println("Invalid input or node not found.");
        }
    }
}
