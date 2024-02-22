package org.jsp.adminaddress.dao;

import java.util.Optional;

import org.jsp.adminaddress.dto.Admin;
import org.jsp.adminaddress.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
	@Autowired
	private AdminRepository adminRepository;
    public Admin saveadmin(Admin admin) {
    	return adminRepository.save(admin);
    }
    public Admin updateadmin(Admin admin) {
    	return adminRepository.save(admin);
    }
    public Optional<Admin> findByid(int id) {
    	return adminRepository.findById(id);
    }
    public Optional<Admin> verify(long phone,String password){
    	return adminRepository.verify(phone,password);
    }
    public Optional<Admin> verify(String email,String password) {
    	return adminRepository.verify(email, password);
        }
    }

