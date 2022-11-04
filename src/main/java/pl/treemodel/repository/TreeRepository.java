package pl.treemodel.repository;

import pl.treemodel.repository.model.Tree;

import java.util.List;
import java.util.Optional;

public interface TreeRepository {
    List<Tree> findAll();
    Optional<Tree> findById(Integer id);
    Tree save(Tree entity);
    boolean existsById(int id);
}
