import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;


public class CheckBoxDemo extends Application {

    CheckBox cbSmartphone;
    CheckBox cbTablet;
    CheckBox cbNotebook;
    CheckBox cbDesktop;

    Label response;
    Label selected;

    String computers;

    public static void main(String[] args) {
        launch(args);
    }

    final void setAllowIndeterminated(boolean activate) {
        cbSmartphone.setAllowIndeterminate(true);
    }

    final boolean isIndeterminate() {
        return true;
    }

    void showAll() {
        computers = "";

        if(cbSmartphone.isSelected()) {
            computers = "Smartphone";
        }
        if(cbTablet.isSelected()) {
            computers = "Tablet";
        }
        if(cbNotebook.isSelected()) {
            computers = "Notebook";
        }
        if(cbDesktop.isSelected()) {
            computers = "Desktop";
        }

        selected.setText("Computers selected: " + computers);

        if(cbSmartphone.isSelected() && cbTablet.isSelected() && cbNotebook.isSelected() && cbDesktop.isSelected()) {
            selected.setText("All computers selected.");
        }

    }

    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate Check Boxes");

        FlowPane rootNode = new FlowPane(Orientation.VERTICAL,10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode,230, 200);
        myStage.setScene(myScene);

        Label heading = new Label("What computers do you own?");

        response = new Label("");
        selected = new Label("");

        cbSmartphone = new CheckBox("Smartphone");
        cbTablet = new CheckBox("Tablet");
        cbNotebook = new CheckBox("Notebook");
        cbDesktop = new CheckBox("Desktop");

        selected.setText("Computers selected: " + computers);


        cbSmartphone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                if(cbSmartphone.isSelected()) {
                    response.setText("Smartphone was just selected.");
                } else {
                    response.setText("Smartphone was just cleared.");
                }
                showAll();
            }
        });

        cbTablet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(cbTablet.isSelected()) {
                    response.setText("Tablet was just selected.");
                } else {
                    response.setText("Tablet was just cleared.");
                }
                showAll();
            }
        });

        cbNotebook.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(cbNotebook.isSelected()) {
                    response.setText("Notebook was just selected.");
                } else {
                    response.setText("Notebook was just cleared.");
                }
                showAll();
            }
        });

        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(cbDesktop.isSelected()) {
                    response.setText("Desktop was just selected.");
                } else {
                    response.setText("Desktop was just cleared.");
                }
                showAll();
            }
        });

        rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet,
                cbNotebook, cbDesktop, response, selected);

        myStage.show();

        showAll();
    }
}
