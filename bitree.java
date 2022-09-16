import java.util.LinkedList;
import java.util.Queue;

import javax.sound.sampled.SourceDataLine;

public class bitree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
            
            

        }
    }
    public static void preorder(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        

    }
    public static void inorder(Node root){
        if(root ==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }
    static int count(Node root){
        if(root == null){
            return 0;
        }
        return count(root.left)+count(root.right)+1;
    }
    static int sum(Node root){
        if(root== null){
            return 0;
        }
        return sum(root.left)+sum(root.right)+root.data;
    }
    static int height(Node root){
        if(root== null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    static int diameter(Node root){
        if(root==null){
            return 0; 
        }
        int d1=diameter(root.left);
        int d2= diameter(root.right);
        int d3= height(root.left)+height(root.right)+1;
        return Math.max(d1,Math.max(d2,d3));
    }
    static void levelorder(Node root){
        if(root==null){
            return;
        }
        
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                q.add(null);
                }
                
            }
            else{
                System.out.print(currNode.data+ " ");
                if(currNode.left!=null){q.add(currNode.left);}
                if(currNode.right!=null){q.add(currNode.right);}

            }
        }
        
    }
    public static void levelOrderSum(Node root){
        if(root ==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum=0;
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println(sum);
                sum=0;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }

            }
            else{
                sum+=curr.data;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }


    }
    static int kLevelSum(Node root, int levelNo){
        int sum=0;
        if(root ==null){
            return 0;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        int level=1;
        
        while(!q.isEmpty()){
            
            Node curr=q.remove();
            
            if(curr==null){
                
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    level++;
                }
                if(level-1==levelNo){
                    break;
                }

            }
            else{
                if(level==levelNo){
                    sum+=curr.data;
                }

                if(curr.left!=null){
                    q.add(curr.left);

                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                


            }
            



        }
        return sum;

    }

    public static class treeInfo{
        int ht;
        int dm;
        treeInfo(int ht, int dm){
            this.ht=ht;
            this.dm=dm;
        }
    }
    public static treeInfo dia2(Node root){
        if(root == null){
            return new treeInfo(0,0);
        }

        treeInfo left= dia2(root.left);
        treeInfo right= dia2(root.right);
        
        int height=Math.max(left.ht,right.ht)+1;
        int d1=left.dm;
        int d2=right.dm;
        int d3= left.ht+right.ht+1;

        int diameter=Math.max(d1,Math.max(d2,d3));
        return new treeInfo(height,diameter);
        

    }
    
    public static void main(String[] args){
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        int sum=kLevelSum(root,2);
        System.out.println(sum);
        

    }
    
}
