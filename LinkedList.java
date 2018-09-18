class Node 
{
    Node next = null;
    double data;

    public Node(double d)
    {
        data = d;
    }
}

public class LinkedList 
{
    public Node head;
    public int listCount;
    
    public LinkedList()
    {
        head = new Node(0);
        listCount = 0;
    }
    public void show()
    {
        Node current = head;
        while(current.next!=null)
        {
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public boolean add(double d)
    {
        Node end = new Node(d);
        Node current = head;
        
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = end;
        listCount++;
        //System.out.println(d+" appended to tail!");
        return true;
    }
    public boolean deleteNodeWithDataBelowAvg(double d)
    {
        Node current = head;
        while(current.next!=null)
        {            
            if(current.next.data < d)
            {
            	//System.out.println("Inner "+ current.next.data);
            	//System.out.println("Inner "+ current.next.next);
                current.next = current.next.next;
                listCount--;
                if(current.next == null)
                    return true;
                //System.out.println("Success! Node with data "+d+" deleted.");
            }
            //System.out.println("Outer "+ current.data);
            current = current.next;
        }
        //System.out.println("Delete Failed: No node found with given data!");
        return true;
    }
    // Use this Function as if required
    public boolean deleteNodeWithDataAboveAvg(double d)
    {
        Node current = head;
        while(current.next!=null)
        {
            if(current.next.data > d)
            {
            	//System.out.println("Inner "+ current.next.data);
            	//System.out.println("Inner "+ current.next.next);
                current.next = current.next.next;
                listCount--;
                if(current.next == null)
                    return true;
                //System.out.println("Success! Node with data "+d+" deleted.");
            }
            //System.out.println("Outer "+ current.data);
            current = current.next;
        }
        //System.out.println("Delete Failed: No node found with given data!");
        return true;
    }    
    //Function to compute the average
    public double computeAvg()
    {
        Node current = head;
        double avg = 0.0; 
        while(current != null) 
        {
            avg += current.data;
            current = current.next;
        }
        return avg/listCount;
    } 
    //Function to print the list
    public void printList() 
    {
        Node current = head;
        while (current != null) 
        {
            System.out.println(current.data+" ");
        }
        System.out.println();
    }       
    public static void main(String[] args) 
    {
    	LinkedList L = new LinkedList();
        
    	//double[] arr = {100.0, 10.0, 15.0,20.0, 200.0, 20.0, 40.0, 300.0}; 
    	//double[] arr = {10.0, 100.0, 10.0}; 
    	double[] arr = { 100.0};
      
    	//Hard-Coding linked list with array values
        for(int i = 0 ; i < arr.length ; i++) 
        {
            L.add(arr[i]);
        }
	    // Print the Original list
	    System.out.println("Starting List: ");
	    L.show();
	    //Compute average
	    double avg = L.computeAvg();
	    System.out.println("Average: "+avg);
	    //Delete Nodes with value below average
	    L.deleteNodeWithDataAboveAvg(avg);
	    //Print the final list
	    System.out.println("Ending List: ");
	    L.show();
    }
}