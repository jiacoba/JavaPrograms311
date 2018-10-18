public class CircularQueue 
{
    int a[]; 
    int front;
    int rear;
    
    public CircularQueue()
    {
        
        a=new int[10];
        front=1;
        rear=1;
    }
    
    public void insert(int x)
    {   
        int p;
        p=(rear+1)%a.length;

        if(p==front)
        {
            System.out.println("Empty queue");
        }
        else
        {
            rear=p;
            a[rear]=x;

            if(front==-1)
                front=0;
        }
    }

    public int delete()
    {
        int x=a[front];
            
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else
            {
                front=(front+1)%a.length;
            }
        
        return x;
    }
    
    public void display()
    {
        if(front == -1)
           System.out.println("Empty queue");
        else
        {
            System.out.print("Numbers of Circular Queue are: ");
            int i = front;

            while(i != rear)
            {
                System.out.print(" "+a[i]);
                i = (i+1)% a.length;
            }

            System.out.print(" "+a[i]);

            System.out.print("\n");
        }
    }
    
    boolean empty()
    {
        if(front==-1)
            return true;
        else
            return false;
    }    
}
