package com.captton.programa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import com.captton.libros.Libros;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Libros> libros = new ArrayList<Libros>();
		
		
		String absoluta = "MiArchivito.txt";
		String texto = "";
		String[] parts; //= texto.split(";");

		File file = new File(absoluta);
		Reader r = null;
		BufferedReader br = null;
		
		try {
			
			r = new FileReader(file);
			br = new BufferedReader(r);
			
			
			
			while ((texto = br.readLine()) != null ) {
				System.out.println(texto);
				
				parts = texto.split(";");
								
				String isbn = parts[0]; 
				String titulo = parts[1]; 
				String autor = parts[2]; 
				
				libros.add(new Libros(isbn,titulo,autor));
				
				
			}
			
			r.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		
		for (Libros l: libros)
		{
			System.out.println("ISBN: "+ l.getIsbn() +"Titulo: " + l.getTitulo() + " Autor: "+l.getAutor());
		}
		
		
	}
		
		

}


