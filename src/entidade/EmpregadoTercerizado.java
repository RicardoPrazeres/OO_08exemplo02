package entidade;

public class EmpregadoTercerizado extends Empregado {
	//atributos	
	private Double ganhoAdicional;
	
	//construtores
	public EmpregadoTercerizado (){
		super ();
	}

	public EmpregadoTercerizado(String nome, Integer horas, Double valorHora, Double ganhoAdicional) {
		super(nome, horas, valorHora);
		this.ganhoAdicional = ganhoAdicional;
	}
	//get set

	public Double getGanhoAdicional() {
		return ganhoAdicional;
	}

	public void setGanhoAdicional(Double ganhoAdicional) {
		this.ganhoAdicional = ganhoAdicional;
	}
	//metodos
		@Override
		public double pagamento() {
			return super.pagamento() + ganhoAdicional * 1.1;
		}	
	

}
	