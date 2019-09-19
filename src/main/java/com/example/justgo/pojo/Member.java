package com.example.justgo.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @auth chejiahui
 * @date 2019/9/18 18:02
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String mid;
    private String realName;
    private Timestamp createTime;
}
