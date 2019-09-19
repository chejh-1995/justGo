package com.example.justgo.service;

import com.example.justgo.mapper.MemberDao;
import com.example.justgo.pojo.Member;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auth chejiahui
 * @date 2019/9/18 18:13
 */
@Service
public class MemberService {
    @Resource
    MemberDao memberDao;

    public Member findMember(String mid){
        System.out.println("mid"+mid);
        Member member=memberDao.findOne(mid);
        return member;
    }
}
