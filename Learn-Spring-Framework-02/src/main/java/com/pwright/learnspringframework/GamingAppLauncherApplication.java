package com.pwright.learnspringframework;

import com.pwright.learnspringframework.game.GameRunner;
import com.pwright.learnspringframework.game.GamingConsole;
import com.pwright.learnspringframework.game.MarioGame;
import com.pwright.learnspringframework.game.PacManGame;
import com.pwright.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("unused")


//configuration file is where the beans are created, dont need it currently as no beans are created
@Configuration
//instances of PacMan game and GameRunner are being created by spring and auto wired
@ComponentScan("com.pwright.learnspringframework.game")
public class GamingAppLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}

	}
}
