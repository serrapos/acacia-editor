/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.alkacon.acacia.client.css;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

/**
 * Bundle for CSS resources.<p>
 */
public interface I_LayoutBundle extends ClientBundle {

    /** The style CSS resource. */
    public interface I_Style extends CssResource {

        /**
         * Returns the entity CSS class name.<p>
         * 
         * @return the entity CSS class
         */
        String entity();

        /**
         * Returns the label CSS class name.<p>
         * 
         * @return the label CSS class
         */
        String label();

        /**
         * Returns the widget holder CSS class name.<p>
         * 
         * @return the widget holder CSS class
         */
        String widgetHolder();
    }

    /** The bundle instance. */
    I_LayoutBundle INSTANCE = GWT.create(I_LayoutBundle.class);

    /**
     * Returns the style CSS.<p>
     * 
     * @return the style CSS
     */
    @Source("style.css")
    I_Style style();
}