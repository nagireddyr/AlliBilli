package com.portal.allibilli.beans.sandbox;

import java.util.ArrayList;
import java.util.List;

import com.portal.allibilli.beans.hibernate.Accordians;

@SuppressWarnings("serial")
public class AccordiansBean extends Accordians {

	private List<TreeElementsBean> treeElements = new ArrayList<TreeElementsBean>();

	public List<TreeElementsBean> getTreeElements() {
		return treeElements;
	}

	public void setTreeElements(List<TreeElementsBean> treeElements) {
		this.treeElements = treeElements;
	}

}
