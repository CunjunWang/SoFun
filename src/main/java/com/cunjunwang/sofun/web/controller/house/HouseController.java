package com.cunjunwang.sofun.web.controller.house;

import com.cunjunwang.sofun.base.ApiResponse;
import com.cunjunwang.sofun.entity.dto.CityDTO;
import com.cunjunwang.sofun.entity.dto.SubwayDTO;
import com.cunjunwang.sofun.entity.dto.SubwayStationDTO;
import com.cunjunwang.sofun.service.ICityService;
import com.cunjunwang.sofun.service.ISubwayService;
import com.cunjunwang.sofun.service.ServiceMultiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Controller
public class HouseController {

    @Autowired
    private ICityService cityService;

    @Autowired
    private ISubwayService subwayService;

    @GetMapping("address/support/cities")
    @ResponseBody
    public ApiResponse getSupportCities() {
        ServiceMultiResult<CityDTO> result = cityService.findAllCities();
        if(result.getResultSize() == 0) {
            return ApiResponse.ofSuccess(ApiResponse.Status.NOT_FOUND);
        }
        return ApiResponse.ofSuccess(result.getResult());
    }

    /**
     * 获取对应城市支持区域列表
     * @param cityEnName
     * @return
     */
    @GetMapping("address/support/regions")
    @ResponseBody
    public ApiResponse getSupportRegions(@RequestParam(name = "city_name") String cityEnName) {
        ServiceMultiResult<CityDTO> addressResult = cityService.findAllRegionsByCityName(cityEnName);
        if (addressResult.getResult() == null || addressResult.getTotal() < 1) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_FOUND);
        }
        return ApiResponse.ofSuccess(addressResult.getResult());
    }

    /**
     * 获取具体城市所支持的地铁线路
     * @param cityEnName
     * @return
     */
    @GetMapping("address/support/subway/line")
    @ResponseBody
    public ApiResponse getSupportSubwayLine(@RequestParam(name = "city_name") String cityEnName) {
        ServiceMultiResult<SubwayDTO> subways = subwayService.findAllSubwayByCityEnName(cityEnName);
        if (subways.getResult().isEmpty()) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_FOUND);
        }

        return ApiResponse.ofSuccess(subways);
    }

    /**
     * 获取对应地铁线路所支持的地铁站点
     * @param subwayId
     * @return
     */
    @GetMapping("address/support/subway/station")
    @ResponseBody
    public ApiResponse getSupportSubwayStation(@RequestParam(name = "subway_id") Long subwayId) {
        ServiceMultiResult<SubwayStationDTO> stationDTOS = subwayService.findAllStationBySubwayId(subwayId);
        if (stationDTOS.getResult().isEmpty()) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_FOUND);
        }

        return ApiResponse.ofSuccess(stationDTOS);
    }


}
