import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private LocalDate validade;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getValidade() {
        return validade;
    }
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public Integer calcularDiasRestantes() {
        LocalDate hoje = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(hoje, validade);
        return Math.toIntExact(dias);
    }
    
}