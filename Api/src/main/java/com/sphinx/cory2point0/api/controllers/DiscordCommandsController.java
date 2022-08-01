package com.sphinx.cory2point0.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sphinx.cory2point0.presenters.DiscordCommandsPresenter;
import com.sphinx.cory2point0.use_cases.DiscordCommandsUseCase;

@RestController
public class DiscordCommandsController {
	private final DiscordCommandsUseCase useCase;
	private final DiscordCommandsPresenter presenter;
	
	
	public DiscordCommandsController(DiscordCommandsUseCase useCase, DiscordCommandsPresenter presenter) {
		this.useCase = useCase;
		this.presenter = presenter;
	}

	@GetMapping()
	public ResponseEntity GetDiscordCommmands() {
		useCase.execute(new GetDiscordCommandsRequest());
		
		return ResponseEntity.ok(presenter.getViewModel());
	}

}
