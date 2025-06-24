package org.example.decorator.new_style;


import org.example.decorator.model.IEntity;

public interface INewStyleService<T extends IEntity> {

    void sayMyName(T entity);

}
