package entities;

import interfaces.TaxaJuros;

public class TaxaBrasilJuros implements TaxaJuros {

    private Double juros;

    public TaxaBrasilJuros(Double juros) {
        this.juros = juros;
    }



    public void setJuros(Double juros) {
        this.juros = juros;
    }

    @Override
    public Double getTaxaJuros() {
        return juros;
    }


}
