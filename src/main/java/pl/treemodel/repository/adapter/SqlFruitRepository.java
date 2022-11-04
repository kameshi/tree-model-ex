package pl.treemodel.repository.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.treemodel.repository.FruitRepository;
import pl.treemodel.repository.model.Fruit;

public interface SqlFruitRepository extends FruitRepository, JpaRepository<Fruit, Integer> {
}