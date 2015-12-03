package leetcode;

import java.util.LinkedList;


//NOTE: record state with each NODE
public class E_155_Min_Stack {
	class MinStack {
        class Node {
            int min;
            int val;
            Node next;
            
            Node(int min, int val) {
                this.min = min;
                this.val = val;
                next = null;
            }

            Node(int min, int val, Node next) {
                this.min = min;
                this.val = val;
                this.next = next;
            }

        }
        
        private Node head = null;

	    public void push(int x) {
	        if(head == null) {
                head = new Node(x,x);
	        }else if(x<head.min) {
                head = new Node(x,x,head);
	        }else {
	            head = new Node(head.min, x, head);
	        }
	    }

	    public void pop() {
	        if(head!=null)
	            head = head.next;
	    }

	    public int top() {
	        return head.val;
	    }

	    public int getMin() {
	        return head.min;
	    }
	}
}
