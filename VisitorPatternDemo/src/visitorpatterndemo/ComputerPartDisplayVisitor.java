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
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void Visit(Computer computer){}
    @Override
    public void Visit(Mouse mouse){}
    @Override
    public void Visit(Keyboard keyboard){}
    @Override
    public void Visit(Monitor monitor){}
}
