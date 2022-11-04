package pl.treemodel.repository;

import pl.treemodel.repository.model.Forest;

import java.util.List;
import java.util.Optional;

public interface ForestRepository {
    List<Forest> findAll();
    Optional<Forest> findById(Integer id);
    Forest save(Forest entity);
    boolean existsById(int id);
}
