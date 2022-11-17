package tn.magasin.fatmamaazountest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;

    private Integer qte;
    private float prixTotal;
    private Integer pourcentageRemise;

    private Integer montantRemise;

    @ManyToOne
    private  Produit produit;

    @ManyToOne
    private  Facture facture;

}
