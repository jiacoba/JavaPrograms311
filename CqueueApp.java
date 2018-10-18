import java.util.Random;
public class CqueueApp 
{   
    public static void main(String[] args) 
    {
        CircularQueue myq=new CircularQueue();

        Random rndGen=new Random();
        rndGen.setSeed(3);
        
            int x;
            int y;
            int number;
            for(int i=0; i<3 ;i++)
            {
                x=rndGen.nextInt(5)+1; 

                for(int j=0; j<x; j++)
                {
                    number=rndGen.nextInt(100);
                    myq.insert(number);
                     myq.display();
                }

                y=rndGen.nextInt(5)+1; 

                for(int z=0; z<y ; z++)
                {
                     if(myq.empty()==false)
                     {
                         myq.delete();
                          myq.display();
                     }                   
                }
            }
            myq.display();        
    }    
}
