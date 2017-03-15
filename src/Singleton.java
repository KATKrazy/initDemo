/**
 * Created by kingdee on 2017/3/15.
 */
public class Singleton {
    private static Singleton instance = null;
    private static int a = getInc();

    private Singleton() {
        System.out.println("init method");
    }
    static{
        System.out.println("Singleton class static struct" + a);
    }

    public static int getInc() {
        return 10;
    }

    private static class inner {
        static{
            System.out.println("inner class static struct");
        }
        private static final int io = 222;//final是常量传播优化，不会再加载inner，因为传播到singleton类的常量池了
    }


    public static int getInstance() {
        return inner.io;
    }

    public static void main(String args[]){
        //Singleton t = new Singleton();
        Singleton.getInstance();
    }
}
