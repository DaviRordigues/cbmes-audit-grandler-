package br.es.gov.cb.cbmesaudit.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuditDTO {
	private Long id;
	private String sourceApp;
	//TODO: CREATION DATE PRECISA SER AUTOGERADO E NAO PASSADO VIA DTO
	private Date creationDate;
	private String auditedUser;
	private String description;
}
