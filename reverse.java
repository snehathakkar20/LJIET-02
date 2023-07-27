public class reverse extends Thread{

    @Override
    public void run(){
        try{
            for(int i=10;i>0;i--)
            {
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
     reverse r1= new reverse();
     r1.start();
    }
}
