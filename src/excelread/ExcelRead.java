/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelread;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 *
 * @author amir
 */
public class ExcelRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        File f = new File("D:\\data1.xls"); // data source
        List<String> list = new ArrayList<>();
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s= wb.getSheet(0);
        int row = s.getRows();
        int col = s.getColumns();
   
        for (int i = 1; i < row; i++) {
                 int countt=0;
            for (int j = 1; j < col; j++) { 
                Cell c = s.getCell(j, i);
                
                String st=c.getContents();
                System.out.print(c.getContents()+"\t");
                list.add(st);
              //  System.out.println(st);
                if (st.equals("1")) {
                    countt++;
                     
                }
                
            }
           System.out.println("Item List"+i+":"+countt);
            System.out.println("");
           
            
          
        }
            
           
        }
           
}
