package pl.treemodel.repository.model;

import pl.treemodel.enums.ForestType;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Forest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @NotBlank(message = "Forest must have name")
    private String name;
    private ForestType type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "forest")
    private Set<Tree> trees;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ForestType getType() {
        return type;
    }

    public void setType(final ForestType type) {
        this.type = type;
    }

    public Set<Tree> getTrees() {
        return trees;
    }

    public void setTrees(final Set<Tree> trees) {
        this.trees = trees;
    }
}
