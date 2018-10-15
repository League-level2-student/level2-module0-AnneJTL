/*

 Run the FndHdnBtn.jar to play the finished game

 */

package arrays;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{

	//1. create an array of JButtons. Don't initialize it yet.
	private JButton[] buttonsArray;
	
	//2 create an int variable called hiddenButton
    private int hiddenButton;
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	private void start() {
        JFrame window;
        JPanel panel;

		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String nbButtonsString = JOptionPane.showInputDialog("Enter a positive number");
        int nbButtons;
		try {
            nbButtons = Integer.parseInt(nbButtonsString);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            nbButtons = 10;
        }
		
		//4. Initialize the array of JButtons to be the size of the int created in step 3
        buttonsArray = new JButton[nbButtons];
		
		//5. Make a for loop to iterate through the JButton array
        for (int i = 0; i < buttonsArray.length; i++) {
            //6. initialize each JButton in the array
            buttonsArray[i] = new JButton();
            buttonsArray[i].setPreferredSize(new Dimension(50,30));
            buttonsArray[i].setBackground(Color.ORANGE);

            //7. add the ActionListener to each JButton
            buttonsArray[i].addActionListener(this);
            //8. add each JButton to the panel
            panel.add(buttonsArray[i]);

        }
		//9 add the panel to the window
		window.add(panel);

		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//11. set the JFrame to visible.
        window.setVisible(true);
		
		//12. Give the user the instructions for the game.
        JOptionPane.showMessageDialog(null, "Instructions :?");
		
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
        hiddenButton = new Random().nextInt(nbButtons);

		//14. Set the text of the JButton located at hiddenButton the read "ME"
        buttonsArray[hiddenButton].setText("ME");
        buttonsArray[hiddenButton].setBackground(Color.GREEN);
		//15. Use Thread.sleep(100); to pause the program.
		//    Surround it with a try/catch
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
        buttonsArray[hiddenButton].setText("");
        buttonsArray[hiddenButton].setBackground(Color.ORANGE);


    }

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
        if (buttonClicked == buttonsArray[hiddenButton]){
            JOptionPane.showMessageDialog(null, "YOU WIN !!!");
        } else {
            //18. else tell them to try again
            JOptionPane.showMessageDialog(null, "Try again !!!");
        }
		
	}
}
