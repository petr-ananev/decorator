package org.example.decorator.old_style;

import lombok.RequiredArgsConstructor;
import org.example.decorator.model.IEntity;

@RequiredArgsConstructor
public class OldStyleDecorator<T extends IEntity> {

    private final IOldStyleService<T> service;

    //Example when model passed.
    public void doSomeThing(T entity) {
        service.sayMyName(entity);
    }

}
