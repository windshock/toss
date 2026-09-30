package o;

import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.putCharSequenceArray;
import o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putCharSequenceArray {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final LiveDataObservableResult<onPostbackSuccess, LiveDataObservableExternalSyntheticLambda1<r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY>> IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted();
    private long onNavigationEvent;

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i4)) | i8;
        int i10 = ~i6;
        int i11 = ~(i10 | i);
        int i12 = i8 | i11 | (~(i10 | i4));
        int i13 = (~((~i4) | i10)) | i8 | i11;
        int i14 = i + i6 + i3 + ((-369695973) * i5) + (1794320298 * i2);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i) + 1478230016 + (776760710 * i6) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i3) + (217841664 * i5) + ((-410517504) * i2) + ((-175177728) * i15);
        int i17 = ((i * 1872133577) - 2052485254) + (i6 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i3 * 1872134975) + (i5 * (-1328892763)) + (i2 * (-1296121642)) + (i15 * (-1691287552));
        return i16 + ((i17 * i17) * (-1729036288)) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ boolean onWarmupCompleted(long j, r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmay) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) onWarmupCompleted(-1297225876, new Object[]{Long.valueOf(j), r8lambda3ckywq3ss3onutwsvbshr4mmay}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1297225876)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(-1297225876, new Object[]{Long.valueOf(j), r8lambda3ckywq3ss3onutwsvbshr4mmay}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1297225876)).booleanValue();
        int i3 = onExtraCallbackWithResult + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
        return zBooleanValue;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long j = this.onNavigationEvent + 1;
        this.onNavigationEvent = j;
        long jOnWarmupCompleted = getBundle.onWarmupCompleted(j);
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return jOnWarmupCompleted;
        }
        throw null;
    }

    public final void onNavigationEvent(@NotNull onPostbackSuccess onpostbacksuccess, long j, @NotNull String str, @NotNull r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onpostbacksuccess, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) onWarmupCompleted(-259974876, new Object[]{this, onpostbacksuccess}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 259974877);
        Iterator it = liveDataObservableExternalSyntheticLambda1.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (getBundle.onWarmupCompleted(((r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) it.next()).onWarmupCompleted(), j)) {
                break;
            }
            int i3 = onExtraCallbackWithResult + 89;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            i2++;
            int i6 = i4 + 31;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        if (i2 < 0) {
            liveDataObservableExternalSyntheticLambda1.add(new r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY(j, str, onwarmupcompleted, null));
            return;
        }
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmay = (r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) liveDataObservableExternalSyntheticLambda1.get(i2);
        if (putCharArray.onNavigationEvent(r8lambda3ckywq3ss3onutwsvbshr4mmay.onNavigationEvent(), str) && r8lambda3ckywq3ss3onutwsvbshr4mmay.IAuthTabCallback() == onwarmupcompleted) {
            return;
        }
        liveDataObservableExternalSyntheticLambda1.set(i2, r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onNavigationEvent(r8lambda3ckywq3ss3onutwsvbshr4mmay, 0L, str, onwarmupcompleted, 1, null));
        int i8 = onExtraCallbackWithResult + 79;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmay = (r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambda3ckywq3ss3onutwsvbshr4mmay, "");
            return Boolean.valueOf(getBundle.onWarmupCompleted(r8lambda3ckywq3ss3onutwsvbshr4mmay.onWarmupCompleted(), jLongValue));
        }
        Intrinsics.checkNotNullParameter(r8lambda3ckywq3ss3onutwsvbshr4mmay, "");
        getBundle.onWarmupCompleted(r8lambda3ckywq3ss3onutwsvbshr4mmay.onWarmupCompleted(), jLongValue);
        throw null;
    }

    public final void IAuthTabCallback(@NotNull onPostbackSuccess onpostbacksuccess, final long j) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onpostbacksuccess, "");
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) this.IAuthTabCallback.get(onpostbacksuccess);
        if (liveDataObservableExternalSyntheticLambda1 != null) {
            CollectionsKt.removeAll(liveDataObservableExternalSyntheticLambda1, new Function1() { // from class: im.toss.tds.compose.component.compound.SlotRegistry$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return Boolean.valueOf(putCharSequenceArray.onWarmupCompleted(j, (r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) obj));
                    }
                    Boolean.valueOf(putCharSequenceArray.onWarmupCompleted(j, (r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) obj));
                    throw null;
                }
            });
            int i4 = onExtraCallbackWithResult + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r1 = o.putCharSequenceArray.onExtraCallback + 109;
        o.putCharSequenceArray.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY> onExtraCallbackWithResult(@NotNull onPostbackSuccess onpostbacksuccess) {
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onpostbacksuccess, "");
            liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) this.IAuthTabCallback.get(onpostbacksuccess);
            int i3 = 95 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onpostbacksuccess, "");
            liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) this.IAuthTabCallback.get(onpostbacksuccess);
        }
    }

    public final boolean onExtraCallback(@NotNull onPostbackSuccess onpostbacksuccess, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onpostbacksuccess, "");
        Intrinsics.checkNotNullParameter(str, "");
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) this.IAuthTabCallback.get(onpostbacksuccess);
        if (liveDataObservableExternalSyntheticLambda1 != null) {
            int size = liveDataObservableExternalSyntheticLambda1.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = onExtraCallbackWithResult + 5;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (putCharArray.onNavigationEvent(((r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) liveDataObservableExternalSyntheticLambda1.get(i2)).onNavigationEvent(), str)) {
                    int i5 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                i2++;
                int i7 = onExtraCallback + 109;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return false;
    }

    public final boolean onWarmupCompleted(@NotNull onPostbackSuccess onpostbacksuccess, @NotNull List<putCharArray> list) {
        int size;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onpostbacksuccess, "");
        Intrinsics.checkNotNullParameter(list, "");
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) this.IAuthTabCallback.get(onpostbacksuccess);
        if (liveDataObservableExternalSyntheticLambda1 != null) {
            int i3 = onExtraCallbackWithResult + 83;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                size = liveDataObservableExternalSyntheticLambda1.size();
                i = 1;
            } else {
                size = liveDataObservableExternalSyntheticLambda1.size();
                i = 0;
            }
            while (i < size) {
                int i4 = onExtraCallbackWithResult + 95;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    list.contains(putCharArray.onNavigationEvent(((r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) liveDataObservableExternalSyntheticLambda1.get(i)).onNavigationEvent()));
                    throw null;
                }
                if (list.contains(putCharArray.onNavigationEvent(((r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) liveDataObservableExternalSyntheticLambda1.get(i)).onNavigationEvent()))) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1
      0x002c: PHI (r1v3 o.LiveDataObservableResult<o.onPostbackSuccess, o.LiveDataObservableExternalSyntheticLambda1<o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY>>) = 
      (r1v2 o.LiveDataObservableResult<o.onPostbackSuccess, o.LiveDataObservableExternalSyntheticLambda1<o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY>>)
      (r1v4 o.LiveDataObservableResult<o.onPostbackSuccess, o.LiveDataObservableExternalSyntheticLambda1<o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY>>)
     binds: [B:8:0x002a, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LiveDataObservableResult<onPostbackSuccess, LiveDataObservableExternalSyntheticLambda1<r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY>> liveDataObservableResult;
        Object objOnExtraCallbackWithResult;
        putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objArr[0];
        onPostbackSuccess onpostbacksuccess = (onPostbackSuccess) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            liveDataObservableResult = putcharsequencearray.IAuthTabCallback;
            objOnExtraCallbackWithResult = liveDataObservableResult.get(onpostbacksuccess);
            int i3 = 19 / 0;
            if (objOnExtraCallbackWithResult == null) {
                int i4 = onExtraCallbackWithResult + 57;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                objOnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult();
                liveDataObservableResult.put(onpostbacksuccess, objOnExtraCallbackWithResult);
                int i6 = onExtraCallbackWithResult + 73;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            liveDataObservableResult = putcharsequencearray.IAuthTabCallback;
            objOnExtraCallbackWithResult = liveDataObservableResult.get(onpostbacksuccess);
            if (objOnExtraCallbackWithResult == null) {
            }
        }
        return (LiveDataObservableExternalSyntheticLambda1) objOnExtraCallbackWithResult;
    }

    public final r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY IAuthTabCallback(@NotNull onPostbackSuccess onpostbacksuccess, @NotNull Function1<? super r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY, Boolean> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onpostbacksuccess, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) this.IAuthTabCallback.get(onpostbacksuccess);
        Object obj = null;
        if (liveDataObservableExternalSyntheticLambda1 == null) {
            return null;
        }
        int size = liveDataObservableExternalSyntheticLambda1.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            int i5 = onExtraCallbackWithResult + 69;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            Object obj2 = liveDataObservableExternalSyntheticLambda1.get(i4);
            if (!(!((Boolean) function1.invoke(obj2)).booleanValue())) {
                obj = obj2;
                break;
            }
            i4++;
        }
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmay = (r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) obj;
        int i7 = onExtraCallbackWithResult + 75;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return r8lambda3ckywq3ss3onutwsvbshr4mmay;
    }

    private final LiveDataObservableExternalSyntheticLambda1<r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY> onExtraCallback(onPostbackSuccess onpostbacksuccess) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (LiveDataObservableExternalSyntheticLambda1) onWarmupCompleted(-259974876, new Object[]{this, onpostbacksuccess}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 259974877);
    }

    private static final boolean onNavigationEvent(long j, r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmay) {
        Object[] objArr = {Long.valueOf(j), r8lambda3ckywq3ss3onutwsvbshr4mmay};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) onWarmupCompleted(-1297225876, objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1297225876)).booleanValue();
    }
}
