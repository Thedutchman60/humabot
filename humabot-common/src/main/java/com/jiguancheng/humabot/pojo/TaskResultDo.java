package com.jiguancheng.humabot.pojo;

import java.util.ArrayList;
import java.util.List;

public class TaskResultDo {
	private long taskId;

	private String taskName;

	private long taskInstanceId;

	private String excuteResult;

	private String interruptReason;

	private List<ServiceResultDo> serviceResultList = new ArrayList<ServiceResultDo>();

	public List<ServiceResultDo> getServiceResultList() {
		return serviceResultList;
	}

	public void setServiceResultList(List<ServiceResultDo> serviceResultList) {
		this.serviceResultList = serviceResultList;
	}

	public String getExcuteResult() {
		return excuteResult;
	}

	public void setExcuteResult(String excuteResult) {
		this.excuteResult = excuteResult;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public long getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(long taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getInterruptReason() {
		return interruptReason;
	}

	public void setInterruptReason(String interruptReason) {
		this.interruptReason = interruptReason;
	}

}
