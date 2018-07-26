/*

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package com.upwork.ramanqul.batik.extension.text2;

import org.apache.batik.anim.dom.SVGDOMImplementation;
import org.apache.batik.dom.AbstractDocument;
import org.apache.batik.dom.DomExtension;
import org.apache.batik.dom.ExtensibleDOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * This is a Service interface for classes that want to extend the
 * functionality of the Dom, to support new tags in the rendering tree.
 *
 * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a>
 * @version $Id$
 */
public class BatikDomExtension
    implements DomExtension, BatikExtConstants {

    /**
     * Return the priority of this Extension.  Extensions are
     * registered from lowest to highest priority.  So if for some
     * reason you need to come before/after another existing extension
     * make sure your priority is lower/higher than theirs.
     */
    public float getPriority() { return 1.0f; }

    /**
     * This should return the individual or company name responsible
     * for the this implementation of the extension.
     */
    public String getAuthor() {
        return "Thomas DeWeese";
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
     * This method should update the DomContext with support
     * for the tags in this extension.  In some rare cases it may
     * be necessary to replace existing tag handlers, although this
     * is discouraged.
     *
     * @param di The ExtensibleDOMImplementation to register the
     *           extension elements with.
     */
    public void registerTags(ExtensibleDOMImplementation di) {
        di.registerCustomElementFactory
            (BATIK_EXT_NAMESPACE_URI,
             BATIK_EXT_TEXT2_TAG,
             new Text2ElementFactory());
    }

}


