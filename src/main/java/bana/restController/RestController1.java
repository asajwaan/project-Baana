package bana.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bana.pojo.Client;
import bana.pojo.LineItem;
import bana.pojo.Registration;

@RestController
public class RestController1 {

@Autowired
ServiceClass serviceObject;
	
	
	@GetMapping("/getLineItems")
	public List<LineItem> getList()
	{
		return serviceObject.getList();
	}
	
	@GetMapping("/getFruits")
	public List<LineItem> getFruits()
	{
		
		return serviceObject.getFruits();
	}
	
	@GetMapping("/getVegetables")
	public List<LineItem> getVegetables()
	{
		return serviceObject.getVegetables();

	}
	
	@PostMapping("/addList")
	public String addList(@RequestBody LineItem req)
	{
		return serviceObject.addList(req);

	}
	//client specific endpoint--------
	
	
	@GetMapping(value="/getClientBYId/{id}")
	public List<Client> getClientBYId(@PathVariable String id)
	{
		return serviceObject.getClientBYId(id);
		
	}
	
	@PutMapping(value="updateClientbyId/{id}")
	public String updateClientbyId(@PathVariable String id, @RequestBody Client reqBody)
	{
		return serviceObject.updateclientById(id,reqBody);
	}
	
	@GetMapping("/getClientList")
	public List<Client> getClientList()
	{
		return serviceObject.getClientList();
	}
	
	@PostMapping("/login")
	public String checkLogin(@RequestParam("name") String name ,@RequestParam("pass") String pass)
	{
		int result= serviceObject.checkLogin(name, pass);
		if(result==1)
			return "login successful token :sefwr234234234234";
		else
			return "unauthorized";
	}
	
	@PostMapping("/addClient")
	public String addClient(@RequestBody Registration reqbody)
	{
		return serviceObject.addClient(reqbody);
	}

}