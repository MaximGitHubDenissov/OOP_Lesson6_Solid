package Notes.model;

public class Note {
    private String id;
    private String title;
    private String text;

    public Note(String id, String title, String text){
        this.id = id;
        this.text = text;
        this.title = title;
    }
    public Note (String title, String text){
        this.title = title;
        this.text = text;
    }
    public String getId() {
        return id;
    }
    public String getText() {
        return text;
    }
    public String getTitle() {
        return title;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return String.format("ID %s\nЗаголовок %s\nТекст записки\n%s\n",id, title, text);
    }
}
