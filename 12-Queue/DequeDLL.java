package queue;

public class DequeDLL {
    static class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
        }
    }

    static class Deque {
        Node front = null, rear = null;

        public void addFront(int val) {
            Node newNode = new Node(val);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
        }

        public void addRear(int val) {
            Node newNode = new Node(val);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                newNode.prev = rear;
                rear = newNode;
            }
        }

        public int removeFront() throws Exception {
            if (isEmpty()) throw new Exception("Deque is empty");
            int val = front.data;
            front = front.next;
            if (front != null) front.prev = null;
            else rear = null;
            return val;
        }

        public int removeRear() throws Exception {
            if (isEmpty()) throw new Exception("Deque is empty");
            int val = rear.data;
            rear = rear.prev;
            if (rear != null) rear.next = null;
            else front = null;
            return val;
        }

        public int peekFront() throws Exception {
            if (isEmpty()) throw new Exception("Deque is empty");
            return front.data;
        }

        public int peekRear() throws Exception {
            if (isEmpty()) throw new Exception("Deque is empty");
            return rear.data;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Deque dq = new Deque();
        dq.addFront(10);
        dq.addRear(20);
        dq.addFront(5);
        dq.display(); // 5 10 20
        dq.removeRear(); // remove 20
        dq.display(); // 5 10
        System.out.println("Front: " + dq.peekFront());
        System.out.println("Rear: " + dq.peekRear());
    }  
    
}
