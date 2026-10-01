var LIB=null;
Process.enumerateModules().forEach(function(m){ if(m.name.indexOf("libea56")>=0) LIB=m; });
if(!LIB){ var t=setInterval(function(){ Process.enumerateModules().forEach(function(m){ if(m.name.indexOf("libea56")>=0){LIB=m;clearInterval(t);send("[lib] "+LIB.base);} }); },100); }
send("[init] "+(LIB?LIB.base:"pending"));
var armed=false, n=0;
function tryArm(){ if(!LIB||armed) return; armed=true;
  Interceptor.attach(LIB.base.add(0xafed8),{
    onEnter:function(a){
      if(a[0].toInt32()!==0) { send("[KILL] x0="+a[0]+" x1=0x"+a[1].toString(16)); return; }
      n++;
      if(n<=40||n%10===0){
        var x1=a[1], x2=a[2];
        var dump="";
        try {
          var b=Memory.readByteArray(x2, 48);
          var u8=new Uint8Array(b); var hex="",asc="";
          for(var i=0;i<48;i++){ hex+=u8[i].toString(16).padStart(2,"0"); var c=String.fromCharCode(u8[i]); asc+=(u8[i]>=32&&u8[i]<127)?c:"."; }
          dump=hex+" |"+asc+"|";
        } catch(e){ dump="<unreadable>"; }
        send("[scan#"+n+"] x1=0x"+x1.toString(16)+" x2=0x"+x2.toString(16)+" "+dump);
      }
    }
  });
  send("[armed]");
}
var t2=setInterval(function(){ if(LIB){tryArm();clearInterval(t2);} },100);
