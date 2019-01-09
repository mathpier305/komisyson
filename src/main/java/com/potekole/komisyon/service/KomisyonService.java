package com.potekole.komisyon.service;

import java.io.IOException;
import java.util.List;

import com.potekole.komisyon.model.KomisyonModel;

public interface KomisyonService {
	
	String put(KomisyonModel model) throws IOException;
	
	List<KomisyonModel> list(String userId) throws IOException;
	
	KomisyonModel get(String id);
	
	void delete(String id);

}
