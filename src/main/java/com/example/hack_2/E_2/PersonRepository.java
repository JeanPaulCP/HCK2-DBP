//import com.example.hack_2.E_2.Person;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//package com.example.hack_2.E_2;
//
//@Repository
//public interface PersonRepository extends JpaRepository<Person, Long> {
//}

package com.example.hack_2.E_2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
