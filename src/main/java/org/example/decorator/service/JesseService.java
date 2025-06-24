package org.example.decorator.service;


import org.example.decorator.model.Jesse;
import org.example.decorator.new_style.INewStyleService;
import org.example.decorator.old_style.IOldStyleService;
import org.springframework.stereotype.Service;

@Service public class JesseService implements IOldStyleService<Jesse>, INewStyleService<Jesse> {

    @Override
    public void sayMyName(Jesse entity) {
        System.out.println("My name is: " + entity.getClass().getSimpleName());
    }

}
