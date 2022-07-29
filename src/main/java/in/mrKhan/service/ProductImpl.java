package in.mrKhan.service;

import in.mrKhan.model.Product;

import org.springframework.stereotype.Service;

import in.mrKhan.exception.NoProductFoundException;

@Service
public class ProductImpl implements ProductService {

	@Override
	public Product findProductById(Integer id) {
		if(id == 101) {
			return new Product(101, "keyboard", 800);
		} else {
			throw new NoProductFoundException("No product found....");
		}
	}

}
