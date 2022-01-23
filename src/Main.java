import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private Map<String, Double> expenseList = new HashMap<>();


    public static void main(String[] args) throws IOException {


        List<String> lineString = Files.readAllLines(Paths.get("data/movementList.csv"));

        BankParser parser = new BankParser();


        for (int i =1; i<lineString.size();i++)
        {
            String qwe = lineString.get(i);
            String[] asd = qwe.split(",", 8);

            Double income_temp = Double.parseDouble(asd[6]);
            Double expence_temp = Double.parseDouble(asd[7].replaceAll("\\\"", "").replace(',', '.'));
           parser.Set_income(income_temp);
           parser.Set_expence(expence_temp);

            String [] tempI = asd[5].split("\s\s\s\s", 3);

            if (income_temp<=0){
                parser.expens_sum(expence_temp,tempI[1].trim());

            }


        }

        parser.print_extens();

    }




}
