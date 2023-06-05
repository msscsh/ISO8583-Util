package br.com.msscsh.isoutil.builders.mastercard;

import br.com.msscsh.isoutil.enumeradores.mastercard.DeParaCOBOLCopybookCampoMastercard;

@FunctionalInterface
interface AcaoAtributoMastercard {
    void executar(DeParaCOBOLCopybookCampoMastercard campoMastercard);
}
