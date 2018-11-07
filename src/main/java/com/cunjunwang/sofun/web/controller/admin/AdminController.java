package com.cunjunwang.sofun.web.controller.admin;

import com.cunjunwang.sofun.base.ApiResponse;
import com.cunjunwang.sofun.entity.dto.CityDTO;
import com.cunjunwang.sofun.entity.dto.HouseDTO;
import com.cunjunwang.sofun.entity.po.SupportCity;
import com.cunjunwang.sofun.entity.vo.AddHouseVO;
import com.cunjunwang.sofun.service.ICityService;
import com.cunjunwang.sofun.service.IHouseService;
import com.cunjunwang.sofun.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by CunjunWang on 2018/11/4.
 */
@Controller
public class AdminController {

    @Autowired
    private ICityService cityService;

    @Autowired
    private IHouseService houseService;

    @GetMapping("/admin/center")
    public String adminCenterPage() {
        return "admin/center";
    }

    @GetMapping("/admin/welcome")
    public String adminWelcomePage() {
        return "admin/welcome";
    }

    @GetMapping("/admin/login")
    public String adminLoginPage() {
        return "admin/login";
    }

    @GetMapping("admin/add/house")
    public String addHousePage() {
        return "admin/house-add";
    }

    @PostMapping(value = "admin/upload/photo", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    public ApiResponse uploadPhoto(@RequestParam("file") MultipartFile file) {
        if(file.isEmpty()) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_VALID_ERROR);
        }
        String fileName = file.getOriginalFilename();
        File target = new File("/Users/CunjunWang/Desktop/SoFun/tmp/" + fileName);
        try {
            file.transferTo(target);
        } catch (IOException e) {
            e.printStackTrace();
            return ApiResponse.ofStatus(ApiResponse.Status.INTERNAL_SERVER_ERROR);
        }
        return ApiResponse.ofSuccess(null);
    }

    @PostMapping("admin/add/house")
    @ResponseBody
    public ApiResponse addHouse(@Valid @ModelAttribute("form-house-add")
                                AddHouseVO addHouseVO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ApiResponse(HttpStatus.BAD_REQUEST.value(),
                    bindingResult.getAllErrors().get(0).getDefaultMessage(), null);
        }

        Map<SupportCity.CityLevel, CityDTO> cityDTOMap = cityService.findCityAndRegion(addHouseVO.getCityEnName(), addHouseVO.getRegionEnName());
        if(cityDTOMap.keySet().size() != 2) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_VALID_ERROR);
        }

        ServiceResult<HouseDTO> result = houseService.save(addHouseVO);
        if(result.isSuccess()) {
            return ApiResponse.ofSuccess(result.getResult());
        }

        return ApiResponse.ofSuccess(ApiResponse.Status.NOT_VALID_ERROR);
    }

}
