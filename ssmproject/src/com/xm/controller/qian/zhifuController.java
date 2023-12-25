package com.xm.controller.qian;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class zhifuController {
@RequestMapping("/pay")
public String zhifu(double sum,Model mod) {
	mod.addAttribute("sum", sum);
	return "zhifu";
}
}
