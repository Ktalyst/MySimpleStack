package dcll.jbui.mysimplestack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;

public abstract class SimpleStackTest 
{

    protected MySimpleStackImpl s;

    public void testNewStackIsEmpty() //test si liste vide est bien égale à zéro
    {
        assertTrue(s.isEmpty());
        assertEquals(s.getSize(), 0);
    }

    @Test
    public void testPushesToEmptyStack() //test si la taille est bien égale au nombre d'éléments
    {
        int nb = 6;
        for (int i = 0; i < nb; i++) 
        {
            s.push(new Item(0));
        }
        assertFalse(s.isEmpty());
        assertEquals(s.getSize(), nb);
    }

    @Test
    public void testPushThenPop() //vérifie si l'élément inséré en dernier est le bon
    {
    	Item message = new Item(4);
        s.push(message);
        assertEquals(s.pop(), message);
    }

    @Test
    public void testPushThenPeek() //vérifie que le dernier élément inséré est bien enlevé
    {
        Item message = new Item(4);
        s.push(message);
        int size = s.getSize();
        assertEquals(s.peek(), message);
        assertEquals(s.getSize(), size);
    }

    @Test
    public void testPoppingDownToEmpty() 
    {
    	Item message = new Item(4);
        int nb = (int)(Math.random() * 20 + 1);
        for (int i = 0; i < nb; i++) {
            s.push(message);
        }
        for (int i = 0; i < nb; i++) {
            s.pop();
        }
        assertTrue(s.isEmpty());
        assertEquals(s.getSize(), 0);
    }

    @Test(expected=NoSuchElementException.class)
    public void testPopOnEmptyStack() 
    {
        assertTrue(s.isEmpty());
        s.pop();
    }

    @Test(expected=NoSuchElementException.class)
    public void testPeekIntoEmptyStack()
    {
        assertTrue(s.isEmpty());
        s.peek();
    }

}
