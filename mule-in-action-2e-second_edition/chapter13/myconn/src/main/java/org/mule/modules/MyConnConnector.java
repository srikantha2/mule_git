/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.modules;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.Source;
import org.mule.api.annotations.Transformer;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.InboundHeaders;
import org.mule.api.annotations.param.InvocationHeaders;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.param.Payload;
import org.mule.api.callback.SourceCallback;
import org.mule.tck.testmodels.fruit.Apple;
import org.mule.tck.testmodels.fruit.Banana;
import org.mule.tck.testmodels.fruit.Fruit;
import org.mule.tck.testmodels.fruit.FruitBowl;

//<start id="lis_13_connector-annotation"/>
@Connector//<co id="lis_13_connector-annotation-1_co"/>
	(name="myconn",
	friendlyName="MyConnector",
	schemaVersion="1.0-SNAPSHOT")
public class MyConnConnector//<end id="lis_13_connector-annotation"/>
{
//<start id="lis_13_connector-config"/>
@Configurable
private String parameterOne;

@Configurable
private String parameterTwo;
//<end id="lis_13_connector-config"/>

    public String getParameterOne() {
		return parameterOne;
	}

	public void setParameterOne(String parameterOne) {
		this.parameterOne = parameterOne;
	}

	public String getParameterTwo() {
		return parameterTwo;
	}

	public void setParameterTwo(String parameterTwo) {
		this.parameterTwo = parameterTwo;
	}

//<start id="lis_13_processor-annotation"/>
@Processor
public void myMethod() { 
    // business logic 
}
//<end id="lis_13_processor-annotation"/>

//<start id="lis_13_optional-annotation"/>
@Processor
public void myMethodWithDefaultArg(
	String requiredParam, 
    @Optional @Default("1") int optionalParam) {
    // business logic 
}
//<end id="lis_13_optional-annotation"/>    

//<start id="lis_13_payload-annotation"/>
@Processor
public String myMethodSetPayload() {
    return "I'm a String that will become payload";
}
//<end id="lis_13_payload-annotation"/>    

//<start id="lis_13_payload-annotation"/>
@Processor 
public String myMethodWithPayload(
    @Payload String payload,
    @InboundHeaders("MULE_*") Map<?,?> muleHeaders,
    @InvocationHeaders("header1, optionalHeader2?")
    Map<?,?> otherHeaders) {
    
	return "I'm a String that will become payload"; 
}
//<end id="lis_13_payload-annotation"/>    


private Ehcache cache;

public void setCache(final Ehcache cache)//<co id="lis_12_interceptor_cache-6"/>
{
    this.cache = cache;
}

//<start id="lis_13_intercepting-processor"/>
@Processor(intercepting=true)//<co id="lis_13_intercepting-processor-1_co"/> 
public Object process(SourceCallback afterChain,//<co id="lis_13_intercepting-processor-2_co"/>
		@Payload Object payload) throws Exception {
	Object key = payload;
	Element cachedElement = cache.get(key);
	if (cachedElement != null) { 
		return cachedElement.getObjectValue(); 
	}
	
	// we don't synchronize so several threads can compete to fill
	// the cache for the same key: this is rare enough to be 
	// acceptable 
	Object result = afterChain.process();//<co id="lis_13_intercepting-processor-3_co"/> 
	cache.put(new Element(key, result));
	return result;
}
//<end id="lis_13_intercepting-processor"/> 

//<start id="lis_13_transformer"/>
@Transformer(sourceTypes = { Object[].class })
public static List transformArrayToList(@Payload Object[] payload) {
	return Arrays.asList(payload);
}
//<end id="lis_13_transformer"/> 

//<start id="lis_13_transformer-sourcetypes"/>
@Transformer(sourceTypes = { Apple.class, Banana.class })
public static FruitBowl transformFruitToBowl(@Payload Fruit payload) {
	FruitBowl bowl = new FruitBowl();
	bowl.addFruit(payload);
	return bowl;
}
//<end id="lis_13_transformer-sourcetypes"/> 

//<start id="lis_13_source"/>
@Source
public void subscribeTopic(
	int interval, 
	final SourceCallback callback) {
	
	TimerTask task = new TimerTask() {
		public void run() {
			try {
				callback.process();//<co id="lis_13_source_1"/>
			} catch (Exception e) {
				// Process error
			}
		}
	};
	Timer timer = new Timer();
	timer.schedule(task, interval);
}
//<end id="lis_13_source"/> 


@Processor() 
public String myProcessor(String content) throws Exception {
	return "Another string";
}

}
