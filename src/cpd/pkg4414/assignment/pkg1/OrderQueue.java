/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd.pkg4414.assignment.pkg1;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Queue;

/**
 *
 * @author c0647456
 */
public class OrderQueue {
    Queue<Order> oQueue = new ArrayDeque<>();
    
    public void add(Order o){
        oQueue.add(o);
        o.setTimeRecieved(new Date());
    }
    
    
}
