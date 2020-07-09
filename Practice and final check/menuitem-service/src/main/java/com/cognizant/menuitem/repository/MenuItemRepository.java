package com.cognizant.menuitem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.menuitem.model.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer>{ 
}
