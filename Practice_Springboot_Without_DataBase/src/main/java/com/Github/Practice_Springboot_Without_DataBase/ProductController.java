package com.Github.Practice_Springboot_Without_DataBase;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Tomcate Server
public class ProductController {

	ArrayList<Product> al = new ArrayList<>();

	public ProductController() {
		al.add(new Product(111, "bathing Soap", "60 Rs", "Daily Needs", "Lux"));
		al.add(new Product(112, "Ice_Cream", "300 Rs", "Food", "Amul"));
		al.add(new Product(113, "Shoes", "80,000 Rs", "Footwear", "Nike"));
		al.add(new Product(114, "Watch", "1,00,000Rs", "Accessaries", "Rolex"));
		al.add(new Product(115, "Mobile Phone", "2,00,000 Rs", "Electronics", "Apple"));
	}

	@GetMapping("Get All Data") // To get All the Data...
	public ArrayList<Product> getData() {
		return al;
	}

	@GetMapping("get_single_data/{pId}") // To get Single Data (first way)
	public Product getSingleData1(@PathVariable int pId) {
		Product pp = new Product();
		for (Product product : al) {

			if (product.pId == pId) {
				pp = product;
			}

		}

		return pp;

	}

	@GetMapping("get_single_data/{pId}") // Also To get Single Data (second way)
	public ArrayList<Product> getSingleData2(@PathVariable int pId) {

		return al;
	}

	@PostMapping("Insert-Data")
	public ArrayList<Product> insertData(@RequestBody Product pp) {
		al.add(pp);
		return al;
	}

	@PutMapping("Update_Data")
	public ArrayList<Product> updateData(@RequestBody Product pd) {
		Product pp = new Product();
		for (Product p1 : al) {

			if (p1.pId == pd.pId) {
				pp = p1;
			}
		}
		pp.setPid(pd.pId);
		pp.setPname(pd.pName);
		pp.setpPrice(pd.pPrice);
		pp.setpCategory(pd.category);
		pp.setPcompany(pd.pCompany);
		return al;
	}

	@DeleteMapping("Delete-Data")
	public ArrayList<Product> delete(@RequestBody int pId) {
		Product pp = new Product();
		for (Product p2 : al) {

			if (p2.pId == pId) {
				pp = p2;
			}

		}

		al.remove(pp);
		return al;
	}

}
