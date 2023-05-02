package com.examly.springapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test_case1() throws Exception {
		String newProduct = "{\"userId\":1,\"email\":\"test@gmail.com\",\"password\":\"Test@123\",\"username\":\"test123\",\"mobileNumber\":\"9876543210\",\"active\":true,\"role\":\"user\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/signup")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newProduct)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	@Test
	public void test_case2() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/home")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isArray())
				.andReturn();
	}

	@Test
	public void test_case3() throws Exception {
		String addCart = "{\"cartItemID\":101,\"userId\":1,\"productName\":\"Laptop\",\"quantity\":2,\"price\":\"200000\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/home/101")
				.contentType(MediaType.APPLICATION_JSON)
				.content(addCart)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	@Test
	void test_case4() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/cart/101")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	@Test
	public void test_case5() throws Exception {
		String addCart = "{\"orderId\":201,\"userId\":1,\"productName\":\"Laptop\",\"quantity\":2,\"totalPrice\":\"200000\",\"status\":\"OrderPlaced\",\"price\":\"200000\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/saveOrder")
				.contentType(MediaType.APPLICATION_JSON)
				.content(addCart)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	@Test
	public void test_case6() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/orders")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isArray())
				.andReturn();
	}

	@Test
	public void test_case7() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/admin")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isArray())
				.andReturn();
	}

	@Test
	public void test_case8() throws Exception {
		String addCart = "{\"productId\":301,\"imageUrl\":\"productimg\",\"productName\":\"Laptop\",\"price\":\"200000\",\"quantity\":2,\"description\":\"MACLAptop\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/admin/addproduct")
				.contentType(MediaType.APPLICATION_JSON)
				.content(addCart)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
}
