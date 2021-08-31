package dio.live.shoppingcart.controller;

import dio.live.shoppingcart.model.Cart;
import dio.live.shoppingcart.model.Item;
import dio.live.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/api/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Cart> findById(@PathVariable("id") Integer id){ return cartRepository.findById(id); }



}
