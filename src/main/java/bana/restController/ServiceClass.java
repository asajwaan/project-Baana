package bana.restController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.*;
import bana.pojo.*;


@Service
public class ServiceClass {

	List<Content> fnv=new ArrayList<Content>(Arrays.asList(new Content("Apple","fruit","50","NA"),
			new Content("Banana","fruit","40","NA"),
			new Content("Orange","fruit","50","NA"),
			new Content("Pomegranet","fruit","90","NA"),
			new Content("bhindi","vegetables","40","NA"))
	);
	
	List<Entity> ent=Arrays.asList(new Entity("asajwan","Ashish","Delhi","101 delhi","asajwan@gmail.com","91029","customer","12345"),
			new Entity("aks","Akhsay","Pune","101 Pune","aks@gmail.com","91020","customer","32456"),
			new Entity("random","rankesh","Delhi","101 delhi","rks@gmail.com","91045","customer","46753")		
			);
	
	
	public List<Content> getList()
	{
		return fnv;
	}

	public int checkLogin(String UserName, String Password) {
		// TODO Auto-generated method stub
	//	ent.stream().filter(x-> x.getUsername().equals(UserName)).
		
		return (int) ent.stream().filter(x-> x.getUsername().equals(UserName)).filter(y->y.getPassword().equals(Password)).count();
	}

	public List<Content> getFruits() {
		// TODO Auto-generated method stub
		
		return fnv.stream().filter(x->x.getType().equals("fruit")).collect(Collectors.toList());
	}

	public List<Content> getVegetables() {
		// TODO Auto-generated method stub
		 return fnv.stream().filter(x->x.getType().equals("vegetables")).collect(Collectors.toList());
	}

	public String addList(Content request) {
		// TODO Auto-generated method stub
		
		fnv.add(request);
		
		return "added Succesfully";
	}
	
	
	
}
