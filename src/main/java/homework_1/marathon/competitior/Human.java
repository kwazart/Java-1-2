package homework_1.marathon.competitior;

public class Human implements Copmetitor{
	String name;

	int maxRunDistance;
	int maxJumpHeight;
	int maxSwimDistance;
	boolean active;

	public Human(String name) {
		this.name = name;
		this.maxRunDistance = 5000;
		this.maxJumpHeight = 30;
		this.maxSwimDistance = 200;
		this.active = true;
	}

	@Override
	public void run(int dist) {
		if (dist <= maxRunDistance) {
			System.out.println(name + " хорошо справился с кроссом");
		} else {
			System.out.println(name + " не справился с кроссом");
			active = false;
		}
	}

	@Override
	public void swim(int dist) {
		if (dist <= maxSwimDistance) {
			System.out.println(name + " отлично проплыл");
		} else {
			System.out.println(name + " не смог проплыть");
			active = false;
		}
	}

	@Override
	public void jump(int height) {
		if (height <= maxJumpHeight) {
			System.out.println(name + " удачно перепрыгнул стену");
		} else {
			System.out.println(name + " не смог перепрыгнуть стену");
			active = false;
		}
	}

	@Override
	public boolean isOnDistance() {
		return active;
	}

	@Override
	public void info() {
		System.out.println(name + " - " + active);
	}
}
