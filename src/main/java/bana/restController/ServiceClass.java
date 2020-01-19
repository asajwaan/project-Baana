package bana.restController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.*;
import bana.pojo.*;


@Service
public class ServiceClass {

	List<LineItem> lineItem=new ArrayList<LineItem>(Arrays.asList(new LineItem("Apple","fruit","50","NA","dfd"),
			new LineItem("Banana","fruit","40","NA","564"),
			new LineItem("Orange","fruit","50","NA","1236"),
			new LineItem("Pomegranet","fruit","90","NA","54645"),
			new LineItem("bhindi","vegetables","40","NA","3453"))
	);
	
	List<Client> client=new ArrayList<Client>(Arrays.asList(new Client("asajwan","Ashish","Delhi","101 delhi","asajwan@gmail.com","91029","customer","564"),
			new Client("aks","Akhsay","Pune","101 Pune","aks@gmail.com","91020","customer","3453"),
			new Client("random","rankesh","Delhi","101 delhi","rks@gmail.com","91045","customer","1236")		
			));
	
	List<LoginTable> login=new ArrayList<LoginTable>(Arrays.asList(new LoginTable("aks","91020")));
	
	
	public List<LineItem> getList()
	{
		return lineItem;
	}

	public List<Client> getClientList()
	{
		return client;
	}
	
	public String addClient(Registration reqbody)
	{
		client.add(new Client(reqbody.getUsername(),reqbody.getName(),reqbody.getCity(),reqbody.getAddress()
				,reqbody.getEmail(),reqbody.getPhoneNumber(),reqbody.getType(),reqbody.getId()));
		
		login.add(new LoginTable(reqbody.getUsername(),reqbody.getPassword()));
		
		return "successfully added client";
	}
	
	public int checkLogin(String UserName, String Password) {
		// TODO Auto-generated method stub
	//	ent.stream().filter(x-> x.getUsername().equals(UserName)).
		
		return (int) login.stream().filter(x-> x.getUsername().equals(UserName)).filter(y->y.getPassword().equals(Password)).count();
	}

	public List<LineItem> getFruits() {
		// TODO Auto-generated method stub
		
		return lineItem.stream().filter(x->x.getType().equals("fruit")).collect(Collectors.toList());
	}

	public List<LineItem> getVegetables() {
		// TODO Auto-generated method stub
		 return lineItem.stream().filter(x->x.getType().equals("vegetables")).collect(Collectors.toList());
	}

	public String addList(LineItem request) {
		// TODO Auto-generated method stub
		
		lineItem.add(request);
		
		return "added Succesfully";
	}

	public List<Client> getClientBYId(String id) {
		return client.stream().filter(x->x.getId().equals(id)).collect(Collectors.toList());
		
	}

	public String updateclientById(String id, Client updateRequest) {
		// TODO Auto-generated method stub 
		
		for(int x=0;x<client.size();x++) {
			
		if(client.get(x).getId().equals(id))
			client.set(x, updateRequest);	
		}
		return "update Succesfull";
	}
	
	
	
}
