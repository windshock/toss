package com.tmoney.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class a {
    public static final String TAG = "CommonPreferences";
    protected Context a;
    protected SharedPreferences b;

    protected a(Context context) {
        this.a = context;
    }

    public static a getInstance() {
        synchronized (a.class) {
            throw new IllegalStateException("CommonPreferences is not initialized, call initializeInstance(..) method first.");
        }
    }

    public void clear() {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public boolean getBoolean(String str) {
        return this.b.getBoolean(str, false);
    }

    public int getInt(String str) {
        return this.b.getInt(str, 0);
    }

    public ArrayList<String> getList(String str) {
        return new ArrayList<>(Arrays.asList(TextUtils.split(this.b.getString(str, ""), "‚‗‚")));
    }

    public long getLong(String str) {
        return this.b.getLong(str, 0L);
    }

    public String getString(String str) {
        return this.b.getString(str, "");
    }

    public void putBoolean(String str, boolean z) {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public void putInt(String str, int i) {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public void putList(String str, ArrayList<String> arrayList) {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(str, TextUtils.join("‚‗‚", (String[]) arrayList.toArray(new String[arrayList.size()])));
        editorEdit.apply();
    }

    public void putLong(String str, long j) {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
