package client.dominio;


public class PatologiaDTO {
	
	private Long id_pat;
	private String Tipo_de_patologia;
	private String Categoria;
	private String Patogeno;
	private String Descripcion;
	private String Sintomas;
	private String Tratamiento;
	
	public PatologiaDTO() {
		
	}
	public PatologiaDTO(Long id_pat, String Tipo_de_patologia,String Categoria,String Patogeno,
			String Descripcion,String Sintomas,String Tratamiento)
	{
		this.id_pat=id_pat;
		this.Tipo_de_patologia=Tipo_de_patologia;
		this.Categoria= Categoria;
		this.Patogeno=Patogeno;
		this.Descripcion=Descripcion;
		this.Sintomas=Sintomas;
		this.Tratamiento=Tratamiento;
	}
	public Long getId_pat() {
		return id_pat;
	}
	public void setId_pat(Long id_pat) {
		this.id_pat = id_pat;
	}
	public String getTipo_de_patologia() {
		return Tipo_de_patologia;
	}
	public void setTipo_de_patologia(String tipo_de_patologia) {
		Tipo_de_patologia = tipo_de_patologia;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getPatogeno() {
		return Patogeno;
	}
	public void setPatogeno(String patogeno) {
		Patogeno = patogeno;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getSintomas() {
		return Sintomas;
	}
	public void setSintomas(String sintomas) {
		Sintomas = sintomas;
	}
	public String getTratamiento() {
		return Tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		Tratamiento = tratamiento;
	}

	
}
