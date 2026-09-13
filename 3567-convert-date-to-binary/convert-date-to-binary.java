class Solution {
    public String convertDateToBinary(String date) {
        String[] st = date.split("-");
        int year = Integer.parseInt(st[0]);
        int month = Integer.parseInt(st[1]);
        int day = Integer.parseInt(st[2]);

        String sty = Integer.toBinaryString(year);
        String stm = Integer.toBinaryString(month);
        String std = Integer.toBinaryString(day);

        return sty + '-' + stm + '-' + std;
    }
}