package pl.treemodel.repository.model;

import pl.treemodel.enums.TreeCrossSection;
import pl.treemodel.enums.TreeSpecies;
import pl.treemodel.enums.TreeType;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "tree")
public class Tree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "forest_id")
    private Forest forest;
    private TreeType type;
    private TreeSpecies species;
    private TreeCrossSection treeCrossSection;
    @Min(value = 0, message = "Age cannot be negative")
    private int age;
    @Min(value = 0, message = "Height cannot be negative")
    protected double height;
    @Min(value = 0, message = "Trunk circum ference cannot be negative")
    protected double trunkCircumference;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tree")
    private Set<Leaf> leafs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tree")
    private Set<Branch> branches;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tree")
    private Set<Neck> necks;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tree")
    private Set<Fruit> fruits;

    public Tree() {
    }

    public Tree(final TreeType type, final TreeSpecies species, final TreeCrossSection treeCrossSection, final int age, final double height, final double trunkCircumference, final Set<Leaf> leafs) {
        this.type = type;
        this.species = species;
        this.treeCrossSection = treeCrossSection;
        this.age = age;
        this.height = height;
        this.trunkCircumference = trunkCircumference;
        this.leafs = leafs;
    }

    public Forest getForest() {
        return forest;
    }

    public void setForest(final Forest forest) {
        this.forest = forest;
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

    public Set<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(final Set<Leaf> leafs) {
        this.leafs = leafs;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(final Set<Branch> branches) {
        this.branches = branches;
    }

    public Set<Neck> getNecks() {
        return necks;
    }

    public void setNecks(final Set<Neck> necks) {
        this.necks = necks;
    }

    public Set<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(final Set<Fruit> fruits) {
        this.fruits = fruits;
    }
}
