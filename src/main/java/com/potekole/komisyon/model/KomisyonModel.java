package com.potekole.komisyon.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

@Entity
@Table(
		name="komisyon_model")

//@TypeDefs({
//	@TypeDef(name="calendarUTC",
//			typeClass= UtcCalendarType.class,
//			defaultForType=Calendar.class)
//})
public class KomisyonModel  implements Serializable {
	
	@Id
	@Column(length=36)
	private String id;
	
	@Version
	private Integer version;
	
//	@Temporal(TemporalType.TIMESTAMP)
//	@Type(type="calendarUTC")
//	private Calendar lastModificationDate;
	
//	@Temporal(TemporalType.TIMESTAMP)
//	@Type(type="calendarUTC")
//	private Calendar creationDate;
	
	@Column(length=32)
	private String username;
	
	@Column(length=32)
	private String password;
	

	private int userId;
	

	@Column(length=32)
	private String productname;
	
	@Column(length=32)
	private String productType;
	
	@Column(length=32)
	private String productWeight;
	
	@Column(length=32)
	private String productUnit;
	
}
