package com.pwright.learnspringframework;


import com.pwright.learnspringframework.game.GameRunner;
import com.pwright.learnspringframework.game.GamingConsole;
import com.pwright.learnspringframework.game.MarioGame;
import com.pwright.learnspringframework.game.PacManGame;
import com.pwright.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("unused")
public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {

			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
	}
}
