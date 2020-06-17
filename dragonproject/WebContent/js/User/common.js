
function removeHtml (text) {
	//console.log(text);
	//text = text.replace(/<br\/>/ig, "\n"); 
	text = text.replace(/&nbsp;/gi, " "); 
	text = text.replace(/<(\/)?([a-zA-Z]*)(\s[a-zA-Z]*=[^>]*)?(\s)*(\/)?>/ig, "");
	//console.log("after", text);
	return text;
}
