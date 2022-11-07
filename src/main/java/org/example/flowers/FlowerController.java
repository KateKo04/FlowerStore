package flowers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FlowerController {

    public static void main(String[] args) {
        SpringApplication.run(FlowerController.class, args);
    }

    @RequestMapping("api/v1/flower")
    @GetMapping
    public List<Flower>  getFlowers(){
        return List.of(new Flower(12, FlowerColor.RED, 55), new Flower(34, FlowerColor.RED, 123), new Flower(10, FlowerColor.RED, 154));
    }

    @RequestMapping("api/v1/delivery")
    @GetMapping
    public String getDelivery(){
        return "Not delivered yet";
    }

    @RequestMapping("api/v1/payment")
    @GetMapping
    public String getPayment(){
        return "No payment system chosen";
    }

}
