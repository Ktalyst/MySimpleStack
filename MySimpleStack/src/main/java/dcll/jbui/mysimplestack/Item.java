package dcll.jbui.mysimplestack;

public class Item {
	int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Item [i=" + i + "]";
	}

	public Item(int i) {
		super();
		this.i = i;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Item)
		{
			return ((Item) obj).i == i;
		}
		else return false;
	}
}
