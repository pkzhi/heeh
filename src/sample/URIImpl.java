package sample;

import javafx.scene.image.Image;

/**
 * Created by javaz on 2017/10/23.
 */
public class URIImpl {
    private final String uri;
    private final String domain;
    private Image image;

    public URIImpl(String uri, String domain) {
        this.uri    = uri;
        this.domain = domain;
    }

    public String getUri() {
        return uri;
    }

    public String getDomain() {
        return domain;
    }

    public Image getImage() {
        if (image == null) {
            image = new Image("https://plus.google.com/_/favicon?domain=" + getDomain());
        }

        return image;
    }

    @Override
    public String toString() {
        return "URIImpl{" + "uri->" + uri + '}';
    }
}
