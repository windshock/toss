package com.skp.smarttouch.sem.tools.dao;

import o.putStringSet;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class TagInfo {
    private byte a;
    private byte[] d;
    private int e;
    private String f;
    private byte[] b = new byte[2];
    private int c = 0;
    private boolean g = false;
    private boolean h = false;

    public void setTag1Byte(byte b) {
        this.a = b;
        this.f = putStringSet.onWarmupCompleted(b);
        setTagGbn(1);
    }

    public byte getTag1Byte() {
        return this.a;
    }

    public void setTag2Byte(byte[] bArr) {
        this.b = bArr;
        this.f = putStringSet.onWarmupCompleted(bArr);
        setTagGbn(2);
    }

    public byte[] getTag2Byte() {
        return this.b;
    }

    public void setLen(int i) {
        this.c = i;
        this.d = new byte[i];
    }

    public int getLen() {
        return this.c;
    }

    public void setBody(byte[] bArr) {
        this.d = bArr;
    }

    public byte[] getBody() {
        return this.d;
    }

    public void setTagGbn(int i) {
        this.e = i;
    }

    public int getTagGbn() {
        return this.e;
    }

    public void setTagStr(String str) {
        this.f = str;
    }

    public String getTagStr() {
        return this.f;
    }

    public void setHasTag(boolean z) {
        this.g = z;
    }

    public boolean getHasTag() {
        return this.g;
    }

    public void setSkipLen(boolean z) {
        this.h = z;
    }

    public boolean getSkipLen() {
        return this.h;
    }
}
