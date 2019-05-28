package cn.wolfcode.ssm.web.controller;

import cn.wolfcode.ssm.service.FaceBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrudController {
    @Autowired
    private FaceBookService service;

    @RequestMapping("/list")
    public String list(Model m){
        m.addAttribute("list",service.listAll().toString());
        return "facebook/list";

    }
}
