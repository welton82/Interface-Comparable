package entities;

import interfaces.TaxaJuros;

public class TaxaUsaJuros implements TaxaJuros {

    private Double juros;

    public TaxaUsaJuros(Double juros) {
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
