package com.initech.inibase.logger.spi;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.Vector;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class b extends PrintWriter {
    private Vector a;

    b() {
        super((Writer) new a());
        this.a = new Vector();
    }

    public final String[] a() {
        int size = this.a.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) this.a.elementAt(i);
        }
        return strArr;
    }

    @Override // java.io.PrintWriter
    public final void print(Object obj) {
        this.a.addElement(obj.toString());
    }

    @Override // java.io.PrintWriter
    public final void print(String str) {
        this.a.addElement(str);
    }

    @Override // java.io.PrintWriter
    public final void print(char[] cArr) {
        this.a.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter
    public final void println(Object obj) {
        this.a.addElement(obj.toString());
    }

    @Override // java.io.PrintWriter
    public final void println(String str) {
        this.a.addElement(str);
    }

    @Override // java.io.PrintWriter
    public final void println(char[] cArr) {
        this.a.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str) {
        this.a.addElement(str);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        this.a.addElement(str.substring(i, i2 + i));
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr) {
        this.a.addElement(new String(cArr));
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        this.a.addElement(new String(cArr, i, i2));
    }
}
