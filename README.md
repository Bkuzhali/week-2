# week-2

| Aspect | **JPA (Java Persistence API)** | **Hibernate** | **Spring Data JPA** |
| --- | --- | --- | --- |
| **Type** | Specification (part of Jakarta EE) | ORM framework (implements JPA) | Abstraction layer built on JPA |
| **Purpose** | Defines standard APIs for ORM | Provides actual ORM functionality | Simplifies JPA usage with repositories |
| **Package** | ``javax.persistence`` / ``jakarta.persistence`` | ``org.hibernate`` | ``org.springframework.data.jpa`` |
| **Role** | Sets rules for mapping Java objects to DB tables | Maps Java objects to DB tables, manages SQL | Provides repository interfaces, auto query generation |
| **Flexibility** | Vendor-independent, can switch providers | Specific implementation with extra features | Works with any JPA provider (Hibernate, EclipseLink, etc.) |
| **Query Language** | JPQL (Java Persistence Query Language) | HQL (Hibernate Query Language) + JPQL | Derived queries from method names, JPQL, native queries |
| **Features** | Standard annotations (``@Entity``, ``@Id``, ``@Table``) | Advanced caching, batch processing, dialect support | Auto-implemented repositories, reduces boilerplate code |
| **Usage** | Needs an implementation (Hibernate, EclipseLink) | Can be used standalone or via JPA | Requires a JPA provider underneath (commonly Hibernate) |
