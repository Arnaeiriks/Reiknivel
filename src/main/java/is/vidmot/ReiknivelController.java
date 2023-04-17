package is.vidmot;

import is.vinnsla.Reiknivel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ReiknivelController {

    @FXML
    private TextField fxUttak;

    private Reiknivel reiknivel;



    public void initialize() {
        reiknivel = new Reiknivel();
    }

    public void inntakTalaActionPerformed(ActionEvent actionEvent) {
        int tala = Integer.parseInt(((Node)actionEvent.getSource()).getId());
        reiknivel.setTala(tala);
        fxUttak.setText(fxUttak.getText()+tala);
    }

    public void hreinsaHandler(ActionEvent actionEvent) {
        reiknivel.hreinsa();
        fxUttak.setText("");
    }

    public void jafntogHandler(ActionEvent actionEvent) {
        fxUttak.setText(reiknivel.jafntOg()+"");
    }

    public void virkiHandler(ActionEvent actionEvent) {
        int virkiNr = Integer.parseInt(((Node)actionEvent.getSource()).getId());
        reiknivel.setVirki(virkiNr-10);
        fxUttak.setText(fxUttak.getText()+ ((Button)actionEvent.getSource()).getText());
    }
}
