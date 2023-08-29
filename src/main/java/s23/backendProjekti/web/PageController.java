package s23.backendProjekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	@RequestMapping ("index")
	@ResponseBody
	public String mainPage() {
		return "This is the main page";
	}
	
	@RequestMapping ("contact")
	@ResponseBody
	public String contactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping ("hello")
	@ResponseBody
	public String sayHello
	
(@RequestParam(name="location", required=false, defaultValue="mysterious place")String loc,
@RequestParam(name="name", required=false, defaultValue="you unknown human being")String nimi)
{
	return "Welcome to the " + loc + " " + nimi + ".";
}
}