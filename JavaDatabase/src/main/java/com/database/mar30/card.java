package com.database.mar30;

public class card {
    public static void main(String[] args) {
        // 测试用例：替换成你的M1卡16进制卡号即可
        // 支持格式：纯16进制、带空格、大小写混合（如 1A 2B 3C 4D、1a2b3c4d）
        String hexCardNumber = "31 B2 B5 1C";

        // 调用转换方法
        long decimalNumber = hexToDecimal(hexCardNumber);

        // 输出结果
        System.out.println("M1卡16进制卡号：" + hexCardNumber);
        System.out.println("M1卡10进制卡号：" + decimalNumber);
    }

    /**
     * M1卡16进制卡号 转 10进制
     * @param hexStr 16进制卡号（支持空格、大小写）
     * @return 10进制卡号（long类型，避免溢出）
     */
    public static long hexToDecimal(String hexStr) {
        // 1. 预处理：去除所有空格、转大写（统一格式）
        String cleanHex = hexStr.replaceAll(" ", "").toUpperCase();

        // 2. 校验：是否为合法16进制字符串
        if (!cleanHex.matches("[0-9A-F]+")) {
            throw new IllegalArgumentException("非法的M1卡16进制卡号：" + hexStr);
        }

        // 3. 转换：16进制转10进制（Long.parseLong支持大数值，避免int溢出）
        return Long.parseLong(cleanHex, 16);
    }
}