package queue;

public class linkedlistImplementation {
    public static class Node {
        int val;
        Node next;
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("queue is empty!");
                return -1;
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("queue is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public void display() {
            if (size == 0) {
                System.out.println("queue is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val + "");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        queueLL q1 = new queueLL();
        q1.display();
        System.out.println(q1.isEmpty());
        q1.add(1);
        q1.add(2);
        System.out.println(q1.isEmpty());
        q1.add(3);
        q1.add(4);
        q1.display();
        System.out.println(q1.peek());
        q1.remove();
        q1.display();
        System.out.println(q1.size);

    }

}

// advantage of linkedlist implementation of queue over array implementation:
// 1) unlimited size
// 2) linkedlist work like a queue

// disadvantage
// 1)size->LL has two members
