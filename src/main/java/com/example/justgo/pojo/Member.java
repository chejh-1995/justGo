package com.example.justgo.pojo;

import java.sql.Timestamp;

/**
 * @auth chejiahui
 * @date 2019/9/18 18:02
 */
public class Member {
    private String mid;
    private String realName;
    private Timestamp createTime;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mid='" + mid + '\'' +
                ", realName='" + realName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
