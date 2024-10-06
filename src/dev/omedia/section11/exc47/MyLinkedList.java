package dev.omedia.section11.exc47;

// NOT FINISHED YET

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        // return ture if added, otherwise false
        // (if already present don't add)
        // use compareTo to place the item in its proper order
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        // return ture if removed, otherwise false
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }


}
