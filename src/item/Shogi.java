package item;


public class Shogi {

	public static void main(String[] args) {

		// コントローラ生成
		Controller ctr = new  Controller();

		// UIの生成
		View UI = new View();
		UI.setMainField(ctr.getShogiBoard());
		UI.setVisible(true);

		ctr.addObserver(UI);

	}
}
