package com.atmogul.CustomerApp;

/**
 * 对象的管理模块
 */
public class CustomerList {

    private Customer[] customers ;// 用来保存客户对象的数组
    private int total = 0  ;      // 记录已保存客户对象的数量


    /**
     *  构造器，用来初始化customers数组
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer){
         customers = new Customer[totalCustomer];
    }

    /**
     * 将参数customer添加到数组中最后一个客户对象记录之后
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * 用参数customer替换数组中由index指定的对象
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust){
        if (index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 从数组中删除参数index指定索引位置的客户对象记录
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index){
        if (index < 0 || index >= total){
            return false;
        }
        for (int i = 0; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * 返回数组中记录的所有客户对象
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 返回参数index指定索引位置的客户对象记录
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    public int getTotal(){
        return total;
    }


}
