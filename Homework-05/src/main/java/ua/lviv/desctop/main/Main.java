package ua.lviv.desctop.main;

import java.util.Date;

import ua.lviv.desctop.domain.Bucket;
import ua.lviv.desctop.domain.Product;
import ua.lviv.desctop.domain.User;
import ua.lviv.desctop.service.BucketService;
import ua.lviv.desctop.service.ProductService;
import ua.lviv.desctop.service.UserService;
import ua.lviv.desctop.service.impl.BucketServiceImpl;
import ua.lviv.desctop.service.impl.ProductServiceImpl;
import ua.lviv.desctop.service.impl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		userService.create(new User("test@test", "test", "test", "test"));
		userService.delete(1);
		System.out.println(userService.read(2));
		userService.update(new User(3, "test@testTest", "test", "test", "test"));
		System.out.println(userService.read(3));
		System.out.println(userService.readAll());

		ProductService productService = new ProductServiceImpl();
		productService.create(new Product("test", "test", 10.5));
		productService.delete(1);
		System.out.println(productService.read(3));
		productService.update(new Product(4, "testTEST", "test", 10.5));
		System.out.println(productService.read(4));
		System.out.println(productService.readAll());

		BucketService bucketService = new BucketServiceImpl();
		bucketService.create(new Bucket(2, 2, new Date()));
		bucketService.delete(1);
		System.out.println(bucketService.read(3));
		System.out.println(bucketService.readAll());

	}

}
