package pl.treemodel.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "tree_id")
    private Tree tree;
    private int size;

    public Tree getTree() {
        return tree;
    }

    public void setTree(final Tree tree) {
        this.tree = tree;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }
}
