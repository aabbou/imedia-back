package com.imedia.ecom.domain.dtos;

import java.util.Set;

import com.googlecode.jmapper.annotations.JGlobalMap;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JGlobalMap
public class ProductDto {

	private long id;
	private String name;
	private String description;
	private int price;
	private Set<CategoryDto> relatedCategories;

}
