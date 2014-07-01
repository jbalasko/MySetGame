package setgame;

import java.awt.Color;
import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

/**
 *
 * @author Dominik
 */
public class GuiMakeMethods{

	public static JFrame frameMaker(String title, int posX, int posY, int width, int height, boolean visible, boolean exitOnClose, LayoutManager manager){
		JFrame frame = new JFrame(title);
		frame.setBounds(posX, posY, width, height);
		frame.setVisible(visible);
		if(exitOnClose)
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(manager);
		return frame;
	}

	public static JDialog dialogMaker(String title, int posX, int posY, int width, int height, boolean visible, boolean exitOnClose, boolean modal, LayoutManager manager){
		JDialog dialog = new JDialog();
		dialog.setTitle(title);
		dialog.setBounds(posX, posY, width, height);
		dialog.setVisible(visible);
		if(exitOnClose)
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setModal(modal);
		dialog.setLayout(manager);
		return dialog;
	}

	public static JMenuBar menuBarMaker(JFrame parent, int posX, int posY, int width, int height){
		JMenuBar bar = new JMenuBar();
		bar.setBounds(posX, posY, width, height);
		parent.add(bar);
		return bar;
	}

	public static JMenu menuMaker(JMenuBar parent, String title){
		JMenu menu = new JMenu(title);
		parent.add(menu);
		return menu;
	}

	public static JMenuItem menuItemMaker(JMenu parent, String title){
		JMenuItem item = new JMenuItem(title);
		parent.add(item);
		return item;
	}

	public static JPanel panelMaker(Container parent, int posX, int posY, int width, int height, LayoutManager manager){
		JPanel panel = new JPanel(manager);
		panel.setBounds(posX, posY, width, height);
		parent.add(panel);
		return panel;
	}

	public static JLabel labelMaker(Container parent, String title, int posX, int posY, int width, int height){
		JLabel label = new JLabel(title);
		label.setBounds(posX, posY, width, height);
		parent.add(label);
		return label;
	}

	public static JTextField textFieldMaker(Container parent, String content, int posX, int posY, int width, int height){
		JTextField tf = new JTextField(content);
		tf.setBounds(posX, posY, width, height);
		parent.add(tf);
		return tf;
	}

	@SuppressWarnings("rawtypes")
	public static JComboBox comboBoxMaker(Container parent, int posX, int posY, int width, int height){
		JComboBox box = new JComboBox();
		box.setBounds(posX, posY, width, height);
		box.removeAllItems();
		parent.add(box);
		return box;
	}

	public static JButton buttonMaker(Container parent, String text, int posX, int posY, int width, int height){
		JButton button = new JButton(text);
		button.setBounds(posX, posY, width, height);
		parent.add(button);
		return button;
	}

	public static JToggleButton toggleButtonMaker(Container parent, String text, int posX, int posY, int width, int height){
		JToggleButton toggleButton = new JToggleButton(text);
		toggleButton.setBounds(posX, posY, width, height);
		parent.add(toggleButton);
		return toggleButton;
	}

	public static JScrollPane scrollPaneMaker(Container parent, int posX, int posY, int width, int height, int vertical, int horizontal){
		JScrollPane scroll = new JScrollPane(vertical, horizontal);
		scroll.setBounds(posX, posY, width, height);
		parent.add(scroll);
		return scroll;
	}

	public static JTextArea textAreaMaker(JScrollPane parent, int posX, int posY, int width, int height){
		JTextArea text = new JTextArea();
		text.setBounds(posX, posY, width, height);
		parent.setViewportView(text);
		return text;
	}

	public static JTextField[] textFieldArrayMaker(Container parent, int count, int displacement, int posX, int posY, int width, int height){
		JTextField[] tfArray = new JTextField[count];
		for (int i = 0; i < count; i++) {
			tfArray[i] = new JTextField();
			tfArray[i].setBounds(posX, posY + (displacement + height) * i, width, height);
			parent.add(tfArray[i]);
		}
		return tfArray;
	}
	
	public static JToggleButton[] toggleButtonArrayMaker(Container parent, int count, int displacement, int posX, int posY, int width, int height){
		JToggleButton[] tbArray = new JToggleButton[count];
		for (int i = 0; i < count; i++) {
			tbArray[i] = new JToggleButton();
			tbArray[i].setBounds(posX, posY + (displacement + height) * i, width, height);
			parent.add(tbArray[i]);
		}
		return tbArray;
	}
	
	public static JPanel[] panelArrayMaker(Container parent, int count, int displacement, int posX, int posY, int width, int height, LayoutManager manager){
		JPanel[] pArray = new JPanel[count];
		for (int i = 0; i < count; i++) {
			pArray[i] = new JPanel(manager);
			pArray[i].setBounds(posX, posY + (displacement + height) * i, width, height);
			parent.add(pArray[i]);
		}
		return pArray;
	}
}
