package org.example.decorator.old_style;

import org.example.decorator.model.IEntity;

public interface IOldStyleService<T extends IEntity> {

    void sayMyName(T entity);

}
