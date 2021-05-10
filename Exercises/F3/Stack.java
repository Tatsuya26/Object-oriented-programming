package com.company.F3;
import java.util.ArrayList;
import java.util.List;


public class Stack {
    private List<String> stack;

    public Stack() {
        this.stack = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public int stackSize() {
        return this.stack.size();
    }

    public void push(String s) {
        this.stack.add(s);
    }

    public String top() {
        return this.stack.get(this.stackSize() - 1);
    }

    public void pop() {
        this.stack.remove(this.top());
    }

    @Override
    public String toString() {
        String r = "";
        for(String s: stack ) r = r + s;
        return r;
    }
}
