package br.com.zup.handora.cadastrobasico4.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

public class AutorDTO {

    @NotBlank
    @Size(max = 120)
    private String nome;

    @NotBlank
    @Size(max = 120)
    private String email;

    @NotBlank
    @Size(max = 2500)
    private String descricao;

    @NotBlank
    @CPF
    private String cpf;

    public AutorDTO() {}

    public AutorDTO(@NotBlank @Size(max = 120) String nome, @NotBlank @Size(max = 120) String email,
                    @NotBlank @Size(max = 2500) String descricao, @NotBlank @CPF String cpf) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.cpf = cpf;
    }

    public Autor paraAutor() {
        String novoCpf = cpf.replaceAll("[^0-9]", "");

        return new Autor(nome, email, descricao, novoCpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
