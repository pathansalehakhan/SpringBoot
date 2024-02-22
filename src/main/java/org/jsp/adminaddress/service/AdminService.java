package org.jsp.adminaddress.service;

import java.util.Optional;

import org.jsp.adminaddress.dao.AdminDao;
import org.jsp.adminaddress.dto.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	public Admin saveadmin(Admin admin) {
		return adminDao.saveadmin(admin);
	}
	public Admin updateadmin(Admin admin) {
		Optional<Admin> a = adminDao.findByid(admin.getId());
		if(a.isPresent()) {
			return adminDao.updateadmin(admin);
		}
		return null;
	}
	public Admin findByid(int id) {
		Optional<Admin> a = adminDao.findByid(id);
		if(a.isPresent()) {
			return a.get();
		}
		return null;
	}
	public Admin verifyByPhoneAndPassword(long phone,String password) {
		Optional<Admin> a = adminDao.verify(phone, password);
		if(a.isPresent()) {
			return a.get();
		}
		return null;
	}
	public Admin verifyEmailAndPassword(String email,String password) {
		Optional<Admin> a = adminDao.verify(email, password);
		if(a.isPresent()) {
			return a.get();
		}
		return null;
	}


}
