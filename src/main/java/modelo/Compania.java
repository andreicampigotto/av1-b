package modelo;

public class Compania {
    String id;
    String nome;
    String dominio;
    String ano;
    String industria;
    String tamanho;
    String localizacao;
    String pais;
    String linkedin;
    int empregados_atual;
    int empregados_total;

    public Compania() {}

    public Compania(String nome) {
        this.nome = nome;
    }

    public Compania(String id, String nome, String dominio, String ano, String industria,
                    String tamanho, String localizacao, String pais, String linkedin) {
        this.id = id;
        this.nome = nome;
        this.dominio = dominio;
        this.ano = ano;
        this.industria = industria;
        this.tamanho = tamanho;
        this.localizacao = localizacao;
        this.pais = pais;
        this.linkedin = linkedin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public int getEmpregados_atual() {
        return empregados_atual;
    }

    public void setEmpregados_atual(int empregados_atual) {
        this.empregados_atual = empregados_atual;
    }
    public int getEmpregados_total() {
        return empregados_total;
    }

    public void setEmpregados_total(int empregados_total) {
        this.empregados_total = empregados_total;
    }

    @Override
    public String toString() {
        return "Compania{" + "id=" + id + ", nome=" + nome + ", dominio=" + dominio + ", ano=" + ano + ", industria="
                + industria + ", tamanho=" + tamanho + ", localizacao=" + localizacao + ", pais=" + pais + ", linkedin="
                + linkedin + ", empregados_atual=" + empregados_atual + ", empregados_total=" + empregados_total + '}';
    }
}
