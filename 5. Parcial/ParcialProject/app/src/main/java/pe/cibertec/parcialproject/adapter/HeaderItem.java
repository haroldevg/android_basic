package pe.cibertec.parcialproject.adapter;

public class HeaderItem extends TaskType {

    private String title;

    public HeaderItem(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int getType() {
        return TYPE_HEADER;
    }
}
