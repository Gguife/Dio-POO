package iphone;

import browser.Browser;
import musicPlayer.MusicPlayer;
import phone.Phone;

public class Iphone implements MusicPlayer, Phone, Browser {
  public void tocar(){
    System.out.println("Tocando música");
  }
  public void pausar(){
    System.out.println("Pausando música");
  }
  public void selecionarMusica(){
    System.out.println("Música selecionada");
  }

  public void ligar(){
    System.out.println("Ligando");
  }
  public void atender(){
    System.out.println("Ligacação atendida");
  }
  public void iniciarCorreioVoz(){
    System.out.println("Iniciando correio de voz");
  }
  
  public void exibirPagina(){
    System.out.println("Exibindo pagina");
  }
  public void adicionarNovaAba(){
    System.out.println("Adiocionando nova aba");
  }
  public void atualizarPagina(){
    System.out.println("Atualizando pagina");
  }

}
