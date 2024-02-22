package org.jsp.adminaddress.controller;

import org.jsp.adminaddress.dto.Admin;
import org.jsp.adminaddress.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@PostMapping
	public Admin saveadmin(@RequestBody Admin admin) {
		return adminService.saveadmin(admin);
	}
	@PutMapping
	public Admin updateadmin(@RequestBody Admin admin) {
		return adminService.updateadmin(admin);
	}
	@GetMapping("{id}")
	public Admin findByid(@PathVariable int  id) {
		return adminService.findByid(id);
	}
	@GetMapping
	public Admin verifyByPhoneAndPassword(@RequestParam long phone,@RequestParam String password) {
		return adminService.verifyByPhoneAndPassword(phone, password);
	}
	@GetMapping("/verify")
	public Admin verifyByEmailAndPassword(@RequestParam String email,@RequestParam String password) {
		return adminService.verifyEmailAndPassword(email, password);
	}
	
	

}
