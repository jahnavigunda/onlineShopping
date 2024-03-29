package com.onlineshopping.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "product")
@ApiModel("Contains all attributes required under Product entity")
public class Product {
    @Id
    @ApiModelProperty("Unique Id of the product generated by System")
    private String id;
    @NotNull(message = "Product Name should not be null")
    @ApiModelProperty("Name of the product")
    private String name;
    @NotNull(message = "Category of product should not be null")
    private Category category;
    @Min(0)
    private double price;
    private String currency;
    @Max(100)
    private double discount;
    private String discountDescription;
    @ApiModelProperty("List of URLs of product images")
    private List<String> imageURLs;


}
