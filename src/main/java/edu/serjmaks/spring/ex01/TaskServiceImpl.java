package edu.serjmaks.spring.ex01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.serjmaks.spring.ex01.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskService self;

    @Transactional
    public void method1() {
        self.method2();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void method2() {
        System.out.println("do something");
    }
}
