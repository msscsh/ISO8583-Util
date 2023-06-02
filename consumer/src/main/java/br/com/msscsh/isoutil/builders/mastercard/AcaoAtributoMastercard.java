package br.com.msscsh.isoutil.builders.mastercard;

import br.com.msscsh.isoutil.enumeradores.mastercard.CampoMastercard;

@FunctionalInterface
interface AcaoAtributoMastercard {
    void executar(CampoMastercard campoMastercard);
}
