package dev.omedia.section11.exc47;

// NOT FINISHED YET

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
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
        //uses recursion to visit all the branches in the tree (Inorder). Print each value on a seperate line.
    }


    private void performRemoval(ListItem root1, ListItem root2) {
        // call this method from removeItem() when the item is found.
    }
}
