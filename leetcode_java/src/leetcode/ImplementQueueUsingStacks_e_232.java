package leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks_e_232 {
    Stack<Integer> s = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!s.empty()) {
            temp.push(s.pop());
        }
        s.push(x);
        while(!temp.empty()) {
            s.push(temp.pop());
        }
        
    }

    // Removes the element from in front of queue.
    public void pop() {
        s.pop();
    }

    // Get the front element.
    public int peek() {
        return (int)s.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s.empty();
    }
}
