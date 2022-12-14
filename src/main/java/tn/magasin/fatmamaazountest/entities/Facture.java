package tn.magasin.fatmamaazountest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;

    @JsonIgnore
    @ManyToOne
    private Client client;


}
