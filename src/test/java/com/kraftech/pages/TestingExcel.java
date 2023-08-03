package com.kraftech.pages;

import com.kraftech.utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TestingExcel {
    public static void main(String[] args) {
        ExcelUtil excelUtil=new ExcelUtil("src/test/resources/KT_B4 DDF test.xlsx","QA 1");
        List<Map<String, String>> dataList = excelUtil.getDataList();
        System.out.println(dataList);

        System.out.println("excelUtil.getCellData(3,3) = " + excelUtil.getCellData(3, 3));
        System.out.println("dataList.get(3).get(\"job\") = " + dataList.get(3).get("job"));
        System.out.println("dataList.get(2).get(\"job\") = " + dataList.get(2).get("job"));
        System.out.println("dataList.get(1).get(\"job\") = " + dataList.get(1).get("job"));


    }

}
