package dev.java10x.CadastroDeNinjas.Missoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // @OneToMany - Uma missão pode ter varios ninjas.
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    
    public MissoesModel(Long id, String nome_Missao, String dificuldade, NinjaModel ninjas) {
        this.id = id;
        this.nome = nome_Missao;
        this.dificuldade = dificuldade;
        this.ninjas = (List<NinjaModel>) ninjas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_Missao() {
        return nome;
    }

    public void setNome_Missao(String nome_Missao) {
        this.nome = nome_Missao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    

    


}
