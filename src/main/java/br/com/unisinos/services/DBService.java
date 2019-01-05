package br.com.unisinos.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unisinos.domain.Areas;
import br.com.unisinos.domain.Evento;
import br.com.unisinos.domain.Monitoria;
import br.com.unisinos.repository.AreasRepository;
import br.com.unisinos.repository.EventoRepository;
import br.com.unisinos.repository.MonitoriaRespository;

@Service
public class DBService {
	

	
	@Autowired
	private AreasRepository areasRepository;
	
	@Autowired
	private MonitoriaRespository monitoriaRepository;
	
	@Autowired
	private EventoRepository eventoRepository;
	
	public void instatiateTestDatabase() throws ParseException {
		
		
		
		Areas area1= new Areas(null,"Fisica");
		Areas area2= new Areas(null,"Português");
		Areas area3= new Areas(null,"Química");
		Areas area4= new Areas(null,"Informática");
		Areas area5= new Areas(null,"Matemática");
		Areas area6= new Areas(null,"Estatística");
				
		
		Monitoria moni3  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","AlgebraV",1,"AlgebraV","","","","","Thiago Endel 8h30 às 12h","Thiago (16h-19h)","Tatiane (16h-19)","Tatiane (16h-19)","Arthur (15h-19h)","Tatiane (16h-19)","Germano Endel (13h-16h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Tatiane, Arthur (17h-19h)","Leticia, Tatiane (17h-19h)","","Thiago (19h-22h)","Germano, Arthur (19h-22h)","Bárbara, Ben Hur, Ana Paula (19h-22h)","Luize, Germano (19h-22h)","","");
		Monitoria moni4  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","AlgebraV",2,"AlgebraV","","","","","","","","","","","","","Matheus (17h as 19h)","Matheus (17h as 19h)","Matheus (17h as 19h)","","","","","","","","");
		Monitoria moni5  = new Monitoria(null,"As monitorias de Mecânica A em São Leopoldo iniciam na segunda semana de aula, 21 dia  de Agosto.","Mecanica A",1,"","","","","","Felipe Borge, Carlos Odoni (09h as 12h)","","","","","","Felipe Borge, Carlos Odoni (12h as 16h)","Tiago, Felipe (17h as 19h)","Tiago, Marcio, Murilo (17h as 19h)","Tiago, Marcio, Murilo (17h as 19h)","Marcio, Murilo (17h as 19h)","","","Jonatas (19h as 21h)","Felipe Borges (19h as 22h)","","Murilo Machado (19h as 22h)","Bruno (19h as 22h)","");
		Monitoria moni6  = new Monitoria(null,"As monitorias de Mecânica A em Porto Alegre iniciam na segunda semana de aula, 22 dia  de Agosto.","Mecanica A",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni7  = new Monitoria(null,"As monitorias de Mecânica B em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","Mecanica B",1,"","","","","","Felipe Borge, Carlos Odoni (09h as 12h)","","","","","","Felipe Borge, Carlos Odoni (12h as 16h)","Tiago, Felipe (17h as 19h)","Tiago, Marcio, Murilo (17h as 19h)","Tiago, Marcio, Murilo (17h as 19h)","Marcio, Murilo (17h as 19h)","","Felipe Borges (17h as 19h)","Jonatas (19h as 21h)","Felipe Borges (19h as 22h)","","Murilo Machado (19h as 22h)","Bruno (19h as 22h)","");
		Monitoria moni8  = new Monitoria(null,"As monitorias de Mecânica B em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","Mecanica B",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni9  = new Monitoria(null,"As monitorias de Eletricidade e Magnetismo em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","Eletricidade",1,"e","","","","","Felipe Borge, Carlos Odoni (09h as 12h)","","","","","","Felipe Borge, Carlos Odoni (12h as 16h)","Tiago, Felipe (17h as 19h)","Tiago, Marcio, Murilo (17h as 19h)","Tiago, Felipe, Murilo (17h as 19h)","Marcio, Murilo (17h as 19h)","","Felipe Borges, Felipe Abreu (17h as 19h)","Jonatas (19h as 21h)","Felipe Borges (19h as 22h)","","Murilo Machado (19h as 22h)","Bruno (19h as 22h)","");
		Monitoria moni10 = new Monitoria(null,"As monitorias de Eletricidade e Magnetismo em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","Eletricidade",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni11 = new Monitoria(null,"As monitorias de Ondas e Ótica em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","Ondas",1,"o","","","","","Felipe Borge (09h as 12h)","","","","","","Felipe Borge (12h as 16h)","Felipe (17h as 19h)","Marcio, Murilo (17h as 19h)","Felipe, Murilo (17h as 19h)","Marcio, Murilo (17h as 19h)","","Felipe Borges, Felipe Abreu (17h as 19h)","Jonatas (19h as 21h)","Felipe Borges (19h as 22h)","","Murilo Machado (19h as 22h)","Bruno (19h as 22h)","");
		Monitoria moni12 = new Monitoria(null,"As monitorias de Ondas e Ótica em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","Ondas",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni13 = new Monitoria(null,"As monitorias de Português em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","Portugues",1,"p","","","","","","","João Schmitz (14h as 17h)","","","","","","Alessandra Redel, Bruna Rodrigues (17h as 19h)","Lauren Silva, Bruna Rodrigues (17h as 19h10)","Lauren Silva, Bruna Rodrigues (17h as 19h10)","","","","João (19h as 21h)","","","","");
		Monitoria moni14 = new Monitoria(null,"As monitorias de Português em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","Portugues",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni15 = new Monitoria(null,"As monitorias de Estatistica em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","Estatistica",1,"Estatistica","","","","","","","","","Fernanda (15h15 as 19h)","","","Lucas (17h as 18h46)","Jéssica (17h30 as 19h10)","Guilherme (17h20 as 19h00)","","Nadine (17h45 as 19h15)","","Aline (19h30 as 21h16)","","","","Andresa (19h40 as 21h40) **Dia 30/08 não haverá monitoria**","");
		Monitoria moni16 = new Monitoria(null,"As monitorias de Estatistica em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","Estatistica",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni17 = new Monitoria(null,"As monitorias de Quimica em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","OrganicaI",1,"Organica I","","","","","Luciano (08h30 as 11h30)","Nathalia (14h as 17h)","Nathalia (14h as 16h30)","Bruna (16h as 17h)","Luize (14h30 as 17h30)","Bruna (14h30 as 17h)","","Nathalia (17h as 19h)","Nathalia (17h as 19h) Matheus Pozza (17h as 19h30)","Bruna  (17h as 19h)","Carolina Saft (16h as 19h)","","","Bruna (19h as 22h)","Carolina Saft (19h as 22h)","Matheus Pozza (19h30 as 22h)","Matheus Pozza (19h30 as 22h)","Matheus Pozza (19h as 22h)","");
		Monitoria moni18 = new Monitoria(null,"As monitorias de Quimica em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","OrganicaI",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni19 = new Monitoria(null,"As monitorias de Quimica em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","OrganicaII",1,"Organica II","","","","","Luciano (08h30 as 11h30)","","","","","","","","Matheus Pozza (17h as 19h30)","","","","","","Carolina Saft (19h as 22h)","Matheus Pozza (19h30 as 22h)","Matheus Pozza (19h30 as 22h)","Matheus Pozza (19h as 22h)","");
		Monitoria moni20 = new Monitoria(null,"As monitorias de Quimica em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","OrganicaII",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni21 = new Monitoria(null,"As monitorias de Quimica em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","FisicoQ",1,"Fisico Quimica","","","","","Luciano (08h30 as 11h30)","","","","","","","","Matheus Pozza (17h as 19h30)","","","","","","Carolina Saft (19h as 22h)","Matheus Pozza (19h30 as 22h)","Matheus Pozza (19h30 as 22h)","","");
		Monitoria moni22 = new Monitoria(null,"As monitorias de Quimica em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","FisicoQ",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni23 = new Monitoria(null,"As monitorias de Quimica em São Leopoldo iniciam na segunda semana de aula, 23 dia  de Agosto.","QuimicaG",1,"Quimica Geral","","","","","Luciano (08h30 as 11h30)","Nathalia (14h as 17h)","Nathalia (14h as 16h30)","Bruna (16h as 17h)","Luise (14h30 as 17h30)","Bruna (14h30 as 17h)","","Nathalia (17h as 19h)","Nathalia (17h as 19h) Matheus Pozza (17h as 19h30)","Bruna (17h as 19h)","Carolina Saft (16h as 19h)","","","Bruna (19h as 22h)","Carolina Saft (19h as 22h)","Matheus Pozza (19h30 as 22h)","Matheus Pozza (19h30 as 22h)","Matheus Pozza (19h as 22h)","");
		Monitoria moni24 = new Monitoria(null,"As monitorias de Quimica em Porto Alegre iniciam na segunda semana de aula, 24 dia  de Agosto.","QuimicaG",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni25  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","CalculoI",1,"CalculoI","","","","","Thiago Endel 8h30 às 12h","Thiago (16h-19h)","Tatiane (16h-19)","Tatiane (16h-19)","Arthur (15h-19h)","Tatiane (16h-19)","Germano Endel (14h-17h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Tatiane, Arthur (17h-19h)","Leticia, Tatiane (17h-19h)","","Thiago (19h-22h)","Germano, Arthur (19h-22h)","Bárbara, Ben Hur, Ana Paula (19h-22h)","Luize, Germano (19h-22h)","Germano, Ana Paula (19h - 22h)","");
		Monitoria moni26  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","CalculoI",2,"CalculoI","","","","","","","","","","","","","Matheus (17h as 19h)","Matheus (17h as 19h)","Matheus (17h as 19h)","","","","","","","","");
		Monitoria moni27  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","CalculoII",1,"CalculoII","","","","","Thiago Endel 8h30 às 12h","Thiago (16h-19h)","Tatiane (16h-19)","Tatiane (16h-19)","Arthur (15h-19h)","Tatiane (16h-19)","Germano Endel (14h-17h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Tatiane, Arthur (17h-19h)","Leticia, Tatiane (17h-19h)","","Thiago, Arthur (19h-22h)","Germano, Arthur (19h-22h)","Bárbara, Ben Hur, Ana Paula (19h-22h)","Luize, Germano (19h-22h)","Germano, Ana Paula (19h - 22h)","");
		Monitoria moni28  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","CalculoII",2,"CalculoII","","","","","","","","","","","","","Matheus (17h as 19h)","Matheus (17h as 19h)","Matheus (17h as 19h)","","","","","","","","");
		Monitoria moni29  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","CalculoIII",1,"CalculoIII","","","","","Thiago Endel 8h30 às 12h","Thiago (16h-19h)","Tatiane (16h-19)","Tatiane (16h-19)","Arthur (15h-19h)","Tatiane (16h-19)","Germano Endel (14h-17h)","Thiago (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","","Thiago (19h-22h)","Germano (19h-22h)","","Germano (19h-22h)","Germano (19h - 22h)","");
		Monitoria moni30  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","CalculoIII",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni31  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","CalculoV",1,"CalculoV","","","","","Thiago Endel 8h30 às 12h","Thiago (16h-19h)","Tatiane (16h-19)","Tatiane (16h-19)","Arthur (15h-19h)","Tatiane (16h-19)","Germano Endel (13h-16h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Tatiane (17h-19h)","","Thiago, Arthur (19h-22h)","Germano, Arthur (19h-22h)","Barbara, Bem Hur, Ana Paula (19h as 22h)","Luise, Germano (19h-22h)","Germano, Ana Paula (19h - 22h)","");
		Monitoria moni32  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","CalculoV",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni33  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","EquacoesD",1,"EquacoesD","","","","","Thiago Endel 8h30 às 12h","Thiago (16h-19h)","Tatiane (16h-19)","Tatiane (16h-19)","","Tatiane (16h-19)","Germano Endel (14h-17h)","Leticia, Thiago, Tatiane (17h-19h)","Leticia, Tatiane (17h-19h)","Leticia, Tatiane (17h-19h)","Leticia, Tatiane (17h-19h)","Leticia, Tatiane (17h-19h)","","Thiago (19h-22h)","Germano (19h-22h)","","Germano (19h-22h)","Germano (19h - 22h)","");
		Monitoria moni34  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","EquacoesD",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni35  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","EquacoesDS",1,"EquacoesDS","","","","","Thiago Endel 8h30 às 12h","Thiago (16h-19h)","Tatiane (16h-19)","Tatiane (16h-19)","Arthur (15h-19h","Tatiane (16h-19)","Germano Endel (14h-17h)","Leticia, Fernanda, Thiago (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Fernanda, Tatiane (17h-19h)","Leticia, Tatiane (17h-19h)","","Thiago, Arthur (19h-22h)","Germano, Arthur (19h-22h)","Barbara, Bem Hur, Ana Paula (19h as 22h)","Luize, Germano (19h-22h)","Germano, Ana Paula (19h - 22h)","");
		Monitoria moni36  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","EquacoesDS",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni37  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","MetodosN",1,"MetodosN","","","","","Thiago Endel 8h30 às 12h","","","","","","Germano Endel (13h as 16h)","Fernanda (17h-19h)","Fernanda (17h-19h)","Fernanda (17h-19h)","","","","","Germano (19h-22h)","","Germano (19h-22h)","Germano (19h - 22h)","");
		Monitoria moni38  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","MetodosN",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni39  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","VariaveisC",1,"VariaveisC","","","","","Thiago Endel 8h30 às 12h","Thiago (16h as 19h)","Tatiane (16h as 19h)","Tatiane (16h as 19h)","","Tatiane (16h as 19h)","Germano Endel (13h as 16h)","Thiago (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","","Thiago (19h as 22h)","Germano (19h-22h)","","Germano (19h-22h)","Germano (19h - 22h)","");
		Monitoria moni40  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","VariaveisC",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni41  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","Fundamentos",1,"Fundamentos","","","","","Thiago Endel 8h30 às 12h","Thiago (16h as 19h)","","","","","Germano (13h as 16h)","Thiago (17h-19h)","Thiago (17h-19h)","Thiago (17h-19h)","","","","Thiago (19h as 22h)","Germano (19h-22h)","","Germano (19h-22h)","Germano (19h - 22h)","");
		Monitoria moni42  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","Fundamentos",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni43  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","MatematicaArq",1,"MatematicaArq","","","","","Thiago Endel 8h30 às 12h","Thiago (16h as 19h)","Tatiane (16h as 19h)","Tatiane (16h as 19h)","Arthur (16h as 19h)","Tatiane (16h as 19h)","Germano, Endel (13h as 16h)","Thiago (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","Tatiane (17h-19h)","","Thiago (19h as 22h)","Germano (19h-22h)","","Germano (19h-22h)","Germano (19h - 22h)","");
		Monitoria moni44  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","MatematicaArq",2,"segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado","segunda","terca","quarta","quinta","sexta","sabado");
		Monitoria moni45  = new Monitoria(null,"As monitorias de Matemática em São Leopoldo iniciam na terceira semana de aula, 20 dia  de Agosto.","MatematicaCG",1,"MatematicaCG","","","","","","","","","","","","","","","","","","","","","","","");
		Monitoria moni46  = new Monitoria(null,"As monitorias de Matemática em Porto Alegre iniciam na segunda semana de aula, 13 dia  de Agosto.","MatematicaCG",2,"MatematicaCG","","","","","","","","","","","","","","","","","","","","","","","");
	
		
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data1 = formato.parse("23/11/2018");
		
		Evento ev1 = new Evento(null, "Reuniao com alunos",data1 );
		
		Date data2 = formato.parse("05/12/2018");
		Evento ev2 = new Evento(null, "Reuniao com alunos e orientadores",data2 );
		
		Date data3 = formato.parse("15/10/2018");
		Evento ev3 = new Evento(null, "Reuniao com alunos de Quimica",data3 );	
		
		area1.getMonitorias().addAll(Arrays.asList(moni5,moni6,moni7,moni8,moni9,moni10,moni11,moni12));
		area2.getMonitorias().addAll(Arrays.asList(moni13,moni14));
		area3.getMonitorias().addAll(Arrays.asList(moni17,moni18,moni19,moni20,moni21,moni22,moni23,moni24));
		area5.getMonitorias().addAll(Arrays.asList(moni3,moni4,moni25,moni26,moni27,moni28,moni29,moni30,moni31,
				                                   moni32,moni33,moni34,moni35,moni36,moni37,moni38,moni39,moni40,
				                                   moni41,moni42,moni43,moni44,moni45,moni46));
		area6.getMonitorias().addAll(Arrays.asList(moni15,moni16));
		
		
		moni3.getAreas().addAll(Arrays.asList(area5));
		moni4.getAreas().addAll(Arrays.asList(area5));
		moni5.getAreas().addAll(Arrays.asList(area1));
		moni6.getAreas().addAll(Arrays.asList(area1));
		moni7.getAreas().addAll(Arrays.asList(area1));
		moni8.getAreas().addAll(Arrays.asList(area1));
		moni9.getAreas().addAll(Arrays.asList(area1));
		moni10.getAreas().addAll(Arrays.asList(area1));
		moni11.getAreas().addAll(Arrays.asList(area1));
		moni12.getAreas().addAll(Arrays.asList(area1));
		moni13.getAreas().addAll(Arrays.asList(area2));
		moni14.getAreas().addAll(Arrays.asList(area2));
		moni15.getAreas().addAll(Arrays.asList(area6));
		moni16.getAreas().addAll(Arrays.asList(area6));
		moni17.getAreas().addAll(Arrays.asList(area3));
		moni18.getAreas().addAll(Arrays.asList(area3));
		moni19.getAreas().addAll(Arrays.asList(area3));
		moni20.getAreas().addAll(Arrays.asList(area3));
		moni21.getAreas().addAll(Arrays.asList(area3));
		moni22.getAreas().addAll(Arrays.asList(area3));
		moni23.getAreas().addAll(Arrays.asList(area3));
		moni24.getAreas().addAll(Arrays.asList(area3));
		moni25.getAreas().addAll(Arrays.asList(area5));
		moni26.getAreas().addAll(Arrays.asList(area5));
		moni27.getAreas().addAll(Arrays.asList(area5));
		moni28.getAreas().addAll(Arrays.asList(area5));
		moni29.getAreas().addAll(Arrays.asList(area5));
		moni30.getAreas().addAll(Arrays.asList(area5));
		moni31.getAreas().addAll(Arrays.asList(area5));
		moni32.getAreas().addAll(Arrays.asList(area5));
		moni33.getAreas().addAll(Arrays.asList(area5));
		moni34.getAreas().addAll(Arrays.asList(area5));
		moni35.getAreas().addAll(Arrays.asList(area5));
		moni36.getAreas().addAll(Arrays.asList(area5));
		moni37.getAreas().addAll(Arrays.asList(area5));
		moni38.getAreas().addAll(Arrays.asList(area5));
		moni39.getAreas().addAll(Arrays.asList(area5));
		moni40.getAreas().addAll(Arrays.asList(area5));
		moni41.getAreas().addAll(Arrays.asList(area5));
		moni42.getAreas().addAll(Arrays.asList(area5));
		moni43.getAreas().addAll(Arrays.asList(area5));
		moni44.getAreas().addAll(Arrays.asList(area5));
		moni45.getAreas().addAll(Arrays.asList(area5));
		moni46.getAreas().addAll(Arrays.asList(area5));
			
		ev1.getAreas().addAll(Arrays.asList(area1));
		ev2.getAreas().addAll(Arrays.asList(area5));
		ev3.getAreas().addAll(Arrays.asList(area3));
		
		area1.getEventos().addAll(Arrays.asList(ev1));
		area3.getEventos().addAll(Arrays.asList(ev3));
	
		
		areasRepository.saveAll(Arrays.asList(area1,area2,area3,area4,area5,area6));
		monitoriaRepository.saveAll(Arrays.asList(moni3,moni4,moni5,moni6,moni7,moni8,moni9,
				                                  moni10,moni11,moni12,moni13,moni14,moni15,
				                                  moni16,moni17,moni18,moni19,moni20,moni21,
				                                  moni22,moni23,moni24,moni25,moni26,moni27,
				                                  moni28,moni29,moni30,moni31,moni32,moni33,
				                                  moni34,moni35,moni36,moni37,moni38,moni39,
				                                  moni40,moni41,moni42,moni43,moni44,moni45,
				                                  moni46));
		
		eventoRepository.saveAll(Arrays.asList(ev1,ev2,ev3));
	}

}
