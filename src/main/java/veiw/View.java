package veiw;

import constant.Constants;
import interfaces.ViewListener;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class View {
    private final ArrayList<ViewListener> listeners;
    private final JLabel label;

    public View() {
        final JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());
        // add button
        final JButton addOne = new JButton(Constants.addOne);
        final JButton minusOne = new JButton(Constants.minusOne);
        // notify on button clicked
        addOne.addActionListener(this::notifyListenersOnButtonClicked);
        minusOne.addActionListener(this::notifyListenersOnButtonClicked);

        frame.add(addOne);
        frame.add(minusOne);

        label = new JLabel();
        frame.add(label);

        this.listeners = new ArrayList<>();

        frame.setVisible(true);
    }
    // add to list listeners
    private void notifyListenersOnButtonClicked(final ActionEvent e) {
        for (final ViewListener listener : listeners) {
            listener.onButtonClicked(e);
        }
    }
    public void addListener(final ViewListener listener) {
        listeners.add(listener);
    }
    public void setLabelText(final String text) {
        label.setText(text);
    }
}