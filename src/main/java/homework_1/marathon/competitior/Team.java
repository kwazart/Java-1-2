package homework_1.marathon.competitior;

public class Team {
	private String title;
	private Copmetitor[] members;

	public Team(String title, Copmetitor... members) {
		this.title = title;
		this.members = members;
	}

	public Copmetitor[] getMembers() {
		return members;
	}

	public void showWinners() {
		System.out.println("win!");
		for (Copmetitor c : members) {
			if (c.isOnDistance()) {
				c.info();
			}
		}
	}
}
