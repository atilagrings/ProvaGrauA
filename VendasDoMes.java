/** Atila Diuliano da Rosa Grings  turma 53  prova GrauA LabI */

public class VendasDoMes{
    private Vendedor vendedor1;// comissionado
    private Vendedor vendedor2;// não comissionado
    private double totalVendidoVendedor1;
    private double totalVendidoVendedor2;
    private int mesVendas;
    
    public VendasDoMes(String vendedor1, String vendedor2, int mesVenda){
        this.vendedor1 = new Vendedor(vendedor1,1);
        this.vendedor2 = new Vendedor(vendedor2,2);
        this.mesVendas = mesVenda;
        totalVendidoVendedor1 = 0;
        totalVendidoVendedor2 = 0; 
    }
    
    public void vende(int tipo, double valorVendido){
        if (tipo == 1) totalVendidoVendedor1 += valorVendido;
        if (tipo == 2) totalVendidoVendedor2 += valorVendido;
    }
    
    private int oTrimestre(){
        if (mesVendas >= 1 && mesVendas <=3) return 1;
        else if (mesVendas >=4 && mesVendas <=6) return 2;
        else if (mesVendas >=7 && mesVendas <= 9) return 3;
        return 4;
    }
    
    public double calculaComissao(){
        if (oTrimestre() == 1 && totalVendidoVendedor1 >= 2000.00) return totalVendidoVendedor1*=1.20;
            else if (oTrimestre() == 1) return totalVendidoVendedor1*=1.08;
        if (oTrimestre() == 2 || oTrimestre() ==4 && totalVendidoVendedor1 >= 3500.00) return totalVendidoVendedor1*=1.12;
            else if (oTrimestre() == 2 || oTrimestre() ==4) return 0;
        return totalVendidoVendedor1*= 1.07;
    }
    
    public boolean atingiuMeta(double valorMeta, int tipoVendedorAnalisado){
        if (tipoVendedorAnalisado == 1 && totalVendidoVendedor1 >= valorMeta ) return true;
        if (tipoVendedorAnalisado == 2 && totalVendidoVendedor2 >= valorMeta ) return true;
        return false;
    }
    
    public String oCampeaoDoMes(){
        if (totalVendidoVendedor1 > totalVendidoVendedor2) return vendedor1.getNome();
        if (totalVendidoVendedor2 > totalVendidoVendedor1) return vendedor2.getNome();
        return null;
    }
    
    public String getNome(int tipo){
        if (tipo == 1) return vendedor1.getNome();
        return vendedor2.getNome();
    }
    
    public double getTotalVendido(int tipo){
        if (tipo ==1) return totalVendidoVendedor1;
        return totalVendidoVendedor2;
    }
    
}




