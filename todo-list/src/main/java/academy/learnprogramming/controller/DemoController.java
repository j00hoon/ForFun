package academy.learnprogramming.controller;

import academy.learnprogramming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController
{
    // fields
    private final DemoService demoService;


    // constructor
    @Autowired
    public DemoController(DemoService demoService)
    {
        this.demoService = demoService;
    }


    // request methods
    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello()
    {
        return "hello method Fuck you Fuck you";
    }

    // http://localhost:8080/todo-list/welcome
    // http://localhost:8080/todo-list/welcome?user=FuckinBaik
    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model)
    {
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);

        //model.addAttribute("user", "Seunghoon Baik");
        log.info("------------------------------------------------------------- DemoController model : {}", model);

        // prefix + name + suffix
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }




    // model attribute
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage()
    {
        log.info("------------------------------------------------------------- DemoController welcomeMessage");

        return demoService.getWelcomeMessage();
        //return "Welcome to this demo application u fucker !!!";
    }


}
