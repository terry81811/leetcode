package leetcode;

import java.util.LinkedList;

public class E_225_ImplementStackUsingQueues {
    private LinkedList<Integer> queue = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        LinkedList<Integer> tempQ = new LinkedList<Integer>();
        tempQ.offer(x);
        while(!this.queue.isEmpty()) {
            tempQ.offer(this.queue.poll());
        }
        this.queue = tempQ;
    }

    // Removes the element on top of the stack.
    public void pop() {
        this.queue.poll();
    }

    // Get the top element.
    public int top() {
        return this.queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return this.queue.isEmpty();
    }
}
