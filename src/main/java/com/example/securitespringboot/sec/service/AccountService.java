package com.example.securitespringboot.sec.service;

import com.example.securitespringboot.sec.entities.AppRole;
import com.example.securitespringboot.sec.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String userName,String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listeUsers();
}
