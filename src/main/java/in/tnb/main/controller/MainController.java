package in.tnb.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.tnb.main.database.Dao;
import in.tnb.service.User;

@Controller
public class MainController {
    @Autowired
	Dao d;
	
  @PutMapping("/save")
  @ResponseBody
  public User home(User u)
  {
	return d.save(u);
  }
  
  @GetMapping("/home")
  @ResponseBody
  public void delete(@RequestParam("id") int name)
  {
	
	  d.deleteById(name);
  }
  @GetMapping("/find")
  @ResponseBody
  public List<User> select()
  {
	
	 return d.findAll();
  }
  
  
}
