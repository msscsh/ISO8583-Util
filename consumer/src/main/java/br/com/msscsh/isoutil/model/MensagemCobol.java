package br.com.msscsh.isoutil.model;


public class MensagemCobol {

    public String iso;

    public MensagemCobol(){
    }

    public MensagemCobol(String iso) {
        this.iso = iso;
    }

    @Override
    public String toString() {
        return "{" +
                "\"iso\":\"" + iso + "\"" +
                "}";
    }
}