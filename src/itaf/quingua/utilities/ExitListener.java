package itaf.quingua.utilities;

import java.awt.event.*;

public class ExitListener extends WindowAdapter  {
@Override
    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }
}
