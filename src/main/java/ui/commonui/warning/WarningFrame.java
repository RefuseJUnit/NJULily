package ui.commonui.warning;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ui.commonui.myui.MyWindow;

public class WarningFrame extends MyWindow implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	WarningPanel efp;
	public static JButton button_close;
	
	
	public WarningFrame(String name){
		
		efp = new WarningPanel(name);
		efp.setOpaque(true);
		efp.setBackground(new Color(0, 0, 0, 0.8f));
		this.add(efp);
		
		button_close = new JButton();
		button_close.addActionListener(this);
		this.add(button_close);
		
		this.setBackground(new Color(0, 0, 0, 0.6f));
			
	}
	
	public void actionPerformed(ActionEvent events) {
		if(events.getSource() == button_close){
			this.setVisible(false);
		}
			
	}
}
