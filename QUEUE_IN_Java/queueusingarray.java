

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chandrasish
 */
public class queueusingarray {
    static int arr[];
    static int size;
    static int rear, front;

    public queueusingarray(int n) {
        size = n;
        arr = new int[size];
        rear = -1;
        front = -1;
    }

    public static void add(int x) {
        if(rear == size - 1){
            System.out.println("Queue is full");
        } else {
            rear++;
            arr[rear] = x;
            if(front == -1) {
                front = 0;
            }
        }
    }
    public static void remove(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        }
        System.out.println("Element removed is: "+ arr[front]);
        front++;
    }
    public static int peek(){
        if(front == -1 || front > rear){
            System.out.print("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public static void main(String args[]){
        queueusingarray q = new queueusingarray(5);
        q.add(10);
        q.add(20);
        q.add(30);
        while(q.peek() != -1){
            System.out.println("Element at front is: " + q.peek());
            q.remove();
        }
        
    }

}
