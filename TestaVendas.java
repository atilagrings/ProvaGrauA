/** Atila Diuliano da Rosa Grings  turma 53  prova GrauA LabI */

public class TestaVendas{
    public static void main(String[] argus){
        Teclado t = new Teclado ();
        
        System.out.println("\f"); /* Apens para manter a tela limpa */
        
        String vendedor1 = t.leString("Digite o nome do vendedor comissionado");
        String vendedor2 = t.leString("Digite o nome do vendedor não comissionado");
        int mesVendas = t.leInt("Indique o mês de realização das vendas");
        
        //Instanciação do objeto VendasDoMes
        VendasDoMes vendas1 = new VendasDoMes(vendedor1,vendedor2,mesVendas);
        
        //Duas vendas com valores randomicos
            vendas1.vende(1,(500+(int) (Math.random()*(4000-500))));
            vendas1.vende(1,(500+(int) (Math.random()*(4000-500))));
            vendas1.vende(2,(500+(int) (Math.random()*(4000-500))));
            vendas1.vende(2,(500+(int) (Math.random()*(4000-500))));
        
        // Tota vendido e o tipo
        System.out.println("-----------------------------------------------------------");
        System.out.println("Vendedor Comissionado(tipo 1): "+vendas1.getNome(1));
        System.out.println("                  Vlr vendido: "+vendas1.getTotalVendido(1));
        System.out.println("\nVendedor não Comissionado(tipo 2): "+vendas1.getNome(2));
        System.out.println("                      Vlr vendido: "+vendas1.getTotalVendido(2));
        System.out.println("-----------------------------------------------------------");
        
        if (vendas1.oCampeaoDoMes()!= null) System.out.println("\n O(a) vencedor(a) campeão de vendas foi "+vendas1.oCampeaoDoMes());
         else System.out.println("\nEmpate nas vendas");
        System.out.println("\n-----------------------------------------------------------"); 
        double meta = t.leDouble("\nQual a meta do mês do(a) "+vendas1.getNome(2)+"?");
        if (vendas1.getTotalVendido(2) >= meta) System.out.println("O vendedor não comissionado Atingiu a meta! Parabéns!");
            else System.out.println("\nO vendedor não comissionado não atingiu meta!");
    }
}