package pl.treemodel.repository;

import pl.treemodel.repository.model.Branch;

import java.util.List;
import java.util.Optional;

public interface BranchRepository {
    List<Branch> findAll();
    Optional<Branch> findById(Integer id);
    Branch save(Branch entity);
    boolean existsById(int id);
}
