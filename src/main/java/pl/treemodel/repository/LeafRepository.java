package pl.treemodel.repository;

import pl.treemodel.repository.model.Leaf;

import java.util.List;
import java.util.Optional;

public interface LeafRepository {
    List<Leaf> findAll();
    Optional<Leaf> findById(Integer id);
    Leaf save(Leaf entity);
    boolean existsById(int id);
}
