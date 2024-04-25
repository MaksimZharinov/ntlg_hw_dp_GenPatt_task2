import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int countOk = 0;
        int countAll = 0;
        for (Integer element : source) {
            if (element < treshold) {
                logger.log("Элемент \"" + element + "\" проходит");
                result.add(element);
                countAll++;
                countOk++;
            } else {
                logger.log("Элемент \"" + element + "\" не проходит");
                countAll++;
            }
        }
        logger.log("Прошло " + countOk +
                " элементов из " + countAll);
        return result;
    }
}