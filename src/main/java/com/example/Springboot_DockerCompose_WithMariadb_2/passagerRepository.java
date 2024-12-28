package com.example.Springboot_DockerCompose_WithMariadb_2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface passagerRepository extends JpaRepository<Passanger,Integer> {

}
