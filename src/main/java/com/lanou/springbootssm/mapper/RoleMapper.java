package com.lanou.springbootssm.mapper;

import com.lanou.springbootssm.bean.Role;
import com.lanou.springbootssm.bean.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    @Delete({
        "delete from role",
        "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleId);

    @Insert({
        "insert into role (role_name, role_des)",
        "values (#{roleName,jdbcType=VARCHAR}, #{roleDes,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="roleId", before=false, resultType=Integer.class)
    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    @Select({
        "select",
        "role_id, role_name, role_des",
        "from role",
        "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    @ResultMap("com.lanou.springbootssm.mapper.RoleMapper.BaseResultMap")
    Role selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update role",
        "set role_name = #{roleName,jdbcType=VARCHAR},",
          "role_des = #{roleDes,jdbcType=VARCHAR}",
        "where role_id = #{roleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
}