
public class arrayImplementation {
    public static class queueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }

            if (f == -1) {
                f = r = 0;
            } else {
                r++;
            }

            arr[r] = val;
            size++;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int removed = arr[f];
            f++;
            size--;

            // Reset if queue becomes empty
            if (f > r) {
                f = r = -1;
            }

            return removed;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            System.out.print("Queue: ");
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            

        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();

        q.display();     // Should say empty
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();     // Should show: 1 2 3 4

        System.out.println("Removed: " + q.remove()); // Removes 1
        q.display();     // Should show: 2 3 4
        System.out.println("Peek: " + q.peek());      // Should show 2
    }
}
