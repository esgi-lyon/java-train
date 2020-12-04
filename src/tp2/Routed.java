package tp2;

import javax.swing.*;
import java.util.HashMap;

public interface Routed {
    public HashMap<String, JPanel> getRoutes();
    public void setRoutes(HashMap<String, JPanel> routes);
    public void addRoute(String key, JPanel route);
}
