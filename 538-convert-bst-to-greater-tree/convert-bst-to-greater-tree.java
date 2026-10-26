class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        revinorder(root , ans);
        int sum = 0;
        for(int i = 0; i < ans.size(); i++){
            sum += ans.get(i).val;
            ans.get(i).val = sum;
        }
        return root;
    }
    public void revinorder(TreeNode root , ArrayList<TreeNode> ans){
        if(root == null) return;
        revinorder(root.right , ans);
        ans.add(root);
        revinorder(root.left , ans);
    }
}