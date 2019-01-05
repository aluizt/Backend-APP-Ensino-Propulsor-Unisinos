package br.com.unisinos.socket;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;
import br.com.unisinos.domain.ChatEstatistica;
import br.com.unisinos.domain.ChatFisica;
import br.com.unisinos.domain.ChatMatematica;
import br.com.unisinos.domain.ChatPortugues;
import br.com.unisinos.domain.ChatQuimica;
import br.com.unisinos.domain.MensagemChat;
import br.com.unisinos.services.ChatEstatisticaService;
import br.com.unisinos.services.ChatFisicaService;
import br.com.unisinos.services.ChatMatematicaService;
import br.com.unisinos.services.ChatPortuguesService;
import br.com.unisinos.services.ChatQuimicaService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class WebSocketController {

	private Integer sala;
	
	
    private final SimpMessagingTemplate template;
   
    private String data,hora;
    
    @Autowired
    private ChatFisicaService serviceFisica;
 
    @Autowired
    private ChatPortuguesService servicePortugues;
    
    @Autowired
    private ChatQuimicaService serviceQuimica;
    
    @Autowired
    private ChatMatematicaService serviceMatematica;
    
    @Autowired
    private ChatEstatisticaService serviceEstatistica;
    
  
    
    @Autowired
    WebSocketController(SimpMessagingTemplate template){
        this.template = template;
    }

    
    //@Autowired
	@MessageMapping("/send/message")
    public void onReceivedMesage(MensagemChat message){
    	
    	System.out.println("Entrou no onReceiveMesage");
    	System.out.println(message);
    	System.out.println(message.getMsg());
    	System.out.println(message.getSala());
    	System.out.println(message.getUsuario());
    	
    	hora=new SimpleDateFormat("HH:mm:ss").format(new Date());
    	data=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    	message.setData(data+" as "+hora);
  
        sala=Integer.parseInt(message.getSala());
  
        // chat fisica
    	if(sala==1) {
    		
    		ChatFisica obj = new ChatFisica();
    		ChatFisica objEnviado = new ChatFisica();
    		String usuario = message.getUsuario();
    		
    		obj.setUsuario(message.getUsuario());
    		obj.setMsg(message.getMsg());
    		obj.setEmail(message.getEmail());
            obj.setData(data+" as "+hora);
            obj.setTipo(message.getTipo());
            obj.setSubTipo(message.getSubTipo());
            
            objEnviado=obj;
            
            
    		serviceFisica.save(obj);
    		
    		if(obj.getTipo()==1 && obj.getSubTipo()!=3) {
    			List<ChatFisica> lista = new ArrayList<ChatFisica>();
    			lista = serviceFisica.findAll();
    		
    			for (int j = 0; j < lista.size() - j; ++j) {
				    ChatFisica tmp = lista.get(j);
				    for (int h= j + 1; h < lista.size(); ++h) {
				        ChatFisica tmp2 = lista.get(h);
				        if (tmp.getId().compareTo(tmp2.getId()) > 0) {
				            ChatFisica temp = tmp;
				            lista.set(j, tmp2);
				            lista.set(h, temp);
				        }
				    }
				}
    			
    			
    			for(int i=0; i< lista.size()-1;i++) {
    				obj=lista.get(i);
    				message.setId(obj.getId());
    				message.setUsuario(obj.getUsuario());
    				message.setTipo(obj.getTipo());
    				message.setMsg(obj.getMsg());
    				message.setData(obj.getData());    				
    		    	message.setSubUsuario(usuario);
    				
    				enviaMensagem(message);
    			}
    			message.setId(null);
    			message.setUsuario(objEnviado.getUsuario());
				message.setTipo(objEnviado.getTipo());
				message.setMsg(objEnviado.getMsg());
				message.setData(objEnviado.getData());
				message.setSubUsuario(objEnviado.getSubUsuario());
				
		        enviaMensagem(message);
    			
    		}else {
	   				
					message.setUsuario(objEnviado.getUsuario());
					message.setTipo(objEnviado.getTipo());
					message.setMsg(objEnviado.getMsg());
					message.setData(objEnviado.getData());
					
    		        enviaMensagem(message);
    		}
    	};
    	
    	// chat portugues
    	if(sala==2) {
    		
    		ChatPortugues obj = new ChatPortugues();
    		ChatPortugues objEnviado = new ChatPortugues();
    		
    		String usuario = message.getUsuario();
    		
    		obj.setUsuario(message.getUsuario());
    		obj.setMsg(message.getMsg());
    		obj.setEmail(message.getEmail());
            obj.setData(data+" as "+hora);
            obj.setTipo(message.getTipo());
            obj.setSubTipo(message.getSubTipo());
            
            objEnviado=obj;
            
            
            servicePortugues.save(obj);
    		
    		if(obj.getTipo()==1 && obj.getSubTipo()!=3) {
    			List<ChatPortugues> lista = new ArrayList<ChatPortugues>();
    			lista = servicePortugues.findAll();
    		
    			for (int j = 0; j < lista.size() - j; ++j) {
				    ChatPortugues tmp = lista.get(j);
				    for (int h= j + 1; h < lista.size(); ++h) {
				        ChatPortugues tmp2 = lista.get(h);
				        if (tmp.getId().compareTo(tmp2.getId()) > 0) {
				            ChatPortugues temp = tmp;
				            lista.set(j, tmp2);
				            lista.set(h, temp);
				        }
				    }
				}
    			
    			
    			for(int i=0; i< lista.size()-1;i++) {
    				obj=lista.get(i);
    				message.setId(obj.getId());
    				message.setUsuario(obj.getUsuario());
    				message.setTipo(obj.getTipo());
    				message.setMsg(obj.getMsg());
    				message.setData(obj.getData());    				
    		    	message.setSubUsuario(usuario);
    				
    				enviaMensagem(message);
    			}
    			message.setId(null);
    			message.setUsuario(objEnviado.getUsuario());
				message.setTipo(objEnviado.getTipo());
				message.setMsg(objEnviado.getMsg());
				message.setData(objEnviado.getData());
				message.setSubUsuario(objEnviado.getSubUsuario());
				
		        enviaMensagem(message);
    			
    		}else {
	   				
					message.setUsuario(objEnviado.getUsuario());
					message.setTipo(objEnviado.getTipo());
					message.setMsg(objEnviado.getMsg());
					message.setData(objEnviado.getData());
					
    		        enviaMensagem(message);
    		}
    		 		
    	};   
    	
    	// chat quimica
    	if(sala==3) {
    		
    		ChatQuimica obj = new ChatQuimica();
    		ChatQuimica objEnviado = new ChatQuimica();
    		
    		String usuario = message.getUsuario();
    		
    		obj.setUsuario(message.getUsuario());
    		obj.setMsg(message.getMsg());
    		obj.setEmail(message.getEmail());
            obj.setData(data+" as "+hora);
            obj.setTipo(message.getTipo());
            obj.setSubTipo(message.getSubTipo());
            
            objEnviado=obj;
            
            
            serviceQuimica.save(obj);
    		
    		if(obj.getTipo()==1 && obj.getSubTipo()!=3) {
    			List<ChatQuimica> lista = new ArrayList<ChatQuimica>();
    			lista = serviceQuimica.findAll();
    		
    			for (int j = 0; j < lista.size() - j; ++j) {
				    ChatQuimica tmp = lista.get(j);
				    for (int h= j + 1; h < lista.size(); ++h) {
				        ChatQuimica tmp2 = lista.get(h);
				        if (tmp.getId().compareTo(tmp2.getId()) > 0) {
				            ChatQuimica temp = tmp;
				            lista.set(j, tmp2);
				            lista.set(h, temp);
				        }
				    }
				}
    			
    			
    			for(int i=0; i< lista.size()-1;i++) {
    				obj=lista.get(i);
    				message.setId(obj.getId());
    				message.setUsuario(obj.getUsuario());
    				message.setTipo(obj.getTipo());
    				message.setMsg(obj.getMsg());
    				message.setData(obj.getData());    				
    		    	message.setSubUsuario(usuario);
    				
    				enviaMensagem(message);
    			}
    			message.setId(null);
    			message.setUsuario(objEnviado.getUsuario());
				message.setTipo(objEnviado.getTipo());
				message.setMsg(objEnviado.getMsg());
				message.setData(objEnviado.getData());
				message.setSubUsuario(objEnviado.getSubUsuario());
				
		        enviaMensagem(message);
    			
    		}else {
	   				
					message.setUsuario(objEnviado.getUsuario());
					message.setTipo(objEnviado.getTipo());
					message.setMsg(objEnviado.getMsg());
					message.setData(objEnviado.getData());
					
    		        enviaMensagem(message);
    		}
    		 		
    	};   
    	
    	// chat matematica
    	if(sala==4) {
    		
    		ChatMatematica obj = new ChatMatematica();
    		ChatMatematica objEnviado = new ChatMatematica();
    		
    		String usuario = message.getUsuario();
    		
    		obj.setUsuario(message.getUsuario());
    		obj.setMsg(message.getMsg());
    		obj.setEmail(message.getEmail());
            obj.setData(data+" as "+hora);
            obj.setTipo(message.getTipo());
            obj.setSubTipo(message.getSubTipo());
            
            objEnviado=obj;
            
            
            serviceMatematica.save(obj);
    		
    		if(obj.getTipo()==1 && obj.getSubTipo()!=3) {
    			List<ChatMatematica> lista = new ArrayList<ChatMatematica>();
    			lista = serviceMatematica.findAll();
    		
    			for (int j = 0; j < lista.size() - j; ++j) {
				    ChatMatematica tmp = lista.get(j);
				    for (int h= j + 1; h < lista.size(); ++h) {
				        ChatMatematica tmp2 = lista.get(h);
				        if (tmp.getId().compareTo(tmp2.getId()) > 0) {
				            ChatMatematica temp = tmp;
				            lista.set(j, tmp2);
				            lista.set(h, temp);
				        }
				    }
				}
    			
    			
    			for(int i=0; i< lista.size()-1;i++) {
    				obj=lista.get(i);
    				message.setId(obj.getId());
    				message.setUsuario(obj.getUsuario());
    				message.setTipo(obj.getTipo());
    				message.setMsg(obj.getMsg());
    				message.setData(obj.getData());    				
    		    	message.setSubUsuario(usuario);
    				
    				enviaMensagem(message);
    			}
    			message.setId(null);
    			message.setUsuario(objEnviado.getUsuario());
				message.setTipo(objEnviado.getTipo());
				message.setMsg(objEnviado.getMsg());
				message.setData(objEnviado.getData());
				message.setSubUsuario(objEnviado.getSubUsuario());
				
		        enviaMensagem(message);
    			
    		}else {
	   				
					message.setUsuario(objEnviado.getUsuario());
					message.setTipo(objEnviado.getTipo());
					message.setMsg(objEnviado.getMsg());
					message.setData(objEnviado.getData());
					
    		        enviaMensagem(message);
    		}
    		 		
    	};   
    	
    	// chat estatistica
    	if(sala==5) {
    		
    		ChatEstatistica obj = new ChatEstatistica();
    		ChatEstatistica objEnviado = new ChatEstatistica();
    		
    		String usuario = message.getUsuario();
    		
    		obj.setUsuario(message.getUsuario());
    		obj.setMsg(message.getMsg());
    		obj.setEmail(message.getEmail());
            obj.setData(data+" as "+hora);
            obj.setTipo(message.getTipo());
            obj.setSubTipo(message.getSubTipo());
            
            objEnviado=obj;
            
            
            serviceEstatistica.save(obj);
    		
    		if(obj.getTipo()==1 && obj.getSubTipo()!=3) {
    			List<ChatEstatistica> lista = new ArrayList<ChatEstatistica>();
    			lista = serviceEstatistica.findAll();
    		
    			for (int j = 0; j < lista.size() - j; ++j) {
				    ChatEstatistica tmp = lista.get(j);
				    for (int h= j + 1; h < lista.size(); ++h) {
				        ChatEstatistica tmp2 = lista.get(h);
				        if (tmp.getId().compareTo(tmp2.getId()) > 0) {
				            ChatEstatistica temp = tmp;
				            lista.set(j, tmp2);
				            lista.set(h, temp);
				        }
				    }
				}
    			
    			
    			for(int i=0; i< lista.size()-1;i++) {
    				obj=lista.get(i);
    				message.setId(obj.getId());
    				message.setUsuario(obj.getUsuario());
    				message.setTipo(obj.getTipo());
    				message.setMsg(obj.getMsg());
    				message.setData(obj.getData());    				
    		    	message.setSubUsuario(usuario);
    				
    				enviaMensagem(message);
    			}
    			message.setId(null);
    			message.setUsuario(objEnviado.getUsuario());
				message.setTipo(objEnviado.getTipo());
				message.setMsg(objEnviado.getMsg());
				message.setData(objEnviado.getData());
				message.setSubUsuario(objEnviado.getSubUsuario());
				
		        enviaMensagem(message);
    			
    		}else {
	   				
					message.setUsuario(objEnviado.getUsuario());
					message.setTipo(objEnviado.getTipo());
					message.setMsg(objEnviado.getMsg());
					message.setData(objEnviado.getData());
					
    		        enviaMensagem(message);
    		}
    		 		
    	};   
    }
    
    public void enviaMensagem(MensagemChat message) {
    	sala=Integer.parseInt(message.getSala());
    	if(sala==1) {
    	    System.out.println("A sala enviada sera Fisica");
    		this.template.convertAndSend("/chat/fisica", message);
    		
    	}
    	
    	if(sala==2) {
    	    System.out.println("A sala enviada sera Portugues");
    		this.template.convertAndSend("/chat/portugues", message);
    		
    	}
    	if(sala==3) {
    	    System.out.println("A sala enviada sera Quimica");
    		this.template.convertAndSend("/chat/quimica", message);
    		
    	}
    	if(sala==4) {
    	    System.out.println("A sala enviada sera Matematica");
    		this.template.convertAndSend("/chat/matematica", message);
    		
    	}
    	if(sala==5) {
    	    System.out.println("A sala enviada sera Estatistica");
    		this.template.convertAndSend("/chat/estatistica", message);
    		
    	}
    }
}
