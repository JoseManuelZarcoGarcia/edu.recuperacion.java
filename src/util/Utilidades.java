package util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import dtos.AlumnoDto;

public class Utilidades {
	
	public static String construirNombreLog()
	{
			Date fechaActual = new Date(System.currentTimeMillis());
			SimpleDateFormat formato = new SimpleDateFormat("ddMMyy");
	        String fechaFormateada = formato.format(fechaActual), nombreString = "log-";
		    String nombreLog = nombreString.concat(fechaFormateada).concat(".txt");
		    return nombreLog;
	}
	
	public static long idAutogeneradoAlumno() 
	{
		List<AlumnoDto> nuevaListaAlumnos = controladores.Inicio.listaAlumno;

	    int tamanyoLista = nuevaListaAlumnos.size();
	    long nuevaId;
	    if (tamanyoLista > 0)
	    {
	        nuevaId = nuevaListaAlumnos.get(tamanyoLista-1).getIdAlumno() + 1;
	    }
	    else
	    {
	        nuevaId = 1;
	    }

	    return nuevaId;
	}

}
