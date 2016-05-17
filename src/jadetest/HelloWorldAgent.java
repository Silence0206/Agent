package jadetest;

import jade.core.*;
import jade.core.behaviours.SimpleBehaviour;
/**
 * 可以成功运行
 * 参数设置为 -gui hello:jadetest.HelloWorldAgent 
 * 冒号后面不能有空格！！不能有空格！！不能有空格！！
 * @author HB
 *
 */

public class HelloWorldAgent extends Agent {

	public void setup() {

		SimpleBehaviour hello_behaviour = new SimpleBehaviour(this) {
			boolean finished = false;

			public void action() {
				System.out.println("Agent Started: Hello World!");
				System.out.println("-----About Me:-----");
				System.out.println("My local name is:" + getLocalName());
				System.out.println("My globally unique name is:" + getName());
				System.out.println("-----About Here:-----");
				Location l = here();
				System.out.println("====Tostring" + l.toString());
				System.out.println("I am running in a location called:" + l.getName());
				System.out.println("Which is identified uniquely as:" + l.getID());
				System.out.println("And is contactable at:" + l.getAddress());
				System.out.println("Using the protocol:" + l.getProtocol());
				finished = true;
			}

			public boolean done() {
				return finished;
			}
		};
		addBehaviour(hello_behaviour);
	}

}

