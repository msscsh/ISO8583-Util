package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.CampoMastercard;

@FunctionalInterface
interface AcaoAtributoMastercard {
    void executar(CampoMastercard campoMastercard);
}
