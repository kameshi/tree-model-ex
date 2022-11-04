package pl.treemodel.repository.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.treemodel.repository.ForestRepository;
import pl.treemodel.repository.model.Forest;

public interface SqlForestRepository  extends ForestRepository, JpaRepository<Forest, Integer> {
}
