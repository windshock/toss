var LIB=null;
Process.enumerateModules().forEach(function(m){ if(m.name.indexOf("libea56")>=0) LIB=m; });
if(!LIB){ var t=setInterval(function(){ Process.enumerateModules().forEach(function(m){ if(m.name.indexOf("libea56")>=0){LIB=m;clearInterval(t);send("[lib] "+LIB.base);} }); },100); }
var armed=false;
function arm(){ if(!LIB||armed) return; armed=true;
  var p=Module.findExportByName("libc.so","memcpy");
  var n=0;
  Interceptor.attach(p,{
    onEnter:function(a){
      var lr=this.returnAddress;
      if(lr.compare(LIB.base)>=0 && lr.compare(LIB.base.add(LIB.size))<0){
        n++;
        if(n<=30){
          var sz=a[2].toInt32();
          if(sz>0 && sz<=512){
            try{
              var b=new Uint8Array(Memory.readByteArray(a[1], Math.min(sz,96)));
              var s=""; for(var i=0;i<b.length;i++){ s+=(b[i]>=32&&b[i]<127)?String.fromCharCode(b[i]):"."; }
              send("[memcpy#"+n+"] sz="+sz+" from-libea56+0x"+lr.sub(LIB.base).toString(16)+" |"+s+"|");
            }catch(e){}
          } else send("[memcpy#"+n+"] sz="+sz);
        }
      }
    }
  });
  send("[armed] memcpy");
}
var t2=setInterval(function(){ if(LIB){arm();clearInterval(t2);} },100);
