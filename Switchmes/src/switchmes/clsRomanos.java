/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switchmes;

/**
 *
 * @author Alvaro
 */
public class clsRomanos {
    
    public String romanos(int num)
    {
        int x;

        int mil,cent,dece,unid;

        mil=(num/1000);

        x=num%1000;

        cent=x/100;

        x=x%100;

        dece=x/10;

        unid=x%10;

        String Result="";

        switch(mil){

            case 1:

                Result = Result +"M";

                break;

            case 2:

                Result = Result +"MM";

                break;

            case 3:

                Result = Result +"MMM";

                break;

                 }

        switch(cent){

            case 1:

                Result = Result +"C";

                break;

            case 2:

                Result = Result +"CC";

                break;

            case 3:

                Result = Result +"CCC";

                break;

            case 4:

                Result = Result +"CD";

                break;

            case 5:

                Result = Result +"D";

                break;

            case 6:

                Result = Result +"DC";

                break;

            case 7:

                Result = Result +"DCC";

                break;

            case 8:

                Result = Result +"DCCC";

                break;

            case 9:

                Result = Result +"CM";

                break;

        }

        switch(dece){

            case 1:

                Result = Result +"X";

                break;

            case 2:

                Result = Result +"XX";

                break;

            case 3:

                Result = Result +"XXX";

                break;

            case 4:

                Result = Result +"XL";

                break;

            case 5:

                Result = Result +"L";

                break;

            case 6:

                Result = Result +"LX";

                break;

            case 7:

                Result = Result +"LXX";

                break;

            case 8:

                Result = Result +"LXXX";

                break;

            case 9:

                Result = Result +"XC";

                break;

                }

        switch(unid){

            case 1:

                Result = Result +"I";

                break;

            case 2:

                Result = Result +"II";

                break;

            case 3:

                Result = Result +"III";

                break;

            case 4:

                Result = Result +"IV";

                break;

            case 5:

                Result = Result +"V";

                break;

            case 6:

                Result = Result +"VI";

                break;

            case 7:

                Result = Result +"VII";

                break;

            case 8:

                Result = Result +"VIII";

                break;

            case 9:

                Result = Result + "IX";

                break;

        }
        return "El número " + num + " convertido a romanos es: " + Result ;
    }
}
