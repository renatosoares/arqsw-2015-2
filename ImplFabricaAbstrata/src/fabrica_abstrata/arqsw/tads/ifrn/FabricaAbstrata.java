package fabrica_abstrata.arqsw.tads.ifrn;

import produtos.fabrica_abstrata.arqsw.tads.ifrn.CalculadoraAbstrata;
import produtos.fabrica_abstrata.arqsw.tads.ifrn.EscritorAbstrato;

public abstract class FabricaAbstrata {
	public abstract EscritorAbstrato createEscritor();
	public abstract CalculadoraAbstrata createCalculadora();
}
