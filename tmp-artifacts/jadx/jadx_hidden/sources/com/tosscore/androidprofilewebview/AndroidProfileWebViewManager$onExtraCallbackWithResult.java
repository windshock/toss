package com.tosscore.androidprofilewebview;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0;
import o.SearchBarStateCompanionExternalSyntheticLambda1;
import o.SegmentedButtonContentMeasurePolicyExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.bindContext;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AndroidProfileWebViewManager$onExtraCallbackWithResult {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 478308930;

    public /* synthetic */ AndroidProfileWebViewManager$onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AndroidProfileWebViewManager$onExtraCallbackWithResult() {
    }

    public static final /* synthetic */ ReadableArray IAuthTabCallback(AndroidProfileWebViewManager$onExtraCallbackWithResult androidProfileWebViewManager$onExtraCallbackWithResult, ReadableMap readableMap, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ReadableArray readableArrayOnNavigationEvent = androidProfileWebViewManager$onExtraCallbackWithResult.onNavigationEvent(readableMap, str);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        int i5 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return readableArrayOnNavigationEvent;
    }

    public static final /* synthetic */ void onWarmupCompleted(AndroidProfileWebViewManager$onExtraCallbackWithResult androidProfileWebViewManager$onExtraCallbackWithResult, String str, SearchBarStateCompanionExternalSyntheticLambda1 searchBarStateCompanionExternalSyntheticLambda1, ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        androidProfileWebViewManager$onExtraCallbackWithResult.onExtraCallbackWithResult(str, searchBarStateCompanionExternalSyntheticLambda1, readableArray);
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 478308948;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final ReadableMap onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((IAuthTabCallback) obj).onNavigationEvent)) {
                return true;
            }
            int i4 = onExtraCallback + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            ReadableMap readableMap = this.onNavigationEvent;
            if (readableMap != null) {
                return readableMap.hashCode();
            }
            int i5 = i3 + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public String toString() {
            int i = 2 % 2;
            ReadableMap readableMap = this.onNavigationEvent;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(21 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{1, 16, 19, '\r', 65521, 5, '\f', 7, 2, '\f', 3, 65518, 65499, 3, 19, '\n', 65535, 20, 65478, 3}, true, 223 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(readableMap);
            Object[] objArr2 = new Object[1];
            a(1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1 - View.MeasureSpec.getSize(0), new char[]{0}, false, 166 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public IAuthTabCallback(@Nullable ReadableMap readableMap) {
            this.onNavigationEvent = readableMap;
        }

        public final ReadableMap onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ReadableMap readableMap = this.onNavigationEvent;
            int i5 = i2 + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return readableMap;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i5 = $10 + 113;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i7] = bindContext.access000.g(cArr2[i7], IAuthTabCallback);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    int i10 = $11 + 67;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    } else {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    }
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                }
                int i11 = $10 + 119;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr2 = cArr4;
            }
            String str = new String(cArr2);
            int i13 = $11 + 15;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            objArr[0] = str;
        }
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            int i5 = $10 + 123;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            cArr2[i7] = bindContext.access000.g(cArr2[i7], onNavigationEvent);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
        }
        if (i2 > 0) {
            int i8 = $11 + 125;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i10 = $11 + 61;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final void onExtraCallbackWithResult(String str, SearchBarStateCompanionExternalSyntheticLambda1 searchBarStateCompanionExternalSyntheticLambda1, ReadableArray readableArray) {
        synchronized (this) {
            Set set = (Set) AndroidProfileWebViewManager.access$getAppliedHeaderNamesByProfile$cp().get(str);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    searchBarStateCompanionExternalSyntheticLambda1.onExtraCallback((String) it.next());
                }
            }
            List<SegmentedButtonContentMeasurePolicyExternalSyntheticLambda0> listOnExtraCallback = onExtraCallback(readableArray);
            Iterator<T> it2 = listOnExtraCallback.iterator();
            while (it2.hasNext()) {
                searchBarStateCompanionExternalSyntheticLambda1.onNavigationEvent((SegmentedButtonContentMeasurePolicyExternalSyntheticLambda0) it2.next());
            }
            Map mapAccess$getAppliedHeaderNamesByProfile$cp = AndroidProfileWebViewManager.access$getAppliedHeaderNamesByProfile$cp();
            List<SegmentedButtonContentMeasurePolicyExternalSyntheticLambda0> list = listOnExtraCallback;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((SegmentedButtonContentMeasurePolicyExternalSyntheticLambda0) it3.next()).IAuthTabCallback());
            }
            mapAccess$getAppliedHeaderNamesByProfile$cp.put(str, CollectionsKt.toSet(arrayList));
        }
    }

    private final ReadableArray onNavigationEvent(ReadableMap readableMap, String str) {
        int i = 2 % 2;
        Object obj = null;
        if (readableMap.hasKey(str)) {
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                readableMap.isNull(str);
                obj.hashCode();
                throw null;
            }
            if (!readableMap.isNull(str)) {
                return readableMap.getArray(str);
            }
        }
        int i3 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
        return null;
    }

    private final List<SegmentedButtonContentMeasurePolicyExternalSyntheticLambda0> onExtraCallback(ReadableArray readableArray) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (readableArray == null) {
            int i5 = i3 + 109;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return CollectionsKt.emptyList();
            }
            CollectionsKt.emptyList();
            obj.hashCode();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            ReadableMap map = readableArray.getMap(i6);
            if (map != null) {
                Object[] objArr = new Object[1];
                a(4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{6, 65529, 5, 65533}, false, View.resolveSize(0, 0) + 211, objArr);
                String strOnExtraCallback = onExtraCallback(map, ((String) objArr[0]).intern());
                String string = strOnExtraCallback != null ? StringsKt.trim(strOnExtraCallback).toString() : null;
                if (string == null) {
                    int i9 = onExtraCallbackWithResult + 107;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    string = "";
                }
                Object[] objArr2 = new Object[1];
                a(Color.blue(0) + 5, 5 - (Process.myTid() >> 22), new char[]{65529, '\t', 0, 65525, '\n'}, true, ImageFormat.getBitsPerPixel(0) + 216, objArr2);
                String strOnExtraCallback2 = onExtraCallback(map, ((String) objArr2[0]).intern());
                if (strOnExtraCallback2 != null) {
                    Object[] objArr3 = new Object[1];
                    a(TextUtils.getOffsetBefore("", 0) + 7, -ImageFormat.getBitsPerPixel(0), new char[]{6, 2, 5, 65532, 65530, 65532, 1}, false, 217 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                    Set<String> setIAuthTabCallback = IAuthTabCallback(map, ((String) objArr3[0]).intern());
                    if (string.length() != 0 && !setIAuthTabCallback.isEmpty()) {
                        arrayList.add(new SegmentedButtonContentMeasurePolicyExternalSyntheticLambda0(string, strOnExtraCallback2, setIAuthTabCallback));
                    }
                }
            }
        }
        return arrayList;
    }

    private final String onExtraCallback(ReadableMap readableMap, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        int i4 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return readableMap.getString(str);
        }
        readableMap.getString(str);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[PHI: r5
      0x0055: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v12 java.lang.String) binds: [B:22:0x0053, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Set<java.lang.String> IAuthTabCallback(com.facebook.react.bridge.ReadableMap r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8.hasKey(r9)
            if (r1 == 0) goto L77
            boolean r1 = r8.isNull(r9)
            if (r1 != 0) goto L77
            com.facebook.react.bridge.ReadableArray r8 = r8.getArray(r9)
            r9 = 0
            if (r8 != 0) goto L2d
            int r8 = com.tosscore.androidprofilewebview.AndroidProfileWebViewManager$onExtraCallbackWithResult.IAuthTabCallback
            int r8 = r8 + 55
            int r1 = r8 % 128
            com.tosscore.androidprofilewebview.AndroidProfileWebViewManager$onExtraCallbackWithResult.onExtraCallbackWithResult = r1
            int r8 = r8 % r0
            if (r8 == 0) goto L26
            java.util.Set r8 = o.clearFaultAdjacentMetadata.onExtraCallback()
            return r8
        L26:
            o.clearFaultAdjacentMetadata.onExtraCallback()
            r9.hashCode()
            throw r9
        L2d:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r2 = r8.size()
            r3 = 0
            r4 = r3
        L38:
            if (r4 >= r2) goto L76
            int r5 = com.tosscore.androidprofilewebview.AndroidProfileWebViewManager$onExtraCallbackWithResult.IAuthTabCallback
            int r5 = r5 + 113
            int r6 = r5 % 128
            com.tosscore.androidprofilewebview.AndroidProfileWebViewManager$onExtraCallbackWithResult.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L4f
            java.lang.String r5 = r8.getString(r4)
            r6 = 83
            int r6 = r6 / r3
            if (r5 == 0) goto L5e
            goto L55
        L4f:
            java.lang.String r5 = r8.getString(r4)
            if (r5 == 0) goto L5e
        L55:
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
            java.lang.String r5 = r5.toString()
            goto L5f
        L5e:
            r5 = r9
        L5f:
            if (r5 == 0) goto L73
            int r6 = r5.length()
            if (r6 == 0) goto L73
            r1.add(r5)
            int r5 = com.tosscore.androidprofilewebview.AndroidProfileWebViewManager$onExtraCallbackWithResult.IAuthTabCallback
            int r5 = r5 + 13
            int r6 = r5 % 128
            com.tosscore.androidprofilewebview.AndroidProfileWebViewManager$onExtraCallbackWithResult.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
        L73:
            int r4 = r4 + 1
            goto L38
        L76:
            return r1
        L77:
            java.util.Set r8 = o.clearFaultAdjacentMetadata.onExtraCallback()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tosscore.androidprofilewebview.AndroidProfileWebViewManager$onExtraCallbackWithResult.IAuthTabCallback(com.facebook.react.bridge.ReadableMap, java.lang.String):java.util.Set");
    }
}
