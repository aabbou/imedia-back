package com.imedia.ecom.domain.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_CATEGORY")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
@NoArgsConstructor
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@NaturalId
	@Column(name = "CATEGORY_LABEL", length = 100)
	private String label;

	@Column(name = "CATEGORY_DESCRIPTION", length = 1000)
	private String description;

	@ManyToMany(mappedBy = "relatedCategories", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Product> relatedProducts = new HashSet<Product>();;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Category tag = (Category) o;
		return Objects.equals(label, tag.label);
	}

	@Override
	public int hashCode() {
		return Objects.hash(label);
	}

}
