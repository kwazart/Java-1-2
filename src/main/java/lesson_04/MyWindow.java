package lesson_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyWindow extends JFrame {
	public MyWindow() {
		setTitle("Test Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);


//		setLayout(null);
//		JButton btn1 = new JButton("Button-1");
//		JButton btn2 = new JButton("Button-2");
//		btn1.setBounds(50, 100, 70, 70);
//		btn2.setBounds(150, 170, 50, 30);
//		add(btn1);
//		add(btn2);


		JButton btnOk = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");
//		add(btnOk, BorderLayout.SOUTH);
//		add(btnCancel, BorderLayout.SOUTH);

		JPanel panel = new JPanel(new GridLayout(1, 2));
		panel.add(btnOk);
		panel.add(btnCancel);
		add(panel, BorderLayout.SOUTH);

		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if ("ok".equalsIgnoreCase(btnOk.getText())) {
					btnOk.setText("Pressed OK");
				} else {
					btnOk.setText("OK");
				}
				System.out.println(btnOk.getText());
			}
		});

		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if ("cancel".equalsIgnoreCase(btnCancel.getText())) {
					btnCancel.setText("Pressed Cancel");
				} else {
					btnCancel.setText("Cancel");
				}
				System.out.println(btnCancel.getText());
			}
		});

		JLabel label = new JLabel();
		label.setFont(new Font("Calibri", Font.PLAIN, 50));
		JPanel panelByKey = new JPanel();
		panel.setFocusable(true);

		panel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String keyText = KeyEvent.getKeyText(e.getKeyCode());
				System.out.println(keyText);
				label.setText(keyText);
			}
		});

		panelByKey.add(label);
		add(panelByKey, BorderLayout.CENTER);

//		setBounds(200, 200, 400, 400);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sizeWidth = 400;
		int sizeHeight = 400;
		int locationX = (screenSize.width - sizeWidth) / 2;
		int locationY = (screenSize.height - sizeHeight) / 2;

		setBounds(locationX, locationY, sizeWidth, sizeHeight);

		setResizable(false);
		setVisible(true);
	}
}
