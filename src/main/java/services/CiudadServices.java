package services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import modelo.Ciudad;
import modelo.Pais;

public class CiudadServices {
	
	private List<Ciudad> ciudades;
	
	public CiudadServices() {
		List<Pais> paises = getPaises();
		this.ciudades = new ArrayList<>();
		Ciudad ciudad = null;
		
		for(int i = 0; i < 15; i++) {
			ciudad = new Ciudad();
			ciudad.setId(i);
			ciudad.setNombre("Ciudad " + i);
			ciudad.setPais(paises.get(i%3));
		
			this.ciudades.add(ciudad);
		}
	}
	
	public List<Ciudad> getCiudades(Integer idPais){
		List<Ciudad> result = ciudades.stream()
				.filter(ciudad -> idPais.equals(ciudad.getPais().getId()))
				.collect(Collectors.toList());
		return result;
	}
	
	public List<Pais> getPaises(){
		List<Pais> ListaPaises = new ArrayList();
		Pais arg = new Pais();
		arg.setId(1);
		arg.setNombre("Argentina");
				
		Pais bol = new Pais();
		bol.setId(2);
		bol.setNombre("Bolivia");

		Pais bra = new Pais();
		bra.setId(3);
		bra.setNombre("Brasil");

		Pais chi = new Pais();
		chi.setId(4);
		chi.setNombre("Chile");
		
		ListaPaises.add(arg);
		ListaPaises.add(bol);
		ListaPaises.add(bra);
		ListaPaises.add(chi);
		return ListaPaises;
	}
	
	public Pais getPais(Integer pais) {
		List<Pais> paises = getPaises();
		
		for(Pais pais2: paises) {
			if(pais2.getId().equals(pais)) 
				return pais2;
			
		}
		return null;
	}

}
