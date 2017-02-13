/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpatterndemo;

/**
 *
 * @author yochida2015
 */
public interface ComputerPartVisitor {
    public void Visit(Computer computer);
    public void Visit(Mouse mouse);
    public void Visit(Keyboard keyboard);
    public void Visit(Monitor monitor);
}
