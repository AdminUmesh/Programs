//Circuiler Queue data Structure implementation using Array

class Umesh {
    int arr[] = new int[5];
    int n = arr.length;
    int rear = -1;
    int front = -1;

    public void enqueue(int x) {
        if (front == -1 && rear == -1) {
            front = rear = 0;
            arr[rear] = x;
        } else if ((rear + 1) % n == front) {
            System.out.println("Overflow Condition");
        } else {
            rear = (rear + 1) % n;
            arr[rear] = x;
        }
    }

    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("UnderFlow condition");
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % n;
        }
    }

    public void display() {
        int i = front;
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        }
        while (i != rear) {
            System.out.println(arr[i]);
            i = (i + 1) % n;
        }
        System.out.println(arr[rear]);
    }
}

public class CircularQue {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Umesh p = new Umesh();
        p.enqueue(4);
        p.enqueue(8);
        p.enqueue(12);
        p.dequeue();
        p.enqueue(7);
        p.display();
    }
}
