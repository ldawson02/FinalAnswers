package QuestionC;

public class IllegalRectangle extends Exception {

	private int x;
	private int y;
	
	public IllegalRectangle(int newx, int newy){
		this.x = newx;
		this.y = newy;
	}
}
