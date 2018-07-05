package com.hzwusibio.koltindemo01.model

/**
 * 可变参数
 */

class Persons {

    /**
     * 可变参数  前面加vararg
     */
    fun addPersons(vararg persons: Person): List<Person> {
        val result = ArrayList<Person>()
        for (person in persons) {
            result.add(person)
        }
        return result
    }

}