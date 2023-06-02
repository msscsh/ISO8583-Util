package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.CampoElo;

@FunctionalInterface
interface AcaoAtributoElo {
    void executar(CampoElo campoElo);
}
