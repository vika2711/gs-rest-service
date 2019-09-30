package controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import items.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import service.IItemService;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private IItemService itemService;

    @GetMapping("item/{no}")
    @ApiOperation(value = "Get Item by No", notes = "${ItemController.getItemNo.notes}")
    public ResponseEntity<Item> getItemNo(
            @ApiParam(value = "${ItemController.getItemNo.no}", required = true)
            @PathVariable("no") Integer no) {

        Item item = itemService.getItemNo(no);
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }

    @GetMapping("items")
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> list = itemService.getAllItems();
        return new ResponseEntity<List<Item>>(list, HttpStatus.OK);
    }

    @PostMapping("item")
    public ResponseEntity<Void> addItem(@RequestBody Item item, UriComponentsBuilder builder) {
        boolean flag = itemService.addItem(item);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/item/{no}").buildAndExpand(item.getItemNo()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @DeleteMapping("item/{no}")
    public ResponseEntity<Void> deleteItem(@PathVariable("no") Integer no) {
        itemService.deleteItem(no);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}