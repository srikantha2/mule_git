
package com.muleinaction.pattern.service;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.mule.api.ExceptionPayload;
import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class PatternServiceJaxRsTestCase extends FunctionalTestCase
{

    @Override
    protected String getConfigResources()
    {
        return "pattern/service/pattern-service-jaxrs.xml";
    }

    @Test
    public void testSimpleValidator() throws Exception
    {
        MuleClient muleClient = new MuleClient(muleContext);

        MuleMessage result = muleClient.send("http://localhost:6099/rest/brews/list", null, null);
        assertThat(result.getPayload(), is(not(instanceOf(ExceptionPayload.class))));
    }
    
}
