	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JFrame;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import javax.swing.JPasswordField;
	import javax.swing.JPanel;					// d  D
	
public class GUIcool implements ActionListener{
	
	private static JLabel label;
	private static JTextField userText;
	private static JLabel passwordlable;
	private static JPasswordField ptext;
	private static JLabel Sucsess;
	
	public static void main(String args[]){
		
		
		JPanel panel =new JPanel();
		
		JFrame frame = new JFrame();
		frame.setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		 
		panel.setLayout(null); 
		
		label = new JLabel("User");
		label.setBounds(10,20,80,25);
		panel.add(label); 
		
		userText = new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText); 
		
		passwordlable = new JLabel("Password");
		passwordlable.setBounds(10,50,80,25);
		panel.add(passwordlable);
		
		ptext = new JPasswordField();
		ptext.setBounds(100,50,165,25);
		panel.add(ptext);
		
		JButton button = new JButton("Login");
		button.setBounds(10,80,80,25);
		button.addActionListener(new GUIcool());
		panel.add(button);
		
		Sucsess = new JLabel("here me");
		Sucsess.setBounds(100,110,300,25);
		panel.add(Sucsess);
		
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		
		String name = userText.getText();
		String pw = String.valueOf(ptext.getPassword());
		System.out.println(name);
		System.out.println(pw);
		
		if(name.equals("thisara")&& pw.equals("1111")){
			Sucsess.setText("Sucsessfuly login");
		}else{
			Sucsess.setText("wrong");
		}
			
		
	}
	
}