package myorg.ToDo.Entities;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
@Data
@Table(name = "dipendenti")
public class Dipendente {
    //idDipendente nome cognome codiceFiscale eMail

    @Id
    @Positive
    private int idDipendente;

    @NotBlank
    private String nome;

    @NotBlank
    private String cognome;

    @Length(min = 16, max = 16)
    private String codiceFiscale;

    @Email
    private String eMail;





}
