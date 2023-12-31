package conversorMonedas1;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	
	public void ConvertirCopToUSD(double valor) {
		double monedaDolar = valor / 3739.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirCopToEUR(double valor) {
		double monedaEuro = valor / 4050.48;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirCopToGBP(double valor) {
		double monedaLibra = valor / 4890.52;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirCopToJPY(double valor) {
		double monedaYen = valor / 29.68;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirCopToKRW(double valor) {
		double monedaWon = valor / 3.04;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
}