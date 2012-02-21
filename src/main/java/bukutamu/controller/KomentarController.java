package bukutamu.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import bukutamu.model.Komentar;

@Controller
public class KomentarController {
	private List<Komentar> daftarKomentar = new ArrayList<Komentar>();
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public ModelMap viewForm(){
		ModelMap mm = new ModelMap();
		mm.addAttribute(new Komentar());
		return mm ;
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String prosesForm(@ModelAttribute @Valid Komentar k,
			BindingResult error,
			SessionStatus session){
		System.out.format("nama", k.getNama());
		System.out.format("email", k.getEmail());
		System.out.format("komentar", k.getKomentar());
		
		// cek error
		if(error.hasErrors()){
			return "form";
		}
		
		daftarKomentar.add(k);
		return "redirect:list" ;
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelMap tampilkanForm(){
		ModelMap mm = new ModelMap();
		mm.addAttribute("daftarKomentar", daftarKomentar);
		return mm;
	}

}