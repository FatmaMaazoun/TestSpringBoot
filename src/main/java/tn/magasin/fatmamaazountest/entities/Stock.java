package tn.magasin.fatmamaazountest.entities;

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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private Integer qteStock;
    private Integer qteMin;
    private String libelleStock;

    @OneToMany(mappedBy = "stock")
    private List<Produit> produits;



}
