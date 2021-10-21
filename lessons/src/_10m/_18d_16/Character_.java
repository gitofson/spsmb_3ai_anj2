package _10m._18d_16;

import org.w3c.dom.ls.LSOutput;

//Třída Character - obalovací třída primitivního datového typu char
public class Character_ {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('1')); //true
        //Java používá Unicode kódování. Tzn., že např. znaky s hodnotami
        //'\u0BE7' - '\u0BEF' jasou platné tamilské číslice, tudíž následující
        // příklad vrátí true
        System.out.format("znak %c, %b%n",'\u0BE7', Character.isDigit('\u0BE7')); //true
        System.out.println(Character.isLetter('A')); //true
        System.out.println(Character.isLetterOrDigit('?')); //false
        System.out.println(Character.isLowerCase('b')); //true
        System.out.println(Character.isUpperCase('B')); //true
        System.out.println(Character.isWhitespace('\n')); //true
    }
}
