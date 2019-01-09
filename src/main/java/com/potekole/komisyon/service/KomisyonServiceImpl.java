package com.potekole.komisyon.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potekole.komisyon.model.KomisyonModel;
import com.potekole.komisyon.repository.KomisyonModelRepository;

@Service
public class KomisyonServiceImpl implements KomisyonService {

	@Autowired
	private KomisyonModelRepository repository;
	
	@Override
	public String put(KomisyonModel model) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KomisyonModel> list(String userId) throws IOException {

		return null;
	}

	@Override
	public KomisyonModel get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
