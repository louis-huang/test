package bfs;
import java.util.*;
class GraphNode{
	public int key;
	public List<GraphNode> neighbors;
	public List<Integer> weights;
	public List<GraphNode> nei;
	public boolean visited = false;
	public GraphNode(int key){
		this.key = key;
		this.neighbors = new ArrayList<GraphNode>();
	}
}
class TreeNode{
	public int key;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int key){
		this.key = key;
	}
	
}
public class bfsOne {
	public void printLayer(TreeNode root){
		 List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()){
			int n = q.size();
			List<Integer> currLayer = new ArrayList<Integer>();
			for (int i = 0; i < n; i++){
				TreeNode a = q.remove();
				if (a.left != null){
					q.offer(a.left);
				}
				if (a.right != null){
					q.offer(a.right);
				}
				currLayer.add(a.key);
			}
			list.add(currLayer);
		}
	}
	public static void main(String[] args){
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		TreeNode a3 = new TreeNode(3);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(5);
		TreeNode a6 = new TreeNode(6);
		TreeNode a7 = new TreeNode(7);
		a1.left =a2;
		a1.right = a3;
		a2.left = a4;
		a2.right =a5;
		a4.left = a6;
		a3.right =a7;
		bfsOne bfs = new bfsOne();
		
	}
}
