package pl.treemodel.repository.model.projection;

import pl.treemodel.enums.TreeCrossSection;
import pl.treemodel.enums.TreeSpecies;
import pl.treemodel.enums.TreeType;
import pl.treemodel.repository.model.Tree;

public class TreeReadModel {
    private final TreeType type;
    private final TreeSpecies species;
    private final TreeCrossSection treeCrossSection;
    private final int age;
    private final double height;
    private final double trunkCircumference;
    private final int numberOfLeaf;

    public TreeReadModel(final Tree tree) {
        this.type = tree.getType();
        this.species = tree.getSpecies();
        this.treeCrossSection = tree.getTreeCrossSection();
        this.age = tree.getAge();
        this.height = tree.getHeight();
        this.trunkCircumference = tree.getTrunkCircumference();
        this.numberOfLeaf = tree.getLeafs().size();
    }

    public TreeType getType() {
        return type;
    }

    public TreeSpecies getSpecies() {
        return species;
    }

    public TreeCrossSection getTreeCrossSection() {
        return treeCrossSection;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getTrunkCircumference() {
        return trunkCircumference;
    }
}
