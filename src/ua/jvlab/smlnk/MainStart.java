/*
* This class displays the disposition of the apartment (entrance, floor)
* Quartile number is user-defined
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
 * @author Sergey Melnyk
 * @date 04.01.2018
 * @version 1.0.0
 */
public class MainStart {

    /**
     * @param args the command line arguments
     */
    int entrance;
    int apartment;

    public static void main(String[] args) {
        String floor;
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите № квартиры:");
        int apartment = sc.nextInt();
       
        switch (apartment) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 37:
            case 38:
            case 39:
            case 40:
            case 73:
            case 74:
            case 75:
            case 76:
            case 109:
            case 110:
            case 111:
            case 112:
                floor = "1 этаже";
                break;

            case 5:
            case 6:
            case 7:
            case 8:
            case 41:
            case 42:
            case 43:
            case 44:
            case 77:
            case 78:
            case 79:
            case 80:
            case 113:
            case 114:
            case 115:
            case 116:
                floor = "2 этаже";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
            case 45:
            case 46:
            case 47:
            case 48:
            case 81:
            case 82:
            case 83:
            case 84:
            case 117:
            case 118:
            case 119:
            case 120:
                floor = "3 этаже";
                break;

            case 13:
            case 14:
            case 15:
            case 16:
            case 49:
            case 50:
            case 51:
            case 52:
            case 85:
            case 86:
            case 87:
            case 88:
            case 121:
            case 122:
            case 123:
            case 124:
                floor = "4 этаже";
                break;

            case 17:
            case 18:
            case 19:
            case 20:
            case 53:
            case 54:
            case 55:
            case 56:
            case 89:
            case 90:
            case 91:
            case 92:
            case 125:
            case 126:
            case 127:
            case 128:
                floor = "5 этаже";
                break;

            case 21:
            case 22:
            case 23:
            case 24:
            case 57:
            case 58:
            case 59:
            case 60:
            case 93:
            case 94:
            case 95:
            case 96:
            case 129:
            case 130:
            case 131:
            case 132:
                floor = "6 этаже";
                break;

            case 25:
            case 26:
            case 27:
            case 28:
            case 61:
            case 62:
            case 63:
            case 64:
            case 97:
            case 98:
            case 99:
            case 100:
            case 133:
            case 134:
            case 135:
            case 136:
                floor = "7 этаже";
                break;

            case 29:
            case 30:
            case 31:
            case 32:
            case 65:
            case 66:
            case 67:
            case 68:
            case 101:
            case 102:
            case 103:
            case 104:
            case 137:
            case 138:
            case 139:
            case 140:
                floor = "8 этаже";
                break;

            case 33:
            case 34:
            case 35:
            case 36:
            case 69:
            case 70:
            case 71:
            case 72:
            case 105:
            case 106:
            case 107:
            case 108:
            case 141:
            case 142:
            case 143:
            case 144:
                floor = "9 этаже";
                break;
                default: floor = "Внимание! введите правильный номер?!";
        }
         if (apartment <= 36) {
            System.out.println("1-й подъезд:");
        } else {
            if (apartment >= 37 & apartment <= 72) {
                System.out.println("2-й подъезд:");
            } else {
                if (apartment >= 73 & apartment <= 108) {
                    System.out.println("3-й подъезд:");
                } else {
                    if (apartment >= 109 & apartment <= 144) {
                        System.out.println("4-й подъезд:");
                    } else {
                        System.out.println("Нет такой квартиры в этом доме!");
                    }
                }

            }

        }
        System.out.println("квартира № "+apartment+" размещена на "+floor);
        sc.close();
    }

}
