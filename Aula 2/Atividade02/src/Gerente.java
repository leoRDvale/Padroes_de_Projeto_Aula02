public class Gerente extends Funcionario implements Autenticavel{
    public Gerente(String nome, double salarioBase, double vendas, double taxaComissao) {
        super(nome, salarioBase, vendas, taxaComissao);
    }

    @Override
    public double calcSalario() {
        return super.calcSalario();
    }

    @Override
    public boolean autenticar(String usuario, String senha) {
        return "gerente".equals(usuario) && "senha123".equals(senha);
    }
}
