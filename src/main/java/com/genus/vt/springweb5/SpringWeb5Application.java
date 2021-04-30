package com.genus.vt.springweb5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringWeb5Application implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(SpringWeb5Application.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringWeb5Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length != 2){
            logger.error("Parameters entered incorrectly");
        } else {
            ServiceExample serEx = new ServiceExample();
            List<String> lst = serEx.compare(args[0], args[1]);
            for (String s : lst) {
                System.out.println(s);
            }
        }
        exit(0);
    }
}
