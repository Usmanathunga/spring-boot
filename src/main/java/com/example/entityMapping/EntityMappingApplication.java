package com.example.entityMapping;

import com.example.entityMapping.controller.CoffeeController;
import com.example.entityMapping.controller.PizzaController;
import com.example.entityMapping.lazy.LazyLoader;
import com.example.entityMapping.propertysource.PropertysourceDemo;
import com.example.entityMapping.scope.PrototypeBean;
import com.example.entityMapping.scope.SingletonBean;
import com.example.entityMapping.service.CheesePizza;
import com.example.entityMapping.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EntityMappingApplication {

	public static void main(String[] args) {
//		var context = SpringApplication.run(EntityMappingApplication.class, args);// return application context object
		ConfigurableApplicationContext context = SpringApplication.run(EntityMappingApplication.class, args);// return application context object

//		PizzaController pizzaController = context.getBean(PizzaController.class);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaDemo");//casting
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");//casting
//		System.out.println(pizzaController.getPizza());
//
//	CheesePizza cheesePizza = context.getBean(CheesePizza.class);
//		CheesePizza cheesePizza = (CheesePizza) context.getBean("cheeseBean");// it's default method name
//		System.out.println(cheesePizza.getPizza());

//		CoffeeController coffeeController = context.getBean(CoffeeController.class);
//		coffeeController.getCoffee();

//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);// on demand

		//single instance
//		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//		SingletonBean singletonBean2= context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//		SingletonBean singletonBean3= context.getBean(SingletonBean.class);
//		System.out.println(singletonBean3.hashCode());

		//many instance
//		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean.hashCode());
//		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//		PrototypeBean prototypeBean2= context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.hashCode());

		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
//		System.out.println(valueAnnotationDemo.getDefaultName());
//
//		System.out.println(valueAnnotationDemo.getEmail());
//		System.out.println(valueAnnotationDemo.getHost());
//		System.out.println(valueAnnotationDemo.getPassword());


//		System.out.println(valueAnnotationDemo.getHomeDir());
//		System.out.println(valueAnnotationDemo.getJavaHome());

//		PropertysourceDemo propertysourceDemo = context.getBean(PropertysourceDemo.class);
//		System.out.println(propertysourceDemo.getEmail());
//		System.out.println(propertysourceDemo.getHost());
//		System.out.println(propertysourceDemo.getPassword());
//		System.out.println(propertysourceDemo.getDesc());
//		System.out.println(propertysourceDemo.getName());




	}

}
