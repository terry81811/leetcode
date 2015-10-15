class MinStack {
public:
    vector<int> stack;
    vector<int> minstack;
    void push(int x) {
        if (stack.empty()){
            stack.push_back(x);
            minstack.push_back(x);
            return;
        }
        else if (x<=minstack.back())
            minstack.push_back(x);
        stack.push_back(x);
    }

    void pop() {
        if (top()==minstack.back()) {
            minstack.pop_back();
        }
        stack.pop_back();
    }

    int top() {
        return stack.back();
    }

    int getMin() {
        return minstack.back();
    }
};