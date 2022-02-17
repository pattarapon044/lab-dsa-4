package lab.home_work;

//================== MainCLL class =========================
public class MainCLL {
	public static void main(String[] args) {
		CLL cll = new CLL();
		cll.print();
		cll.addFirst(1);
		cll.print();
		cll.addLast(2);
		cll.print();
		cll.addFirst(3);
		cll.print();
		cll.rotate();
		cll.print();
		cll.removeFirst();
		cll.print();
		cll.removeLast();
		cll.print();
	}
}
