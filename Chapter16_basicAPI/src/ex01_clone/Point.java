package ex01_clone;

public class Point implements Cloneable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "X = "+x+", Y = "+y;
	}

	@Override
	protected Object clone(){
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException err) {
			err.printStackTrace();
		}
		return obj;
	}
	
	
}
