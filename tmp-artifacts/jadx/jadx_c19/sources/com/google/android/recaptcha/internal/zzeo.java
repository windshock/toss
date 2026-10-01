package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import java.util.Map;
import kotlin.Pair;
import o.access8100;
import o.getWrite;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzeo implements zzen {
    private final Context zzb;
    private final Map zzc = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(2, "activity"), getWrite.IAuthTabCallback(3, "phone"), getWrite.IAuthTabCallback(4, "input_method"), getWrite.IAuthTabCallback(5, MediaDescription.MEDIA_TYPE_AUDIO)});

    public zzeo(@NotNull Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzen
    public final Object zza(@NotNull Object... objArr) throws zzae {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        Object obj2 = this.zzc.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zzb.getSystemService((String) obj2);
        }
        throw new zzae(4, 4, (Throwable) null);
    }
}
