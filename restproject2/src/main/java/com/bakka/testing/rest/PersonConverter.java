/**
 * 
 */
package com.bakka.testing.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * @author prakash
 * http://technicalmumbojumbo.wordpress.com/2014/06/23/mule-tutorial-series-restful-webservice/
 *
 */
public class PersonConverter implements Converter {  @Override
    public boolean canConvert(Class arg0) {
	System.out.println(arg0);
    if (Map.class.equals(arg0) || HashMap.class.equals(arg0)) {
        return Boolean.TRUE;
    } else {
        return Boolean.FALSE;
    }
}

@Override
public void marshal(Object object, HierarchicalStreamWriter writer,
        MarshallingContext ctx) {
    Map map = (Map)object;
	System.out.println("map -"+map);
    Set names = map.keySet();
	System.out.println("names:"+names);

    writer.startNode("Person");
    for (Object name : names) {
        writer.startNode(name.toString());
        String value = (String)map.get(name);
        writer.setValue(value);
        writer.endNode();
    }
    writer.endNode();

}

@Override
public Object unmarshal(HierarchicalStreamReader arg0,
        UnmarshallingContext arg1) {
    return null;
}}
