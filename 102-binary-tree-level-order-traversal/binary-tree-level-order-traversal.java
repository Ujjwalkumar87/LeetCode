/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
//     class pair {
//     TreeNode node;
//     int level;

//     pair(TreeNode node, int level) {
//         this.node = node;
//         this.level = level;
//     }
// }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode front = q.remove();
                level.add(front.val);

                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            ans.add(level);
        }
        return ans;


        // List<List<Integer>> ans = new ArrayList<>();
        // if(root == null) return ans;
        // Queue<pair> q = new LinkedList<>();
        // q.add(new pair(root , 0));
        // while(q.size() > 0){
        //     pair front = q.remove();
        //     if(ans.size() == front.level){
        //         ans.add(new ArrayList<>());
        //     }
        //     ans.get(front.level).add(front.node.val);
        //     if(front.node.left != null) q.add(new pair(front.node.left , front.level + 1));
        //     if(front.node.right != null) q.add(new pair(front.node.right , front.level + 1));
        // }
        // return ans;
    }
}