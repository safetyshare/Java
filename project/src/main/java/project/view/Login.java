package project.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import project.util.GUITools;


public class Login extends JFrame implements ActionListener {
	private JPanel imgPanel;
	private JButton btnLogin;

	public Login() {
		super("班级通讯录登录界面");
		initComponent();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 350);
		GUITools.center(this);
		this.setVisible(true);
	}

	private void initComponent() {
		// 定义分层面板
		JLayeredPane layeredPane = this.getLayeredPane();
		// 初始化用来显示图片的面板
		imgPanel = new JPanel();
		// 把图片面板放在分层面板默认层
		layeredPane.add(imgPanel, JLayeredPane.DEFAULT_LAYER);
		// 设置图片面板布局为边界布局
		imgPanel.setLayout(new BorderLayout());
		// 在图片面板上添加一个显示图片的标签
		imgPanel.add(new JLabel(new ImageIcon("contact.jpg")));
		/*
		 * 由于JLayeredPanel没有layoutManager所以必须完成设置setBounds()函数对每个添加到JLayeredPanel的对象，
		 * 否则会导致无法显示该组件
		 */
		imgPanel.setBounds(0, 0, 500, 350);
		// 定义登录按钮
		btnLogin = new JButton("欢迎登录班级通讯录系统");
		btnLogin.setFont(new Font("楷体", Font.BOLD, 20));
		btnLogin.setBounds(100, 150, 300, 60);
		// 把登录按钮放在分层面板的模式层
		layeredPane.add(btnLogin, JLayeredPane.MODAL_LAYER);
		// 为登录和注册按钮注册监听
		btnLogin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 创建主窗体对象
		new MainFrame();
		this.dispose();
	}

	public static void main(String[] args) {
		new Login();
	}

}
