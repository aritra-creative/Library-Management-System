package com.project.library_management_system.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.library_management_system.entity.Admin;
import com.project.library_management_system.models.AdminModel;

import com.project.library_management_system.repositary.AdminRepositary;

@Service
public class AdminService {

    @Autowired
    private AdminRepositary adminRepositary;

    public AdminModel createAdmin(AdminModel adminModel) {
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminModel, admin);
        adminRepositary.save(admin);
        return adminModel;
    }

    public List<AdminModel> getAdmin() {
        List<Admin> admins = adminRepositary.findAll();

        List<AdminModel> adminModels = admins.stream()
                .map(adm -> new AdminModel(
                        adm.getId(),
                        adm.getName(),
                        adm.getUsername(),
                        adm.getPassword()))
                .collect(Collectors.toList());
        return adminModels;
    }

    public boolean deleteAdmin(int id) {
        Admin admin = adminRepositary.findById(id).get();
        adminRepositary.delete(admin);
        return true;

    }

}
