import spock.lang.*

class DbSingletonSpec extends Specification {
    def "asd"() {
        expect:
            Math.max(a, b) == c

        where:
            a << [3, 5, 9]
            b << [7, 4, 9]
            c << [7, 5, 9]
    }
}