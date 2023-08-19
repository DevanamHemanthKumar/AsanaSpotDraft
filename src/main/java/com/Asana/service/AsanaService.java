package com.Asana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Asana.Repository.AsanaRepository;
import com.Asana.model.AsanaTasks;

@Service
public class AsanaService implements AsanaServiceInterface {
	
	@Autowired
	private AsanaRepository asanaRepo;

	@Override
	public AsanaTasks postAsanaTask(AsanaTasks asanaTask) {
		return asanaRepo.save(asanaTask);
	}

}
