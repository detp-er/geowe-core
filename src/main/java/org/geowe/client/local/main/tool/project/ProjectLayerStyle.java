/*
 * #%L
 * GeoWE Project
 * %%
 * Copyright (C) 2015 - 2016 GeoWE.org
 * %%
 * This file is part of GeoWE.org.
 * 
 * GeoWE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * GeoWE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with GeoWE.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.geowe.client.local.main.tool.project;

import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;

/**
 * Modelo de estilo de capa vectorial para la configuración de la sesión de trabajo del proyecto
 * 
 * @author jose@geowe.org
 *
 */
public class ProjectLayerStyle {
	public static final String FILL_COLOR_NAME = "fillColor";
	public static final String FILL_OPACITY_NAME = "fillOpacity";
	public static final String STROKE_COLOR_NAME = "strokeColor";
	public static final String STROKE_WIDTH_NAME = "strokeWidth";
	
	private String fillColor;
	private Double fillOpacity;
	private String strokeColor;
	private Double strokeWidth;
	
	public ProjectLayerStyle() {
		
	}
	
	public ProjectLayerStyle(String fillColor, Double fillOpacity, String strokeColor, Double strokeWidth) {
		this.fillColor = fillColor;
		this.fillOpacity = fillOpacity;
		this.strokeColor = strokeColor;
		this.strokeWidth = strokeWidth;
	}

	public Double getFillOpacity() {
		return fillOpacity;
	}

	public void setFillOpacity(Double fillOpacity) {
		this.fillOpacity = fillOpacity;
	}

	public String getStrokeColor() {
		return strokeColor;
	}

	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
	}

	public Double getStrokeWidth() {
		return strokeWidth;
	}

	public void setStrokeWidth(Double strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public JSONObject getJSONObject() {
		JSONObject projectLayerObject = new JSONObject();
		
		projectLayerObject.put(FILL_COLOR_NAME, new JSONString(getFillColor()));
		projectLayerObject.put(FILL_OPACITY_NAME, new JSONNumber(getFillOpacity()));
		projectLayerObject.put(STROKE_COLOR_NAME, new JSONString(getStrokeColor()));
		projectLayerObject.put(STROKE_WIDTH_NAME, new JSONNumber(getStrokeWidth()));
		
		return projectLayerObject;		
	}
	
	public String toJSON() {
		return getJSONObject().toString();
	}
	
}
