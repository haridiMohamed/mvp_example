import model.Model;
import presenter.Presenter;
import veiw.View;

public class Main {
    public static void main(String[] args) {
        final View view = new View();
        final Model model = new Model();
        new Presenter(view, model);
    }
}
