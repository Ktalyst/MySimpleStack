package dcll.jbui.mysimplestack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Item i = new Item(1);
        MySimpleStackImpl m = new MySimpleStackImpl();
        m.push(i);
        System.out.println(m.getSize());
        System.out.println(m.peek());
        System.out.println(m.isEmpty());
        m.pop();
        System.out.println(m.isEmpty());
    }
}
