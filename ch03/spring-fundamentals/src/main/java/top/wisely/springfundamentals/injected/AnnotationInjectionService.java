package top.wisely.springfundamentals.injected;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wisely.springfundamentals.beans.annotated.ScopeService;
import top.wisely.springfundamentals.beans.annotated.SomeService2;
import top.wisely.springfundamentals.beans.annotated.SomeService;

@Service
public class AnnotationInjectionService {
    private SomeService someService;

    private SomeService2 someService2;

//    @Autowired
    public AnnotationInjectionService(SomeService someService,SomeService2 someService2) {
        this.someService = someService;
        this.someService2 = someService2;
    }

    public void doMyThing(){
        someService.doSomething();
        someService2.doSomething();
    }
}
