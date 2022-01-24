
package imageviewer.controler;

import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\vj_62\\Pictures\\Saved Pictures");
        FileImageLoader imageLoader = new FileImageLoader(folder);
        MainFrame mainFrame = new MainFrame();
        Image image = imageLoader.load();
        mainFrame.getImageDisplay().show(image);
    }
    
}
