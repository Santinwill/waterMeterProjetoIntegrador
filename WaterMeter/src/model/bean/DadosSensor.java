package model.bean;

public class DadosSensor {
	private int id_sensor;
	private String vldata;
	private String hora;
	private float litros;
	
	public int getId_sensor() {
		return id_sensor;
	}
	public void setId_sensor(int id_sensor) {
		this.id_sensor = id_sensor;
	}
	public String getVldata() {
		return vldata;
	}
	public void setVldate(String vldata) {
		this.vldata = vldata;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public float getLitros() {
		return litros;
	}
	public void setLitros(float litros) {
		this.litros = litros;
	}
	
	
}
