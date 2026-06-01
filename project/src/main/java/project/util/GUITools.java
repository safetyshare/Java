package project.util;

import java.awt.Component;
import java.awt.Toolkit;

public class GUITools {
	static Toolkit kit = Toolkit.getDefaultToolkit();

	// 定义静态方法设置组件在屏幕中央显示
	public static void center(Component c) {
		int x = (kit.getScreenSize().width - c.getWidth()) / 2;
		int y = (kit.getScreenSize().height - c.getHeight()) / 2;
		c.setLocation(x, y);
	}

}

