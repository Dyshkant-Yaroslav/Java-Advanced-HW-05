package ua.lviv.desctop.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.desctop.dao.ProductDao;
import ua.lviv.desctop.dao.impl.ProductDaoImpl;
import ua.lviv.desctop.domain.Product;
import ua.lviv.desctop.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public ProductServiceImpl() {
		try {
			productDao = new ProductDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Product create(Product t) {
		return productDao.create(t);
	}

	@Override
	public Product read(Integer id) {
		return productDao.read(id);
	}

	@Override
	public Product update(Product t) {
		return productDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		productDao.delete(id);

	}

	@Override
	public List<Product> readAll() {
		return productDao.readAll();
	}

}

