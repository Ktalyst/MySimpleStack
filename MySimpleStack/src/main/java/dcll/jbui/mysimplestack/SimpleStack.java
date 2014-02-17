package dcll.jbui.mysimplestack;

public interface SimpleStack 
{
	void push(Item item);
    Item pop();
    Item peek();
    int getSize();
    boolean isEmpty();
}