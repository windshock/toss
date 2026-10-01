import struct, sys
dex = open('/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_hidden_dex.bin','rb').read()
code = open(sys.argv[1],'rb').read()
def u32d(o): return struct.unpack_from('<I', dex, o)[0]
def ulebd(o):
    r=0;s=0
    while True:
        b=dex[o];o+=1;r|=(b&0x7f)<<s;s+=7
        if not b&0x80: break
    return r,o
F={}
for i,n in enumerate(["string_ids_size","string_ids_off","type_ids_size","type_ids_off","proto_ids_size","proto_ids_off",
       "field_ids_size","field_ids_off","method_ids_size","method_ids_off","class_defs_size","class_defs_off","data_size","data_off"]):
    F[n]=u32d(0x38+i*4)
def get_str(idx):
    off=u32d(F["string_ids_off"]+idx*4); ln,p=ulebd(off)
    return dex[p:p+ln].decode('utf-8','replace')
def field_info(fidx):
    c,t,n=struct.unpack_from('<HHI', dex, F["field_ids_off"]+fidx*8)
    return "%s.%s" % (get_str(u32d(F["type_ids_off"]+c*4)).strip(';').split('/')[-1], get_str(n))
def method_info(midx):
    c,pr,n=struct.unpack_from('<HHI', dex, F["method_ids_off"]+midx*8)
    return "%s.%s" % (get_str(u32d(F["type_ids_off"]+c*4)).strip(';').split('/')[-1], get_str(n))
SZ={}
for op in list(range(0x00,0x0e))+[0x0e,0x0f,0x10,0x11,0x12]: SZ[op]=1
SZ.update({0x13:2,0x14:3,0x15:2,0x16:3,0x17:5,0x18:2,0x19:2,0x1a:2,0x1b:3,0x1c:2,0x1d:1,0x1e:1,0x1f:2,0x20:2,0x21:1,0x22:2,0x23:2})
SZ.update({0x24:3,0x25:3,0x26:3,0x27:1,0x28:1,0x29:2,0x2a:3,0x2b:3,0x2c:3})
for op in range(0x2d,0x3e): SZ[op]=2
for op in list(range(0x44,0x73))+list(range(0x74,0x79)): SZ[op]=2 if op<0x6e else (3 if op<0x73 or op>=0x74 else 2)
for op in range(0x6e,0x73): SZ[op]=3
for op in range(0x74,0x79): SZ[op]=3
for op in range(0x7b,0x90): SZ[op]=1
for op in range(0x90,0xb0): SZ[op]=2
for op in range(0xb0,0xd0): SZ[op]=1
for op in range(0xd0,0xe3): SZ[op]=2
IGET={0x52:"iget",0x53:"iget-wide",0x54:"iget-object",0x55:"iget-boolean",0x56:"iget-byte",0x57:"iget-char",0x58:"iget-short",
 0x59:"iput",0x5a:"iput-wide",0x5b:"iput-object",0x5c:"iput-boolean",0x5d:"iput-byte",0x5e:"iput-char",0x5f:"iput-short"}
SGET={0x60:"sget",0x61:"sget-wide",0x62:"sget-object",0x63:"sget-boolean",0x64:"sget-byte",0x65:"sget-char",0x66:"sget-short",
 0x67:"sput",0x68:"sput-wide",0x69:"sput-object",0x6a:"sput-boolean",0x6b:"sput-byte",0x6c:"sput-char",0x6d:"sput-short"}
INV={0x6e:"invoke-virtual",0x6f:"invoke-super",0x70:"invoke-direct",0x71:"invoke-static",0x72:"invoke-interface"}
INVR={0x74:"invoke-virtual/range",0x75:"invoke-super/range",0x76:"invoke-direct/range",0x77:"invoke-static/range",0x78:"invoke-interface/range"}
IF2=["if-eq","if-ne","if-lt","if-ge","if-gt","if-le"]
IFZ=["if-eqz","if-nez","if-ltz","if-gez","if-gtz","if-lez"]
BIN={0x90:"add-int",0x91:"sub-int",0x92:"mul-int",0x93:"div-int",0x94:"rem-int",0x95:"and-int",0x96:"or-int",0x97:"xor-int",0x98:"shl-int",0x99:"shr-int",0x9a:"ushr-int",
 0x9b:"add-long",0x9c:"sub-long",0x9d:"mul-long",0x9e:"div-long",0x9f:"rem-long",0xa0:"and-long",0xa1:"or-long",0xa2:"xor-long",
 0xa3:"shl-long",0xa4:"shr-long",0xa5:"ushr-long",0xa6:"add-float",0xa7:"sub-float",0xa8:"mul-float",0xa9:"div-float",0xaa:"rem-float",
 0xab:"add-double",0xac:"sub-double",0xad:"mul-double",0xae:"div-double",0xaf:"rem-double"}
BIN2A={0xB0:"add-int/2addr",0xB1:"sub-int/2addr",0xB2:"mul-int/2addr",0xB3:"div-int/2addr",0xB4:"rem-int/2addr",0xB5:"and-int/2addr",0xB6:"or-int/2addr",0xB7:"xor-int/2addr",
 0xB8:"shl-int/2addr",0xB9:"shr-int/2addr",0xBA:"ushr-int/2addr",0xBB:"add-long/2addr",0xBC:"sub-long/2addr",0xBD:"mul-long/2addr",0xBE:"div-long/2addr",0xBF:"rem-long/2addr",
 0xC0:"and-long/2addr",0xC1:"or-long/2addr",0xC2:"xor-long/2addr",0xC3:"shl-long/2addr",0xC4:"shr-long/2addr",0xC5:"ushr-long/2addr",
 0xC6:"add-float/2addr",0xC7:"sub-float/2addr",0xC8:"mul-float/2addr",0xC9:"div-float/2addr",0xCA:"rem-float/2addr",
 0xCB:"add-double/2addr",0xCC:"sub-double/2addr",0xCD:"mul-double/2addr",0xCE:"div-double/2addr",0xCF:"rem-double/2addr"}
BINL={0xd0:"add-int/lit16",0xd1:"rsub-int",0xd2:"mul-int/lit16",0xd3:"div-int/lit16",0xd4:"rem-int/lit16",
 0xd8:"add-int/lit8",0xd9:"rsub-int/lit8",0xda:"mul-int/lit8",0xdb:"div-int/lit8",0xdc:"rem-int/lit8",0xdd:"and-int/lit8",0xde:"or-int/lit8",0xdf:"xor-int/lit8",0xe0:"shl-int/lit8",0xe1:"shr-int/lit8",0xe2:"ushr-int/lit8"}
UN={0x7b:"neg-int",0x7c:"not-int",0x7d:"neg-long",0x7e:"not-long",0x7f:"neg-float",0x80:"neg-double",0x81:"int-to-long",0x82:"int-to-float",0x83:"int-to-double",0x84:"long-to-int",0x85:"long-to-float",0x86:"long-to-double",0x87:"float-to-int",0x88:"float-to-long",0x89:"float-to-double",0x8a:"double-to-int",0x8b:"double-to-long",0x8c:"double-to-float",0x8d:"int-to-byte",0x8e:"int-to-char",0x8f:"int-to-short"}
def w(i): return struct.unpack_from('<H', code, i*2)[0]
def sext(b,bits): return b-(1<<bits) if b&(1<<(bits-1)) else b
i=0
while i < len(code)//2:
    u=w(i); op=u&0xff; hi=u>>8
    sz=SZ.get(op,1); txt="op%#04x"%op
    if op==0x12: txt="const/4 v%d, #%d"%(hi&0xf, sext((hi>>4)&0xf,4))
    elif op==0x13: txt="const/16 v%d, #%d"%(hi, sext(w(i+1),16))
    elif op==0x14: txt="const v%d, #%d"%(hi, sext(w(i+1)|(w(i+2)<<16),32))
    elif op==0x19: txt="const/high16 v%d, #%#x"%(hi, w(i+1))
    elif op==0x1a: txt="const-string v%d, %r"%(hi, get_str(w(i+1)))
    elif op in (0x0a,0x0b,0x0c,0x0d): txt={0x0a:"move-result",0x0b:"move-result-wide",0x0c:"move-result-object",0x0d:"move-exception"}[op]+" v%d"%hi
    elif op in (0x01,0x04,0x07): txt={0x01:"move",0x04:"move-wide",0x07:"move-object"}[op]+" v%d, v%d"%(hi>>4, hi&0xf)
    elif op in (0x02,0x05,0x08): txt={0x02:"move/from16",0x05:"move-wide/from16",0x08:"move-object/from16"}[op]+" v%d, v%d"%(hi, w(i+1))
    elif op==0x0e: txt="return-void"
    elif op in (0x0f,0x10,0x11): txt={0x0f:"return",0x10:"return-wide",0x11:"return-object"}[op]+" v%d"%hi
    elif op in IGET: txt="%s v%d, v%d, %s"%(IGET[op], hi>>4, hi&0xf, field_info(w(i+1)))
    elif op in SGET: txt="%s v%d, %s"%(SGET[op], hi, field_info(w(i+1)))
    elif op in INV:
        g=hi&0xf; A=hi>>4; rw=w(i+2)
        regs=[rw&0xf,(rw>>4)&0xf,(rw>>8)&0xf,(rw>>12)&0xf][:max(A,1)] if A else []
        txt="%s {%s}, %s"%(INV[op], ",".join("v%d"%r for r in regs), method_info(w(i+1)))
    elif op in INVR:
        txt="%s {v%d..v%d}, %s"%(INVR[op], w(i+2), w(i+2)+hi-1, method_info(w(i+1)))
    elif op==0x28: txt="goto %+d"%sext(hi,8)
    elif op==0x29: txt="goto/16 %+d"%sext(w(i+1),16)
    elif 0x32<=op<=0x37: txt="%s v%d, v%d, %+d"%(IF2[op-0x32], hi>>4, hi&0xf, sext(w(i+1),16))
    elif 0x38<=op<=0x3d: txt="%s v%d, %+d"%(IFZ[op-0x38], hi, sext(w(i+1),16))
    elif op==0x21: txt="array-length v%d, v%d"%(hi>>4, hi&0xf)
    elif op==0x27: txt="throw v%d"%hi
    elif op==0x22: txt="new-instance v%d, %s"%(hi, get_str(u32d(F["type_ids_off"]+w(i+1)*4)))
    elif op==0x1f: txt="check-cast v%d, %s"%(hi, get_str(u32d(F["type_ids_off"]+w(i+1)*4)))
    elif op==0x1c: txt="const-class v%d, %s"%(hi, get_str(u32d(F["type_ids_off"]+w(i+1)*4)))
    elif op==0x26: txt="fill-array-data v%d, %+d"%(hi, sext(w(i+1),16))
    elif op==0x2d: txt="cmpl-float v%d, v%d, v%d"%(hi>>4, hi&0xf, (w(i+1)>>8)&0xff)
    elif op in (0x2e,0x2f,0x30,0x31):
        nm={0x2e:"cmp-long",0x2f:"fcmpl",0x30:"fcmpg",0x31:"dcmpl"}[op]
        txt="%s v%d, v%d, v%d"%(nm, hi>>4, hi&0xf, (w(i+1)>>8)&0xff)
    elif 0x90<=op<=0xaf:
        ww=w(i+1); txt="%s v%d, v%d, v%d"%(BIN[op], hi>>4, hi&0xf, (ww>>8)&0xff)
    elif op in BIN2A: txt="%s v%d, v%d"%(BIN2A[op], hi>>4, hi&0xf)
    elif op in BINL:
        if op<=0xd7: txt="%s v%d, v%d, #%d"%(BINL[op], hi>>4, hi&0xf, sext(w(i+1),16))
        else:
            ww=w(i+1); txt="%s v%d, v%d, #%d"%(BINL[op], hi>>4, ww&0xff, sext((ww>>8)&0xff,8))
    elif op in UN: txt="%s v%d, v%d"%(UN[op], hi>>4, hi&0xf)
    elif op==0x00:
        if u==0x0100 or u==0x0200 or u==0x0300 or u==0x0400 or u==0x0500:
            # payload pseudo-op: size in next unit
            elem=struct.unpack_from('<H',code,(i+1)*2)[0]; size=struct.unpack_from('<I',code,(i+2)*2)[0]
            units={0x0100:1,0x0200:2,0x0300:0,0x0400:4,0x0500:8}[u]
            sz=(size*units+1)//2+4 if u!=0x0300 else size*4+4
            txt="payload %#x size=%d"%(u,size)
        else: txt="nop"
    print("%4d: %-52s ; %04x"%(i,txt,u))
    i+=sz
