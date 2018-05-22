package sg.edu.rp.webservices.c302_photostoreclient_p05;

public class Photo {

    public String title;
    public String description;

    public Photo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
