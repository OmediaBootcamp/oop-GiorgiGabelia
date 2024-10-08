package dev.omedia.section11.exc47;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return rightLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item == null) return -1;
        return ((String) super.getValue()).compareTo((String) item.getValue());
    }
}
