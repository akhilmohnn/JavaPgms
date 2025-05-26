class MainThread
 {
 public static void main(String args[])
 {
 Thread t = Thread.currentThread();
 System.out.println("Current Thread="+t);
 t.setName("My Thread");
 System.out.println("After name change="+t);
 try{
 for(int i=5;i>0;i--)
 {
 System.out.println(i);
 Thread.sleep(1000);
 }
 }
 catch(Exception e)
 {
 System.out.println(" Main thread interrupted");
 }
 }
}
