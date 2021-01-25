package cybersec.cloud.registro;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Studente {
    
    protected int matricola;
    protected String cognome;
    protected String nome;
    
    public Studente() {}
    
    public Studente(int matricola, String cognome, String nome) {
        this.matricola = matricola;
        this.cognome = cognome;
        this.nome = nome;
    }
    
    @JsonProperty
    public int getMatricola() { return this.matricola; }

    @JsonProperty
    public String getCognome() { return this.cognome; }
    
    @JsonProperty
    public String getNome() { return this.nome; }
        
}
