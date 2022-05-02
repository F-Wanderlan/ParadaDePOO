package biblioteca;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Emprestimo {
    private Map<String,Livro> livros = new HashMap<String,Livro>();
    private Calendar dataSolicitaçao, dataDevoluçao;

    public Emprestimo(Calendar dataSolicitaçao, Calendar dataDevoluçao){
        this.dataDevoluçao = dataDevoluçao;
        this.dataSolicitaçao = dataSolicitaçao;

    }

    public Calendar getDataSolicitaçao() {
        return dataSolicitaçao;
    }

    public Calendar getDataDevoluçao() {
        return dataDevoluçao;
    }

    public void setDataDevoluçao(Calendar dataDevoluçao) {
        this.dataDevoluçao = dataDevoluçao;
    }
}
