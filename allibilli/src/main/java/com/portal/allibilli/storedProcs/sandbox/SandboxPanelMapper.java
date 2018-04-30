package com.portal.allibilli.storedProcs.sandbox;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.portal.allibilli.beans.dbTblMappings.PANELS;
import com.portal.allibilli.beans.sandbox.PanelsBean;

public class SandboxPanelMapper implements RowMapper<PanelsBean>{

	public PanelsBean mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		
		PanelsBean bean = new PanelsBean();
		bean.setPanelId(rs.getInt(PANELS.panelId));
		bean.setPanelName(rs.getString(PANELS.panelName));
		return bean;
		
	}
}
