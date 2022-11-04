package pl.treemodel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.treemodel.enums.TreeSpecies;
import pl.treemodel.repository.TreeRepository;
import pl.treemodel.repository.model.Tree;
import pl.treemodel.repository.model.projection.TreeWriteModel;
import pl.treemodel.service.TreeService;

import javax.validation.Valid;

@RestController()
@RequestMapping("/tree")
public class TreeController {

    private final TreeService treeService;

    TreeController(final TreeService treeService) {
        this.treeService = treeService;
    }

    @GetMapping("/read")
    ResponseEntity<?> readAllTrees(){
        return ResponseEntity.ok(treeService.findAll());
    }

    @PostMapping("/add")
    ResponseEntity<?> addTree(@RequestBody @Valid TreeWriteModel treeWrite){
        treeService.save(treeWrite);
        return ResponseEntity.noContent().build();
    }
}
