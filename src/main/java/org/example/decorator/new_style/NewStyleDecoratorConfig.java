package org.example.decorator.new_style;


import org.example.decorator.model.Heisenberg;
import org.example.decorator.model.IEntity;
import org.example.decorator.old_style.IOldStyleService;
import org.example.decorator.old_style.OldStyleDecorator;
import org.example.decorator.service.HeisenbergService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.ResolvableType;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class NewStyleDecoratorConfig {


    @Bean
    public <T extends IEntity> Map<String, INewStyleService<T>> serviceMap(Collection<INewStyleService<T>> services) {
        return services.stream()
                       .collect(Collectors.toMap(service ->
                                                         resolveGenericType(service, 0, INewStyleService.class),
                                                 Function.identity()));
    }

    private <T> String resolveGenericType(Object object, int index, Class<T> tClass) {
        return ResolvableType.forClass(tClass, object.getClass())
                             .getGenerics()[index].resolve()
                                                  .getSimpleName();
    }

}
