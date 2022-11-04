package pl.treemodel.repository.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.treemodel.repository.LeafRepository;
import pl.treemodel.repository.model.Leaf;

public interface SqlLeafRepository extends LeafRepository, JpaRepository<Leaf, Integer> {
}
