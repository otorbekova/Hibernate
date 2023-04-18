package aizada.spring.com.Controllers;

import aizada.spring.com.service.ActorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/apple")
public class ActorControoler {
private final ActorService service;

    public ActorControoler(ActorService service) {
        this.service = service;
    }


    @GetMapping()
    public String index(Model model) {
        model.addAttribute("key_indexActor", service.findAll());
        return "ActorM/index_actor";
    }
/*

    @GetMapping({"/{id}"})
    public String showId(@PathVariable("id") int id, Model model) {
        model.addAttribute("id_actor", service.findOne(id));
        return "ActorM/showId";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("create_key") Actor person) {
        return "ActorM/create";
    }

    @PostMapping()
    public String create(@ModelAttribute("create_key") @Valid Actor person,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "ActorM/create";

        service.save(person);
        return "redirect:/apple";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable("id") int id) {
        model.addAttribute("update_actor", service.findOne(id));
        return "ActorM/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("update_actor") @Valid Actor actor, BindingResult bindingResult,
                         @PathVariable("id") int id) {
        if (bindingResult.hasErrors()) {
            return "ActorM/edit";
        } else {
            service.update(id, actor);
            return "redirect:/apple";
        }
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        service.delete(id);
       return "redirect:/apple";
    ///return "ActorControoler/index_actor";
    }
*/

}