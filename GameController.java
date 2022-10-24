import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class GameController {

    int player = 1, scoreX = 0, scoreO = 0;
    boolean endGame = false;

    @FXML
    private Button btn_bottom_center, btn_bottom_left, btn_bottom_right, btn_center, btn_center_left, btn_center_right, 
                   btn_clear_score, btn_restart, btn_top_center, btn_top_left, btn_top_right;
    
    @FXML
    private Label label_next_move, label_score_X, label_score_O;
    
    @FXML
    private TextField placar_O, placar_X;

    @FXML
    void clickBtnBottomCenter(ActionEvent event) {
        if(btn_bottom_center.getText().equals("") && endGame == false){
            if(player == 1){
                btn_bottom_center.setTextFill(Color.RED);;
                btn_bottom_center.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_bottom_center.setTextFill(Color.BLUE);
                btn_bottom_center.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }

    @FXML
    void clickBtnBottomLeft(ActionEvent event) {
        if(btn_bottom_left.getText().equals("") && endGame == false){
            if(player == 1){
                btn_bottom_left.setTextFill(Color.RED);;
                btn_bottom_left.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_bottom_left.setTextFill(Color.BLUE);
                btn_bottom_left.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }

    @FXML
    void clickBtnBottomRight(ActionEvent event) {
        if(btn_bottom_right.getText().equals("") && endGame == false){
            if(player == 1){
                btn_bottom_right.setTextFill(Color.RED);;
                btn_bottom_right.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_bottom_right.setTextFill(Color.BLUE);
                btn_bottom_right.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }

    @FXML
    void clickBtnCenter(ActionEvent event) {
        if(btn_center.getText().equals("") && endGame == false){
            if(player == 1){
                btn_center.setTextFill(Color.RED);;
                btn_center.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_center.setTextFill(Color.BLUE);
                btn_center.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }

    @FXML
    void clickBtnCenterLeft(ActionEvent event) {
        if(btn_center_left.getText().equals("") && endGame == false){
            if(player == 1){
                btn_center_left.setTextFill(Color.RED);;
                btn_center_left.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_center_left.setTextFill(Color.BLUE);
                btn_center_left.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }

    @FXML
    void clickBtnCenterRight(ActionEvent event) {
        if(btn_center_right.getText().equals("") && endGame == false){
            if(player == 1){
                btn_center_right.setTextFill(Color.RED);;
                btn_center_right.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_center_right.setTextFill(Color.BLUE);
                btn_center_right.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }

    @FXML
    void clickBtnTopCenter(ActionEvent event) {
        if(btn_top_center.getText().equals("") && endGame == false){
            if(player == 1){
                btn_top_center.setTextFill(Color.RED);;
                btn_top_center.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_top_center.setTextFill(Color.BLUE);
                btn_top_center.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }

    @FXML
    void clickBtnTopLeft(ActionEvent event) {
        if(btn_top_left.getText().equals("") && endGame == false){
            if(player == 1){
                btn_top_left.setTextFill(Color.RED);;
                btn_top_left.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_top_left.setTextFill(Color.BLUE);
                btn_top_left.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }

    @FXML
    void clickBtnTopRight(ActionEvent event) {
        if(btn_top_right.getText().equals("") && endGame == false){
            if(player == 1){
                btn_top_right.setTextFill(Color.RED);;
                btn_top_right.setText("X");
                player = 0;
                label_next_move.setTextFill(Color.BLUE);
                label_next_move.setText("O");
            }else{
                btn_top_right.setTextFill(Color.BLUE);
                btn_top_right.setText("O");
                player = 1;
                label_next_move.setTextFill(Color.RED);
                label_next_move.setText("X");
            }
            gameController();
        }
    }
    
    @FXML
    void clickBtnRestart(ActionEvent event) {
        btn_bottom_center.setText("");
        btn_bottom_left.setText("");
        btn_bottom_right.setText("");
        btn_center.setText("");
        btn_center_left.setText("");
        btn_center_right.setText("");
        btn_top_center.setText("");
        btn_top_left.setText("");
        btn_top_right.setText("");
        endGame = false;
    }

    void gameController(){
        if(btn_top_left.getText().equals("X") && btn_top_center.getText().equals("X") && btn_top_right.getText().equals("X")){
            endGame = true;
            scoreX =+ 1;
            label_score_X.setText(String.valueOf(scoreX));
        }else
        if(btn_top_left.getText().equals("O") && btn_top_center.getText().equals("O") && btn_top_right.getText().equals("O")){
            endGame = true;
            scoreO =+ 1;
            label_score_O.setText(String.valueOf(scoreO));
        }else
        if(btn_center_left.getText().equals("X") && btn_center.getText().equals("X") && btn_center_right.getText().equals("X")){
            endGame = true;
            scoreX =+ 1;
            label_score_X.setText(String.valueOf(scoreX));
        }else
        if(btn_center_left.getText().equals("O") && btn_center.getText().equals("O") && btn_center_right.getText().equals("O")){
            endGame = true;
            scoreO =+ 1;
            label_score_O.setText(String.valueOf(scoreO));
        }else
        if(btn_bottom_left.getText().equals("X") && btn_bottom_center.getText().equals("X") && btn_bottom_right.getText().equals("X")){
            endGame = true;
            scoreX =+ 1;
            label_score_X.setText(String.valueOf(scoreX));
        }else
        if(btn_bottom_left.getText().equals("O") && btn_bottom_center.getText().equals("O") && btn_bottom_right.getText().equals("O")){
            endGame = true;
            scoreO =+ 1;
            label_score_O.setText(String.valueOf(scoreO));
        }else
        if(btn_top_left.getText().equals("X") && btn_center_left.getText().equals("X") && btn_bottom_left.getText().equals("X")){
            endGame = true;
            scoreX =+ 1;
            label_score_X.setText(String.valueOf(scoreX));
        }else
        if(btn_top_left.getText().equals("O") && btn_center_left.getText().equals("O") && btn_bottom_left.getText().equals("O")){
            endGame = true;
            scoreO =+ 1;
            label_score_O.setText(String.valueOf(scoreO));
        }else
        if(btn_top_center.getText().equals("X") && btn_center.getText().equals("X") && btn_bottom_center.getText().equals("X")){
            endGame = true;
            scoreX =+ 1;
            label_score_X.setText(String.valueOf(scoreX));
        }else
        if(btn_top_center.getText().equals("O") && btn_center.getText().equals("O") && btn_bottom_center.getText().equals("O")){
            endGame = true;
            scoreO =+ 1;
            label_score_O.setText(String.valueOf(scoreO));
        }else
        if(btn_top_right.getText().equals("X") && btn_center_right.getText().equals("X") && btn_bottom_right.getText().equals("X")){
            endGame = true;
            scoreX =+ 1;
            label_score_X.setText(String.valueOf(scoreX));
        }else
        if(btn_top_right.getText().equals("O") && btn_center_right.getText().equals("O") && btn_bottom_right.getText().equals("O")){
            endGame = true;
            scoreO =+ 1;
            label_score_O.setText(String.valueOf(scoreO));
        }else
        if(btn_top_left.getText().equals("X") && btn_center.getText().equals("X") && btn_bottom_right.getText().equals("X")){
            endGame = true;
            scoreX =+ 1;
            label_score_X.setText(String.valueOf(scoreX));
        }else
        if(btn_top_left.getText().equals("O") && btn_center.getText().equals("O") && btn_bottom_right.getText().equals("O")){
            endGame = true;
            scoreO =+ 1;
            label_score_O.setText(String.valueOf(scoreO));
        }else
        if(btn_bottom_left.getText().equals("X") && btn_center.getText().equals("X") && btn_top_right.getText().equals("X")){
            endGame = true;
            scoreX =+ 1;
            label_score_X.setText(String.valueOf(scoreX));
        }else
        if(btn_bottom_left.getText().equals("O") && btn_center.getText().equals("O") && btn_top_right.getText().equals("O")){
            endGame = true;
            scoreO =+ 1;
            label_score_O.setText(String.valueOf(scoreO));
        }
    }
    
    @FXML
    void clickClearScore(ActionEvent event) {
        scoreO = 0;
        scoreX = 0;
        label_score_O.setText(String.valueOf(scoreO));
        label_score_X.setText(String.valueOf(scoreX));
    }
}
