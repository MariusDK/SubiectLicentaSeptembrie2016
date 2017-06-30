/**
 * Created by MariusDK on 30.06.2017.
 */
public class SalaDeCurs {
    private String denumire;
    private Integer capacitate;

    public SalaDeCurs(String denumire, int capacitate)
    {
        this.denumire=denumire;
        this.capacitate=capacitate;
    }
    public String getDenumire()
    {
        return this.denumire;
    }
    public int getCapacitate()
    {
        return this.capacitate;
    }

    @Override
    public String toString() {
        return "SalaDeCurs{" +
                "denumire='" + denumire + '\'' +
                ", capacitate=" + capacitate +
                '}';
    }
}
