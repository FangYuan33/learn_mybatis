package dao;

import entity.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> findAll();

    Department findById(String id);
}
