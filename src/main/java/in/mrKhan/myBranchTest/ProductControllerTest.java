package in.mrKhan.myBranchTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.mrKhan.model.Product;
import in.mrKhan.service.ProductService;

@RestController
public class ProductControllerTest {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/getproduct",produces = {"application/json"})
	public Product getProductById(@RequestParam("pid") Integer pid) {
		return productService.findProductById(pid);
	}
}
