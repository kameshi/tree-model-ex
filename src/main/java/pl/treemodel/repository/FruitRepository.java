package pl.treemodel.repository;

import pl.treemodel.repository.model.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitRepository {
    List<Fruit> findAll();
    Optional<Fruit> findById(Integer id);
    Fruit save(Fruit entity);
    boolean existsById(int id);
}
