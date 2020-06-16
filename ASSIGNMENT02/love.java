package muno;

public class love {
	 int countEmpty()
		{
			return countEmpty(overallRoot);
		}

		private int countEmpty(IntTreeNode root)
		{
			if(root == null)
				return 0;
			
			if(root.left == null && root.right == null)
			{
				return 2 + countEmpty(root.left) 
							+ countEmpty(root.right);
			}
			else if(root.left == null || root.right == null)
			{
				return 1 + countEmpty(root.left) 
							+ countEmpty(root.right);
			}
			else
			{
				return countEmpty(root.left) 
							+ countEmpty(root.right);
			}
		}

}
