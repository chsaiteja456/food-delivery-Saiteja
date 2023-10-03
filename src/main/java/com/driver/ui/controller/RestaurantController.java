package com.restaurant.ui.controller;

import java.util.List;

import com.restaurant.model.request.MenuItemRequestModel;
import com.restaurant.model.response.OperationStatusModel;
import com.restaurant.model.response.MenuItemResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class RestaurantController {

    @GetMapping(path = "/{itemId}")
    public MenuItemResponse getMenuItem(@PathVariable String itemId) throws Exception {
        // Logic to retrieve a menu item by ID
        return null;
    }

    @PostMapping()
    public MenuItemResponse createMenuItem(@RequestBody MenuItemRequestModel menuItemDetails) throws Exception {
        // Logic to create a new menu item
        return null;
    }

    @PutMapping(path = "/{itemId}")
    public MenuItemResponse updateMenuItem(@PathVariable String itemId, @RequestBody MenuItemRequestModel menuItemDetails) throws Exception {
        // Logic to update an existing menu item
        return null;
    }

    @DeleteMapping(path = "/{itemId}")
    public OperationStatusModel deleteMenuItem(@PathVariable String itemId) throws Exception {
        // Logic to delete a menu item
        return null;
    }

    @GetMapping()
    public List<MenuItemResponse> getMenuItems() {
        // Logic to retrieve all menu items
        return null;
    }
}
