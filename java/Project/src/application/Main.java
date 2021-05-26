package application;

import java.util.Date;
import java.text.SimpleDateFormat;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.stage.Stage;


//https://code.makery.ch/kr/library/javafx-tutorial/part1/
//https://digiconfactory.tistory.com/entry/JavaFX-2-%EC%9E%90%EB%B0%94-GUI-SCENE-2%EA%B0%9C%EB%A5%BC-%EB%B2%88%EA%B0%88%EC%95%84-%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0-SCENE-%EC%94%AC

public class Main extends Application {
	
	/*@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	*/
    /**
     * Shows the person overview inside the root layout.
     */
	@Override
    public void start(Stage primaryStage) {
		
		Controller ctr = new Controller();
        try {
        	
    		Date date_now = new Date(System.currentTimeMillis()); // 현재시간을 가져와 Date형으로 저장한다
    		// 년월일시분초 14자리 포멧
    		SimpleDateFormat fourteen_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
    		String now = fourteen_format.format(date_now); 
    		

    		
		
			

    		ctr.getLogInScene(primaryStage,now);
    		ctr.getRegisterScene(primaryStage);
			

			
			
			primaryStage.setTitle(now);
			primaryStage.setScene(ctr.getSceneLogin());
			primaryStage.show();
			
			
			//회원가입 화면------------------------------------------------------------------------------------
			
			
			
			
			
			
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
