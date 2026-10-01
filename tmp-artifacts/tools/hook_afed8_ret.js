// §160: afed8(R-tick 엔진 진입) 인자+반환값 — 네이티브→Java 판정 값 관츰
var LIB=null;
Process.enumerateModules().forEach(function(m){ if(m.name.indexOf("libea56")>=0) LIB=m; });
if(!LIB){ var t=setInterval(function(){ Process.enumerateModules().forEach(function(m){ if(m.name.indexOf("libea56")>=0){LIB=m;clearInterval(t);send("[lib] "+LIB.base);} }); },100); }
send("[init] libea56="+(LIB?LIB.base:"pending"));
var hookArm=false;
function arm(){
  if(!LIB||hookArm) return; hookArm=true;
  var addr=LIB.base.add(0xafed8);
  Interceptor.attach(addr,{
    onEnter:function(a){ this.a0=a[0].toInt32(); this.a1=a[1].toInt32(); this.a2=a[2].toString(16); send("[afed8>] x0="+this.a0+" x1="+this.a1+" x2=0x"+this.a2+" tid="+this.threadId); },
    onLeave:function(r){ send("[afed8<] ret=0x"+r.toString(16)+" (x0 was "+this.a0+") tid="+this.threadId); }
  });
  send("[armed] afed8 @"+addr);
}
var t2=setInterval(function(){ if(LIB){arm(); clearInterval(t2);} },100);
