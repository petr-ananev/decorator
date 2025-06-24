package org.example.decorator.service;


import org.example.decorator.model.Heisenberg;
import org.example.decorator.new_style.INewStyleService;
import org.example.decorator.old_style.IOldStyleService;
import org.springframework.stereotype.Service;

@Service
public class HeisenbergService implements IOldStyleService<Heisenberg>, INewStyleService<Heisenberg> {

    @Override
    public void sayMyName(Heisenberg entity) {
        System.out.println("My name is: " + entity.getClass().getSimpleName());
    }

}
