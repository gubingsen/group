package com.three.memory.util;

import com.three.memory.constant.SystemCon;
import com.three.memory.vo.ResultBean;

import java.util.List;

public class ResultUtil {

    //操作成功
    public static ResultBean setOK(String msg, Object data){
        ResultBean resultBean=new ResultBean();
        resultBean.setCode(SystemCon.ROK);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }

    public static ResultBean setOKToken(Object token, Object data, String msg){
        ResultBean resultBean=new ResultBean();
        resultBean.setCode(SystemCon.ROK);
        resultBean.setData(data);
        resultBean.setToken(token);
        resultBean.setMsg(msg);
        return resultBean;
    }

    //操作失败
    public static ResultBean setError(int code,String msg,Object data){
        ResultBean resultBean=new ResultBean();
        resultBean.setCode(code);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }

    //非查询操作
    public static ResultBean execOp(int count,String msg){
        if(count>0){
            return setOK(msg+"成功",null);
        }else{
            return setError(SystemCon.RERROR1,msg+"失败",null);
        }
    }

    //封装分页信息
    public static ResultBean setPage(Object token, Object data, String msg, List list, long total,
                                     int pages, int pageNum, int pageSize) {
        ResultBean resultBean=new ResultBean();
        resultBean.setCode(SystemCon.ROK);
        resultBean.setData(data);
        resultBean.setToken(token);
        resultBean.setMsg(msg);
        resultBean.setList(list);
        resultBean.setCount(total);
        resultBean.setPages(pages);
        resultBean.setPageNum(pageNum);
        resultBean.setPageSize(pageSize);
        return resultBean;
    }

    public static int getPageNum(Integer pageNum) {
        if (pageNum == null) {
            pageNum = SystemCon.PAGENUM;
        }

        return pageNum;
    }

    public static int getPageSize(Integer pageSize) {
        if (pageSize == null) {
            pageSize = SystemCon.PAGESIZE;
        }

        return pageSize;
    }
}