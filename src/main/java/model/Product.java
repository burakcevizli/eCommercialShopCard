package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.util.*;

public class Product {

    private Long id;

    private String name;

    private String brand;

    private BigDecimal price;

    private int inventory;

    private String description;

    private Category category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true) // bi product silindiğinde hiç imagesi yoksa direkt silinmesini sağlıyor. orphanRemoval...
    private List<Image> images;
}
