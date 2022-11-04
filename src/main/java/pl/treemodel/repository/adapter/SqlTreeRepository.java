package pl.treemodel.repository.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.treemodel.repository.TreeRepository;
import pl.treemodel.repository.model.Tree;

public interface SqlTreeRepository extends TreeRepository, JpaRepository<Tree, Integer> {
}
