package demo.service

import demo.domain.Order
import spock.lang.Specification

class EmailServiceSpec extends Specification {
    def "Runtime Exception Testing with single argument"(){
        given:"Create order instance"
        Order order = new Order()

        and: "Create Email Service instance"
        EmailService emailService = new EmailService()

        when: "Check send email"
        emailService.sendEmail(order)

        then: "Throw exception"
        thrown(RuntimeException)
    }
    def "Runtime Exception Testing with two arguments"(){
        given:"Create order instance"
        Order order = new Order()

        and: "Create a string"
        String cc = ""

        and: "Create Email Service instance"
        EmailService emailService = new EmailService()

        when: "Check send email"
        boolean checkSendEmail = emailService.sendEmail(order,cc)

        then: "return boolean"
        checkSendEmail == true
    }
}

