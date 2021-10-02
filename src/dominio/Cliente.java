package dominio;

import java.util.Arrays;

public class Cliente {
	private String nombre;
	private Integer dni;
	private Cuenta [] arrayDeCuentas;

	public Cliente(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.arrayDeCuentas=new Cuenta[3];
	}
	public void agregarCuenta(Cuenta cuenta) {
		for (int i = 0; i < arrayDeCuentas.length; i++) {
			if(arrayDeCuentas[i]==null) {
				arrayDeCuentas[i]=cuenta;
				break;
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public Cuenta[] getArrayDeCuentas() {
		return arrayDeCuentas;
	}


	public void setArrayDeCuentas(Cuenta[] arrayDeCuentas) {
		this.arrayDeCuentas = arrayDeCuentas;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", arrayDeCuentas=" + Arrays.toString(arrayDeCuentas)
				+ "]";
	}
	public void AlgoQueBorrar() {
		String palabra="Prueba borrar de git";
		
	}
	

}
