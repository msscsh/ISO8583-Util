package br.com.msscsh.isoutil.model;


public class MensagemCOBOL {

    public String iso;

    public MensagemCOBOL(){
    }

    public MensagemCOBOL(String iso) {
        this.iso = iso;
    }

    @Override
    public String toString() {
        return "{" +
                "\"iso\":\"" + iso + "\"" +
                "}";
    }
}