package lk.ijse.gdse.shenan.logs.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    String getLog() {
        logger.debug("This is DEBUG Log Massage");
        logger.info("This is INFO Log Massage");
        logger.warn("This is WARN Log Massage");
        logger.error("This is ERROR Log Massage");

        try {
            throw new RuntimeException("Hello.... I'm Exception");
        } catch (RuntimeException e) {
            logger.error("You have RuntimeException : {}", e.getMessage());
        }

        return "Log massages generated!";
    }

}
