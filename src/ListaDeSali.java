import java.util.ArrayList;

/**
 * Created by MariusDK on 30.06.2017.
 */
public class ListaDeSali {
    private Integer nrElemente;
    private ArrayList<SalaDeCurs> elem;



    public ListaDeSali(int nrElemente,ArrayList<SalaDeCurs> elem)
    {
        this.nrElemente=nrElemente;
        this.elem=elem;
    }
    public void adauga(SalaDeCurs salaDeCurs)
    {
        this.elem.add(salaDeCurs);
    }
    public SalaDeCurs elementAt(int pos)
    {
        return elem.get(pos);
    }
    public int getNrElemente()
    {
        return elem.size();
    }
    public void sorteaza()
    {
        boolean ok=false;
        while (ok!=true)
        {
            ok=true;
            for (int i=1;i<elem.size();i++)
            {
                if (elem.get(i-1).getCapacitate()>elem.get(i).getCapacitate())
                {
                    ok=false;
                    SalaDeCurs aux=elem.get(i-1);
                    elem.set(i-1,elem.get(i));
                    elem.set(i,aux);
                }
            }
        }
    }
}
