import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AprenderCucumber {

    @Dado("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {
    }

    @Quando("executá-lo")
    public void executáLo() {
    }

    @Então("a especificação deve finalizar com sucesso")
    public void aEspecificaçãoDeveFinalizarComSucesso() {
    }

    private Integer contador;

    @Dado("que o valor do contador é {int}")
    public void queOValorDoContadorÉ(Integer valorInicial) {
       this.contador = valorInicial;
    }
    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(Integer valorIncremento) {
        contador = contador + valorIncremento;
    }
    @Então("o valor do contador será {int}")
    public void oValorDoContadorSerá(Integer valorFinal) {
        Assert.assertEquals(valorFinal, contador);
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dataEntrega;
    @Dado("^que o prazo é dia (\\d+)/(\\d+)/(\\d+)$")
    public void queOPrazoÉDia(int dia, int mes, int ano) {
        //dataEntrega = LocalDate.parse(prazo, formatter);
        dataEntrega = LocalDate.of(ano, mes, dia);
    }
    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mês|meses)$")
    public void aEntregaAtrasarEmDias(Integer incremento, String tipo) {
        if (tipo.equals("dia") || tipo.equals("dias")) {
            dataEntrega = dataEntrega.plusDays(incremento);
        } else if (tipo.equals("mes") || tipo.equals("meses")) {
            dataEntrega = dataEntrega.plusMonths(incremento);
        }
    }
    @Então("^a entrega será efetuada em (\\d{2}/\\d{2}/\\d{4})$")
    public void aEntregaSeráEfetuadaEm(String dataAtualizada) {
        LocalDate dataAtual = LocalDate.parse(dataAtualizada, formatter);
        Assert.assertEquals(dataAtual, dataEntrega);
    }

    @Dado("^que o ticket( especial)? é A.(\\d+)$")
    public void queOTicketÉAF345(String tipo, String ticket) {

    }
    @Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
    public void queOValorDaPassagemÉR$(Double double1, Double double2) {

    }
    @Dado("^que o nome do passageiro é \"(.*)\"$")
    public void queONomeDoPassageiroÉ(String string) {

    }
    @Dado("^que o telefone do passageiro é \\d+\\-\\d+$")
    public void queOTelefoneDoPassageiroÉ(Integer int1, Integer int2) {

    }
    @Quando("criar os steps")
    public void criarOsSteps() {

    }
    @Então("o teste vai funcionar")
    public void oTesteVaiFuncionar() {

    }
}
