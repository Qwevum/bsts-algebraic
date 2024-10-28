package edu.psu.ist;

public record Empty() implements BSTree {


    @Override
    public BSTree insert(Integer toAdd) {
        return new NonEmpty(new Empty(), toAdd, new Empty());
    }

    @Override
    public String preOrder() {
        return "";
    }

    @Override
    public String inOrder() {
        return "";
    }

    @Override
    public String postOrder() {
        return "";
    }

    @Override
    public int size() {
        return 0;
    }
}
