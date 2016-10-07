/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excelread;

import java.io.File;
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
        File f = new File("");
        
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s= wb.getSheet(0);
        
    }
    
}
