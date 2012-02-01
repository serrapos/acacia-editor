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

package com.alkacon.forms.client;

import com.alkacon.forms.client.css.I_LayoutBundle;
import com.alkacon.vie.client.I_Entity;
import com.alkacon.vie.client.I_EntityAttribute;
import com.alkacon.vie.client.I_Vie;
import com.alkacon.vie.shared.I_Type;

import java.util.List;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * Widget rendering the form view of an entity.<p>
 */
public class ComplexTypeRenderer implements I_EntityRenderer {

    /** The entity CSS class. */
    public static final String ENTITY_CLASS = I_LayoutBundle.INSTANCE.style().entity();

    /** The attribute label CSS class. */
    public static final String LABEL_CLASS = I_LayoutBundle.INSTANCE.style().label();

    /** The VIE instance. */
    private I_Vie m_vie;

    /** The widget service. */
    private I_WidgetService m_widgetService;

    /**
     * Constructor.<p>
     * 
     * @param widgetService the widget service to use
     * @param vie the VIE instance
     */
    public ComplexTypeRenderer(I_WidgetService widgetService, I_Vie vie) {

        m_widgetService = widgetService;
        m_vie = vie;
    }

    /**
     * @see com.alkacon.forms.client.I_EntityRenderer#getHelp(java.lang.String)
     */
    public String getHelp(String attributeName) {

        return attributeName;
    }

    /**
     * @see com.alkacon.forms.client.I_EntityRenderer#getLabel(java.lang.String)
     */
    public String getLabel(String attributeName) {

        return attributeName;
    }

    /**
     * @see com.alkacon.forms.client.I_EntityRenderer#render(com.alkacon.vie.client.I_Entity)
     */
    public Widget render(I_Entity entity) {

        FlowPanel result = new FlowPanel();
        result.setStyleName(ENTITY_CLASS);
        I_Type entityType = m_vie.getType(entity.getTypeName());
        List<String> attributeNames = entityType.getAttributeNames();
        for (String attributeName : attributeNames) {
            I_Type attributeType = entityType.getAttributeType(attributeName);
            I_EntityRenderer renderer = m_widgetService.getRendererForAttribute(attributeName, attributeType);
            Label label = new Label(renderer.getLabel(attributeName));
            label.setStyleName(LABEL_CLASS);
            label.setTitle(renderer.getHelp(attributeName));
            result.add(label);
            renderer.render(
                entity,
                attributeName,
                result,
                entityType.getAttributeMinOccurrence(attributeName),
                entityType.getAttributeMaxOccurrence(attributeName));
        }
        return result;
    }

    /**
     * @see com.alkacon.forms.client.I_EntityRenderer#render(com.alkacon.vie.client.I_Entity, java.lang.String, com.google.gwt.user.client.ui.HasWidgets, int, int)
     */
    public void render(
        I_Entity parentEntity,
        String attributeName,
        HasWidgets parentPanel,
        int minOccurrence,
        int maxOccurrence) {

        I_EntityAttribute attribute = parentEntity.getAttribute(attributeName);
        if (attribute.isSimpleValue()) {
            //TODO: throw exception
        } else {
            for (I_Entity entity : attribute.getComplexValues()) {
                parentPanel.add(render(entity));
            }
        }
    }

    /**
     * @see com.alkacon.forms.client.I_EntityRenderer#initConfiguration(java.lang.String)
     */
    public void initConfiguration(String configuration) {

        // nothing to do
    }
}
