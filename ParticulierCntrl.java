package com.belhassen.Controllers;
import com.belhassen.Entities.Particulier;
import com.belhassen.Services.ParticulierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
    @RequestMapping("/Particulier/")

    public class ParticulierCntrl {

        @Autowired
        private ParticulierService particulierService;

        @GetMapping(path = "/hello")
        public String getMessage() {
            return "Hello boot";
        }

        @PostMapping("/save")
        public Particulier saveParticulier (@RequestBody Particulier particulier) {

            return particulierService.saveParticulier(particulier);
        }

        @PutMapping("/update")
        public Particulier updateParticulier(@RequestBody Particulier particulier) {
            return particulierService.updateParticulier(particulier);
        }

        @GetMapping("/getall")
        public List<Particulier> getAllParticulier() {
            return particulierService.getAllParticulier();
        }

        @GetMapping("/getone/{particulierId}")
        public Particulier getParticulier(@PathVariable(name = "particulierId") Long particulierId) {
            return particulierService.getParticulier(particulierId);
        }

        @DeleteMapping("/delete/{particulierId}")
        public void deleteParticulier(@PathVariable(name = "particulierId") Long particulierId) {
            particulierService.deleteParticulier(particulierId);
        }
    }