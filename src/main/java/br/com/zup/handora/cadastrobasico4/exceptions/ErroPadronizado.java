package br.com.zup.handora.cadastrobasico4.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.FieldError;

public class ErroPadronizado {

    private String codigoHttp;
    private String mensagemHttp;
    private String mensagemGeral;
    private List<String> mensagens;

    public ErroPadronizado(String codigoHttp, String mensagemHttp, String mensagemGeral) {
        this.codigoHttp = codigoHttp;
        this.mensagemHttp = mensagemHttp;
        this.mensagemGeral = mensagemGeral;
        this.mensagens = new ArrayList<>();
    }

    public void adicionarErro(FieldError fieldError) {
        mensagens.add(fieldError.getField() + ": " + fieldError.getDefaultMessage());
    }

    public void adicionarErro(String error) {
        mensagens.add(error);
    }

    public String getCodigoHttp() {
        return codigoHttp;
    }

    public String getMensagemHttp() {
        return mensagemHttp;
    }

    public String getMensagemGeral() {
        return mensagemGeral;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

}
