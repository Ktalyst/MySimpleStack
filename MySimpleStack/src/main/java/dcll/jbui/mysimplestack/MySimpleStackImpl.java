package dcll.jbui.mysimplestack;

import java.util.LinkedList;

public class MySimpleStackImpl implements SimpleStack
{
    private LinkedList<Item> list = new LinkedList<Item>();

    public void push(Item item) {list.addFirst((Item) item);}
    public Item pop() {return list.removeFirst();}
    public Item peek() {return list.getFirst();}
    public int getSize() {return list.size();}
    public boolean isEmpty() {return list.isEmpty();}
    public void untruc(){int i;}

}
