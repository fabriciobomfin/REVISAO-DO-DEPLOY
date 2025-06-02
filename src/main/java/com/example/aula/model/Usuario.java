package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tab_jogador")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Gênero é obrigatório.")
    private String sexo;

    @NotBlank(message = "Idade é obrigatória.")
    private String idade;

    @NotBlank(message = "Altura é obrigatória.")
    private String altura;

    @NotBlank(message = "Peso é obrigatória.")
    private String peso;

    @NotBlank(message = "Posição é obrigatória.")
    private String posicao;

    @NotBlank(message = "Número da camisa é obrigatória.")
    private String numeroCamisa;



    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Gênero é obrigatório.") String getSexo() {
        return sexo;
    }

    public void setSexo(@NotBlank(message = "Gênero é obrigatório.") String sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "Idade é obrigatória.") String getIdade() {
        return idade;
    }

    public void setIdade(@NotBlank(message = "Idade é obrigatória.") String idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "Altura é obrigatória.") String getAltura() {
        return altura;
    }

    public void setAltura(@NotBlank(message = "Altura é obrigatória.") String altura) {
        this.altura = altura;
    }

    public @NotBlank(message = "Peso é obrigatória.") String getPeso() {
        return peso;
    }

    public void setPeso(@NotBlank(message = "Peso é obrigatória.") String peso) {
        this.peso = peso;
    }

    public @NotBlank(message = "Posição é obrigatória.") String getPosicao() {
        return posicao;
    }

    public void setPosicao(@NotBlank(message = "Posição é obrigatória.") String posicao) {
        this.posicao = posicao;
    }

    public @NotBlank(message = "Número da camisa é obrigatória.") String getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(@NotBlank(message = "Número da camisa é obrigatória.") String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade='" + idade + '\'' +
                ", altura='" + altura + '\'' +
                ", peso='" + peso + '\'' +
                ", posicao='" + posicao + '\'' +
                ", numeroDaCamisa='" + numeroCamisa + '\'' +
                '}';
    }
}
