package com.exampel.treirad;

public class Treirad {
    public static void main(String[] args) {
        System.out.println("Tre I Rad!");

        int x = 1;
        int o = 2;

        int ett = x;int tva = o;int tre = x;
        int fyra = x;int fem = o;int sex = o;
        int sju = o;int ata = x;int nio = x;

        if (ett + tva + tre == 3 || fyra + fem + sex == 3 || sju + ata + nio == 3
                || ett + fyra + sju == 3 || tre + sex + nio == 3 || tva + fem + ata == 3
                || ett + fem + nio == 3 || sju + fem + tre == 3) {
            System.out.println("x har vunnit");
        } else if (ett + tva + tre == 6 || fyra + fem + sex == 6 || sju + ata + nio == 6
                || ett + fyra + sju == 6 || tre + sex + nio == 6 || tva + fem + ata == 6
                || ett + fem + nio == 6 || sju + fem + tre == 6) {
            System.out.println("o har vunnit");
        } else if (ett + tva + tre + fyra + fem + sex + sju + ata + nio == 13
                || ett + tva + tre + fyra + fem + sex + sju + ata + nio == 14) {
            System.out.println("det är oavgjort");
        }
    }

}
