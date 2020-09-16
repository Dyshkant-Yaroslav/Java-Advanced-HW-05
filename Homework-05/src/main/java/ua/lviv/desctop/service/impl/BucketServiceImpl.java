package ua.lviv.desctop.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.desctop.dao.BucketDao;
import ua.lviv.desctop.dao.impl.BucketDaoImpl;
import ua.lviv.desctop.domain.Bucket;
import ua.lviv.desctop.service.BucketService;

public class BucketServiceImpl implements BucketService {

	private BucketDao bucketDao;

	public BucketServiceImpl() {
		try {
			bucketDao = new BucketDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Bucket create(Bucket t) {
		return bucketDao.create(t);
	}

	@Override
	public Bucket read(Integer id) {
		return bucketDao.read(id);
	}

	@Override
	public Bucket update(Bucket t) {
		return bucketDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		bucketDao.delete(id);

	}

	@Override
	public List<Bucket> readAll() {
		return bucketDao.readAll();
	}

}
