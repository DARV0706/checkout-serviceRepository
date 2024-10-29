package co.edu.unbosque.sw2.checkout_service.Feign;

import co.edu.unbosque.sw2.checkout_service.DTO.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="products-service", url = "http://localhost:8081")
@RequestMapping("/productos")
public interface ProductoFeign {
    @GetMapping("/lista")
    List<ProductDTO>getProductsById(@RequestParam List<Integer>ids);

}
