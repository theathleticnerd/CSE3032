// A Linked List Node 
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}
class singleListTraversal{
    // iterative function to return the k'th node from the 
    // end in a linked list
    public static Node findKthNode(Node head, int k){
        Node curr = head;
        //move k nodes ahead in the linked list
        for(int i=0; curr!=null && i<k; i++){
            curr = curr.next;
            //return if k is more than the total number of nodes
            //in the list
            if(curr == null && i!=k-1){
                return null;
            }
        }
        //move the head and curr parallelly till the curr
        //reaches the list's end
        while(curr!=null){
            head=head.next;
            curr=curr.next;
        }
        //head will now contain the k'th node from the end
        return head;
    }
    public static void main(String[] args){
        //input keys
        int[] keys = {1,2,3,4,5};
        Node head = null;
        for (int i=keys.length-1; i>=0; i--){
            head = new Node(keys[i], head);
        }
        int k = 3;
        Node node = findKthNode(head, k);
        if(node!=null){
            System.out.println("k'th node from the end is "+ node.data);
        }
    }
}
