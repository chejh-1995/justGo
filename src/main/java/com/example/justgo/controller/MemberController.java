package com.example.justgo.controller;

import com.example.justgo.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @auth chejiahui
 * @date 2019/9/18 17:45
 */
@RestController  //RestController 包含了Controller和ResponseBody
@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST}, value = "/member")
public class MemberController {
    @Resource
   private MemberService memberService; //记得写private

    @RequestMapping("/show")
    public String showMember(HttpServletRequest request){
        System.out.println("傻掉车架会");
        System.out.println("mid"+memberService.findMember(request.getParameter("mid")).toString());
        return memberService.findMember(request.getParameter("mid")).toString();
    }
}
