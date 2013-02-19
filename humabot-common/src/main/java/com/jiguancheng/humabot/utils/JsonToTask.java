package com.jiguancheng.humabot.utils;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

import com.jiguancheng.humabot.pojo.TaskResultDo;




public class JsonToTask {

	public static TaskResultDo jsonToTask(String json){
		
		TaskResultDo taskResultDo = null;
		if(StringUtils.isBlank(json)){
			return taskResultDo;
		}
		JSONObject jsonObject = null;
		try {
			jsonObject = JSONObject.fromObject(json);
			Object ret = JSONObject.toBean(jsonObject,TaskResultDo.class);
			if(ret == null){
				taskResultDo = (TaskResultDo)ret;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return taskResultDo;
		
	}
	
	public static List<TaskResultDo> jsonToTask(List<String> jsons){
		
		List<TaskResultDo> taskResultDos = new ArrayList<TaskResultDo>();
		if(CollectionUtils.isEmpty(jsons)){
			return taskResultDos;
		}
		for(String json : jsons){
			TaskResultDo taskResultDo = jsonToTask(json);
			if(taskResultDo != null ){
				taskResultDos.add(taskResultDo);
			}
		}
		
		return taskResultDos;
		
	}
	
public static TaskResultDo jsonStringToTask(String json){
		
		TaskResultDo taskResultDo = new TaskResultDo();
		if(StringUtils.isBlank(json)){
			return taskResultDo;
		}
		JSONObject jsonObject = new JSONObject();
		JSONObject.fromObject(json);
		try {
			taskResultDo.setTaskName((String) jsonObject.get("taskName"));
			taskResultDo.setExcuteResult((String) jsonObject.get("excuteResult"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return taskResultDo;
		
	}
	
}
