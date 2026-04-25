import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame; // Import GUI components in Swing class
import javax.swing.JLabel;
import javax.swing.JPanel; // import JPanel class;

/** 
 * This java code is the Snow Problem.
 * A frame by the name of snowProblemFrame is created for the GUI window.
 * @param xxxx.
 * @author Muhammad Alsalamah.
 * @return*/

 
public class snowmangame {
    public static void main(String[] args) {

    /*Create a clean, unpopulated top-level window that acts as the root container for 
    the problem’s GUI. Assign the instance name SnowProblemFrame */
    JFrame snowProblemFrame = new JFrame();
    snowProblemFrame.setVisible(true); // Make the window visible
    snowProblemFrame.setTitle("Snow Problem"); // Set the title of the window to "Snow Problem"
    snowProblemFrame.setSize(1000, 1000); // Set the size of the window GUI
    snowProblemFrame.setLocationRelativeTo(null); // Locate the window GUI in the center of the screen
    
    /* Execute a clean termination of the ongoing operation, ensure all 
    temporary resources are released, and subsequently close the graphical user 
    interface to conclude the session.*/
    snowProblemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    /*Create an instance of JPanel that functions as the main workspace 
    for the interface. Attach this panel to the window snowProblemFrame by making it the 
    frame’s default content area, which will give a clean canvas for adding 
    buttons, labels, game objects, and custom drawing routines in the next steps */
    JPanel snowProblemPanel = new JPanel(); // Create a panel
    snowProblemFrame.setContentPane(snowProblemPanel); // Use panel on Window


    JLabel snowProblemDescription = new JLabel();
    snowProblemDescription.setOpaque(true);
    snowProblemDescription.setBorder(BorderFactory.createEmptyBorder(50,500,10,10));
    snowProblemDescription.setBackground(Color.GREEN);
    snowProblemFrame.add(snowProblemDescription,BorderLayout.NORTH);
    JLabel snowProblemDescriptionLable = new JLabel("Can you help the snowman? Build snowmen by guiding snowballs around obstacles until they are perfectly positioned to stack. Plan carefully. Once the snowballs start moving, they will not stop until they hit a barrier.");
    snowProblemDescription.add(snowProblemDescriptionLable);
    }
}