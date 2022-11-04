package pl.treemodel.repository.model.projection;

import pl.treemodel.enums.TreeCrossSection;
import pl.treemodel.enums.TreeSpecies;
import pl.treemodel.enums.TreeType;
import pl.treemodel.repository.model.Tree;

import javax.validation.constraints.Min;

public class TreeWriteModel {

    private TreeType type;
    private TreeSpecies species;
    private TreeCrossSection treeCrossSection;
    @Min(value = 0, message = "Age cannot be negative")
    private int age;
    @Min(value = 0, message = "Height cannot be negative")
    private double height;
    @Min(value = 0, message = "Trunk circum ference cannot be negative")
    private double trunkCircumference;
    public Tree toTree() {
        Tree tree = new Tree();
        tree.setType(type);
        tree.setSpecies(species);
        tree.setTreeCrossSection(treeCrossSection);
        tree.setAge(age);
        tree.setHeight(height);
        tree.setTrunkCircumference(trunkCircumference);
        return tree;
    }

    public TreeType getType() {
        return type;
    }

    public void setType(final TreeType type) {
        this.type = type;
    }

    public TreeSpecies getSpecies() {
        return species;
    }

    public void setSpecies(final TreeSpecies species) {
        this.species = species;
    }

    public TreeCrossSection getTreeCrossSection() {
        return treeCrossSection;
    }

    public void setTreeCrossSection(final TreeCrossSection treeCrossSection) {
        this.treeCrossSection = treeCrossSection;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public double getTrunkCircumference() {
        return trunkCircumference;
    }

    public void setTrunkCircumference(final double trunkCircumference) {
        this.trunkCircumference = trunkCircumference;
    }
}
