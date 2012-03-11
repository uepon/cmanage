package org.uepon.dto;

import java.io.Serializable;

public class PageConditionDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public int page = 1;
	public int limit;
	public int totalCount = 0;

	public PageConditionDto(){}

	public PageConditionDto(int limit, int totalCount) {
		this.limit = limit;
		this.totalCount = totalCount;
	}

	public boolean isNextPage() {
		return this.totalCount - (this.page * this.limit) > 0;
	}

	public boolean isPrevPage() {
		return this.page > 1;
	}

	public void prevPage() {
		this.page = this.page - 1;
	}

	public void nextPage() {
		this.page = this.page + 1;
	}

	public int getOffset()
	{
		return (this.page - 1) * this.limit;
	}

}
