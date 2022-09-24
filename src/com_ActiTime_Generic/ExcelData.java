package com_ActiTime_Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String file_path, String sheet_name, int rn, int cn)
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(file_path));
			String data=WorkbookFactory.create(file).getSheet(sheet_name).getRow(rn).getCell(cn).toString();
			return data;
		}
		catch(Exception e)
		{
			return null;//becz return type is String
		}		
	}
	public static int getRowCount(String file_path, String sheet_name)
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(file_path));
			int rc=WorkbookFactory.create(file).getSheet(sheet_name).getLastRowNum();
			return rc;
		}
		catch (Exception e)
		{
			return 0;//Becz return type is int
		}
	} 
	public static int getCellCount(String file_path, String sheet_name, int rn)//rn is RowNum
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(file_path));
			int cc=WorkbookFactory.create(file).getSheet(sheet_name).getRow(rn).getLastCellNum();
			return cc;
		}
	catch(Exception e)
	{
		return 0;
	}
}

