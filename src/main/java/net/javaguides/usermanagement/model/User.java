package net.javaguides.usermanagement.model;

import javax.persistence.*;

/*
 * @Entity: shows this class is JPA entity, the variables will be mapped to a database table
 * @Table: Specify the name of table in the database which this entity will be mapped
 * @Id: Marks the field as primary key for the database table
 * @GeneratedValue(strategy=GenerationType.IDENTITY): Specify how the primary key will be generated, IDENTITY means the databases will generate a new value for each insert
 * @Column: Map the field to the correspond column in the database table, allowing custom column name and its attributes
 */

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;

    @Column(name = "name")
    protected String name;

    @Column(name = "email")
    protected String email;

    @Column(name = "country")
    protected String country;

    public User() {
    }

    public User(String name, String email, String country) {
        super();
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public User(int id, String name, String email, String country) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
