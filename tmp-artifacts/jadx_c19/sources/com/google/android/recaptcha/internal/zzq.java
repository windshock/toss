package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzq {
    private final SharedPreferences zza;

    public zzq(@NotNull Context context) {
        this.zza = context.getSharedPreferences("_GRECAPTCHA", 0);
    }

    public final String zza(@NotNull String str) {
        return this.zza.getString("_GRECAPTCHA_KC", null);
    }

    public final void zzb(@NotNull Map map) {
        SharedPreferences.Editor editorEdit = this.zza.edit();
        for (Map.Entry entry : map.entrySet()) {
            editorEdit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        editorEdit.commit();
    }
}
