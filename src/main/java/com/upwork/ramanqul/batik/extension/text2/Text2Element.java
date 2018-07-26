package com.upwork.ramanqul.batik.extension.text2;

import org.apache.batik.anim.dom.SVGOMTextElement;
import org.apache.batik.dom.AbstractDocument;
import org.w3c.dom.Node;

public class Text2Element extends SVGOMTextElement implements BatikExtConstants {

    protected Text2Element() {}
    public Text2Element(String prefix, AbstractDocument owner) {
        super(prefix, owner);
        
    }
    
    @Override
    public String getLocalName() {
        return BATIK_EXT_TEXT2_TAG;
    }

    @Override
    public String getNamespaceURI() {
        return BATIK_EXT_NAMESPACE_URI;
    }
    
    @Override
    protected Node newNode() {
        return new Text2Element();
    }
    
}
