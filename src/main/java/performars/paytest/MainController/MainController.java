package performars.paytest.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping(value="/order")
    public String index2(){
        return "order";
    }

}
