package clock;

/**
 *
 * @author Alex Nguyen
 */
public class Test {
    
    public static void main(String[] args) {
        Clock c1 = new Clock(23, 14, 50);
        Clock c2 = new Clock(c1);
        
        c1.setHr(0);
        System.out.println(c2);
        System.out.println(c1);
        
        Clock c = new Clock(22, 55, 2);
        for (int i = 0; i < 10000; i ++) {
            c.increaseSec();
            System.out.println(c);
        }
    }  
}
