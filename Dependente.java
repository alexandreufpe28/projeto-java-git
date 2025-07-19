import java.time.LocalDate;

public class Dependente {

    private int sequencial;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private Integer sexo;
    private boolean participaPlano;
    public int getSequencial() {
        return sequencial;
    }
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Integer getSexo() {
        return sexo;
    }
    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }
    public boolean isParticipaPlano() {
        return participaPlano;
    }
    public void setParticipaPlano(boolean participaPlano) {
        this.participaPlano = participaPlano;
    }


}
