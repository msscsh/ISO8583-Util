package br.com.msscsh.isoutil.builders.visa;

import br.com.msscsh.isoutil.enumeradores.visa.CampoVISA;

@FunctionalInterface
interface AcaoAtributoVISA {
    void executar(CampoVISA atributo);
}
