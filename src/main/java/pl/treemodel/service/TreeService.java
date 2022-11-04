package pl.treemodel.service;

import org.springframework.stereotype.Service;
import pl.treemodel.repository.TreeRepository;
import pl.treemodel.repository.model.projection.TreeReadModel;
import pl.treemodel.repository.model.projection.TreeWriteModel;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TreeService {
    private final TreeRepository treeRepository;

    TreeService(final TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public List<TreeReadModel> findAll() {
        return treeRepository.findAll().stream()
                .map(TreeReadModel::new)
                .collect(Collectors.toList());
    }

    public void save(final TreeWriteModel treeWriteModel) {
        treeRepository.save(treeWriteModel.toTree());
    }
}
