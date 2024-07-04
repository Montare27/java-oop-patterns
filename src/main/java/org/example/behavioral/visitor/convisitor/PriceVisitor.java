package org.example.behavioral.visitor.convisitor;

import org.example.behavioral.visitor.objectStructure.Widget;
import org.example.behavioral.visitor.objectStructure.WidgetAssembly;
import org.example.behavioral.visitor.visitor.ComponentVisitor;

public class PriceVisitor implements ComponentVisitor {

    private double maxPrice;

    public PriceVisitor(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public void visit(Widget w) {
        double price = w.getPrice();
        if (price > this.maxPrice)
            System.out.println("Do not buy! Widget " + w.getName() + " price " + price + " exceeds max price (" + this.maxPrice + ").");
        else
            System.out.println("Buy! Widget " + w.getName() + " price " + price + " is less then max price (" + this.maxPrice + ").");
    }

    @Override
    public void visit(WidgetAssembly wa) {
        double price = wa.getPrice();
        if (price > this.maxPrice)
            System.out.println("Do not buy! WidgetAssembly " + wa.getName() + " price " + price + " exceeds max price (" + this.maxPrice + ").");
        else
            System.out.println("Buy! WidgetAssembly " + wa.getName() + " price " + price + " is less then max price (" + this.maxPrice + ").");
    }
}
