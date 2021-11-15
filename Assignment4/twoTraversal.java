class Node{
    int data;
    Node next;
    Node(int data, Node next){
    this.data = data;
    this.next = next;
    }
}
class twoTraversal{
    //iterative function to return the k'th node from the end
    //in a linked list
    public static Node findKthNode(Node head, int k){
        int n=0;
        Node curr = head;
        // count the total number of nodes in the linked list
        while(curr != null){
            curr=curr.next;
            n++;
        }
        // if the total number of nodes is more than or equal
        // to k
        if(n>=k){
            //return (n-k+1)'th node from the begining
            curr=head;
            for(int i=0; i<n-k; i++){
                curr=curr.next;
            }
        }
        return curr;
    }
    public static void main(String[] args){
        //input keys
        int[] keys = {1,2,3,4,5};
        Node head = null;
       for(int i=keys.length-1; i>=0; i--){
            head=new Node(keys[i], head); 
       } 
       int k=3;
       Node node = findKthNode(head , k);
       if(node!=null){
           System.out.println("k'th node from the end is " + node.data);
       }
    }
}
