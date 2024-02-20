package PracticeOnNmber;

public class HowManyGames {

	public static void main(String[] args) {

		int res = howManyGames(20, 3, 6, 80);
		System.out.println(res);

	}

	public static int howManyGames(int p, int d, int m, int s) {

		int gamesBought = 0;
		int totalCost = 0;
		while (totalCost <= s) {

			totalCost += p;

			gamesBought++;

			p = Math.max(p - d, m);
		}

		return gamesBought - 1;

	}

}
