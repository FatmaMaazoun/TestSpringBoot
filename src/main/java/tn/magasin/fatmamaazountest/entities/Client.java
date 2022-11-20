package tn.magasin.fatmamaazountest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String nom;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String email;

    private String Password;
    @Enumerated(EnumType.STRING)
    private CategorieClient categorieProfession;

    private Profession profession;

    @OneToMany(mappedBy = "client")
    private List<Facture> factures;

}

