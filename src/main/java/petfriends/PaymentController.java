package petfriends;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 public class PaymentController {
	 @GetMapping("api/hello")
	 public String test() {
		 System.out.println("Hello, Payment");
		 return "Hello, Payment";
	 }
 }
