/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();
        build(root,s);
        return s.toString();
    }
    void build(TreeNode root,StringBuilder s)
    {
        if(root==null)
        {
            s.append("N,");
        }
        else
        {
            s.append(root.val);
        

        s.append(",");

        build(root.left,s);
        build(root.right,s);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int pin[]={0};
        String tokens[] = data.split(",");
        
        return recurse(pin,tokens);
    }

    TreeNode recurse(int pin[],String tokens[])
    {
        if(tokens[pin[0]].equals("N"))
        {
            pin[0]++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(tokens[pin[0]++]));
        root.left = recurse(pin,tokens);
        root.right = recurse(pin,tokens);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));