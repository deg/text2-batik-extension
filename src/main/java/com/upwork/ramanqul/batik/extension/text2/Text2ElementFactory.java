package com.upwork.ramanqul.batik.extension.text2;

import org.apache.batik.dom.AbstractDocument;
import org.apache.batik.dom.ExtensibleDOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Text2ElementFactory implements ExtensibleDOMImplementation.ElementFactory {
    public Text2ElementFactory() {
    }
    /**
     * Creates an instance of the associated element type.
     */
    public Element create(String prefix, Document doc) {
        return new Text2Element(prefix, (AbstractDocument)doc);
    }
}


