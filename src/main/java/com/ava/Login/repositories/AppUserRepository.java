package com.ava.Login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ava.Login.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer>{

	public AppUser findByEmail(String email);
}
