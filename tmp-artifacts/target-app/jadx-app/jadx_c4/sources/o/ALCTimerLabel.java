package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.core.webkit.bridge.AbsLoadImagesHandler$;
import im.toss.core.webkit.bridge.image.Image;
import im.toss.core.webkit.bridge.image.LoadImagesDialog;
import im.toss.core.webkit.bridge.image.camera.CameraActivity;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCTimerLabel;
import o.IPostMessageService_Parcel;
import o.onOutOfMemory;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class ALCTimerLabel implements ALCFaceQuality {
    private static final byte[] $$a = {61, -49, -70, 93};
    private static final int $$b = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static char[] onExtraCallbackWithResult = {60742, 23300, 33218, 53146, 13394, 25124, 43257, 5801, 24414, 34091, 62433, 14412, 26142, 60839, 23549, 33069, 53108, 13487, 25327, 60855, 23539, 33077, 53091, 13502, 25323, 43040, 5708, 24449, 34260, 62209, 14515, 26347, 44062, 6757, 17341, 35287, 63232, 15697, 27286, 53464, 7683, 18367, 36336, 60856, 23549, 33087, 53089, 13477, 25316, 43031, 5736, 24461, 34247, 62239};
    private static long onWarmupCompleted = -3793341919879996526L;
    private static char[] onExtraCallback = {27252, 27199, 27199, 27196, 27159, 27155, 27170, 27177, 27352, 27495, 27489, 27519, 27491, 27492, 27489, 27492, 27249, 27342, 27184, 27338, 27331, 27336, 27197, 27193, 27335, 27337, 27343, 27338, 27334, 27197, 27170, 27341, 27339, 27341, 27343, 27186, 27173, 27289, 27291, 27295, 27292, 27291, 27290, 27377, 27378, 27290, 27288, 27294, 27291, 27284, 27281};

    private static String $$c(int i, int i2, short s) {
        int i3 = (i2 * 3) + 4;
        byte[] bArr = $$a;
        int i4 = (i * 2) + 97;
        int i5 = s * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = i6 + (-i3);
            i3++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i3;
            i4 += -bArr[i3];
            i3 = i9 + 1;
            i7 = i8;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(startrunning);
        }
        IAuthTabCallback(startrunning);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i6 + i + i5 + ((-112346298) * i3) + (505796074 * i4);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i6) - 1525940224) + (1734765094 * i) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i5) + (859308032 * i3) + (310902784 * i4) + (417529856 * i13);
        int i15 = (i6 * (-1233303660)) + 1670658458 + (i * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i5 * (-1233302909)) + (i3 * 1075253458) + (i4 * 745806526) + (i13 * 1512636416);
        int i16 = i14 + (i15 * i15 * (-1737162752));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            return onWarmupCompleted(objArr);
        }
        int i17 = 2 % 2;
        ((setOnOutOfMemeryErrorCallback) objArr[0]).IAuthTabCallback(new AbsLoadImagesHandler$.ExternalSyntheticLambda1());
        Unit unit = Unit.INSTANCE;
        int i18 = onNavigationEvent + 77;
        IAuthTabCallback = i18 % 128;
        int i19 = i18 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(startrunning);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = IAuthTabCallback + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(new Object[]{setonoutofmemeryerrorcallback}, -1579660147, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1579660147);
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(startrunning);
        int i4 = IAuthTabCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{function0, dialogInterface}, 358279853, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -358279851);
        int i4 = IAuthTabCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public abstract void onExtraCallbackWithResult(@NotNull String str, @NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Context context, @NotNull setText settext, @NotNull List<String> list, int i, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback);

    @Override // o.drawTextBox
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        return true ^ (i2 % 2 == 0);
    }

    public static final /* synthetic */ void IAuthTabCallback(ALCTimerLabel aLCTimerLabel, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        aLCTimerLabel.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onnavigationevent);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        int i5 = onNavigationEvent + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(ALCTimerLabel aLCTimerLabel, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{aLCTimerLabel, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onnavigationevent}, 1525670740, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1525670739);
        int i4 = onNavigationEvent + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
            int i3 = 38 / 0;
        } else {
            zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory.onNavigationEvent onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        if (i3 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        return new java.util.ArrayList<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        r6 = kotlin.collections.CollectionsKt.arrayListOf(new java.lang.String[]{r6.toString()});
        r7 = o.ALCTimerLabel.onNavigationEvent + 95;
        o.ALCTimerLabel.IAuthTabCallback = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if ((r7 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ArrayList<String> onNavigationEvent(int i, int i2, Intent intent, int i3) throws Throwable {
        Uri uriOnExtraCallback;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        if (i != 1252) {
            if (i == 1253) {
                extras = intent != null ? intent.getExtras() : null;
                if (extras != null) {
                    Object[] objArr = new Object[1];
                    a(Process.getGidForName("") + 1, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, (char) (251 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr);
                    ArrayList<String> stringArrayList = extras.getStringArrayList(((String) objArr[0]).intern());
                    if (stringArrayList != null) {
                        return stringArrayList;
                    }
                }
                return new ArrayList<>();
            }
            throw new IllegalArgumentException();
        }
        IPostMessageService_Parcel.onExtraCallback onextracallbackIAuthTabCallback = IAuthTabCallback(i3);
        if (onextracallbackIAuthTabCallback instanceof IPostMessageService_Parcel.onExtraCallback) {
            List listIAuthTabCallback = onextracallbackIAuthTabCallback.IAuthTabCallback(i2, intent);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
            Iterator it = listIAuthTabCallback.iterator();
            while (it.hasNext()) {
                arrayList.add(((Uri) it.next()).toString());
            }
            return new ArrayList<>(arrayList);
        }
        if (onextracallbackIAuthTabCallback instanceof IPostMessageService_Parcel.onTransact) {
            int i7 = onNavigationEvent + 43;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                uriOnExtraCallback = ((IPostMessageService_Parcel.onTransact) onextracallbackIAuthTabCallback).onExtraCallback(i2, intent);
                int i8 = 83 / 0;
            } else {
                uriOnExtraCallback = ((IPostMessageService_Parcel.onTransact) onextracallbackIAuthTabCallback).onExtraCallback(i2, intent);
            }
        } else {
            return new ArrayList<>();
        }
    }

    public void onNavigationEvent(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, str);
        int i4 = IAuthTabCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    private static final Unit IAuthTabCallback(startRunning startrunning) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        List listEmptyList = CollectionsKt.emptyList();
        try {
            Result.Companion companion = kotlin.Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = kotlin.Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(new checkCanOpenLandingPage(Image.Companion.serializer()), listEmptyList));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!(!kotlin.Result.onExtraCallback(obj))) {
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            obj = null;
        }
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, (String) obj}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    protected void onNavigationEvent(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.bridge.AbsLoadImagesHandler$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i3 % 128;
                Object obj2 = null;
                startRunning startrunning = (startRunning) obj;
                if (i3 % 2 == 0) {
                    ALCTimerLabel.onExtraCallback(startrunning);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallback = ALCTimerLabel.onExtraCallback(startrunning);
                int i4 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        });
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit asInterface(startRunning startrunning) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        List listEmptyList = CollectionsKt.emptyList();
        try {
            Result.Companion companion = kotlin.Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = kotlin.Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(new checkCanOpenLandingPage(Image.Companion.serializer()), listEmptyList));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i2 = onNavigationEvent + 73;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                int i4 = 53 / 0;
            }
            int i5 = i3 + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            obj = null;
        }
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, (String) obj}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 13;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 28 / 0;
        }
        return unit;
    }

    public void onExtraCallback(@NotNull String str, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.bridge.AbsLoadImagesHandler$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 73;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = ALCTimerLabel.onNavigationEvent((startRunning) obj);
                int i5 = onExtraCallback + 117;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 73 / 0;
                }
                return unitOnNavigationEvent;
            }
        });
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59697), (ViewConfiguration.getLongPressTimeout() >> 16) + 17, 10973 - View.MeasureSpec.getSize(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 46134), 31 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0') + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 49123), ExpandableListView.getPackedPositionGroup(0L) + 44, 1494 - (KeyEvent.getMaxKeyCode() >> 16), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $11 + 91;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 % 3;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 79;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 49123), MotionEvent.axisFromString("") + 45, 1494 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.resolveSize(0, 0)), 44 - Drawable.resolveOpacity(0, 0), (Process.myTid() >> 22) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    @Override // o.ALCFaceQuality
    public final void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i2 != -1) {
            onNavigationEvent(setonoutofmemeryerrorcallback);
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        b(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 0}, new int[]{0, 8, 0, 0}, objArr);
        int iOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        b(false, new byte[]{0, 1, 0, 0, 1, 0, 1, 1}, new int[]{8, 8, 195, 4}, objArr2);
        int iOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), 0);
        try {
            ArrayList<String> arrayListOnNavigationEvent = onNavigationEvent(i, i2, intent, iOnNavigationEvent);
            Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            Intrinsics.checkNotNull(context);
            onExtraCallbackWithResult(str, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, context, settext, arrayListOnNavigationEvent, iOnNavigationEvent2, setonoutofmemeryerrorcallback);
            int i5 = IAuthTabCallback + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            onExtraCallback(str, setonoutofmemeryerrorcallback, th);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 5 - TextUtils.lastIndexOf("", '0', 0, 0), (char) View.resolveSizeAndState(0, 0, 0), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b(true, new byte[]{0, 0, 1, 0, 0, 1, 1, 0}, new int[]{0, 8, 0, 0}, objArr2);
        int iOnNavigationEvent = settext.onNavigationEvent(((String) objArr2[0]).intern(), 0);
        Object[] objArr3 = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 20, TextUtils.indexOf((CharSequence) "", '0', 0) + 25, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        b(true, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0}, new int[]{16, 20, 26, 0}, objArr4);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 44, 11 - TextUtils.getCapsMode("", 0, 0), (char) Color.argb(0, 0, 0, 0), objArr5);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        Object[] objArr6 = new Object[1];
        b(false, new byte[]{0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, new int[]{36, 15, 106, 15}, objArr6);
        onNavigationEvent onnavigationevent = new onNavigationEvent(iOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent3, strOnNavigationEvent4, settext.onNavigationEvent(((String) objArr6[0]).intern(), ""));
        int i2 = IAuthTabCallback.onWarmupCompleted[onWarmupCompleted.Companion.onExtraCallbackWithResult(strOnNavigationEvent).ordinal()];
        if (i2 == 1) {
            onExtraCallbackWithResult(new Object[]{this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onnavigationevent}, 1525670740, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1525670739);
            return;
        }
        int i3 = onNavigationEvent + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (i2 == 2) {
            onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onnavigationevent);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onnavigationevent, (Function0<Unit>) new AbsLoadImagesHandler$.ExternalSyntheticLambda4(setonoutofmemeryerrorcallback));
            int i5 = onNavigationEvent + 113;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final Unit onExtraCallbackWithResult(startRunning startrunning) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        List listEmptyList = CollectionsKt.emptyList();
        try {
            Result.Companion companion = kotlin.Result.Companion;
            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = kotlin.Result.constructor-impl(wie2VarOnExtraCallback.onWarmupCompleted(new checkCanOpenLandingPage(Image.Companion.serializer()), listEmptyList));
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i4 = onNavigationEvent + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, (String) obj}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult implements LoadImagesDialog.IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ onNavigationEvent onExtraCallbackWithResult;
        final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ onNavigationEvent;

        onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onNavigationEvent onnavigationevent) {
            this.onNavigationEvent = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            this.onExtraCallbackWithResult = onnavigationevent;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public void onExtraCallbackWithResult(LoadImagesDialog.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            int i4 = onExtraCallbackWithResult.IAuthTabCallback[onwarmupcompleted.ordinal()];
            if (i4 == 1) {
                ALCTimerLabel.IAuthTabCallback(ALCTimerLabel.this, this.onNavigationEvent, this.onExtraCallbackWithResult);
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = onWarmupCompleted + 5;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ALCTimerLabel.onNavigationEvent(ALCTimerLabel.this, this.onNavigationEvent, this.onExtraCallbackWithResult);
            }
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function0.invoke();
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onNavigationEvent onnavigationevent, Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity != null) {
            LoadImagesDialog loadImagesDialog = new LoadImagesDialog(activity, new onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onnavigationevent));
            loadImagesDialog.setOnCancelListener(new AbsLoadImagesHandler$.ExternalSyntheticLambda2(function0));
            loadImagesDialog.show();
        } else {
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private final ITrustedWebActivityCallbackStub<IPostMessageServiceDefault, ? extends Object> IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (i <= 1) {
            return new IPostMessageService_Parcel.onTransact();
        }
        IPostMessageService_Parcel.onExtraCallback onextracallback = new IPostMessageService_Parcel.onExtraCallback(i);
        int i5 = IAuthTabCallback + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    private final void onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            int i4 = IAuthTabCallback + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, IAuthTabCallback(onnavigationevent.IAuthTabCallback()).onWarmupCompleted(context, ITrustedWebActivityCallback.onExtraCallbackWithResult(IPostMessageService_Parcel.onTransact.onExtraCallback.onNavigationEvent, 0, false, (IPostMessageService_Parcel.onTransact.onExtraCallbackWithResult) null, 14, (Object) null)), 1252, (Bundle) null, 4, (Object) null);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[1];
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        Object obj = null;
        if (context == null) {
            int i4 = onNavigationEvent + 63;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, CameraActivity.Companion.onExtraCallback(context, onnavigationevent.IAuthTabCallback(), onnavigationevent.onNavigationEvent(), onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.onWarmupCompleted(), onnavigationevent.onExtraCallback()), 1253, (Bundle) null, 4, (Object) null);
        return null;
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallback;
        if (cArr != null) {
            int i7 = $10;
            int i8 = i7 + 115;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = i7 + 25;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            for (int i12 = 0; i12 < length; i12++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 35283), (ViewConfiguration.getWindowTouchSlop() >> 8) + 35, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = $11 + 61;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 10936), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 64, 16718 - ExpandableListView.getPackedPositionGroup(0L), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 28, (ViewConfiguration.getTouchSlop() >> 8) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 49467), 70 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12487 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i17 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i17, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i18 = $10 + 7;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i20 = $11 + 31;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] >> iArr[3]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        return (Unit) onExtraCallbackWithResult(new Object[]{setonoutofmemeryerrorcallback}, -1579660147, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 1579660147);
    }

    private static final void onExtraCallbackWithResult(Function0 function0, DialogInterface dialogInterface) {
        onExtraCallbackWithResult(new Object[]{function0, dialogInterface}, 358279853, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -358279851);
    }

    private final void onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onNavigationEvent onnavigationevent) {
        onExtraCallbackWithResult(new Object[]{this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onnavigationevent}, 1525670740, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -1525670739);
    }
}
