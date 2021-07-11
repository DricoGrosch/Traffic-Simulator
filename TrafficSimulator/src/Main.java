import View.Tela;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Tela tela;
                try {
                    tela = new Tela();
                    tela.setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }

}
