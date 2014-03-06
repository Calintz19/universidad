
package com.cenfotec.universidad.pojo;

public class EstudianteXCursoPOJO {

	private int estudianteXCursoId;
	private int estudianteId;
	private int cursoId;
	private String profesor;
	private String fecha;	
		
	public EstudianteXCursoPOJO(){
		super();
	}
	
	public int getEstudianteXCursoId(){
		return this.estudianteXCursoId;
	}
	
	public void setEstudiantXCursoId(int pId){
		this.estudianteXCursoId = pId;
	}
	
	public int getEstudianteId() {
		return this.estudianteId;
	}
	
	public void setEstudianteId(int pEstudianteId){
		this.estudianteId = pEstudianteId;
	}
	
	public int getCursoId() {
		return this.cursoId;
	}
	
	public void setCursoId(int pCursoId){
		this.cursoId = pCursoId;
	}
	
	
	public String getProfesor(){
		return this.profesor;
	}
	
	public void setProfesor(String pProfesor){
		this.profesor = pProfesor;
	}
	
	public String getFecha(){
		return this.fecha;
	}
	
	public void setFecha(String pFecha){
		this.fecha = pFecha;
	}
}
