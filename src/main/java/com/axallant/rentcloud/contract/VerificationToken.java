package com.axallant.rentcloud.contract;

import javax.persistence.*;


import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;


@Entity
public class VerificationToken {
	
	private static final int EXPIRATION = 60 * 72;
	 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String token;
  
    @OneToOne(targetEntity = Tenant.class, fetch = FetchType.EAGER)
    private Tenant tenant;
    
    private Date expiryDate;
    
    public VerificationToken() {
		// TODO Auto-generated constructor stub
	}
   
    public VerificationToken(String token, Tenant tenant) {
		
		this.token = token;
		this.tenant = tenant;
		this.expiryDate =calculateExpiryDate(EXPIRATION);
	}
    
    public VerificationToken(Long id, String token, Tenant tenant, Date expiryDate) {
		
		this.id = id;
		this.token = token;
		this.tenant = tenant;
		this.expiryDate = expiryDate;
	}

	private Date calculateExpiryDate(int expiryTimeInMinutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public static int getExpiration() {
		return EXPIRATION;
	}
    
    

}
