package com.dzkj.controller;

import com.dzkj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 操作学生的处理器
 */
@Controller
public class StudentController {

    @Autowired
    private IStudentService studentService;

    // 查询所有学生
    @RequestMapping("/quryAll")
    public String quryAll(Map map){
        List stuList = studentService.queryAll();
        map.put("stuList",stuList);
        return "student";
    }
}
