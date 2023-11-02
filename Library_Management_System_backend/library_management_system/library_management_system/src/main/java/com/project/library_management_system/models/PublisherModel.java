package com.project.library_management_system.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherModel {
    public int id;
    public String name;
    public String address;
    public String phoneNumber;
    public String email;
}
