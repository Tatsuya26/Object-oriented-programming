package com.company.F4;

import java.util.ArrayList;
import java.util.List;

public class Stackstr {
    private int sp;
    private List<String> stack;

    public Stackstr() {
        this.sp = 0;
        this.stack = new ArrayList<String>();
    }

    public Stackstr(int sp, List<String> content) {
        this.sp = sp;
        this.stack = new ArrayList<>(content);
    }

    public Stackstr(Stackstr s) {
        this.sp = s.get_sp();
        this.stack = new ArrayList<>(s.stack);
    }

    public int get_sp() {
        return this.sp;
    }

    public List<String> get_SList() {
        return this.stack;
    }

    public void pushs(String s) {
        this.sp++;
        this.stack.add(s);
    }

    public String pop() {
        this.sp--;
        String acc = this.stack.get(this.get_sp());
        this.stack.remove(this.get_sp());
        return acc;
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public String toString() {
        return "Stack has " + this.get_sp() + " elements\n" +
                this.stack.toString();
    }
}