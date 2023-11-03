package com.project.library_management_system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.library_management_system.models.AdminModel;
import com.project.library_management_system.service.AdminService;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/admin")
    public AdminModel createAdmin(@RequestBody AdminModel adminModel) {
        return adminService.createAdmin(adminModel);
    }

    @GetMapping("/admins")
    public List<AdminModel> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/admin/{id}")
    public AdminModel getAdminById(@PathVariable int id) {
        return adminService.getAdminById(id);
    }

    @DeleteMapping("/admin/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteAdmin(@PathVariable int id) {
        boolean deleted = false;
        deleted = adminService.deleteAdmin(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    // public AdminModel updateAdmin(@RequestBody AdminModel adminModel) {
    // return adminService.updateAdmin(adminModel);
    // }

}
