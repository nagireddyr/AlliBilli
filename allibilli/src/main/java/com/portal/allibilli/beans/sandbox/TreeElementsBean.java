package com.portal.allibilli.beans.sandbox;

import java.util.List;

import com.portal.allibilli.beans.hibernate.TreeElements;

@SuppressWarnings("serial")
public class TreeElementsBean extends TreeElements {
	private List<TreeElementsBean> children;

	public List<TreeElementsBean> getChildren() {
		return children;
	}

	public void setChildren(List<TreeElementsBean> children) {
		this.children = children;
	}

}
