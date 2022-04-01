package com.example.service;

import com.example.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO, String> {

    void complete(ProjectDTO project);
}
