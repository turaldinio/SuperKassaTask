package com.guluev.superkasstask.entity;

import com.guluev.superkasstask.model.UserCurrentNumber;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sk_example_table")
public class ExampleTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JdbcTypeCode(SqlTypes.JSON)
    private UserCurrentNumber obj;
}

