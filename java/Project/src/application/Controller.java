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
	
	//�α���ȭ��
	private Scene sceneLogin;
	//ȸ������ ȭ��
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
	
	//�α���ȭ��------------------------------------------------------------------------------------		
	public void getLogInScene(Stage primaryStage,String now) {
		

		

		
		
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER);
		
		vbox.setSpacing(20);
		

		
		Label titleLabel = new Label();
		titleLabel.setText(now);
		titleLabel.setFont(new Font(25));
		
		//���̵�
		HBox hboxId = new HBox(); //���� �ڽ��� ����
		hboxId.setAlignment(Pos.CENTER); //�߾����ķ� ����
		hboxId.setSpacing(20); //��Ʈ�Ѱ��� ������ 20���� 
		

		
		TextField id = new TextField(); //�ؽ�Ʈ �Է�â
		

		
		//���⼭���� Bottom�� �� VBox
		VBox vboxBody = new VBox();
		vboxBody.setAlignment(Pos.CENTER);
		
		vboxBody.setSpacing(20);
		
		Label labelId = new Label();
		labelId.setText("���̵�");
		hboxId.getChildren().addAll(labelId,id);
		
		TextField password = new TextField(); //�ؽ�Ʈ �Է�â
		
		HBox hboxPassword = new HBox(); //���� �ڽ��� ����
		hboxPassword.setAlignment(Pos.CENTER); //�߾����ķ� ����
		hboxPassword.setSpacing(20); //��Ʈ�Ѱ��� ������ 20���� 			
		
		Label labelPassword = new Label();
		labelPassword.setText("��й�ȣ");
		

		
		hboxPassword.getChildren().addAll(labelPassword,password);
		vboxBody.getChildren().addAll(hboxId,hboxPassword);
		
		//�α��� ��ư
		Button btnLogin = new Button();  
		btnLogin.setText("�α���");
		btnLogin.setMinHeight(0100L);
		//hbox.getChildren().addAll( btn);
		
		//���⼭���� ���Ϳ� �� HBox
		HBox hboxBody = new HBox(); //���� �ڽ��� ����
		hboxBody.setAlignment(Pos.CENTER); //�߾����ķ� ����
		hboxBody.setSpacing(20); //��Ʈ�Ѱ��� ������ 20���� 
		
		hboxBody.getChildren().addAll(vboxBody,btnLogin);
		
		
		Button btnMemberRegist = new Button();  //��ư
		btnMemberRegist.setText("ȸ������");
		btnMemberRegist.setOnAction(e->primaryStage.setScene(this.sceneRegist));
	
		
		
		vbox.getChildren().addAll(titleLabel,hboxBody,btnMemberRegist);
		
		rootLogin.setTop(vbox);
		
		
	}
	
	
	public void getRegisterScene(Stage primaryStage) {
		
		VBox vbox = new VBox();
		
		//���̵�
		HBox hboxId = new HBox(); //���� �ڽ��� ����
		hboxId.setAlignment(Pos.CENTER); //�߾����ķ� ����
		hboxId.setSpacing(20); //��Ʈ�Ѱ��� ������ 20���� 
		

		
		TextField id = new TextField(); //�ؽ�Ʈ �Է�â
		

		
		
		VBox vboxBody = new VBox();
		vboxBody.setAlignment(Pos.CENTER);
		
		vboxBody.setSpacing(20);
		
		//����
		
		Label labelTitle = new Label();
		labelTitle.setText("ȸ������");		
		labelTitle.setMinHeight(50L);
		
		//���̵�
		
		Label labelId = new Label();
		labelId.setText("���̵�");
		
		
		//�ߺ�Ȯ�� ��ư
		Button btnDup = new Button();  
		btnDup.setText("�ߺ�Ȯ��");
		
		hboxId.getChildren().addAll(labelId,id,btnDup);
		hboxId.setAlignment(Pos.CENTER_LEFT); 		

		//��й�ȣ
		HBox hboxPassword = new HBox(); //���� �ڽ��� ����
		hboxPassword.setAlignment(Pos.CENTER); //�߾����ķ� ����
		hboxPassword.setSpacing(20); //��Ʈ�Ѱ��� ������ 20���� 
		
		Label labelPassword = new Label();
		labelPassword.setText("��й�ȣ");
		labelPassword.setMinHeight(50L);
		
		TextField password = new TextField(); //�ؽ�Ʈ �Է�â
		
		Label labelPathLength = new Label();
		labelPathLength.setText("8~16�ڸ��� �Է��� �ּ���");
		
		
		
		hboxPassword.getChildren().addAll(labelPassword,password,labelPathLength);
		hboxPassword.setAlignment(Pos.CENTER_LEFT); 
		
		//��й�ȣ Ȯ��
		HBox hboxPasswordComfirm = new HBox(); //���� �ڽ��� ����
		hboxPasswordComfirm.setAlignment(Pos.CENTER); //�߾����ķ� ����
		hboxPasswordComfirm.setSpacing(20); //��Ʈ�Ѱ��� ������ 20���� 
		
		Label labelPasswordComfirm = new Label();
		labelPasswordComfirm.setText("��й�ȣ Ȯ��");
		labelPasswordComfirm.setMinHeight(50L);
		
		
		TextField passwordComfirm = new TextField(); //�ؽ�Ʈ �Է�â
		
		
		
		
		hboxPasswordComfirm.getChildren().addAll(labelPasswordComfirm,passwordComfirm);
		hboxPasswordComfirm.setAlignment(Pos.CENTER_LEFT); 
		
		//�̸�
		HBox hboxName = new HBox(); //���� �ڽ��� ����
		hboxName.setAlignment(Pos.CENTER); //�߾����ķ� ����
		hboxName.setSpacing(20); //��Ʈ�Ѱ��� ������ 20���� 
		
		Label labelName = new Label();
		labelName.setText("�̸�");
		labelName.setMinHeight(50L);
		
		TextField name = new TextField(); //�ؽ�Ʈ �Է�â
		
		
		
		
		hboxName.getChildren().addAll(labelName,name);
		hboxName.setAlignment(Pos.CENTER_LEFT); 
		
		
		//����,���
		HBox hboxButton = new HBox(); //���� �ڽ��� ����
		hboxButton.setMinHeight(50L);
		// ��ư
		Button btnRegist = new Button();  
		btnRegist.setText("����");

		Button btnCancel = new Button();  
		btnCancel.setText("���");
		
		hboxButton.getChildren().addAll(btnRegist,btnCancel);
		
		hboxButton.setAlignment(Pos.CENTER); 
		
		
		vbox.setAlignment(Pos.CENTER); //�߾����ķ� ����
		
		vbox.getChildren().addAll(labelTitle,hboxId,hboxPassword,hboxPasswordComfirm,hboxName,hboxButton);
		
		
		
		rootRegister.setTop(vbox);
	}

}
