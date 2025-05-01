// Problems on Doubly Linked List

// 1. Palindrome checking in a doubly linked list
// 2. Two Sum in a sorted doubly linked list
// 3. Critical Point - Maxima and Minima of a Doubly Linked List
// 4. Flatten a multilevel doubly linked list - LeetCode 430 - https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/

public class DoublyLinkedListProblems {

    // Node class
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node child;
        Node(int data) {
            this.data = data;
        }
    }
    
    // 1. Palindrome checking in a doubly linked list

    // 2. Two Sum in a sorted doubly linked list

    // 3. Maxima and Minima of a Doubly Linked List

    // 4. Flatten a multilevel doubly linked list
    public static Node flatten(Node head) {
        if (head == null) return head;
        Node curr = head;
        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
                continue;
            }
            Node temp = curr.child;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = curr.next;
            if (curr.next != null) {
                curr.next.prev = temp;
            }
            curr.next = curr.child;
            curr.child.prev = curr;
            curr.child = null;
        }
        return head;
    }


}


//   2. two sum in a sorted doubly linked list
class DoublyLinkedList {
    Node head; // Head of the list

    // Node class
    class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Function to find pairs with given sum
    public void findPairWithSum(int target) {
        if (head == null) return; // Empty list

        Node start = head;
        Node end = head;

        // Move `end` pointer to the last node
        while (end.next != null) {
            end = end.next;
        }

        boolean found = false;

        // Two-pointer approach
        while (start != null && end != null && start != end && end.next != start) {
            int sum = start.data + end.data;

            if (sum == target) {
                System.out.println("Pair Found: (" + start.data + ", " + end.data + ")");
                found = true;
                start = start.next; // Move `start` forward
                end = end.prev; // Move `end` backward
            } else if (sum < target) {
                start = start.next; // Increase sum by moving left pointer forward
            } else {
                end = end.prev; // Decrease sum by moving right pointer backward
            }
        }

        if (!found) {
            System.out.println("No Pair Found");
        }
    }

    // Insert at end (for sorted list)
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(1);
        dll.insert(2);
        dll.insert(4);
        dll.insert(5);
        dll.insert(6);
        dll.insert(8);
        dll.insert(9);

        dll.display(); // Output: 1 2 4 5 6 8 9

        dll.findPairWithSum(10); // Example: Finding pairs with sum 10
    }
}


