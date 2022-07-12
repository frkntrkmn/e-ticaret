package com.furkan.eticaret.controller;

import com.furkan.eticaret.dto.request.MusteriSaveDto;
import com.furkan.eticaret.service.MusteriService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
}
