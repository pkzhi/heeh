package sample;

import javafx.scene.control.CheckBox;

/**
 * Created by javaz on 2017/10/24.
 */
public class Row {
    private Integer index;
    private String content;
    private EditCell checked = new EditCell();

    public Row(Integer index, String content) {
        this.index = index;
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditCell getChecked() {
        return checked;
    }

}
