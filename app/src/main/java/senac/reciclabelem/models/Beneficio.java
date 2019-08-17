package senac.reciclabelem.models;

public class Beneficio {

    private String imageUrl;
    private String titulo;
    private String descricao;
    private String link;
    private String url;
    private String numero;

    public Beneficio() {
    }

    public Beneficio(String imageUrl, String titulo, String descricao, String link, String url, String numero) {
        this.imageUrl = imageUrl;
        this.titulo = titulo;
        this.descricao = descricao;
        this.link = link;
        this.url = url;
        this.numero = numero;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLink() {
        return link;
    }

    public String getUrl() {
        return url;
    }

    public String getNumero(){ return  numero;}

}