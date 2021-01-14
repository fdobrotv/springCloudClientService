package com.fdobrotv.client_service.v1.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */

public class Product   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("price")
  private BigDecimal price;

  public Product id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The product identifier
   * @return id
  */
  @ApiModelProperty(example = "3afe5b11-152c-46de-963b-8655dbc8602b", readOnly = true, value = "The product identifier")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название продукта
   * @return name
  */
  @ApiModelProperty(example = "Фрукт", required = true, value = "Название продукта")
  @NotNull

@Size(min=1) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Product's price
   * minimum: 0
   * @return price
  */
  @ApiModelProperty(example = "12.15", value = "Product's price")

  @Valid
@DecimalMin("0")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.price, product.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

