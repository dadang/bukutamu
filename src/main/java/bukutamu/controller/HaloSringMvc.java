package bukutamu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HaloSringMvc {

	@RequestMapping("/coba")
	public ModelMap coba(HttpServletResponse response){
		ModelMap mm = new ModelMap();
		mm.addAttribute("nama", "Fanani") ;
		return mm;
	}
}
