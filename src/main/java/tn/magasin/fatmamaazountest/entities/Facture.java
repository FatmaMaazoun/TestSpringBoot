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
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;

    private float montantRemise;

    private  float montantFacture;

    @Temporal(TemporalType.DATE)
    private Date dateFacture;

    private  boolean active;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;

    @ManyToOne
    private Client client;


}
