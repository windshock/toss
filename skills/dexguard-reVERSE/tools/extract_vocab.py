#!/usr/bin/env python3
"""§149 — DEX string pool에서 가드 탐지 어휘 전량 복호화.
Usage: python3 extract_vocab.py <toss_hidden_fixed.dex> [string_index]
Decoder: out[k] = rotl16(tbl[i+k],13) ^ ((k*W)&0xFFFF) ^ c
  tbl = DEX string #4236 (4380 MUTF-8 chars → 2190 BE chars)
  W = rotl64(R=6339512474634032604, 45) & 0xFFFF = 0x3D77
c brute-force by first-char heuristic (/=path, A=tag, g=generic).
"""
import struct, re, sys, json

def read_uleb(d, o):
    r=0;s=0
    while True:
        b=d[o];o+=1;r|=(b&0x7F)<<s
        if not(b&0x80):break
        s+=7
    return r,o

def read_mutf8(d, o):
    ul,o = read_uleb(d,o);out=[]
    while len(out)<ul:
        b=d[o];o+=1
        if b<0x80:out.append(b)
        elif(b&0xE0)==0xC0:b2=d[o];o+=1;out.append(((b&0x1F)<<6)|(b2&0x3F))
        elif(b&0xF0)==0xE0:
            b2=d[o];o+=1;b3=d[o];o+=1
            out.append(((b&0x0F)<<12)|((b2&0x3F)<<6)|(b3&0x3F))
        else:out.append(b)
    return out

def rotl16(v,n):return((v<<n)|(v>>(16-n)))&0xFFFF
def rotl64(v,n):v&=(1<<64)-1;return((v<<n)|(v>>(64-n)))&((1<<64)-1)

def main():
    dex = open(sys.argv[1],"rb").read()
    idx = int(sys.argv[2]) if len(sys.argv)>2 else 4236
    sio = struct.unpack_from("<I",dex,0x3c)[0]
    so = struct.unpack_from("<I",dex,sio+idx*4)[0]
    chars = read_mutf8(dex,so)
    raw = bytes(c&0xFF for c in chars)
    tbl = [(raw[i]<<8)|raw[i+1] for i in range(0,len(raw),2)]
    R = 6339512474634032604; W = rotl64(R,45)&0xFFFF
    def dec(i,i2,c):
        out=""
        for k in range(i2):
            if i+k>=len(tbl):break
            t=tbl[i+k]&0xFFFF
            out+=chr(rotl16(t,13)^((k*W)&0xFFFF)^(c&0xFFFF))
        return out
    results={}
    for i in range(0,len(tbl)):
        t0=rotl16(tbl[i]&0xFFFF,13)
        for first in "/sbfcpdgGABCDEN":
            c0=t0^ord(first)
            s=dec(i,8,c0)
            if len(s)>=6 and sum(1 for ch in s if 32<=ch<127)>=6:
                if s[1:4] in("dev","sys","pro","dat","ven","com","and","bin","lib","en.") or \
                   s[0].isupper() and s[1].isupper():
                    full=dec(i,100,c0)
                    real=""
                    for ch in full:
                        if 32<=ch<127:real+=ch
                        else:break
                    if len(real)>=5:
                        results[i]=(c0,real);break
    for i in sorted(results):
        c,s=results[i]
        print(f"i={i} c={hex(c)}: {s}")
    json.dump([(i,hex(c),s) for i,(c,s) in sorted(results.items())],
              open("/tmp/vocab_extracted.json","w"),ensure_ascii=False)

if __name__=="__main__":main()
