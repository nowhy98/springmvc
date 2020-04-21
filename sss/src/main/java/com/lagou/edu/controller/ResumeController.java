package com.lagou.edu.controller;


import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 简历实体类（在类中要使用注解建立实体类和数据表之间的映射关系以及属性和字段的映射关系）
 * 1、实体类和数据表映射关系
 * @Entity
 * @Table
 * 2、实体类属性和表字段的映射关系
 * @Id 标识主键
 * @GeneratedValue 标识主键的生成策略
 * @Column 建立属性和字段映射
 */
@Controller
public class ResumeController {
    @Autowired
    private ResumeService resumeService;
    //正常访问login页面
    @RequestMapping("/main")
    public String toLogin(){
        return "Login";
    }

    //正常访问login页面
    @RequestMapping("/login")
    public String login(String name){
        //设置到session
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();

        session.setAttribute("resume",name);
        return "list";
    }

    //正常访问login页面
    @RequestMapping(value="/save" ,produces = {"text/plain;charset=UTF-8"})
    public String save(Resume resume){
        //设置到session
        resumeService.add(resume);
        return "list";
    }

    @RequestMapping("/edit")
    public String edit(Resume resume){
        //设置到session
        resumeService.edit(resume);
        return "list";
    }

    @RequestMapping("/delete")
    public String delete(Long id){
        resumeService.deleteById(id);
        return "list";
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Resume> queryAll() throws Exception {
        //设置到session
       List<Resume> resumes = resumeService.queryAll();
       Map<String, Object> map = new HashMap<String, Object>();
       map.put("resums",resumes);
       ObjectMapper objectMapper = new ObjectMapper();
       return resumes;
    }

}
