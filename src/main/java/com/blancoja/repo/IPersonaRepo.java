package com.blancoja.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blancoja.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
