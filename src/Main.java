//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Book> livros = new DatasetReader().readDataset("src/data.csv");

        for(Book x :livros)

        {
            if (x.getAuthor().equals("J.K. Rowling"))
                System.out.println(x.getTitle());
        }
    }
}