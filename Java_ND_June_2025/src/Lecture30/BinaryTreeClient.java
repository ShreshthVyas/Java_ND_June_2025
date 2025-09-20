package Lecture30;

public class BinaryTreeClient {
	//10 true 20 true 30 false false false true 40 true 50 false false true -10 false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt =  new BinaryTree();
//		bt.Display();
//		System.out.println(bt.Find(500));
//		System.out.println(bt.Max());
//		System.out.println(bt.Min());
//		System.out.println(bt.Height());
		bt.PreOrder();
		bt.InOrder();
		bt.PostOrder();
		bt.LevelOrder();
		bt.LevelOrderLevelwise();
		
	}

}
