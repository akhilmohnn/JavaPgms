package Multithread;

public class SampleThread implements Runnable{
    
    public void run()
    {
        //super.run();

        for(int i=0;i<10;i++)
        {
            System.out.println("ThreadCount"+i);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
    
}
