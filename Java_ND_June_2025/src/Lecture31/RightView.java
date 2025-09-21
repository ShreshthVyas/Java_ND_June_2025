package Lecture31;

import java.util.ArrayList;
import java.util.List;

import Lecture31.DiameterOptimised.TreeNode;

public class RightView {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	int maxlvl = -1;
	List<Integer> ans;
	public List<Integer> rightSideView(TreeNode root) {
		ans =  new ArrayList<>();
		rightview(root,0);
		return ans;
	}
	private void rightview(TreeNode root, int cl) {
		// TODO Auto-generated method stub
		if(root== null) {
			return;
		}
		if(cl>maxlvl) {
			ans.add(root.val);
			maxlvl = cl;
		}
		rightview(root.right,cl+1);
		rightview(root.left,cl+1);
	}
}
