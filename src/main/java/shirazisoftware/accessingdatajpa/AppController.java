package shirazisoftware.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private final BuddyService service;

    public AppController(BuddyService service) {
        this.service = service;
    }
    @GetMapping("/buddies")
    public String showForm(Model model) {
        model.addAttribute("buddies", new BuddyInfo());
        return "buddies";
    }

    @GetMapping("/buddies/show")
    public List<BuddyInfo> listAll() {
        return service.findAll();
    }

    @PostMapping(value = "/buddies",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String newBuddy(BuddyInfo buddy, Model model) {
        service.save(buddy);
        model.addAttribute("buddies", buddy);
        return "buddies";
    }
}
