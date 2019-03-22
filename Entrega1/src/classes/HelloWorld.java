package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void imprimir() {
    	DateFormat dataFormatada = new SimpleDateFormat("HH:mm:ss");
    	Date data = new Date();
    	String hora = dataFormatada.format(data);
        System.out.println(hora + " - Ol� " + this.getNome() + ". Voc� acabou de fazer seu primeiro Hello World em Java. Parab�ns.");
    }
}

