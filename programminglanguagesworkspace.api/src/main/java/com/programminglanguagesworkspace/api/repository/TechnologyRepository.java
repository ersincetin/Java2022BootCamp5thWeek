package com.programminglanguagesworkspace.api.repository;

import com.programminglanguagesworkspace.api.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
}
