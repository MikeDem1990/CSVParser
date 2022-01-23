import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BankParser {

    private Map<String, Double> expenseList = new HashMap<>();
    private double income = 0;
    private double expense = 0;
//    private double amount_income = 0;
//    private double amount_expense = 0;

    public void Set_income(double arg)
    {
        this.income += arg;
    }

    public void Set_expence ( double arg)
    {
        this.expense += arg;
    }

    public double Get_income ()
    {
        return this.income;
    }

    public double Get_expence ()
    {
        return this.expense;
    }

    public  void expens_sum(Double arg_volume, String arg_key)
    {

        if (!expenseList.containsKey(arg_key))
        {
            this.expenseList.put(arg_key,arg_volume);

        }
        else {
            double sum_expens = this.expenseList.get(arg_key);
            sum_expens +=arg_volume;
            expenseList.put(arg_key,sum_expens);
        }

    }

    public void print_extens()
    {
        System.out.println("Сумма расходов : " + Get_expence()+"\n");
        System.out.println("Сумма доходов : " + Get_income()+"\n\n\n");
        System.out.println("Суммы расходов по организациям : \n");


        for (String l : expenseList.keySet())
        {
            System.out.println(l +"\s\s"+ expenseList.get(l) + "руб\n");
        }



    }

//    public static void couting_bank_transaction(String arg) {
//
//        Map<String,Double> collect = new HashMap<>();
//        if (collect.containsKey(tempI[1]))
//        {
//            //collect.put(tempI,)
//
//        } else {
//            collect.put(tempI[1],)
//        }
//
//        for (int j =0; j< tempI.length; j++) {
//            System.out.println(tempI[1].trim());
//        }
//
//    }

}
