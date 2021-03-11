package lesson_01.inners;

import java.util.Arrays;

public class House {
	class Stage {
		class Room {
			float sizeX;
			float sizeY;

			public Room(float sizeX, float sizeY) {
				this.sizeX = sizeX;
				this.sizeY = sizeY;
				roomsCounter++;
			}

			@Override
			public String toString() {
				return "\n\t\tRoom{" +
						"sizeX=" + sizeX +
						", sizeY=" + sizeY +
						'}';
			}
		}

		int roomsCounter;
		Room[] roomArray;

		private Stage() {
			this.roomsCounter = 0;
			this.roomArray = new Room[5];
		}

		Stage build() {
			for (int i = 0; i < roomArray.length; i++) {
				this.roomArray[i] = new Room(4,5);
			}
			return this;
		}

		@Override
		public String toString() {
			return "\n\tStage{" +
					"roomsCounter=" + roomsCounter +
					", roomArray=" + Arrays.toString(roomArray) +
					'}';
		}
	}

	private int stages;
	private String color;
	private Stage[] stageArray;

	public House(int stages, String color) {
		this.stages = stages;
		this.color = color;
		this.stageArray = new Stage[stages];
	}

	public int getStages() {
		return stages;
	}

	@Override
	public String toString() {
		return "\nHouse{" +
				"stages=" + stages +
				", color='" + color + '\'' +
				", stageArray=" + Arrays.toString(stageArray) +
				'}';
	}

	House build() {
		for (int i = 0; i < getStages(); i++) {
			stageArray[i] = new Stage().build();
		}
		return this;
	}

	public static void main(String[] args) {
		System.out.println(new House(5, "grey").build());
	}
}
