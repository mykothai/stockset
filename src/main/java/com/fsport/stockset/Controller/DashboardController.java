package com.fsport.stockset.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static java.lang.Math.*;

@Controller
public class DashboardController {

    @GetMapping({"/dash"})
    public String dashboard() {
        return "dashboard";
    }
}