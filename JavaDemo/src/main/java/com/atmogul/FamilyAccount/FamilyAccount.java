package com.atmogul.FamilyAccount;

public class FamilyAccount {
    public static void main(String[] args) {

        int balance = 10000; // 起始金额
        String details = "收支\t账户金额\t收支金额\t说 明\n";

        boolean loopFlag = true;
        do {
        /**
         *  主界面
         */
        System.out.println("\n------------------------家庭收支记账软件------------------------\n");
        System.out.println("                           1  收支明细");
        System.out.println("                           2  登记明细");
        System.out.println("                           3  登记支出");
        System.out.println("                           4  退   出\n");
        System.out.print("                           请选择（1-4）：");

        /**
         * 加入选择结构
         */
        char menuSelection = Utility.readMenuSelection();
        switch (menuSelection){
            // 收支明细
            case '1':
                System.out.println("--------------当前收支明细记录--------------");
                System.out.println(details);
                System.out.println("----------------------------");
                break;
            // 登记收入
            case '2':
                System.out.println("请输入收入金额：");
                int amount1 = Utility.readNumber();
                System.out.println("请输入收入说明：");
                String info1 = Utility.readString();

                balance += amount1;
                details += "收入" + "\t" + balance+ "\t" + amount1 + "\t" + info1 + "\n";
                System.out.println("----------登记完成----------");
                break;
            // 登记支出
            case '3':
                System.out.println("请输入支出金额：");
                int amount2 = Utility.readNumber();
                System.out.println("请输入支出说明：");
                String info2 = Utility.readString();

                balance += amount2;
                details += "支出" + "\t" + balance+ "\t" + amount2 + "\t" + info2 + "\n";
                System.out.println("----------登记完成----------");
                break;
            // 退 出
            case '4':
                System.out.println("确认是否退出（Y/N）：");
                char YN = Utility.readConfirmSelection();
                if (YN == 'Y'){
                    loopFlag = false;
                }
                break;

            }
        }
        /**
         *  加入循环功能
         */
        while (loopFlag);
    }
}
