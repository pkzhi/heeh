package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;
import javafx.util.Pair;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML private TreeView documentTree;

    @FXML private TableView contentTable;

    @FXML public TableColumn content;
    @FXML public TableColumn<Row, CheckBox> checked;




    // the initialize method is automatically invoked by the FXMLLoader - it's magic
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        documentTree.setCellFactory(new Callback<TreeView<Pair<URIImpl, String>>, TreeCell<Pair<URIImpl, String>>>() {
            @Override
            public TreeCell<Pair<URIImpl, String>> call(TreeView<Pair<URIImpl, String>> treeView) {
                return new TreeCell<Pair<URIImpl, String>>() {
                    final ImageView iconView = new ImageView();

                    @Override
                    protected void updateItem(final Pair<URIImpl, String> pair, boolean empty) {
                        super.updateItem(pair, empty);

                        if (!empty && pair != null) {
                            setText(
                                    pair.getValue()
                            );
                            setGraphic(
                                    iconView
                            );
                            iconView.setImage(pair.getKey().getImage());
                        } else {
                            setText(null);
                            setGraphic(null);
                        }

                        setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent event) {
                                //clickedPair.setText("Key: " + pair.getKey() + " Value: " + pair.getValue());
                            }
                        });
                    }
                };
            }
        });

        loadTreeItems(
                createPair("http://www.google.com", "google.com", "Google"),
                createPair("http://www.microsoft.com", "microsoft.com", "Microsoft"),
                createPair("http://www.yahoo.com", "yahoo.com", "Yahoo")
        );


        loadTableItems();
    }

    private Pair<URIImpl, String> createPair(String uri, String domain, String name) {
        return new Pair<>(new URIImpl(uri, domain), name);
    }

    private void loadTableItems() {
         final ObservableList<Row> data =
                FXCollections.observableArrayList(
                        new Row(1, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(2, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(3, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(4, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(5, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(6, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(7, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(8, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(9, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(10, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),
                        new Row(11, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）"),

                        new Row(5, "段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容段落内容（可编辑）")

                );
        contentTable.setEditable(true);

        content.setCellValueFactory(new PropertyValueFactory<>("content"));
        checked.setCellValueFactory(cellData -> cellData.getValue().getChecked().getCheckBox());

        contentTable.setItems(data);


    }

    private void loadTreeItems(Pair<URIImpl,String>... rootItems) {
        TreeItem<Pair<URIImpl,String>> root = new TreeItem(createPair("N/A", "", "Root Node"));
        root.setExpanded(true);

        for (Pair<URIImpl, String> pair: rootItems) {
            root.getChildren().add(
                    new TreeItem<>(
                            pair
                    )
            );
        }

        documentTree.setRoot(root);
    }

}
