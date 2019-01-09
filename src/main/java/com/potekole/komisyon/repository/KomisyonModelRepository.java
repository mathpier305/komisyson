package com.potekole.komisyon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.potekole.komisyon.model.KomisyonModel;

@Repository
public interface KomisyonModelRepository extends CrudRepository<KomisyonModel, String> {
	//@Query("select  a from komisyonModel a where a.userId =?1 ")
	List<KomisyonModel> findKomisyonByUserId(String userId);

}
