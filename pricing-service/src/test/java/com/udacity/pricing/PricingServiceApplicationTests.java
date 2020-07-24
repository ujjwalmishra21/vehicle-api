package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import org.aspectj.util.LangUtil;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
//@SpringBootTest
//@WebMvcTest(PricingController.class)
public class PricingServiceApplicationTests {
//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private PricingService pricingService;
//
////	@Test
////	public void getPrice() throws Exception {
////		mockMvc.perform(MockMvcRequestBuilders.get("/service/price?vehicleId=1"))
////				.andExpect(MockMvcResultMatchers.status().isOk());
//////				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
//////				.andExpect(MockMvcResultMatchers.content().json("[]"));
////
//////		Mockito.verify(pricingService,Mockito.times(1)).get();
////	}
	@Test
	public void getStaticPrice() throws PriceException {
		Assert.assertNotNull(PricingService.getPrice((long) 1));
//		Assert.assert(new PriceException("Cannot find price for Vehicle 1"), PricingService.getPrice());
//		Assertions.assertThatExceptionOfType(PriceException.class);
	}


}
