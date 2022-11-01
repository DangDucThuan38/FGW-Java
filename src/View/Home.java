package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Controller.ManagerSV;
import Controller.Unity;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import Model.SinhVien;

import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Scrollbar;

public class Home extends JFrame {
private JLabel lblNewLabel_1;
   private JButton btnLogOut;
   private JPanel contentPane; 
   private JTable tbEmployee;
   private DefaultTableModel defauTableModel;
   private JButton btnDelete;
   private JButton btnUpdate;
   private JButton btnAdd;
   private JTextField textField;
   private JTextField txtName;
   private JTextField txtEmail;
   private JTextField txtG1;
   private JTextField txtG3;
   private JTextField txtDate;
   private static Home frame; 
   private  JComboBox cbbAdress;
   private  JComboBox cbbClass;
   private  JRadioButton rbMale;
   private  JRadioButton rbFeMale;
   private  JComboBox cbbMajor;
   private  ArrayList<SinhVien> aList;
   

	private final static String FILE_PATH="F:\\testout.txt";
	protected static final String Manager = null;
	/** 
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/Icon/graduates.png")));
		frame = this;
	//Láº¥y data tá»« class managerSv
		ArrayList<SinhVien> aList= ManagerSV.getSinhVienData();
		
//-----------------------------------------------------------------------------------------		
		setTitle("Student management software");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 739);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenuItem btnOpenFile = new JMenuItem("Open file");
		btnOpenFile.setBackground(Color.LIGHT_GRAY);
		mnNewMenu.add(btnOpenFile);
		
		JMenuItem btnSaveFile = new JMenuItem("Save file");
		btnSaveFile.setBackground(Color.LIGHT_GRAY);
		mnNewMenu.add(btnSaveFile);
		
		JMenu mnNewMenu_1 = new JMenu("About");
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("About Me");
		mntmNewMenuItem_2.setBackground(Color.LIGHT_GRAY);
		mnNewMenu_1.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 103, 848, 198);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		//--------------------------------------------
		String[] header= {"Student code","Name Student","DateBrith Day","Class","Sex","Adress","Email","Phone Number","Major","Total Grade"};
		defauTableModel= new DefaultTableModel(header,0);
		
		//Add data to table model(truyền dữ liệu từ alist đến bảng)
		for (SinhVien each : aList) {
			String sex=each.isSex()? "Male":"Female";
			Object[] row= {each.getId(),
					each.getName(),
					each.getDate(),
					each.getClassGroup(),
					sex,
					each.getAdress(),
					each.getEmail(),
					each.getPhone(),
					each.getMajorGroup(),
					each.getTotalgrade()};
			defauTableModel.addRow(row);
		}
		
		JLabel lblNewLabel = new JLabel("Student List");
		lblNewLabel.setBounds(360, 223, 164, 13);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel);
		
		
		//----------------------------------------
		
		tbEmployee = new JTable(defauTableModel);
		panel_1.add(tbEmployee);
		JScrollPane scrollPane = new JScrollPane(tbEmployee);
		scrollPane.setBounds(0, 0, 838, 191);
		panel_1.add(scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(255, 55, 41, 38);
		lblNewLabel_2.setIcon(new ImageIcon(Home.class.getResource("/Icon/students.png")));
		contentPane.add(lblNewLabel_2);
		
		 ButtonGroup group = new ButtonGroup();
	       
	       JLabel lblNewLabel_3_1 = new JLabel("Student management software");
	       lblNewLabel_3_1.setBounds(294, 74, 257, 19);
	       lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
	       contentPane.add(lblNewLabel_3_1);
	      	       
	       JPanel panel = new JPanel();
	       panel.setBounds(0, 299, 841, 381);
	       contentPane.add(panel);
	       panel.setBackground(new Color(211, 211, 211));
	       panel.setLayout(null);
	       
	       rbMale = new JRadioButton("Male");
	       rbMale.setFont(new Font("Tahoma", Font.PLAIN, 12));
	       rbMale.setBackground(new Color(211, 211, 211));
	       rbMale.setBounds(82, 91, 74, 23);
	       panel.add(rbMale);
	       group.add(rbMale);
	       
	       rbFeMale = new JRadioButton("Female");
	       rbFeMale.setFont(new Font("Tahoma", Font.PLAIN, 12));
	       rbFeMale.setBackground(new Color(211, 211, 211));
	       rbFeMale.setBounds(173, 92, 85, 21);
	       panel.add(rbFeMale);
	       group.add(rbFeMale);
	       
	       cbbAdress = new JComboBox();
	       cbbAdress.setFont(new Font("Tahoma", Font.PLAIN, 13));
	       cbbAdress.setBounds(403, 24, 180, 36);
	       panel.add(cbbAdress);
	       cbbAdress.setModel(new DefaultComboBoxModel(new String[] {" ","An Giang", "Bà Rịa – Vũng Tàu", "Bạc Liêu", "Bắc Giang", "Bắc Kạn", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Định", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Thành phố Hồ Chí Minh", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lạng Sơn", "Lào Cai", "Lâm Đồng", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái"}));
	      
	     
	       
	       JLabel lblNewLabel_3_5_1 = new JLabel("Major");
	       lblNewLabel_3_5_1.setBounds(342, 148, 66, 19);
	       panel.add(lblNewLabel_3_5_1);
	       lblNewLabel_3_5_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	       
	        
	         cbbClass = new JComboBox();
	        cbbClass.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        cbbClass.setBounds(78, 240, 180, 36);
	        panel.add(cbbClass);
	        cbbClass.setModel(new DefaultComboBoxModel(new String[] {" "," GCH1001", "GCH1002", "GCH1003", "GCH1004", "GCH1005", "GCH1006", "GCH1007", "GCH1008", "GCH1009 ", "GCH1010", "GCH1011", "GCH1012"}));
	        
	          
	          JLabel lblNewLabel_3_5_2 = new JLabel("Total Grade");
	          lblNewLabel_3_5_2.setBounds(296, 211, 97, 21);
	          panel.add(lblNewLabel_3_5_2);
	          lblNewLabel_3_5_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	          
	          JLabel lblNewLabel_3_5 = new JLabel("Phone Number");
	          lblNewLabel_3_5.setBounds(296, 92, 122, 19);
	          panel.add(lblNewLabel_3_5);
	          lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
	          
	          JLabel lblNewLabel_3_3 = new JLabel("Adress");
	          lblNewLabel_3_3.setBounds(342, 32, 67, 19);
	          panel.add(lblNewLabel_3_3);
	          lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
	          
	          JLabel lblNewLabel_3 = new JLabel("Name");
	          lblNewLabel_3.setBounds(10, 32, 39, 19);
	          panel.add(lblNewLabel_3);
	          lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
	          
	          JLabel lblNewLabel_3_2 = new JLabel("Sex");
	          lblNewLabel_3_2.setBounds(10, 92, 24, 19);
	          panel.add(lblNewLabel_3_2);
	          lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	          
	          JLabel lblNewLabel_3_5_2_1 = new JLabel("Class");
	          lblNewLabel_3_5_2_1.setBounds(10, 248, 33, 19);
	          panel.add(lblNewLabel_3_5_2_1);
	          lblNewLabel_3_5_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	          
	             
	             JLabel lblNewLabel_3_4 = new JLabel("Email");
	             lblNewLabel_3_4.setBounds(10, 198, 36, 19);
	             panel.add(lblNewLabel_3_4);
	             lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
	             
	             txtName = new JTextField();
	             txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
	             txtName.setBounds(78, 23, 180, 41);
	             panel.add(txtName);
	             txtName.setColumns(10);
	             
	             txtEmail = new JTextField();
	             txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
	             txtEmail.setColumns(10);
	             txtEmail.setBounds(78, 192, 180, 35);
	             panel.add(txtEmail);
	             
	             txtG1 = new JTextField();
	             txtG1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	             txtG1.setColumns(10);
	             txtG1.setBounds(403, 84, 180, 39);
	             panel.add(txtG1);
	             
	             txtG3 = new JTextField();
	             txtG3.setFont(new Font("Tahoma", Font.PLAIN, 12));
	             txtG3.setColumns(10);
	             txtG3.setBounds(403, 205, 180, 36);
	             panel.add(txtG3);
	             
	             JLabel lblNewLabel_3_4_1 = new JLabel("Brithday");
	             lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	             lblNewLabel_3_4_1.setBounds(10, 148, 66, 19);
	             panel.add(lblNewLabel_3_4_1);
	             
	             txtDate = new JTextField();
	             txtDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
	             txtDate.setColumns(10);
	             txtDate.setBounds(78, 131, 180, 41);
	             panel.add(txtDate);
	             
	             JButton btnAdd_1 = new JButton("Add");
	             btnAdd_1.setBounds(677, 49, 108, 33);
	             panel.add(btnAdd_1);
	             
	             btnAdd_1.setIcon(new ImageIcon(Home.class.getResource("/Icon/add.png")));
	             btnAdd_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	             
	             JButton btnEdit = new JButton("Edit");
	             btnEdit.setBounds(677, 121, 108, 33);
	             panel.add(btnEdit);
	             btnEdit.setIcon(new ImageIcon(Home.class.getResource("/Icon/exchange.png")));
	             
	             btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
	             
	             JButton btnDelete_1 = new JButton("Delete");
	             btnDelete_1.setBounds(677, 178, 108, 32);
	             panel.add(btnDelete_1);
	             
	             btnDelete_1.setIcon(new ImageIcon(Home.class.getResource("/Icon/delete.png")));
	             btnDelete_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	             
	             JButton btnExit = new JButton("Exit");
	             btnExit.setIcon(new ImageIcon(Home.class.getResource("/Image/logout.png")));
	             btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
	             btnExit.setBounds(728, 326, 93, 33);
	             panel.add(btnExit);
	             
	            cbbMajor = new JComboBox();
	             cbbMajor.setModel(new DefaultComboBoxModel(new String[] {" ","IT", "Business", "Marketing communication", "Graphics Design", "English language", "Computer science", "Safety information", "Banking and Finance", "Ecommerce"}));
	             cbbMajor.setFont(new Font("Tahoma", Font.PLAIN, 12));
	             cbbMajor.setBounds(403, 140, 180, 36);
	             panel.add(cbbMajor);
	             
	             JButton btnCancel = new JButton("Cancel");
	             btnCancel.addActionListener(new ActionListener() {
	             	public void actionPerformed(ActionEvent e) {
	             		resetGUI();
	             	}
	             });
	             btnCancel.setIcon(new ImageIcon(Home.class.getResource("/Image/x-button(1).png")));
	             btnCancel.setBounds(677, 240, 108, 36);
	             panel.add(btnCancel);
	             
	             textField = new JTextField();
	             textField.setBounds(545, 69, 192, 33);
	             contentPane.add(textField);
	             textField.setColumns(10);
	             
	             JButton btnNewButton_1 = new JButton("");
	             btnNewButton_1.setBounds(747, 69, 83, 33);
	             contentPane.add(btnNewButton_1);
	             btnNewButton_1.setIcon(new ImageIcon(Home.class.getResource("/Icon/loupe.png")));
	             btnNewButton_1.addActionListener(new ActionListener() {
	             	public void actionPerformed(ActionEvent e) {
	             	}
	             });
	             btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	             
	             JLabel lblNewLabel_4 = new JLabel("");
	             lblNewLabel_4.setIcon(new ImageIcon(Home.class.getResource("/Image/27-University-of-Greenwich (1).png")));
	             lblNewLabel_4.setBounds(332, 26, 164, 38);
	             contentPane.add(lblNewLabel_4);
	             
	             	             
	             //---------------EVENTE---------------------
	              
	             // Nút Add
	             btnAdd_1.addActionListener(new ActionListener() {
	 		       	public void actionPerformed(ActionEvent e) {
	 		       	  
	 		       		
	 		       		
	 		       		String name= txtName.getText();
	 		       		String sex = rbMale.isSelected() ? "Male" : "Female";
	 		       		String email= txtEmail.getText();
	 		       		String date = txtDate.getText();
	 		       		String phone =txtG1.getText();
	 		       	    String major =cbbMajor.getSelectedItem().toString();
	 		       		double totalgrade =Double.valueOf(txtG3.getText());
	 		       		String selectedaddressGroup= cbbAdress.getSelectedItem().toString();
	 		            String classgroup=cbbClass.getSelectedItem().toString();
	 		       		SinhVien sv= new SinhVien(name, selectedaddressGroup,rbMale.isSelected(), 
	 		       				email, phone, major, totalgrade, classgroup, date);
	 		       		aList.add(sv);
	 		       		updatetable(sv);
	 		       		resetGUI();
	 		    //   	Unity.saveToFile(FILE_PATH, sv);
	     			 ManagerSV.addList(sv);
	
	 		       	}
	 		       });
	             
	             
	             
	             tbEmployee.addMouseListener(new MouseAdapter() {
 
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						//super.mouseClicked(e);
						//Được triệu hồi khi nút chuột đã được click (được nhấn và nhả ra) trên một thành phần.
						int selectedRow = tbEmployee.getSelectedRow();
	     			     int id =Integer.parseInt(defauTableModel.getValueAt(selectedRow, 0).toString());
	     				String name = defauTableModel.getValueAt(selectedRow, 1).toString();
	     				String date = defauTableModel.getValueAt(selectedRow, 2).toString();
	     				String classgroup = defauTableModel.getValueAt(selectedRow, 3).toString();
	     				String sex = defauTableModel.getValueAt(selectedRow, 4).toString();
	     				String address = defauTableModel.getValueAt(selectedRow, 5).toString();
	     				String email = defauTableModel.getValueAt(selectedRow, 6).toString();
	     				String phone = defauTableModel.getValueAt(selectedRow, 7).toString();
	     				String diemvan= defauTableModel.getValueAt(selectedRow, 8).toString();
	     				double totalgrade = Double.parseDouble(defauTableModel.getValueAt(selectedRow, 9).toString());	
					    SinhVien sv= new SinhVien(id, name, address, sex=="Male", email, phone, diemvan,totalgrade, classgroup, date);
	     						fillGUI(sv);
					}
	            	 
				});
	             //------EDIT
	             
	             btnEdit.addActionListener(new ActionListener() {
	 		       	public void actionPerformed(ActionEvent e) {
	 		       	//Get employee selected from JTable
	 					int selectedRow = tbEmployee.getSelectedRow();
	 					int id =Integer.parseInt(defauTableModel.getValueAt(selectedRow, 0).toString());
	 					String name = txtName.getText();
	 					String sex = rbMale.isSelected() ? "Male" : "Female";
	 		       		String email= txtEmail.getText();
	 		       		String date = txtDate.getText();
	 		       		String phone =txtG1.getText();
	 		       		String major =cbbMajor.getSelectedItem().toString();
	 		          	double totalgrade =Double.valueOf(txtG3.getText());
	 		       		String selectedaddressGroup= cbbAdress.getSelectedItem().toString();
	 		       		String selecteclassgroup= cbbClass.getSelectedItem().toString();
	 		       	SinhVien sv= new SinhVien(id, name, selectedaddressGroup, sex=="Male", email, phone, major, totalgrade, selecteclassgroup, date);
	 		       	aList.set(selectedRow, sv);
	 		       	editRowInTable(sv, selectedRow);
	 		       ManagerSV.updateList(sv, selectedRow);
					
	 		       	}  	
	             });
	             
	             
	             btnCancel.addActionListener(new ActionListener() {
		             	public void actionPerformed(ActionEvent e) {
		             		resetGUI();
		             	}
		             });
	 	         
	             btnDelete_1.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		int choice = JOptionPane.showConfirmDialog(null, "Are you sure to delete this row?"
							, "Confirmation",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if(choice == JOptionPane.YES_OPTION) {
						int selectedRow = tbEmployee.getSelectedRow();
						aList.remove(selectedRow);
						defauTableModel.removeRow(selectedRow);
						ManagerSV.deleteTofile(aList);
					}	
		       	}
		       });
	     
	     	       
	   	mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact();
			}
		});
	   	
	   	
	    btnExit.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		
					dispose();
				Login l1= new Login();
					l1.setVisible(true); 
         	}
         });    	  		
	}

	//Behaviors

protected void fillGUI(SinhVien sv) {
		// TODO Auto-generated method stub
		this.txtName.setText(sv.getName());
		this.txtDate.setText(sv.getDate()); 
		this.txtEmail.setText(sv.getEmail());	
		this.txtG1.setText(sv.getPhone());
		this.cbbMajor.setSelectedItem(sv.getMajorGroup());
		this.txtG3.setText(sv.getTotalgrade()+" ");
		this.cbbClass.setSelectedItem(sv.getClassGroup());
		this.cbbAdress.setSelectedItem(sv.getAdress());
		if(sv.isSex()) rbMale.setSelected(true);
	    else rbFeMale.setSelected(true);		
	}


protected void editRowInTable(SinhVien sv, int index) {
	defauTableModel.setValueAt(sv.getId(), index, 0);
	defauTableModel.setValueAt(sv.getName(), index, 1);
	defauTableModel.setValueAt(sv.getDate(), index, 2);
	defauTableModel.setValueAt(sv.getClassGroup(), index, 3);
	defauTableModel.setValueAt(sv.isSex() ? "Male":"Female", index, 4);
	defauTableModel.setValueAt(sv.getAdress(), index, 5);
	defauTableModel.setValueAt(sv.getEmail(), index, 6);
	defauTableModel.setValueAt(sv.getPhone(), index, 7);
	defauTableModel.setValueAt(sv.getMajorGroup(), index, 8);
	defauTableModel.setValueAt(sv.getTotalgrade(), index, 9);	
	}

	protected void Contact() {
		JOptionPane.showMessageDialog(this, "Book management software designed by Dang Duc Thuan");
	}

	protected void resetGUI() {
		txtName.setText("");
		txtG1.setText("");
		cbbMajor.setSelectedIndex(-1);
		txtG3.setText("");
		txtEmail.setText("");
		txtDate.setText("");
		cbbClass.setSelectedIndex(-1);
		cbbAdress.setSelectedIndex(-1);	
	}
  
	protected void updatetable(SinhVien sv) {
		Object[] newRow = {
   				sv.getId(),
   				sv.getName(),
   				sv.getDate(),
   				sv.getClassGroup(),
   				sv.isSex()? "Male" : "FeMale",
   				sv.getAdress(),
   				sv.getEmail(),
   				sv.getPhone(),
   				sv.getMajorGroup(),
   				sv.getTotalgrade()};
   		defauTableModel.addRow(newRow);
			
	}
	
}