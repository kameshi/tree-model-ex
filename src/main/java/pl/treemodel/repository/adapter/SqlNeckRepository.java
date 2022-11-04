package pl.treemodel.repository.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.treemodel.repository.NeckRepository;
import pl.treemodel.repository.model.Neck;

public interface SqlNeckRepository extends NeckRepository, JpaRepository<Neck, Integer> {
}
