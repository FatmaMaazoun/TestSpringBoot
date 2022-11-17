package tn.magasin.fatmamaazountest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;

    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @ManyToMany
    private List<Fournisseur> fournisseurs;

    @JsonIgnore
    @ManyToOne
    private  Rayon rayon;

    @JsonIgnore
    @ManyToOne
    private  Stock stock;

    @OneToOne(cascade = CascadeType.PERSIST)
    private  DetailProduit detailProduit;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;

}
