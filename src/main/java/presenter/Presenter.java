package presenter;

import constant.Constants;
import interfaces.ViewListener;
import model.Model;
import veiw.View;

import java.awt.event.ActionEvent;

public class Presenter implements ViewListener {
    private final View view;
    private final Model model;

    public Presenter(final View view, final Model model) {
        this.view = view;
        view.addListener(this);
        this.model = model;
    }

    @Override
    public void onButtonClicked(ActionEvent e) {
        if(e.getActionCommand().equals(Constants.addOne)){
            model.addOneToCount();
            view.setLabelText(String.valueOf(model.getCount()));
        }
        if(e.getActionCommand().equals(Constants.minusOne)){
            model.minusOneToCount();
            view.setLabelText(String.valueOf(model.getCount()));
        }
    }
}
