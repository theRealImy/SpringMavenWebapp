package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Timea on 11-Oct-17.
 */
@Controller
public class HelloWorldController {
    String message = "Hello ";

    @RequestMapping("/hello")
    public ModelAndView showMessage(@RequestParam(required = false, defaultValue = "World") String name) {
        ModelAndView mv = new ModelAndView("helloworld");
        mv.addObject("message", this.message);
        mv.addObject("name", name);
        return mv;
    }
}
