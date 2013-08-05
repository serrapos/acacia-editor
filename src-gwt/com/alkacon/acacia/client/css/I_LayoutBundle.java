/*
 * This library is part of the Acacia Editor -
 * an open source inline and form based content editor for GWT.
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
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.alkacon.acacia.client.css;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.Shared;
import com.google.gwt.resources.client.ImageResource;

/**
 * Bundle for CSS resources.<p>
 */
public interface I_LayoutBundle extends com.alkacon.geranium.client.ui.css.I_LayoutBundle {

    /** The attribute choice widget CSS. */
    interface I_AttributeChoice extends CssResource {

        /** 
         * Returns the attribute choice CSS class.<p>
         * 
         * @return the attribute CSS class
         */
        String attributeChoice();

        /**
         * Returns the bridging div CSS class.<p>
         * 
         * @return the bridge CSS class
         */
        String bridge();

        /** 
         * Returns the button icon CSS class name.<p>
         * 
         * @return the button icon CSS class
         */
        String buttonIcon();

        /** 
         * Returns the choice CSS class name.<p>
         * 
         * @return the choice CSS class
         */
        String choice();

        /** 
         * Returns the choices CSS class name.<p>
         * 
         * @return the choices CSS class
         */
        String choices();

        /** 
         * Returns the display above CSS class name.<p>
         * 
         * @return the display above CSS class
         */
        String displayAbove();

        /** 
         * Returns the choices frame CSS class name.<p>
         * 
         * @return the choices frame CSS class
         */
        String frame();

        /** 
         * Returns the hovering CSS class name.<p>
         * 
         * @return the hovering CSS class
         */
        String hovering();

        /**
         * Returns the submenu CSS class name.<p>
         * 
         * @return the submenu CSS class name 
         */
        String submenu();
    }

    /** The style CSS resource. */
    @Shared
    interface I_Style extends com.alkacon.geranium.client.ui.css.I_LayoutBundle.I_DragCss, I_Widgets {

        /** 
         * Returns the attribute CSS class name.<p>
         * 
         * @return the attribute CSS class
         */
        String attribute();

        /**
         * Returns the button CSS class name.<p>
         * 
         * @return the button CSS class
         */
        String button();

        /**
         * Returns the button bar CSS class name.<p>
         * 
         * @return the button bar CSS class
         */
        String buttonBar();

        /**
         * Returns the button bar bridge CSS class name.<p>
         * 
         * @return the button bar bridge CSS class
         */
        String buttonBarBridge();

        /**
         * Returns the button bar frame CSS class name.<p>
         * 
         * @return the button bar frame CSS class
         */
        String buttonBarFrame();

        /**
         * Returns the closed bubble CSS class name.<p>
         * 
         * @return the closed bubble CSS class
         */
        String closedBubble();

        /**
         * Returns the display bubble above CSS class name.<p>
         * 
         * @return the display bubble above CSS class
         */
        String displayAbove();

        /** 
         * Returns the attribute CSS class name.<p>
         * 
         * @return the attribute CSS class
         */
        String dragElement();

        /**
         * Returns the drag overlay CSS class name.<p>
         *  
         * @return the drag overlay CSS class
         */
        String dragOverlay();

        /**
         * Returns the CSS constant value.<p>
         * 
         * @return the CSS constant value
         */
        String FOCUS_GRADIENT();

        /**
         * Returns the CSS constant value.<p>
         * 
         * @return the CSS constant value
         */
        String FOCUS_GRADIENT_IE9();

        /**
         * Returns the focused CSS class name.<p>
         * 
         * @return the focused CSS class
         */
        String focused();

        /**
         * Returns the form parent CSS class name.<p>
         * 
         * @return the form parent CSS class
         */
        String formParent();

        /**
         * Returns the help bubble CSS class name.<p>
         * 
         * @return the help bubble CSS class
         */
        String helpBubble();

        /**
         * Returns the help bubble arrow CSS class name.<p>
         * 
         * @return the help bubble arrow CSS class
         */
        String helpBubbleArrow();

        /**
         * Returns the help bubble close CSS class name.<p>
         * 
         * @return the help bubble close CSS class
         */
        String helpBubbleClose();

        /**
         * Returns the help message CSS class name.<p>
         * 
         * @return the help message CSS class
         */
        String helpMessage();

        /**
         * Returns the help message icon CSS class name.<p>
         * 
         * @return the help message icon CSS class
         */
        String helpMessageIcon();

        /**
         * Returns the hide help bubbles CSS class name.<p>
         * 
         * @return the hide help bubbles CSS class
         */
        String hideHelpBubbles();

        /** 
         * Returns the CSS class which is set when the user is hovering over a button of the button bar.<p>
         * 
         * @return a CSS class 
         */
        String hoverButton();

        /**
         * Returns the input field CSS class name.<p>
         * 
         * @return the input field CSS class name
         */
        String input();

        /** 
         * Returns the move handle CSS class name.<p>
         * 
         * @return the move handle CSS class
         */
        String moveHandle();

        /**
         * Returns the multi button bar CSS class name.<p>
         * 
         * @return the multi button bar CSS class
         */
        String multiButtonBar();

        /**
         * Returns the CSS constant value.<p>
         * 
         * @return the CSS constant value
         */
        String PARENT_GRADIENT();

        /**
         * Returns the CSS constant value.<p>
         * 
         * @return the CSS constant value
         */
        String PARENT_GRADIENT_IE9();

        /**
         * The second column width constant.<p>
         *  
         * @return the second column width constant
         */
        int SECOND_COLUMN_WIDTH();

        /**
         * Returns the shallow widget CSS class name.<p>
         *  
         * @return the shallow widget CSS class
         */
        String shallowWidget();

        /**
         * Returns the simple value CSS class name.<p>
         * 
         * @return the simple value CSS class name
         */
        String simpleValue();

        /**
         * Returns the tinymce toolbar container CSS class name.<p>
         * 
         * @return the tinymce toolbar container CSS class name
         */
        String tinymceToolbarContainer();
    }

    /** The widget CSS classes. */
    @Shared
    interface I_Widgets extends CssResource {

        /**
         * Returns the attribute value CSS class name.<p>
         * 
         * @return the attribute value CSS class
         */
        String attributeValue();

        /**
         * Returns the compact view CSS class name.<p>
         * 
         * @return the compact view CSS class
         */
        String compactView();

        /**
         * Returns the default view CSS class name.<p>
         * 
         * @return the compact view CSS class
         */
        String defaultView();

        /**
         * Returns the drag helper CSS class name.<p>
         *  
         * @return the drag helper CSS class
         */
        String dragHelper();

        /**
         * Returns the drag helper CSS class name.<p>
         *  
         * @return the drag helper CSS class
         */
        String emptyValue();

        /**
         * Returns the entity CSS class name.<p>
         * 
         * @return the entity CSS class
         */
        String entity();

        /**
         * Returns the first column CSS class name.<p>
         *  
         * @return the first column CSS class
         */
        String firstColumn();

        /**
         * Returns the has error CSS class name.<p>
         * 
         * @return the has error CSS class
         */
        String hasError();

        /**
         * Returns the has warning CSS class name.<p>
         * 
         * @return the has warning CSS class
         */
        String hasWarning();

        /**
         * Returns the help bubble close CSS class name.<p>
         * 
         * @return the help bubble close CSS class
         */
        String inActive();

        /**
         * Returns the label CSS class name.<p>
         * 
         * @return the label CSS class
         */
        String label();

        /**
         * Returns the second column CSS class name.<p>
         *  
         * @return the second column CSS class
         */
        String secondColumn();

        /**
         * Returns the single line view CSS class name.<p>
         * 
         * @return the single line view CSS class
         */
        String singleLine();

        /**
         * Returns the widget CSS class name.<p>
         * 
         * @return the widget CSS class
         */
        String widget();

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
     * Returns the attribute choice CSS.<p>
     * 
     * @return the attribute choice CSS
     */
    @Source("attributeChoice.css")
    I_AttributeChoice attributeChoice();

    /**
     * Returns the base image bundle.<p>
     * 
     * @return the base image bundle
     */
    com.alkacon.geranium.client.ui.css.I_ImageBundle baseImages();

    /**
     * Access method.<p>
     * 
     * @return the image resource 
     */
    @Source("bottom-left-corner.png")
    ImageResource bottomLeftCorner();

    /**
     * Access method.<p>
     * 
     * @return the image resource 
     */
    @Source("bottom-left-corner-error.png")
    ImageResource bottomLeftCornerError();

    /**
     * Access method.<p>
     * 
     * @return the image resource 
     */
    @Source("errorImageSmall.png")
    ImageResource errorImageSmall();

    /**
     * Returns the style CSS.<p>
     * 
     * @return the style CSS
     */
    @Source("form.css")
    I_Style form();

    /**
     * Access method.<p>
     * 
     * @return the image resource 
     */
    @Source("top-left-corner.png")
    ImageResource topLeftCorner();

    /**
     * Access method.<p>
     * 
     * @return the image resource 
     */
    @Source("top-left-corner-error.png")
    ImageResource topLeftCornerError();
}
