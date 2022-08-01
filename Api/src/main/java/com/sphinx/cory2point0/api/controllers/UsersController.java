package com.sphinx.cory2point0.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sphinx.cory2point0.presenters.UsersPresenter;
import com.sphinx.cory2point0.use_cases.UsersUseCase;

@RestController
public class UsersController {
	private final UsersUseCase useCase;
	private final UsersPresenter presenter;
	
	
	public UsersController(UsersUseCase useCase, UsersPresenter presenter) {
		this.useCase = useCase;
		this.presenter = presenter;
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity GetUser(int id) {
		useCase.Execute(new GetUserRequest(id));
		
		return ResponseEntity.ok(presenter.GetViewModel());
	}
	
}
