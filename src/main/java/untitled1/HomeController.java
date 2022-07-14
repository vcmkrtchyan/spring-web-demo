package untitled1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    private static final List<String> people = Arrays.asList(
            "John Smith",
            "Gago Smith"
    );

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getHome() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("people", people);
        return modelAndView;
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String getHome(ModelMap modelMap) {
//        modelMap.addAttribute("people", people);
//        return "home";
//    }

}
