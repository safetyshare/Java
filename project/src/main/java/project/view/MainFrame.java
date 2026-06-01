package project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import project.bean.Student;
import project.dao.StudentDao;
import project.dao.impl.StudentDaoImpl;
import project.util.GUITools;
import project.util.ListToArray;

public class MainFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JScrollPane tablePane;
	private JTable table;
	private JPanel msgPanel,btnPanel;
	private JLabel lblSid,lblSname,lblSclass,lblAddress,lblTeleNumber,lblQQ;
	private JTextField txtSid,txtSname,txtSclass,txtAddress,txtTeleNumber,txtQQ;
	private JButton btnAdd,btnQueryById,btnQueryByName,btnUpdate,btnDelete;
	private StudentDao sd=null;
	public MainFrame() {
		super("班级通讯录界面");
		initComponent();
		//使用接口实现类构造方法创建StudentDao接口对象
		sd=new StudentDaoImpl();
		//调用StudentDao对象方法，查询所有通讯录信息，显示在主窗体界面表格中
		this.refreshTable(sd.lookAllStudent());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(650, 600);
		GUITools.center(this);
		this.setVisible(true);
	}
	private void initComponent() {
		this.setLayout(null);
		tablePane=new JScrollPane();//显示表格的滚动面板
		table=new JTable();//显示通讯录信息的表格
		tablePane.setBounds(10, 10, 610, 330);
		tablePane.setViewportView(table);//设置表格显示在滚动面板上
		this.add(tablePane);
		msgPanel=new JPanel();//存放标签和输入框的面板
		//为面板设置一个带标题的边框
		msgPanel.setBorder(BorderFactory.createTitledBorder("通讯录信息管理"));
		msgPanel.setBounds(10,350, 500, 200);
		this.add(msgPanel);
		msgPanel.setLayout(null);
		lblSid=new JLabel("学号:");//学号标签
		lblSid.setBounds(20, 50, 30, 30);
		msgPanel.add(lblSid);
		txtSid=new JTextField(16);//学号输入框
		msgPanel.add(txtSid);
		txtSid.setBounds(60, 50, 150, 30);
		lblSname=new JLabel("姓名:");//姓名标签
		lblSname.setBounds(280, 50, 30, 30);
		msgPanel.add(lblSname);
		txtSname=new JTextField(16);//姓名输入框
		txtSname.setBounds(320, 50, 150, 30);
		msgPanel.add(txtSname);
		lblSclass=new JLabel("班级:");//班级标签
		lblSclass.setBounds(20, 100, 30, 30);
		msgPanel.add(lblSclass);
		txtSclass=new JTextField(16);//班级输入框
		txtSclass.setBounds(60, 100, 150, 30);
		msgPanel.add(txtSclass);
		lblAddress=new JLabel("地址:");//地址标签
		lblAddress.setBounds(280, 100, 30, 30);
		msgPanel.add(lblAddress);
		txtAddress=new JTextField(16);//地址输入框
		txtAddress.setBounds(320, 100, 150, 30);
		msgPanel.add(txtAddress);
		lblTeleNumber=new JLabel("电话:");//电话标签
		lblTeleNumber.setBounds(20, 150, 30, 30);
		msgPanel.add(lblTeleNumber);
		txtTeleNumber=new JTextField(16);//电话输入框
		txtTeleNumber.setBounds(60, 150, 150, 30);
		msgPanel.add(txtTeleNumber);
		lblQQ=new JLabel("QQ:");//QQ标签
		lblQQ.setBounds(280, 150, 30, 30);
		msgPanel.add(lblQQ);
		txtQQ=new JTextField(16);//QQ号码输入框
		txtQQ.setBounds(320, 150, 150, 30);
		msgPanel.add(txtQQ);

		btnPanel=new JPanel();//存放按钮的面板
		btnPanel.setLayout(null);
		btnPanel.setBounds(510,350, 115, 200);
		btnPanel.setBorder(BorderFactory.createTitledBorder("编辑按钮"));
		this.add(btnPanel);
		btnAdd=new JButton("添加信息");//添加信息按钮
		btnAdd.setBounds(6, 25, 100, 30);
		btnPanel.add(btnAdd);

		btnQueryById=new JButton("学号查询");//按学号查询按钮
		btnQueryById.setBounds(6, 60, 100, 30);
		btnPanel.add(btnQueryById);

		btnQueryByName=new JButton("姓名查询");//按姓名查询按钮
		btnQueryByName.setBounds(6, 95, 100, 30);
		btnPanel.add(btnQueryByName);

		btnUpdate=new JButton("修改信息");//修改信息按钮
		btnUpdate.setBounds(6, 130, 100, 30);
		btnPanel.add(btnUpdate);

		btnDelete=new JButton("删除信息");//删除信息按钮
		btnDelete.setBounds(6, 165, 100, 30);
		btnPanel.add(btnDelete);

		//为查询按钮注册监听
		this.btnAdd.addActionListener(this);
		this.btnQueryById.addActionListener(this);
		this.btnQueryByName.addActionListener(this);
		this.btnUpdate.addActionListener(this);
		this.btnDelete.addActionListener(this);


	}
	private void refreshTable(List<Student> list) {
		String [] thead= {"学号","姓名","班级","地址","电话号码","QQ"};
		String [][] tbody=ListToArray.toArray(list);
		//定义表格模型对象
		TableModel model=new DefaultTableModel(tbody,thead);
		//设置表格对象的表格模型
		table.setModel(model);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//获取事件源对象上的文本
		String command=e.getActionCommand();
		//如果点击的是添加信息按钮
		if("添加信息".equals(command)) {
			//从输入框中获取输入信息
			String sid=this.txtSid.getText().trim();
			String sname=this.txtSname.getText().trim();
			String sclass=this.txtSclass.getText().trim();
			String address=this.txtAddress.getText().trim();
			String teleNumber=this.txtTeleNumber.getText().trim();
			String QQ=this.txtQQ.getText().trim();
			//利用输入信息构建Student对象
			Student student=new Student(sid,sname,sclass,address,teleNumber,QQ);
			//调用方法把信息添加到数据表
			boolean flag=sd.addStudent(student);
			if(flag) { //如果添加成功
				//刷新表格数据
				this.refreshTable(sd.lookAllStudent());
				this.reset();//重置输入框
			}else {
				JOptionPane.showMessageDialog(this, "添加学生信息失败");
			}
		}
		//如果点击的是按学号查询按钮
		if("学号查询".equals(command)) {
			//获取学号输入框的值
			String sid=this.txtSid.getText().trim();
			//调用方法按学号查询学生信息
			Student student=sd.lookStudentById(sid);
			if(student != null) {
				List<Student> list=new ArrayList<Student>();
				list.add(student);
				this.refreshTable(list);
				this.reset();
			}else {
				JOptionPane.showMessageDialog(this, "没有找到该学生信息");
			}
		}
		//如果点击的是按姓名查询按钮
		if("姓名查询".equals(command)) {
			//获取姓名输入框的值
			String sname=this.txtSname.getText().trim();
			System.out.println(sname+"&&");
			//按姓名查询学生信息
			List<Student> list=sd.lookStudentByName(sname);
			if(list.size()>0) {
				this.refreshTable(list);
				this.reset();
			}else {
				JOptionPane.showMessageDialog(this, "没有找到学生信息");
			}
		}
		//如果点击的是修改信息按钮
		if("修改信息".equals(command)) {
			//从输入框中获取输入信息
			String sid=this.txtSid.getText().trim();
			String sname=this.txtSname.getText().trim();
			String sclass=this.txtSclass.getText().trim();
			String address=this.txtAddress.getText().trim();
			String teleNumber=this.txtTeleNumber.getText().trim();
			String QQ=this.txtQQ.getText().trim();
			//用输入值构建学生对象
			Student student=new Student(sid,sname,sclass,address,teleNumber,QQ);
			//修改学生信息
			boolean flag=sd.updateStudent(student);
			if(flag) {
				//查询所有通讯录记录，刷新表格中数据
				this.refreshTable(sd.lookAllStudent());
				this.reset();
			}else {
				JOptionPane.showMessageDialog(this, "修改学生信息失败");
			}
		}
		//如果点击的是删除信息按钮
		if("删除信息".equals(command)) {
			String sid=this.txtSid.getText().trim();
			//根据学号删除学生通讯录信息
			boolean flag=sd.deleteStudent(sid);
			if(flag) {
				//刷新表格数据
				this.refreshTable(sd.lookAllStudent());
				this.reset();
			}else {
				JOptionPane.showMessageDialog(this, "删除学生信息失败");
			}
		}
	}
	//定义方法重置输入框的值
	private void reset() {
		this.txtSid.setText("");
		this.txtSname.setText("");
		this.txtSclass.setText("");
		this.txtAddress.setText("");
		this.txtTeleNumber.setText("");
		this.txtQQ.setText("");
	}

}