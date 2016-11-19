/** Atila Diuliano da Rosa Grings  turma 53  prova GrauA LabI */

public class Vendedor{
    private String nome;/* mínimo 7 caracteres */
    private int tipo;/* 1 indica comissionado 2 sem comissão */
    
    public Vendedor(String nome, int tipo){
        setVendedor(nome);
        setTipo(tipo);
    }
    
    public void setVendedor(String nomeVendedor){
        int tamanhoNome = nomeVendedor.length();
        Teclado t = new Teclado();
        if (tamanhoNome >= 7) this.nome = nomeVendedor;
            else
                this.nome="NomeIndefinido";
        }
        
    public void setTipo(int tipo){
        Teclado t = new Teclado();       
        while (tipo != 1 && tipo != 2){
            System.out.println("O tipo digitado não é válido, favor, verifique o código e tente novamente");
            tipo = t.leInt("\fDigite o tipo desejado para o vendedor: \n1 - indica vendedor comissionado\n2 - indica vendedor sem comissão");
            
        }
        this.tipo = tipo;    
    }
    
    public String traduzTipo(){
        if (this.tipo == 1) return "Comissionado";
        return "Sem comissão";
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getTipo(){
        return tipo;
    }
}
    
    
