package editor;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class EditorMain extends JFrame{
	private JPanel wholeContainer = new JPanel();
	private JPanel topMostMenu = new JPanel();
	private JPanel centralPanel = new JPanel(); // code area and files area, run button
	private JTextArea codeArea = new JTextArea();
	
	private void setCentralPanel() {
		GridBagLayout centralLayout = new GridBagLayout();
		centralPanel.setLayout(centralLayout);
		JPanel topMostMenuCentralPanel = new JPanel();
		JPanel codePanel = new JPanel();
		GridBagConstraints c = new GridBagConstraints();
		codePanel.setBackground(Color.PINK);
		c.fill = GridBagConstraints.BOTH;
		codePanel.add(codeArea);
		//c.fill = GridBagConstraints.HORIZONTAL;
		//c.gridx = 0;
		//c.gridy = 0;
		
		centralPanel.add(codePanel,c );
	}
	
	public void setContainers() {
		setCentralPanel();
		topMostMenu.add(new JLabel("test"));
		topMostMenu.setBackground(Color.blue);
		this.wholeContainer.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.weighty = 0;
		c.weightx = 0.5;
		this.wholeContainer.add(topMostMenu, c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.ipady = 400;
		centralPanel.setBackground(Color.YELLOW);
		this.wholeContainer.add(centralPanel,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weighty = 0.1;
		c.ipady = 60;
		this.wholeContainer.add(new JButton("kdsa"), c);
		setContentPane(this.wholeContainer);
		setVisible(true);
		setSize(900,600);
	}
	public EditorMain() {
		setContainers();
	}
	
	public static void main(String[] args) {
		new EditorMain();
	}
}
