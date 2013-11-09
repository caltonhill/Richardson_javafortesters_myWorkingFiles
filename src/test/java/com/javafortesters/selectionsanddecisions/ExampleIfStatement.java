package com.javafortesters.selectionsanddecisions;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
This is just an example of code. Probably won't actually run
 */
public class ExampleIfStatement {

    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(!url.startsWith("http")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }
    {
    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(url.startsWith("http")){
            //do nothing the url is fine
        }else{
            url=addHttp(url);
        }
        assertTrue(url.startsWith("http;//"));
        assertEquals("http://www.seleniumsimplified.com", url);
        }
    }
    {
    @Test
    public void ifElseNestedAddHttp(){
        String url = "seleniumsimplified.com";
        if(url.startsWith("http")){
            //do nothing url is fine
        }else{
            if(!url.startsWith("www")){
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http;//"));
        assertEquals("http://www.seleniumsimplified.com", url);
        }
    }
    }
    }

