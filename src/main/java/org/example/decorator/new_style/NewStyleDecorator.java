package org.example.decorator.new_style;

import lombok.RequiredArgsConstructor;
import org.example.decorator.model.IEntity;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
@RequiredArgsConstructor
public class NewStyleDecorator<T extends IEntity>  {

    private final Map<String, INewStyleService<T>> serviceMap;

    public void doSomeThing(T entity) {
        serviceMap.get(entity.getClass().getSimpleName()).sayMyName(entity);
    }

}
