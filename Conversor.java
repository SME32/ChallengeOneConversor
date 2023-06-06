import javax.swing.JOptionPane;

public class Conversor {
public static void main(String[] args) {
	int terminar;
	do {
		String [] arreglo = {"Conversor de Moneda","Conversor de Temperatura"};
		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.DEFAULT_OPTION, null, arreglo,arreglo[0]);
		if (opcion == "Conversor de Moneda") {
			String [] arreglo1 = {"De Pesos a Dolar","De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dolar a Pesos","De Euro a Pesos","De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"};
			String opcion1 = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.DEFAULT_OPTION, null, arreglo1,arreglo[0]);
			
			String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que sea convertir");
			
			if (!cantidad.isEmpty() && cantidad.matches("[0-9]+")) {
				double dolar = 242.46;
				double yen = 1.74;
				double euro = 259.75;
				double libras = 11.37;
				double WonCoreano = 0.19;
				double res = Integer.parseInt(cantidad);
				String res1 = " Pesos";
				
				switch (opcion1) {
				case "De Pesos a Dolar":
					res = res/dolar;
					res1 = " Dolares";
					break;
				case "De Pesos a Euro":
					res = res/euro;
					res1 = " Euro";
					break;
				case "De Pesos a Libras":
					res = res/libras;
					res1 = " Libras";
					break;
				case "De Pesos a Yen":
					res = res/yen;
					res1 = " Yen";
					break;
				case "De Pesos a Won Coreano":
					res = res/WonCoreano;
					res1 = " Won Coreano";
					break;
				case "De Dolar a Pesos":
					res = res*dolar;
					break;
				case "De Euro a Pesos":
					res = res*euro;
					break;
				case "De Libras a Pesos":
					res = res*libras;
					break;
				case "De Yen a Pesos":
					res = res*yen;
					break;
				case "De Won Coreano a Pesos":
					res = res*WonCoreano;
					break;
				}
				JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", res) + res1);
			}
			else {
				JOptionPane.showMessageDialog(null, "Valor no valido");
			}
		}
		else {
			String [] arreglo1 = {"De Celsius a Farenheite", "De Celsius a Kelvin", "De Farenheite a Celsius", "De Kelvin a Celsius", "De Kelvin a Farenheite", "De Farenheite a Kelvin", };
			String opcion1 = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.DEFAULT_OPTION, null, arreglo1,arreglo[0]);
			
			String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de grados");
			double res = Integer.parseInt(cantidad);
			String res1 = "C";
			switch (opcion1) {
			case "De Celsius a Farenheite":
				res = (res*9/5) + 32;
				break;
			case "De Celsius a Kelvin":
				res = res - 273.15;
				break;
			case "De Farenheite a Celsius":
				res = (res - 32) * 5/9;
				break;
			case "De Kelvin a Celsius":
				res = res + 273.15;
				break;
			case "De Kelvin a Farenheite": 
				res = ((res - 273.15) * 9/5) + 32;
				break;
			case "De Farenheite a Kelvin":
				res = ((res - 273.15) - 32) * 5/9;
				break;
			}
			JOptionPane.showMessageDialog(null, "Son "+String.format("%.2f", res) + "°"+res1);
			
		}
		terminar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	}while(terminar == 0);
	JOptionPane.showMessageDialog(null, "Programa terminado");
}
}
