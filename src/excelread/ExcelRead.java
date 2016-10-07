/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelread;

import java.io.File;
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
        File f = new File("D:\\data1.xls");
        
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s= wb.getSheet(0);
        int row = s.getRows();
        int col = s.getColumns();
        
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) { 
                Cell c = s.getCell(j, i);
                System.out.print(c.getContents()+"\t");
                
            }
            System.out.println("");
            
        }
        
    }
    
}
