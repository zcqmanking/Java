function initEditor(){
	editor = new baidu.editor.ui.Editor({
                minFrameHeight: 150,
                textarea: "activeDetail",
                iframeCssUrl :"CSS/ueditor/iframe.css",
                autoClearinitialContent:false,
                toolbars:[
                    ['MultiMenu','Image','Video','GMap']
                ]
            });
    editor.render("detailEditor");
}