package com.imedia.ecom.domain.dtos;

import com.googlecode.jmapper.annotations.JGlobalMap;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JGlobalMap
public class CategoryDto {

	private long id;
	private String label;

}
