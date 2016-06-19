package com.company.Patterns.Adapter.adapter;

import java.util.Iterator;
import java.util.List;
import com.company.Patterns.Adapter.objects.Printer;

// адаптер, который совмещает желание клиента и возможности принтера
public class PrinterAdapter implements PageListPrinter{

    private Printer printer = new Printer();
    
    @Override
    public void print(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
       /* for (String text : list) {
            printer.print(text);            
        }*/
    }
 
}
