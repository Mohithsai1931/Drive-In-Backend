package com.drivein.www.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivein.www.model.Items;
import com.drivein.www.repo.ItemsRepository;

@Service
public class ItemsService {

    @Autowired
    private ItemsRepository itemsRepository;

    public List<Items> getAllItems() {
        return itemsRepository.findAll();
    }

    public Items saveItem(Items item) {
        return itemsRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemsRepository.deleteById(id);
    }
}
