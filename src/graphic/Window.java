package graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    JLabel labelName = new JLabel("Nom : ");
    JTextField inputName = new JTextField(20);
    JButton btn = new JButton("Submit");

    public Window() throws HeadlessException {
        setVisible(true);
        setTitle("First frame");
        setLocationRelativeTo(null);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(buildPanel());

        setVisible(true);
    }

    public JPanel buildPanel() {
        JPanel panel   = new JPanel(new GridLayout(2, 2));
        JPanel header  = new JPanel(new FlowLayout());
        JPanel content = new JPanel(new FlowLayout());
        // Header
        header.add(this.labelName);
        header.add(this.inputName);
        // Create submit / cancel buttons
        content = submit(content);

        panel.add(header);
        panel.add(content);

        return panel;
    }

    public JPanel submit(JPanel panel) {
        panel.add(this.btn);
        this.btn.addActionListener(this);
        panel.add(new JButton("Cancel"));

        return panel;
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource().equals(this.btn)) {
            System.out.println("ok");
            JOptionPane.showConfirmDialog(
                    this,
                    this.labelName.getText() + this.inputName.getText()
            );
        }
    }
}
