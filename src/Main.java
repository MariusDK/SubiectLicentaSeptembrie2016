import java.util.ArrayList;

/**
 * Created by MariusDK on 30.06.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        Main m=new Main();
        m.rezolvare();
    }
    public void rezolvare()
    {
        ListaDeSali listaDeSali=new ListaDeSali(3,initList());
        listaDeSali.sorteaza();
        for (int i=0;i<listaDeSali.getNrElemente();i++) {
            System.out.println(listaDeSali.elementAt(i));
        }
    }
    public ArrayList<SalaDeCurs> initList()
    {
        ArrayList<SalaDeCurs> list=new ArrayList<>();
        SalaDeCurs sc1=new SalaDeCurs("Nicolae Iorga",200);
        SalaDeCurs sc2=new SalaDeCurs("D.V. Ionescu",80);
        SalaDeCurs sc3=new SalaDeCurs("Popoviciu",100);
        list.add(sc1);
        list.add(sc2);
        list.add(sc3);

        return list;
    }
}
