package com.neo.ticketingapp.chartbuilder;

import com.neo.ticketingapp.common.constants.CommonConstants;

public class TableChartType implements IChartType{

	@Override
	public String chartType() {
		return CommonConstants.TABLECHART;
	}

}
