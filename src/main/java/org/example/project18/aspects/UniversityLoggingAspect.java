package org.example.project18.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @AfterThrowing(pointcut = "org.example.project18.aspects.MyPointcuts.getStudents()"
            , throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {

        System.out.println("afterThrowingGetStudentsLoggingAdvice: логирование выброс " +
                "исключения " + exception);
    }

}

