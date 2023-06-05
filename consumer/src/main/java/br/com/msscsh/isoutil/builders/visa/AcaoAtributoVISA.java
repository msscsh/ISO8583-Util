package br.com.msscsh.isoutil.builders.visa;

import br.com.msscsh.isoutil.enumeradores.visa.DeParaCOBOLCopybookCampoVISA;

@FunctionalInterface
interface AcaoAtributoVISA {
    void executar(DeParaCOBOLCopybookCampoVISA atributo);
}
