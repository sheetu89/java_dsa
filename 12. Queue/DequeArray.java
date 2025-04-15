package queue;

public class DequeArray {
    static class Deque {
        int[] arr;
        int front, rear, size, capacity;

        Deque(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = -1;
            rear = 0;
            size = 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void addFront(int val) throws Exception {
            if (isFull()) throw new Exception("Deque is full");
            if (isEmpty()) {
                front = rear = 0;
            } else {
                front = (front - 1 + capacity) % capacity;
            }
            arr[front] = val;
            size++;
        }

        public void addRear(int val) throws Exception {
            if (isFull()) throw new Exception("Deque is full");
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % capacity;
            }
            arr[rear] = val;
            size++;
        }

        public int removeFront() throws Exception {
            if (isEmpty()) throw new Exception("Deque is empty");
            int val = arr[front];
            front = (front + 1) % capacity;
            size--;
            if (size == 0) front = rear = -1;
            return val;
        }

        public int removeRear() throws Exception {
            if (isEmpty()) throw new Exception("Deque is empty");
            int val = arr[rear];
            rear = (rear - 1 + capacity) % capacity;
            size--;
            if (size == 0) front = rear = -1;
            return val;
        }

        public int peekFront() throws Exception {
            if (isEmpty()) throw new Exception("Deque is empty");
            return arr[front];
        }

        public int peekRear() throws Exception {
            if (isEmpty()) throw new Exception("Deque is empty");
            return arr[rear];
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            System.out.print("Deque: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Deque dq = new Deque(5);
        dq.addRear(1);
        dq.addRear(2);
        dq.addFront(0);
        dq.display(); // 0 1 2
        dq.removeRear();
        dq.display(); // 0 1
        dq.addRear(3);
        dq.addRear(4);
        dq.display(); // 0 1 3 4
        System.out.println("Front: " + dq.peekFront());
        System.out.println("Rear: " + dq.peekRear());
    }
}
