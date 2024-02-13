package tyler.hopperroutes;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainContoller {
    
    @GetMapping("/")
    public String index(Model model) {

        ArrayList<Receipt> receipts = new ArrayList<>();

        receipts.add( new Receipt("Grace Hopper", "copper wire", "11.25 inches of wire", 45.45, "Home Depot"));
        receipts.add( new Receipt("Josh Gallaway", "Bathroom Vanity", "nice sink and cabnets", 700.45, "Lowe's"));
        model.addAttribute("receipts", receipts);
        return "index.jsp";
    }
    
}
