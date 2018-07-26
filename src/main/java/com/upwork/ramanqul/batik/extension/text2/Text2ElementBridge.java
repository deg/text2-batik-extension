package com.upwork.ramanqul.batik.extension.text2;

import org.apache.batik.bridge.Bridge;
import org.apache.batik.bridge.SVGTextElementBridge;
import org.apache.batik.util.SVGConstants;

public class Text2ElementBridge extends SVGTextElementBridge implements BatikExtConstants {

    public String getLocalName() {
        return BATIK_EXT_TEXT2_TAG;
    }

    public String getNamespaceURI() {
        return BATIK_EXT_NAMESPACE_URI;
    }

    public Bridge getInstance() {
        return new Text2ElementBridge();
    }
    
    
    
}
