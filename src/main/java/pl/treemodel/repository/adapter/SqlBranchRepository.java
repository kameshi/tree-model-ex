package pl.treemodel.repository.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.treemodel.repository.BranchRepository;
import pl.treemodel.repository.model.Branch;

public interface SqlBranchRepository extends BranchRepository, JpaRepository<Branch, Integer> {
}
