package com.imedia.ecom.domain.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_PRODUCT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "PRODUCT_NAME", length = 100, nullable = false)
	private String name;

	@Column(name = "PRODUCT_DESCRIPTION", length = 1000, nullable = true)
	private String description;

	@Column(name = "PRODUCT_PRICE", nullable = false)
	private int price;

	@Column(name = "PRODUCT_CURRENCY", nullable = false)
	private String currency;

	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "T_PRODUCT_CATEGORY", joinColumns = @JoinColumn(name = "PRODUCT_ID"), inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"))
	private Set<Category> relatedCategories = new HashSet<Category>();

	public void addCategory(Category category) {
		relatedCategories.add(category);
		category.getRelatedProducts().add(this);
	}

	public void removeCategory(Category category) {
		relatedCategories.remove(category);
		category.getRelatedProducts().remove(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Product))
			return false;
		return id != null && id.equals(((Product) o).getId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

}
