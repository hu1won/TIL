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




public class Controller {
	


	


	private BorderPane rootLogin;
	private BorderPane rootRegister;
	
	//로그인화면
	private Scene sceneLogin;
	//회원가입 화면
	private Scene sceneRegist;
	
	public Controller() {
		rootLogin = new BorderPane();
		
		System.out.println("rootLogin:"+rootLogin);
		rootRegister = new BorderPane();
		
		sceneLogin = new Scene(rootLogin,400,300);
		sceneRegist = new Scene(rootRegister,400,400);	
	}
	
	public BorderPane getRootLogin() {
		return rootLogin;
	}

	

	public BorderPane getRootRegister() {
		return rootRegister;
	}

	public Scene getSceneLogin() {
		return sceneLogin;
	}

	
	public Scene getSceneRegist() {
		return sceneRegist;
	}	
	
	//로그인화면------------------------------------------------------------------------------------		
	public void getLogInScene(Stage primaryStage,String now) {
		

		

		
		
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER);
		
		vbox.setSpacing(20);
		

		
		Label titleLabel = new Label();
		titleLabel.setText(now);
		titleLabel.setFont(new Font(25));
		
		//아이디
		HBox hboxId = new HBox(); //가로 박스로 설정
		hboxId.setAlignment(Pos.CENTER); //중앙정렬로 변경
		hboxId.setSpacing(20); //컨트롤간의 간격은 20으로 
		

		
		TextField id = new TextField(); //텍스트 입력창
		

		
		//여기서부터 Bottom에 들어갈 VBox
		VBox vboxBody = new VBox();
		vboxBody.setAlignment(Pos.CENTER);
		
		vboxBody.setSpacing(20);
		
		Label labelId = new Label();
		labelId.setText("아이디");
		hboxId.getChildren().addAll(labelId,id);
		
		TextField password = new TextField(); //텍스트 입력창
		
		HBox hboxPassword = new HBox(); //가로 박스로 설정
		hboxPassword.setAlignment(Pos.CENTER); //중앙정렬로 변경
		hboxPassword.setSpacing(20); //컨트롤간의 간격은 20으로 			
		
		Label labelPassword = new Label();
		labelPassword.setText("비밀번호");
		

		
		hboxPassword.getChildren().addAll(labelPassword,password);
		vboxBody.getChildren().addAll(hboxId,hboxPassword);
		
		//로그인 버튼
		Button btnLogin = new Button();  
		btnLogin.setText("로그인");
		btnLogin.setMinHeight(0100L);
		//hbox.getChildren().addAll( btn);
		
		//여기서부터 센터에 들어갈 HBox
		HBox hboxBody = new HBox(); //가로 박스로 설정
		hboxBody.setAlignment(Pos.CENTER); //중앙정렬로 변경
		hboxBody.setSpacing(20); //컨트롤간의 간격은 20으로 
		
		hboxBody.getChildren().addAll(vboxBody,btnLogin);
		
		
		Button btnMemberRegist = new Button();  //버튼
		btnMemberRegist.setText("회원가입");
		btnMemberRegist.setOnAction(e->primaryStage.setScene(this.sceneRegist));
	
		
		
		vbox.getChildren().addAll(titleLabel,hboxBody,btnMemberRegist);
		
		rootLogin.setTop(vbox);
		
		
	}
	
	
	public void getRegisterScene(Stage primaryStage) {
		
		VBox vbox = new VBox();
		
		//아이디
		HBox hboxId = new HBox(); //가로 박스로 설정
		hboxId.setAlignment(Pos.CENTER); //중앙정렬로 변경
		hboxId.setSpacing(20); //컨트롤간의 간격은 20으로 
		

		
		TextField id = new TextField(); //텍스트 입력창
		

		
		
		VBox vboxBody = new VBox();
		vboxBody.setAlignment(Pos.CENTER);
		
		vboxBody.setSpacing(20);
		
		//제목
		
		Label labelTitle = new Label();
		labelTitle.setText("회원가입");		
		labelTitle.setMinHeight(50L);
		
		//아이디
		
		Label labelId = new Label();
		labelId.setText("아이디");
		
		
		//중복확인 버튼
		Button btnDup = new Button();  
		btnDup.setText("중복확인");
		
		hboxId.getChildren().addAll(labelId,id,btnDup);
		hboxId.setAlignment(Pos.CENTER_LEFT); 		

		//비밀번호
		HBox hboxPassword = new HBox(); //가로 박스로 설정
		hboxPassword.setAlignment(Pos.CENTER); //중앙정렬로 변경
		hboxPassword.setSpacing(20); //컨트롤간의 간격은 20으로 
		
		Label labelPassword = new Label();
		labelPassword.setText("비밀번호");
		labelPassword.setMinHeight(50L);
		
		TextField password = new TextField(); //텍스트 입력창
		
		Label labelPathLength = new Label();
		labelPathLength.setText("8~16자리로 입력해 주세요");
		
		
		
		hboxPassword.getChildren().addAll(labelPassword,password,labelPathLength);
		hboxPassword.setAlignment(Pos.CENTER_LEFT); 
		
		//비밀번호 확인
		HBox hboxPasswordComfirm = new HBox(); //가로 박스로 설정
		hboxPasswordComfirm.setAlignment(Pos.CENTER); //중앙정렬로 변경
		hboxPasswordComfirm.setSpacing(20); //컨트롤간의 간격은 20으로 
		
		Label labelPasswordComfirm = new Label();
		labelPasswordComfirm.setText("비밀번호 확인");
		labelPasswordComfirm.setMinHeight(50L);
		
		
		TextField passwordComfirm = new TextField(); //텍스트 입력창
		
		
		
		
		hboxPasswordComfirm.getChildren().addAll(labelPasswordComfirm,passwordComfirm);
		hboxPasswordComfirm.setAlignment(Pos.CENTER_LEFT); 
		
		//이름
		HBox hboxName = new HBox(); //가로 박스로 설정
		hboxName.setAlignment(Pos.CENTER); //중앙정렬로 변경
		hboxName.setSpacing(20); //컨트롤간의 간격은 20으로 
		
		Label labelName = new Label();
		labelName.setText("이름");
		labelName.setMinHeight(50L);
		
		TextField name = new TextField(); //텍스트 입력창
		
		
		
		
		hboxName.getChildren().addAll(labelName,name);
		hboxName.setAlignment(Pos.CENTER_LEFT); 
		
		
		//가입,취소
		HBox hboxButton = new HBox(); //가로 박스로 설정
		hboxButton.setMinHeight(50L);
		// 버튼
		Button btnRegist = new Button();  
		btnRegist.setText("가입");

		Button btnCancel = new Button();  
		btnCancel.setText("취소");
		
		hboxButton.getChildren().addAll(btnRegist,btnCancel);
		
		hboxButton.setAlignment(Pos.CENTER); 
		
		
		vbox.setAlignment(Pos.CENTER); //중앙정렬로 변경
		
		vbox.getChildren().addAll(labelTitle,hboxId,hboxPassword,hboxPasswordComfirm,hboxName,hboxButton);
		
		
		
		rootRegister.setTop(vbox);
	}

}
