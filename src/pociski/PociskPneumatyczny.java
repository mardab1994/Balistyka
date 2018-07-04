package pociski;
import modeleG.G1;

public class PociskPneumatyczny extends PociskBazowy implements G1{
	
	{
		this.setMasa((this.getMasa()*64.79891)/1000000); // przeliczenie masy na kilogramy 
	}
	/**Konstruktor klasy <code>PociskPneumatyczny</code>
	 * @param aMasa masa pocisku [grain] 
	 * @param aVo prêdkoœæ pocz¹tkowa pocisku [m/s]*/
	public PociskPneumatyczny(double aMasa, double aVo) {
		super(aMasa, aVo);
	}
	
	
	@Override
	public void pokaz() {
		System.out.println("Pokazuje pneumatyczny");
	}
	
}
