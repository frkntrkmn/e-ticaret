package com.furkan.eticaret.controller;

import com.furkan.eticaret.dto.request.MusteriSaveDto;
import com.furkan.eticaret.dto.response.MusteriFindAllDto;
import com.furkan.eticaret.dto.response.MusteriFindByName;
import com.furkan.eticaret.service.MusteriService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
@Api(value = "musteri islemleri")
public class MusteriController {
    @Autowired
    MusteriService musteriService;


    @ApiOperation(value = "musteri save")
    @PostMapping("/save")
    public ResponseEntity<Void> saveDto(@RequestBody@Valid MusteriSaveDto musteriSaveDto){
        musteriService.save(musteriSaveDto);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "musteri findall")
    @GetMapping("/finallmusteri")
    public ResponseEntity<List<MusteriFindAllDto>> musteriFindAll(){
        return ResponseEntity.ok(musteriService.musteriFindAllDtos());
    }

    @ApiOperation(value = "musteri findbyname")
    @GetMapping("/findbyname")
    public ResponseEntity<List<MusteriFindByName>> musteriFindByName(String name){
        return ResponseEntity.ok(musteriService.musteriFindByNames(name));
    }

    @ApiOperation(value = "musteri delete")
    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(long id){
        musteriService.delete(id);
        return ResponseEntity.ok().build();
    }
}
