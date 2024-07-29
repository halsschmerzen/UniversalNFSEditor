module halsschmerzen.nfs.universalnfseditor {
    requires javafx.controls;
    requires javafx.fxml;


    opens halsschmerzen.nfs.universalnfseditor to javafx.fxml;
    exports halsschmerzen.nfs.universalnfseditor;
}