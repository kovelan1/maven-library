package com.axallant.rentcloud.maintenance;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProviderInvite extends CommonFields{
	
	private static final int EXPIRATION = 60 * 24 * 3;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="maintenance_provider_id")
	private MaintenanceProvider maintenanceProvider;
	
	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@NotNull
	@JoinColumn(name="service_request_id")
	private ServiceRequest serviceRequest;
	
	@Column(columnDefinition = "LONGTEXT")
	private String invitationLink;
	
	@Enumerated(EnumType.STRING)
	private InviteMode inviteMode;
	
	private boolean enabled;
	
	private String token;
	
	@Column(columnDefinition = "LONGTEXT")
	private String description;
	
	private Date expiryDate = calculateExpiryDate(EXPIRATION);
	
	private Date calculateExpiryDate(int expiryTimeInMinutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }
	
	public static int getExpiration() {
		return EXPIRATION;
	}
	
	public ProviderInvite() {
		
	}
	
	
}
