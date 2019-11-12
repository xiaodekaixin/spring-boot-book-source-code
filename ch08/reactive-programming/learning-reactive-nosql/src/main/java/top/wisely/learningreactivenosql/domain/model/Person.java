package top.wisely.learningreactivenosql.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Document(indexName = "person")
@Document(collection = "person")
public class Person {
    @Id
    private String id;
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
