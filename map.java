import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
*
* @author Admin
*/
public class H1 {
public static void main(String[] args) {
HashMap&lt;String,Integer&gt; hm=new HashMap();
hm.put(&quot;A&quot;,1);
hm.put(&quot;B&quot;,1);
hm.put(&quot;C&quot;,2);
hm.put(&quot;D&quot;,3);
hm.put(&quot;E&quot;,5);
Set keys=hm.keySet();
System.out.println(&quot;print element of HasMap using Map.Entry&quot;);
for(Map.Entry&lt;String,Integer&gt; k:hm.entrySet()){
System.out.println(&quot;Key is : &quot;+k.getKey()+&quot; Value is &quot;+k.getValue());
}

}
}
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
*
* @author Admin
*/
public class H1 {
public static void main(String[] args) {
HashMap&lt;Integer,String&gt; hm=new HashMap&lt;&gt;();
hm.put(100,&quot;A&quot;);
hm.put(10,&quot;B&quot;);
hm.put(200,&quot;C&quot;);
hm.put(30,&quot;D&quot;);
hm.put(500,&quot;E&quot;);
System.out.println(&quot;&quot;+hm);
Set keys=hm.keySet();
System.out.println(&quot;print element of HasMap using Map.Entry&quot;);
for(Map.Entry&lt;Integer,String&gt; k:hm.entrySet()){
System.out.println(&quot;Key is : &quot;+k.getKey()+&quot; Value is &quot;+k.getValue());
}
}
}