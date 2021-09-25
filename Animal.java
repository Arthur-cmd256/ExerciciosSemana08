public class Animal{
    private String nome;
    private int quantidadePatas;

    Animal(){
        super();
    }

    Animal(String nome){
        setNome(nome);
    }
    Animal(int quantidadePatas, String nome){
        setNome(nome);
        setQuantidadePatas(quantidadePatas);
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

}