package com.drivein.www.Service;

import java.awt.MenuItem;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.drivein.www.dto.CounterDTO;
import com.drivein.www.dto.ItemsDTO;
import com.drivein.www.model.Counters;
import com.drivein.www.model.Login;
import com.drivein.www.repo.CounterRepo;
import com.drivein.www.repo.LoginRepo;

@Service
public class CounterService {

    @Autowired
    private CounterRepo counterRepo;

    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired 
    private LoginRepo loginRepo;

    public ResponseEntity<String> addCounter(CounterDTO dto) {
        Counters counter = modelMapper.map(dto, Counters.class);
        counterRepo.save(counter);
        return ResponseEntity.ok("Counter saved successfully");
    }

    
    public ResponseEntity<List<Counters>> getAllCounters() {
        List<Counters> counters = counterRepo.findAll();
        return ResponseEntity.ok(counters);
    }


    public ResponseEntity<String> updateCounter(Long id, CounterDTO dto) {
        Optional<Counters> optionalCounter = counterRepo.findById(id);

        if (optionalCounter.isPresent()) {
            Counters counter = optionalCounter.get();
            modelMapper.map(dto, counter);
            counterRepo.save(counter);
            return ResponseEntity.ok("Counter updated successfully");
        } else {
            return ResponseEntity.status(404).body("Counter not found");
        }
    }

    public ResponseEntity<String> deleteCounter(Long id) {
        if (counterRepo.existsById(id)) {
            counterRepo.deleteById(id);
            return ResponseEntity.ok("Counter deleted");
        }
        return ResponseEntity.status(404).body("Counter not found");
    }

    public ResponseEntity<String> addLogin(Login login) {
    	Login existingUser = loginRepo.findByUsername(login.getUsername());

        if (existingUser != null) {
            if (existingUser.getPassword().equals(login.getPassword())) {
                return ResponseEntity.ok("Access Granted");
            } else {
                return ResponseEntity.status(403).body("Incorrect password");
            }
        } else {
            return ResponseEntity.status(404).body("Username not registered");
        }
    }

    public ResponseEntity<String> additems(Object dto) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ResponseEntity<?> getitems() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ResponseEntity<String> updateitems(Long id, Object dto) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ResponseEntity<String> deleteitems(long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ResponseEntity<?> getcounteritems(Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

	public ResponseEntity<String> add(CounterDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<?> get() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<?> getCounterItems(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<String> update(Long id, CounterDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<String> delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<String> addItems(ItemsDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<?> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<String> updateItems(Long id, CounterDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<String> deleteItems(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public MenuItem getMenuItemDetails(Long itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<MenuItem> getMenuByCounterId(Long counterId) {
		// TODO Auto-generated method stub
		return null;
	}

}
