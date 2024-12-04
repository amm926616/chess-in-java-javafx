module com.amm.chessjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.amm.chess.application to javafx.fxml;
    exports com.amm.chess.application;
}