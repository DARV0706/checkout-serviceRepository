package co.edu.unbosque.sw2.checkout_service.Feign;

import co.edu.unbosque.sw2.checkout_service.DTO.ProductDTO;
import co.edu.unbosque.sw2.checkout_service.DTO.ProductoResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="products-service")
public interface ProductoFeign {
    @GetMapping("productos/lista")
    ProductoResponseDTO getProductsById(@RequestParam List<Integer> ids);
}
