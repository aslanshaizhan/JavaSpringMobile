package kz.iitu.courseSystem.service;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {

    public int testException() {
        throw new NullPointerException("Some exception");
    }

}
