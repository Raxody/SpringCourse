package com.spring.springCourse.persistence.mapper;

import com.spring.springCourse.domain.Category;
import com.spring.springCourse.persistence.entity.Categoria;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estado", target = "active")
    })

    Category toCategory(Categoria categoria);
}
