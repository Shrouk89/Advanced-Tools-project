package com.alakeel.authentication;

import com.alakeel.customer.*;
import javax.ejb.Stateless;
import java.util.*;


@Stateless
public class AuthenticationService {
	private ArrayList<Customer> Customers;
	public AuthenticationService() {
		Customers = new ArrayList<>();
	}
	public void SignIn(String Username, String Password) {
		Customer customer = null;
        for (Customer c : Customers) {
            if (c.getUsername().equals(Username)) {
                customer = c;
                break;
            }
        }      
        if (customer == null) {
        	SignUp(Username, Password);
        }
        
	}
	public void SignUp(String Username, String Password) {
        Customer customer = null;
        for (Customer c : Customers) {
            if (c.getUsername().equals(Username)) {
                customer = c;
                break;
            }
        }
        if (customer != null) {
            SignIn(Username, Password);
        }
	}
}
