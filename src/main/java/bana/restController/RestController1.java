package bana.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import bana.pojo.Content;

@RestController
public class RestController1 {

@Autowired
ServiceClass serviceObject;
	
	
	@GetMapping("/getList")
	public List<Content> getList()
	{
		return serviceObject.getList();
	}
	
	@PostMapping("/login")
	public int checkLogin(@RequestParam("name") String name ,@RequestParam("pass") String pass)
	{
		
		return serviceObject.checkLogin(name, pass);
	}
	
	@GetMapping("/getFruits")
	public List<Content> getFruits()
	{
		
		return serviceObject.getFruits();
	}
	
	@GetMapping("/getVegetables")
	public List<Content> getVegetables()
	{
		return serviceObject.getVegetables();

	}
	
	@PostMapping("/addList")
	public String addList(@RequestBody Content req)
	{
		return serviceObject.addList(req);

	}
	
}
