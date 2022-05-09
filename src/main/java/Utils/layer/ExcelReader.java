package Utils.layer;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook sheet;
public ExcelReader(String path) {
	File f=new File("path");
	try {
		FileInputStream fs=new FileInputStream(f);
					 sheet=new XSSFWorkbook(fs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getdata(int index,int row,int cell)
	{
	String data=sheet.getSheetAt(index).getRow(row).getCell(cell).getStringCellValue();
	return data;
	}
	public int getrowcount(int index) {
		int rows=sheet.getSheetAt(index).getLastRowNum();
		return rows;
	}
	public int getcellcount(int index) {
		int cell=sheet.getSheetAt(index).getRow(0).getLastCellNum();
		return cell;
	}
		}

