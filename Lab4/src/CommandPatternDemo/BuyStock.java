/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPatternDemo;

/**
 *
 * @author yochida2015
 */
public class BuyStock implements Order{
    private Stock stock(){return null;}
    public BuyStock(){}
    @Override
    public void execute(){}
}
