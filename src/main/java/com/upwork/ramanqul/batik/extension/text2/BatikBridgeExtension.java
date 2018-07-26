
package com.upwork.ramanqul.batik.extension.text2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

import org.apache.batik.bridge.BridgeContext;
import org.apache.batik.bridge.BridgeExtension;
import org.w3c.dom.Element;


public class BatikBridgeExtension implements BridgeExtension {

    /**
     * Return the priority of this Extension.  Extensions are
     * registered from lowest to highest priority.  So if for some
     * reason you need to come before/after another existing extension
     * make sure your priority is lower/higher than theirs.
     */
    public float getPriority() { return 1.0f; }

    /**
     * This should return the list of extensions implemented
     * by this BridgeExtension.
     * @return An iterator containing strings one for each implemented
     *         extension.
     */
    public Iterator<String> getImplementedExtensions() {
        String [] extensions = {
            "http://xml.apache.org/batik/ext/text2/1.0" ,
        };
//        List v = new ArrayList(extensions.length);
//        for (int i=0; i<extensions.length; i++) {
//            v.add(extensions[i]);
//        }
        List<String> v = Arrays.asList( extensions );
        return Collections.unmodifiableList(v).iterator();
    }

    /**
     * This should return the individual or company name responsible
     * for the this implementation of the extension.
     */
    public String getAuthor() {
        return "Ramanqul";
    }

    /**
     * This should contain a contact address (usually an e-mail address).
     */
    public String getContactAddress() {
        return "deweese@apache.org";
    }

    /**
     * This should return a URL where information can be obtained on
     * this extension.
     */
    public String getURL() {
        return "http://xml.apache.org/batik";
    }

    /**
     * Human readable description of the extension.
     * Perhaps that should be a resource for internationalization?
     * (although I suppose it could be done internally)
     */
    public String getDescription() {
        return "Example extension to standard SVG shape tags";
    }

    /**
     * This method should update the BridgeContext with support
     * for the tags in this extension.  In some rare cases it may
     * be necessary to replace existing tag handlers, although this
     * is discouraged.
     *
     * @param ctx The BridgeContext instance to be updated
     */
    public void registerTags(BridgeContext ctx) {
        ctx.putBridge(new Text2ElementBridge());
    }

    /**
     * Whether the presence of the specified element should cause
     * the document to be dynamic.  If this element isn't handled
     * by this BridgeExtension, just return false.
     *
     * @param e The element to check.
     */
    public boolean isDynamicElement(Element e) {
        return false;
    }
}
