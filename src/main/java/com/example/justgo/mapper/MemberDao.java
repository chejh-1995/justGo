package com.example.justgo.mapper;

import com.example.justgo.pojo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


/**
 * @auth chejiahui
 * @date 2019/9/18 18:04
 */
@Mapper
public interface MemberDao {
    @Select("SELECT * FROM member WHERE mid=#{mid}")
    @Results({
            @Result(column = "real_name",property = "realName"),
            @Result(column = "create_time",property = "createTime")
    })
    Member findOne(String mid);
}
