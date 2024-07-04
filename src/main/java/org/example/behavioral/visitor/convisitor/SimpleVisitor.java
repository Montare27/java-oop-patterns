package org.example.behavioral.visitor.convisitor;

import org.example.behavioral.visitor.objectStructure.Widget;
import org.example.behavioral.visitor.objectStructure.WidgetAssembly;
import org.example.behavioral.visitor.visitor.ComponentVisitor;

public class SimpleVisitor implements ComponentVisitor {

    @Override
    public void visit(Widget w) {
        System.out.println("Visiting Widget " + w.getName());
    }

    @Override
    public void visit(WidgetAssembly wa) {
        System.out.println("Visiting WidgetAssembly " + wa.getName());
    }

}
