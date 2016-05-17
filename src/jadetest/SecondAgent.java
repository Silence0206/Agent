package jadetest;

import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;

public class SecondAgent extends Agent {
	 protected void setup(){

		this.addBehaviour(new CyclicBehaviour(){
			public void action (){
				ACLMessage msg=receive();
				if(msg!=null){
					System.out.println("receive:"+msg.getContent());
				}
			}
			};
	 }}
		
			
		
	