package com.example.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.example.batch.model.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{


	@Override
	public Person process(Person person) throws Exception {
		final String firstName = person.getFirstName().toLowerCase();
		final String lastName = person.getLastName().toLowerCase();

		final Person transformedPerson = new Person(person.getPersonId(), firstName, lastName,person.getEmail(),person.getAge());

		return transformedPerson;

	}
}
