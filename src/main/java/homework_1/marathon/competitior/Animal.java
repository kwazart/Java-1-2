package homework_1.marathon.competitior;

public class Animal implements Copmetitor{
	protected String name;
	protected String type;

	protected int maxRunDistance;
	protected int maxJumpHeight;
	protected int maxSwimDistance;
	protected boolean onDistance;

	public Animal(String name, String type, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
		this.name = name;
		this.type = type;
		this.maxRunDistance = maxRunDistance;
		this.maxJumpHeight = maxJumpHeight;
		this.maxSwimDistance = maxSwimDistance;
		this.onDistance = true;
	}

	@Override
	public void run(int dist) {
		if (dist <= maxRunDistance) {
			System.out.println(type + " " + name + " хорошо справился с кроссом");
		} else {
			System.out.println(type + " " + name + " не справился с кроссом");
			onDistance = false;
		}
	}

	@Override
	public void jump(int height) {
		if (height <= maxJumpHeight) {
			System.out.println(type + " " + name + " удачно перепрыгнул стену");
		} else {
			System.out.println(type + " " + name + " не смог перепрыгнуть стену");
			onDistance = false;
		}
	}

	@Override
	public void swim(int dist) {
		if (maxSwimDistance == 0) {
			System.out.println(type + " " + name + " не умеет плавать");
			onDistance = false;
			return;
		}
		if (dist <= maxSwimDistance) {
			System.out.println(type + " " + name + " отлично проплыл");
		} else {
			System.out.println(type + " " + name + " не смог проплыть");
			onDistance = false;
		}
	}

	@Override
	public boolean isOnDistance() {
		return onDistance;
	}

	@Override
	public void info() {
		System.out.println(type + " " + name + " - " + onDistance);
	}
}
