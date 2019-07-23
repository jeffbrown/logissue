package logdemo

import groovy.util.logging.Slf4j

@Slf4j
class MySuperclass {

    void testMethod() {
        def test = [1, 2, 3]
        test.each {it ->
            log.info("gab" + it)
            def test2 = [4,5,6]
            test2.each {
                MySuperclass.log.info("" + it)
            }
        }
    }
}