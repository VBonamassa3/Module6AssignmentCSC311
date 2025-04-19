module org.example.module6assignmentcsc311 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.module6assignmentcsc311 to javafx.fxml;
    exports org.example.module6assignmentcsc311;
}