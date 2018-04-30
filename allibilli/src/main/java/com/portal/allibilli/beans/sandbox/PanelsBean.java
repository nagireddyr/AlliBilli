package com.portal.allibilli.beans.sandbox;

import java.util.ArrayList;
import java.util.List;

import com.portal.allibilli.beans.hibernate.Panels;

@SuppressWarnings("serial")
public class PanelsBean extends Panels  {

	private List<AccordiansBean> accs = new ArrayList<AccordiansBean>();

	public List<AccordiansBean> getAccs() {
		return accs;
	}

	public void setAccs(List<AccordiansBean> accs) {
		this.accs = accs;
	}

}
