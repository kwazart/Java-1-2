package lesson_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ChatGUI {
	private static final String USERNAME = "Artem";

	public ChatGUI () {
		JFrame frame = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int sizeWidth = 800;
		int sizeHeight = 600;
		int locationX = (screenSize.width - sizeWidth) / 2;
		int locationY = (screenSize.height - sizeHeight) / 2;

		frame.setBounds(locationX, locationY, sizeWidth, sizeHeight);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


		JPanel centralPanel = new JPanel();
		centralPanel.setBackground(Color.lightGray);
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		centralPanel.setLayout(new BorderLayout());
		centralPanel.add(scrollPane, BorderLayout.CENTER);


		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.ORANGE);
		JButton sendBtn = new JButton("Send");
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(500, 30));
		bottomPanel.setPreferredSize(new Dimension(1, 40));
		bottomPanel.setLayout(new FlowLayout());

		bottomPanel.add(textField);
		bottomPanel.add(sendBtn);

		sendBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isEmpty()) {
					textArea.append(" " + USERNAME + ": " +textField.getText() + "\n");
					textField.setText("");
				}
				textField.grabFocus();
			}
		});

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String keyText = KeyEvent.getKeyText(e.getKeyCode());
				if ("enter".equalsIgnoreCase(keyText)) {
					sendBtn.doClick();
				}
			}
		});


		frame.add(centralPanel, BorderLayout.CENTER);
		frame.add(bottomPanel, BorderLayout.SOUTH);

		frame.setResizable(false);
		frame.setVisible(true);
	}

}
