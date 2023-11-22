package com.example.demo.controller.database;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//creara para srping un pbjeto en memoria que va a reutilizar
@Profile(value = "mysql")
@Component
public class MySQLConnection implements DBConnection {

	public void helloFromMysql() {
		System.out.println("hola desde el controlador de Mysql");
	}

	@Override
	public void helloFromWhateverDatabase() {
		helloFromMysql();
	}
}
