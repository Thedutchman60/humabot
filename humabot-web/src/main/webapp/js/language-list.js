/**
 * 
 */

var languages = [ { text: "简体中文", fieldValue: "zh_CN" }, 
                  { text: "English", fieldValue: "en_US" },
                  { text: "한국어", fieldValue: "ko_KR" }
                ];



function switchIndex(language){
	if(language!=""){
		for (var i=0;i<languages.length;i++){
			if(language==languages[i].fieldValue){
				return i;
			}
		}
	}
	return 0;
}