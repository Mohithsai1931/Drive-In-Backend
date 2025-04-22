
package com.drivein.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drivein.www.model.Counters;
@Repository
public interface CounterRepo extends JpaRepository<Counters,Long>{

}
