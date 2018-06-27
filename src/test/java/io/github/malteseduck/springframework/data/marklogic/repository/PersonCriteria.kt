package io.github.malteseduck.springframework.data.marklogic.repository

import com.marklogic.client.query.StructuredQueryBuilder.Operator.*
import io.github.malteseduck.springframework.data.marklogic.core.Person
import io.github.malteseduck.springframework.data.marklogic.core.query.*
import io.github.malteseduck.springframework.data.marklogic.core.query.QueryCriteria
import java.time.Instant

data class PersonCriteria(
    @Word
    var name: String? = null,

    var age: Int? = null,

    @Range(field = "age", operator = GT)
    var olderThan: Int? = null,

    @Range(field = "age", operator = LT)
    var youngerThan: Int? = null,

    var gender: String? = null,

    @Word
    var occupation: String? = null,

    @Word
    var description: String? = null,

    var birthtime: Instant? = null,

    @Range(field = "birthtime", operator = GT)
    var bornAfter: Instant? = null,

    var hobbies: String? = null,

    @Word(field = "pets.name")
    var pets: String? = null

) : QueryCriteria<Person>()
