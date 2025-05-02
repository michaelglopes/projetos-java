package model;
public class Piscina {
   private double comprimento;
   private double largura;
   private double profundidadeAtual;
   private double profundidadeMaxima;
   
   public Piscina(double comprimento, double largura, double profundidadeAtual, double profundidadeMaxima) {
      this.comprimento = comprimento;
      this.largura = largura;
      this.profundidadeAtual = 0;
      this.profundidadeMaxima = profundidadeMaxima;
   }

   public double getComprimento() {
      return comprimento;
   }

   public void setComprimento(double comprimento) {
      this.comprimento = comprimento;
   }

   public double getLargura() {
      return largura;
   }

   public void setLargura(double largura) {
      this.largura = largura;
   }

   public double getProfundidadeAtual() {
      return profundidadeAtual;
   }

   public void setProfundidadeAtual(double profundidadeAtual) {
      this.profundidadeAtual = profundidadeAtual;
   }

   public double getProfundidadeMaxima() {
      return profundidadeMaxima;
   }

   public void setProfundidadeMaxima(double profundidadeMaxima) {
      this.profundidadeMaxima = profundidadeMaxima;
   }

   public void esvaziar() {
      this.profundidadeAtual = 0;
   }

   public void encher() {
      this.profundidadeAtual = profundidadeMaxima;
   }

   public void encherParcialmente(double profundidade) {
      if (profundidade <= profundidadeMaxima) {
         this.profundidadeAtual = profundidade;
      }else {
         System.out.println("A piscina não comporta essa quanidade de água");
      }
   }
}