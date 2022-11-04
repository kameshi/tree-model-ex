package pl.treemodel.repository;

import pl.treemodel.repository.model.Neck;

import java.util.List;
import java.util.Optional;

public interface NeckRepository {
    List<Neck> findAll();
    Optional<Neck> findById(Integer id);
    Neck save(Neck entity);
    boolean existsById(int id);
}
