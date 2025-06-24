package org.example.decorator;


import lombok.RequiredArgsConstructor;
import org.example.decorator.model.Heisenberg;
import org.example.decorator.model.Jesse;
import org.example.decorator.new_style.NewStyleDecorator;
import org.example.decorator.old_style.OldStyleDecorator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EntryPoint {

    private final OldStyleDecorator<Heisenberg> heisenbergDecorator;

    private final OldStyleDecorator<Jesse> jesseDecorator;

    private final NewStyleDecorator<Heisenberg> heisenbergNewStyleDecorator;

    private final NewStyleDecorator<Jesse> jesseNewStyleDecorator;

    public void hereWeGo() {
        Heisenberg heisenberg = new Heisenberg();
        Jesse jesse = new Jesse();
        heisenbergDecorator.doSomeThing(heisenberg);
        jesseDecorator.doSomeThing(jesse);

        heisenbergNewStyleDecorator.doSomeThing(heisenberg);
        jesseNewStyleDecorator.doSomeThing(jesse);
    }

}
