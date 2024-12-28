package com.example.Springboot_DockerCompose_WithMariadb_2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class passangerController {
@Autowired passagerRepository prepo;
@RequestMapping("/test")
public String test()
{
	return"this for Mariadb test";
}
@PostMapping("/save")
public String saveData(@RequestBody Passanger p)
{
	prepo.save(p);
	return"data is saved";
}
@GetMapping("/all")
public List<Passanger> showAll()
{
	return prepo.findAll();
	
}

}
