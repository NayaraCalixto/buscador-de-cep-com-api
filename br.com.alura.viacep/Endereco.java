public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public String getCep(){
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Cep: " + cep + 
        ", Logradouro: " + logradouro 
        + ", Complemento: " + complemento +
        ", Bairro: " + bairro 
        + ", Localidade: " + localidade 
        + ", UF: " + uf;
    }
    
}
