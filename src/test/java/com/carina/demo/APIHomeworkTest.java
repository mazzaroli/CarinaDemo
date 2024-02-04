package com.carina.demo;

import com.carina.demo.api.products.*;
import com.jayway.jsonpath.JsonPath;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import io.restassured.response.Response;
import org.testng.annotations.Test;

/**
 * Test class for API homework.
 */
public class APIHomeworkTest implements IAbstractTest {

    /**
     * Test method to get product information.
     */
    @Test
    @MethodOwner(owner = "carlitos")
    public void getProductTest() {
        // Create a GetProduct instance and set the index
        GetProduct getProduct = new GetProduct();
        getProduct.setIndex(99);

        // Call the API and expect success
        Response response = getProduct.callAPIExpectSuccess();

        // Validate the response against the specified schema
        getProduct.validateResponseAgainstSchema("api/products/_get/rs.schema");

        // Extract and print specific information from the response using JsonPath
        // Uncomment the line below if needed
        // System.out.println("#############" + JsonPath.from(response.asString()).getString("id,description"));

        // Example of using JsonPath to read a specific attribute from the response
        JsonPath.read(response.asString(), "$.id");
    }

    /**
     * Test method to post a new product.
     */
    @Test
    @MethodOwner(owner = "carlitos")
    public void postProductTest() {
        // Create a PostProduct instance and set properties from a file
        PostProduct postProduct = new PostProduct();
        postProduct.setProperties("api/products/product.properties");

        // Call the API and expect success
        postProduct.callAPIExpectSuccess();

        // Validate the response
        postProduct.validateResponse();
    }

    /**
     * Test method to delete a product.
     */
    @Test
    @MethodOwner(owner = "carlitos")
    public void deleteProductTest() {
        // Create a DeleteProduct instance and set the index and properties from a file
        DeleteProduct deleteProduct = new DeleteProduct();
        deleteProduct.setIndex(99);
        deleteProduct.setProperties("api/products/product.properties");

        // Call the API and expect success
        deleteProduct.callAPIExpectSuccess();

        // Validate the response against the specified schema
        deleteProduct.validateResponseAgainstSchema("api/products/_delete/rs.json");
    }

    /**
     * Test method to update a product using PUT request.
     */
    @Test
    @MethodOwner(owner = "carlitos")
    public void putProductTest() {
        // Create a PutProduct instance and set the index and properties from a file
        PutProduct putProduct = new PutProduct();
        putProduct.setIndex(99);
        putProduct.setProperties("api/products/product.properties");

        // Call the API and expect success
        putProduct.callAPIExpectSuccess();

        // Validate the response against the specified schema
        putProduct.validateResponseAgainstSchema("api/products/_put/rs.schema");
    }

    /**
     * Test method to partially update a product using PATCH request.
     */
    @Test
    @MethodOwner(owner = "carlitos")
    public void patchProductTest() {
        // Create a PatchProduct instance and set the index and properties from a file
        PatchProduct patchProduct = new PatchProduct();
        patchProduct.setIndex(1);
        patchProduct.setProperties("api/products/_patch/product.properties");

        // Call the API and expect success
        patchProduct.callAPIExpectSuccess();

        // Validate the response against the specified schema
        patchProduct.validateResponseAgainstSchema("api/products/_put/rs.schema");
    }
}