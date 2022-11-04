package pl.treemodel.service;

import org.junit.jupiter.api.Test;
import pl.treemodel.enums.TreeCrossSection;
import pl.treemodel.enums.TreeSpecies;
import pl.treemodel.enums.TreeType;
import pl.treemodel.repository.TreeRepository;
import pl.treemodel.repository.model.Tree;
import pl.treemodel.repository.model.projection.TreeReadModel;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TreeServiceTest {

    @Test
    void findAll_rerurnOneElementList() {
        //given
        var mockTreeRepository = mock(TreeRepository.class);
        when(mockTreeRepository.findAll()).thenReturn(Collections.singletonList(new Tree(TreeType.LeafyTree, TreeSpecies.Ash, TreeCrossSection.Columnar, 4, 6.5, 3.4, Collections.emptySet())));
        var toTest = new TreeService(mockTreeRepository);
        //when
        final List<TreeReadModel> all = toTest.findAll();
        //then
        assertThat(all.size()).isOne();
    }
}