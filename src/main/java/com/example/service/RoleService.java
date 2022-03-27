package com.example.service;

import com.example.dto.RoleDTO;
import com.example.dto.UserDTO;

import java.util.List;

public interface RoleService extends CrudService<RoleDTO, Long>{

    UserDTO myLogic(UserDTO user, String str);
}
