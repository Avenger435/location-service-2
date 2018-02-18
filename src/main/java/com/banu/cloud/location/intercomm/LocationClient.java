package com.banu.cloud.location.intercomm;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banu.cloud.location.model.*;

@FeignClient("location-service")
public interface LocationClient {

	@RequestMapping(method = RequestMethod.GET, value = "/location/{city}")
	List<Location> findbyCity(@PathVariable("city") String city);
}
