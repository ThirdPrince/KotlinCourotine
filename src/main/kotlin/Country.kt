fun main() {

    val country1 = Country("1", "EU", 333)
    val country2 = Country("2", "EU", 30000)
    val country3 = Country("3", "EU", 33)
    val country4 = Country("4", "EU", 22)
    val countryList = mutableListOf<Country>(country1, country2, country3, country4)

    val newCountry = filterCountries(countryList) {
        it.continient == "EU" && it.population > 10000
    }
    println(newCountry)


}

data class Country(val name: String, val continient: String, val population: Int)

fun filterCountries(countries: List<Country>, test: (Country) -> Boolean): List<Country> {
    val res = mutableListOf<Country>()
    for (c in countries) {
        if (test(c)) {
            res.add(c)
        }
    }
    return res
}

fun isBigEuropeanCountry(country: Country): Boolean {
    return country.continient == "EU" && country.population > 10000
}

class CountryApp {
    fun filterCountries(countries: List<Country>): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continient == "EU") {
                res.add(c)
            }
        }
        return res
    }
}

class CountryTest {
    fun isBigEuropeanCountry(country: Country): Boolean {
        return country.continient == "EU" && country.population > 10000
    }
}

