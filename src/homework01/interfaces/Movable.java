package homework01.interfaces;

public interface Movable {

	boolean isDone();
	void setDone(boolean done);
	boolean run (int length);
	boolean jump(int height);
	boolean swim (int length);
}
