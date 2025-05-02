package Service;
import model.Piscina;
public class ServicosPicina {
    public double calculaQuantidadeAgua(Piscina calcula) {
        
        double metrosCubicos = calcula.getComprimento() * calcula.getLargura() * calcula.getProfundidadeAtual();
        double totalLitros = metrosCubicos * 1000;      
        return totalLitros;
    }
     public void encherPiscida(Piscina piscina) {
        piscina.encher();
     }

     public void encherParcialmentePiscina(Piscina piscina, double profundidade) {
        piscina.encherParcialmente(profundidade);
     }

     public double quantidadeAgua(Piscina piscina) {
        return calculaQuantidadeAgua(piscina);
     }
}