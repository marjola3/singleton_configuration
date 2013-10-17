package configuration;

/**
 * User: Mariola
 * Date: 17.10.13
 */
public class Configuration {
    private static Configuration configuration = new Configuration();
    private String path;
    private int width;
    private int height;

    public static Configuration getConfiguration(){
        return configuration;
    }

    private Configuration(){}

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
