<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>WebSocket/SockJS Echo Sample (Adapted from Tomcat's echo sample)</title>   
    <script src="http://cdn.sockjs.org/sockjs-0.3.min.js"></script>  
    <script type="text/javascript">  
    var host = window.location.host;
    var websocket;
    if ('WebSocket' in window) {
    	alert();
        websocket = new WebSocket("ws://" + host + "/MySSH/webSocketIMServer", null, {debug:true, maxReconnectAttempts:4});
    } else if ('MozWebSocket' in window) {
        websocket = new MozWebSocket("ws://" + host + "/webSocketIMServer");
    } else {
        websocket = new SockJS("http://" + host + "/sockjs/webSocketIMServer");
    }
    websocket.onopen = function(evnt) {
        console.log("websocket连接上");
    };
    websocket.onmessage = function(evnt) {
        messageHandler(evnt.data);
    };
    websocket.onerror = function(evnt) {
        console.log("websocket错误");
    };
    websocket.onclose = function(evnt) {
        console.log("websocket关闭");
    }
    </script>  
</head>  
<body>  
</body>  
</html>  