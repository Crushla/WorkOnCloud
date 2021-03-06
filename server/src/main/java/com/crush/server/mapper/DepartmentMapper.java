package com.crush.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crush.server.pojo.Department;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    List<Department> getAllDepartments(Integer parentId);

    void addDep(Department dep);

    void deleteDep(Department dep);
}
