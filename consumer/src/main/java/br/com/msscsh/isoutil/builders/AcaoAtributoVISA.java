package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.CampoVISA;

@FunctionalInterface
interface AcaoAtributoVISA {
    void executar(CampoVISA atributo);
}
