package com.google.android.gms.wearable.internal;

import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdq extends DataBufferRef implements DataItem {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static char[] onNavigationEvent = {27165, 27346, 27354, 27354};
    private static int onWarmupCompleted;
    private final int zza;

    public zzdq(DataHolder dataHolder, int i2, int i3) {
        super(dataHolder, i2);
        this.zza = i3;
    }

    public final /* synthetic */ Object freeze() {
        int i2 = 2 % 2;
        zzdn zzdnVar = new zzdn(this);
        int i3 = onWarmupCompleted + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zzdnVar;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final byte[] getData() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 50, 3}, true, new byte[]{0, 1, 1, 1}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 4, 50, 3}, true, new byte[]{0, 1, 1, 1}, objArr2);
            obj = objArr2[0];
        }
        byte[] byteArray = getByteArray(((String) obj).intern());
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return byteArray;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Uri getUri() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Uri uri = Uri.parse(getString("path"));
        if (i4 == 0) {
            int i5 = 70 / 0;
        }
        return uri;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final DataItem setData(@Nullable byte[] bArr) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Map<String, DataItemAsset> getAssets() {
        int i2 = 2 % 2;
        HashMap map = new HashMap(this.zza);
        int i3 = 0;
        while (i3 < this.zza) {
            zzdm zzdmVar = new zzdm(this.mDataHolder, this.mDataRow + i3);
            if (zzdmVar.getString("asset_key") != null) {
                int i4 = IAuthTabCallback + 45;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    map.put(zzdmVar.getString("asset_key"), zzdmVar);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                map.put(zzdmVar.getString("asset_key"), zzdmVar);
            }
            i3++;
            int i5 = onWarmupCompleted + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = onWarmupCompleted + 109;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return map;
    }

    public final String toString() throws Throwable {
        Object objValueOf;
        int i2 = 2 % 2;
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 50, 3}, true, new byte[]{0, 1, 1, 1}, objArr);
        byte[] byteArray = getByteArray(((String) objArr[0]).intern());
        Map<String, DataItemAsset> assets = getAssets();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(getUri())));
        if (byteArray == null) {
            int i3 = IAuthTabCallback + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            objValueOf = "null";
        } else {
            objValueOf = Integer.valueOf(byteArray.length);
        }
        sb.append(", dataSz=".concat(objValueOf.toString()));
        sb.append(", numAssets=" + assets.size());
        if (zIsLoggable) {
            int i5 = onWarmupCompleted + 81;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                assets.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!assets.isEmpty()) {
                sb.append(", assets=[");
                String str = "";
                for (Map.Entry<String, DataItemAsset> entry : assets.entrySet()) {
                    sb.append(str + entry.getKey() + ": " + entry.getValue().getId());
                    str = ", ";
                }
                sb.append("]");
            }
        }
        sb.append(" }");
        return sb.toString();
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = onNavigationEvent;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 31;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35283), TextUtils.lastIndexOf("", c) + 36, View.MeasureSpec.getMode(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35284), (ViewConfiguration.getTapTimeout() >> 16) + 35, 14239 - TextUtils.getOffsetBefore("", 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i3 = 2;
                c = '0';
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            int i11 = $10 + 57;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10935), TextUtils.indexOf("", "") + 65, (Process.myPid() >> 22) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 28 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 49467), 70 - (ViewConfiguration.getWindowTouchSlop() >> 8), 12486 - TextUtils.indexOf("", "", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i15 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i15, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i15);
            int i16 = $11 + 3;
            $10 = i16 % 128;
            int i17 = i16 % 2;
        }
        if (z) {
            int i18 = $11 + 77;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i20 = $11 + 67;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i22 = $11 + 69;
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] + iArr[3]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
