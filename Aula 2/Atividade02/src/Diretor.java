public class Diretor extends Funcionario implements Autenticavel{

    public Diretor(String nome, double salarioBase, double vendas, double taxaComissao) {
        super(nome, salarioBase, vendas, taxaComissao);
    }

    @Override
    public double calcSalario() {
        return super.calcSalario();
    }

    @Override
    public boolean autenticar(String usuario, String senha) {
        return "diretor".equals(usuario) && "senha123".equals(senha);
    }
}
