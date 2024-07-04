package org.example.behavioral.visitor.visitor;

import org.example.behavioral.visitor.objectStructure.Widget;
import org.example.behavioral.visitor.objectStructure.WidgetAssembly;

public interface ComponentVisitor {

    void visit(Widget w);

    void visit(WidgetAssembly wa);

}
