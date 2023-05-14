package J12_Objects_Exercise;

public class Article {
    private String title;
    private String content;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public Article(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void Edit(String newContent){
        this.content = newContent;
    }

    public void ChangeAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void Rename(String newTitle){
        this.title = newTitle;
    }

    void ToString(){
        System.out.printf("%s - %s:%s", title, content, author);
    }
}
