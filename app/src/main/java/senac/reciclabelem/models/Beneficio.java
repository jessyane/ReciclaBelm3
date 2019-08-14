package senac.reciclabelem.models;

public class Beneficio {

    private String imageUrl;
    private String titulo;
    private String descricao;
    private String link;
    private String url;

    public Beneficio() {
    }

    public Beneficio(String imageUrl, String titulo, String descricao, String link, String url) {
        this.imageUrl = imageUrl;
        this.titulo = titulo;
        this.descricao = descricao;
        this.link = link;
        this.url = url;
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


}