import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapList {
    public static void main(String[] args){
//        List<Object> list = new ArrayList<Object>();
//        list.add("123");
//        Object o = list.get(0);
//        System.out.println(o);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","张三");
        map.put("age","13");
        map.put("address","上海");
        String name = (String) map.get("name");
        System.out.println(name);
    }
}
