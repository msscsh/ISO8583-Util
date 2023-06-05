package br.com.msscsh.isoutil.builders.elo;

import br.com.msscsh.isoutil.enumeradores.elo.DeParaCOBOLCopybookCampoElo;

@FunctionalInterface
interface AcaoAtributoElo {
    void executar(DeParaCOBOLCopybookCampoElo campoElo);
}
