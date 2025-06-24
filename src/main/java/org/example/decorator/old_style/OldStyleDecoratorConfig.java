package org.example.decorator.old_style;


import org.example.decorator.model.Heisenberg;
import org.example.decorator.model.Jesse;
import org.example.decorator.service.HeisenbergService;
import org.example.decorator.service.JesseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OldStyleDecoratorConfig {

    @Bean
    public OldStyleDecorator<Heisenberg> oldStyleHeisenbergService(HeisenbergService heisenbergService) {
        return new OldStyleDecorator<>(heisenbergService);
    }

    @Bean
    public OldStyleDecorator<Jesse> oldStyleJesseService(JesseService jesseService) {
        return new OldStyleDecorator<>(jesseService);
    }

}
