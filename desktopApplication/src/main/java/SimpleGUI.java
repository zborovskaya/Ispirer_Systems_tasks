import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton();
    private JLabel label = new JLabel();
    private JMenu menu;
    private JMenuItem i1, i2;
    private MessageManager  currentLanguage = MessageManager.EN;

    public SimpleGUI() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension= toolkit.getScreenSize();
        this.setBounds(dimension.width/2 -100, dimension.height/2 - 100, 200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb=new JMenuBar();
        menu=new JMenu();
        i1=new JMenuItem();
        i2=new JMenuItem();
        setLanguage();
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentLanguage = MessageManager.EN;
                setLanguage();
            }
        });
        i2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentLanguage = MessageManager.RU;
                setLanguage();
            }
        });
        menu.add(i1);
        menu.add(i2);
        mb.add(menu);
        this.setJMenuBar(mb);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(label.getText()==""){
                label.setText(currentLanguage.getString("labelText"));
                }else {
                    label.setText("");
                }
            }
        });
        JPanel grid = new JPanel(new GridLayout(2, 2, 5, 0) );
        grid.add (label);
        grid.add (button);
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flow.add(grid);
        Container container = getContentPane();
        container.add(flow, BorderLayout.CENTER);
    }

    private void setLanguage(){
        setTitle(currentLanguage.getString("application"));
        menu.setText(currentLanguage.getString("chooseLanguage"));
        i1.setText(currentLanguage.getString("english"));
        i2.setText(currentLanguage.getString("russian"));
        button.setText(currentLanguage.getString("button"));
        label.setText("");
    }
}
