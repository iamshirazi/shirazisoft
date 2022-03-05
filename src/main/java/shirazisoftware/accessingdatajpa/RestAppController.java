package shirazisoftware.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class RestAppController {
/*
    @Autowired
    private final BuddyService service;

    public RestAppController(BuddyService service) {
        this.service = service;
    }
    @GetMapping("/buddies")
    public Model showForm(Model model) {
        model.addAttribute("buddies", new BuddyInfo());
        return model;
    }

    @GetMapping("buddies/list")
    public ResponseEntity<List<BuddyInfo>> listAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/buddies",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity newBuddy(BuddyInfo buddy) {
        service.save(buddy);
        return new ResponseEntity(HttpStatus.OK);
    }

 */
}
