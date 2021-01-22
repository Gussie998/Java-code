package List;

import java.util.ArrayList;
import java.util.List;

/**
 * User:DELL
 * Date:2021-01-22
 * Time:10:49
 */
public class YangHuiTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows<= 0 ) {
            return  ret;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ret.add(list);
        for (int i = 0; i <numRows ; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for (int j = 1; j <i ; j++) {
               List<Integer> preRow = ret.get(i-1);
                curRow.add(preRow.get(j-1)+preRow.get(j));
            }
            //1
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;

    }
}
