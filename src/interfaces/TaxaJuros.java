package interfaces;

public interface TaxaJuros {
    Double getTaxaJuros();


    default Double pagamento(Double valor, Integer mes){

        return valor * Math.pow( 1+getTaxaJuros()/100, mes);

    }
}
