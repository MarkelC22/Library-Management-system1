import java.util.LinkedList;
import java.util.Queue;
public class Queue{

    boolean isEmpty(){
        return front == -1;
    }
    boolean isFull(){
        return front == 4;
    }
        int queue[] = new int[5];
        int size;
        int front;
        int rear;
        public void enQueue(int data){
            queue[rear] = data;
            rear = rear + 1;
            size = size + 1;
            if (!isFull()){
                front++;
                queue[front] = data;
            }
            else
            {
                return;
            }

        }
        public int deQueue(){
            int data = queue[front];
            front = front + 1;
            size = size - 1;


            return data;
        }
        public void show(){
            System.out.println("Elements :");
            for (int i=0;i<size;i++){
                System.out.print(queue[front + i] +"");
            }
        }
}
