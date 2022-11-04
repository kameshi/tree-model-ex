package pl.treemodel.repository.model;

import pl.treemodel.enums.LeafColour;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "neck")
public class Neck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "tree_id")
    private Tree tree;
    @Min(value = 0, message = "Size cannot be negative")
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
