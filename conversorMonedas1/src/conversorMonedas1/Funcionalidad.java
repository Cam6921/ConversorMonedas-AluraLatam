package conversorMonedas1;

import javax.swing.JOptionPane;

public class Funcionalidad {

	ConvertirMonedas monedas = new ConvertirMonedas();
	MonedaAPesos pesos = new MonedaAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConvertirCopToUSD(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirCopToEUR(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirCopToGBP(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirCopToJPY(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirCopToKRW(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.ConvertirUSDToCop(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEURToCop(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirGBPToCop(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirJPYToCop(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirKRWToCop(Minput);
            break;
        }      
    }
        
}