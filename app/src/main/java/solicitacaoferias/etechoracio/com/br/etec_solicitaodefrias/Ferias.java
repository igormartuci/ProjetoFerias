package solicitacaoferias.etechoracio.com.br.etec_solicitaodefrias;

import java.util.Date;

public class Ferias {

    private String abono;
    private Date dt_inicio;
    private int qtde_dias;
    private Date dt_fim;

    public String getAbono() {
        return abono;
    }

    public void setAbono(String abono) {
        this.abono = abono;
    }

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public int getQtde_dias() {
        return qtde_dias;
    }

    public void setQtde_dias(int qtde_dias) {
        this.qtde_dias = qtde_dias;
    }

    public Date getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(Date dt_fim) {
        this.dt_fim = dt_fim;
    }

}
