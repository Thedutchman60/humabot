package com.jiguancheng.humabot.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServiceResultDo {
	private long serviceId;

	private String serviceName;

	private String excuteResult;

	private long exeOrder;

	private String returnMessage;

	private String filePathStr;

	private List<String> filePath = new ArrayList<String>();

	public String getFilePathStr() {
		return filePathStr;
	}

	public void setFilePathStr(String filePathStr) {
		this.filePathStr = filePathStr;
	}

	public List<String> getFilePath() {
		if (filePathStr != null && !"".equals(filePathStr)) {
			String[] array = filePathStr.split("#");
			for (int i = 0; i < array.length; i++) {
				filePath.add(array[i]);
			}
		}
		return filePath;
	}

	public void setFilePath(List<String> filePath) {
		this.filePath = filePath;
	}

	public String getExcuteResult() {
		return excuteResult;
	}

	public void setExcuteResult(String excuteResult) {
		this.excuteResult = excuteResult;
	}

	public long getExeOrder() {
		return exeOrder;
	}

	public void setExeOrder(long exeOrder) {
		this.exeOrder = exeOrder;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
