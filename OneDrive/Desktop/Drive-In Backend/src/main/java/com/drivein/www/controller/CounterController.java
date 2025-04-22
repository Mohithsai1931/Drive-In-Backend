package com.drivein.www.controller;

import java.awt.MenuItem;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drivein.www.Service.CounterService;
import com.drivein.www.dto.CounterDTO;
import com.drivein.www.dto.ItemsDTO;
import com.drivein.www.model.Counters;
import com.drivein.www.model.Login;


@CrossOrigin("*")
@RestController
@RequestMapping("/api") 
public class CounterController {

    @Autowired
    private CounterService serv;

    @PostMapping("/addcounters")
    public ResponseEntity<String> add(@RequestBody CounterDTO dto) {
        return serv.add(dto);
    }

    @GetMapping("/fetchcounters")
    public ResponseEntity<?> get() {
        return serv.get();
    }

    @GetMapping("/fetchcounter")
    public ResponseEntity<?> getCounterItems(@RequestParam Long id) {
        return serv.getCounterItems(id);
    }

    @PutMapping("/updatecounters/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody CounterDTO dto) {
        return serv.update(id, dto);
    }

    @DeleteMapping("/deletecounters/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        return serv.delete(id);
    }

    @PostMapping("/additems")
    public ResponseEntity<String> addItems(@RequestBody ItemsDTO dto) {
        return serv.addItems(dto);
    }

    @GetMapping("/fetchitems")
    public ResponseEntity<?> getItems() {
        return serv.getItems();
    }

    @PutMapping("/updateitems/{id}")
    public ResponseEntity<String> updateItems(@PathVariable Long id, @RequestBody CounterDTO dto) {
        return serv.updateItems(id, dto);
    }

    @DeleteMapping("/deleteitems/{id}")
    public ResponseEntity<String> deleteItems(@PathVariable long id) {
        return serv.deleteItems(id);
    }

    @PostMapping("/login")
    public ResponseEntity<String> addLogin(@RequestBody Login login) {
        return serv.addLogin(login);
    }

    @GetMapping
    public ResponseEntity<List<Counters>> getAllCounters() {
        return serv.getAllCounters();
    }

    @GetMapping("/{counterId}/menu")
    public List<MenuItem> getMenuByCounter(@PathVariable Long counterId) {
        return serv.getMenuByCounterId(counterId);
    }

    @GetMapping("/menu/{itemId}")
    public MenuItem getMenuItemDetails(@PathVariable Long itemId) {
        return serv.getMenuItemDetails(itemId);
    }
}
