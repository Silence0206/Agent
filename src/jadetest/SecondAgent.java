package jadetest;

import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.*;

public class SecondAgent extends Agent {
	 public void setup(){

		this.addBehaviour(new CyclicBehaviour(){
			public void action (){
				ACLMessage msg=receive();
				if(msg!=null){
					System.out.println("receive:"+msg.getContent());
				}
			}
		});
			}
	 }
		
			
		
	