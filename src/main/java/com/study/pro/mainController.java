package com.study.pro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
    @Autowired
    private itemRepository itmRepo;

    @RequestMapping("/item")
    @ResponseBody
    public List<item> getItems() {
        return itmRepo.findAll();
    }

    @RequestMapping("/item/{id}")
    @ResponseBody
    public Optional<item> getItemById(@PathVariable("id") String itemCode) {
        return itmRepo.findById(Long.parseLong(itemCode));
    }

    @PostMapping("/item")
    @ResponseBody
    public item setItem(@RequestBody item itm) {
        itmRepo.save(itm);
        System.out.println(itm.getItemName());
        return itm;
    }

    @PutMapping("/item")
    @ResponseBody
    public item updateItem(@RequestBody item itm) {
        itmRepo.save(itm);
        return itm;
    }

    @DeleteMapping("/item/{id}")
    @ResponseBody
    public item deleteItem(@PathVariable("id") String itemCode) {
        item itm = itmRepo.getOne(Long.parseLong(itemCode));
        itmRepo.delete(itm);
        return (item) itm;
    }
}