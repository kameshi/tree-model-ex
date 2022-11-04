package pl.treemodel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("isAlive")
    public ResponseEntity<String> isAlive(){
        return ResponseEntity.ok("alive");
    }
}
