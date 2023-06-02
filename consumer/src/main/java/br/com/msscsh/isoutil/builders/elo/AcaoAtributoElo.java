package br.com.msscsh.isoutil.builders.elo;

import br.com.msscsh.isoutil.enumeradores.elo.CampoElo;

@FunctionalInterface
interface AcaoAtributoElo {
    void executar(CampoElo campoElo);
}
