package com.LogAndReg.example.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.LogAndReg.example.models.LoginUser;
import com.LogAndReg.example.models.User;
import com.LogAndReg.example.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepo;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
        // TO-DO: Additional validations!
    	if(potentialUser.isPresent()) {
    		result.rejectValue("email", "emailError", "Email already taken!");
    	}
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	if(result.hasErrors()) {
    		return null;
    	}else {
    		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    		newUser.setPassword(hashed);
    		return userRepo.save(newUser);
    	}
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        // Find if the user is in the DB
    	Optional<User>potientialUser = userRepo.findByEmail(newLoginObject.getEmail());
    	if(!potientialUser.isPresent()) {
    		result.rejectValue("email", "loginErrors", "email is not found !");
    	}else {
    		User user = potientialUser.get();
    		// check the password
    		if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
    		    result.rejectValue("password", "loginErrors", "Invalid Password!");
    		}
    		if(result.hasErrors()) {
    			return null;
    		}else {
    			return user;
    		}

    	}
        return null;
    	
    }
} 
