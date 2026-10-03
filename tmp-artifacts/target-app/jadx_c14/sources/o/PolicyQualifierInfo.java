package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.TimeoutCompanionNONE1;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.GetClipboardTextHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PolicyQualifierInfo implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static char onExtraCallback = 10102;
    private static char onExtraCallbackWithResult = 38055;
    private static char onNavigationEvent = 11984;
    private static char onWarmupCompleted = 35341;

    public static /* synthetic */ Unit IAuthTabCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(startrunning);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(startrunning);
        int i3 = asInterface + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(startrunning);
        int i4 = asInterface + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(startrunning);
        int i4 = asInterface + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        int i5 = IAuthTabCallback + 49;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallback + 17;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 88 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = asInterface + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = asInterface + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = asInterface + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallback + 71;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new GetClipboardTextHandler$.ExternalSyntheticLambda0());
        int i2 = asInterface + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
        int i3 = asInterface + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(startRunning startrunning) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.IAuthTabCallback();
            unit = Unit.INSTANCE;
            int i3 = 12 / 0;
        } else {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.IAuthTabCallback();
            unit = Unit.INSTANCE;
        }
        int i4 = asInterface + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        Object systemService;
        ClipboardManager clipboardManager;
        ClipData.Item itemAt;
        CharSequence text;
        int i = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        try {
            FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            if (activity != null) {
                Object[] objArr = new Object[1];
                a(new char[]{28462, 63192, 49396, 37540, 44162, 40249, 60107, 11513, 6744, 7974}, 9 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                systemService = activity.getSystemService(((String) objArr[0]).intern());
                int i2 = asInterface + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
            } else {
                systemService = null;
            }
            if (!(systemService instanceof ClipboardManager)) {
                clipboardManager = null;
            } else {
                int i4 = asInterface + 93;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                clipboardManager = (ClipboardManager) systemService;
            }
            if (clipboardManager != null) {
                int i5 = asInterface + 97;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (clipboardManager.hasPrimaryClip()) {
                    int i7 = asInterface + 11;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        clipboardManager.getPrimaryClip();
                        throw null;
                    }
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
                        int i8 = asInterface + 31;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        String string = text.toString();
                        if (string != null) {
                            str2 = string;
                        }
                    }
                    enableFabricLogs enablefabriclogs = enableFabricLogs.onExtraCallback;
                    if (enablefabriclogs.onExtraCallback(str2)) {
                        if (((Boolean) enableFabricLogs.onExtraCallbackWithResult(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1307295849, 1307295853, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{enablefabriclogs})).booleanValue()) {
                            setonoutofmemeryerrorcallback.IAuthTabCallback(new GetClipboardTextHandler$.ExternalSyntheticLambda1());
                            return;
                        }
                    }
                    if (!enablefabriclogs.onExtraCallback(str2)) {
                        enableFabricLogs.onExtraCallbackWithResult(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 415908122, -415908121, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{enablefabriclogs, str2});
                    }
                    ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, str2);
                    return;
                }
            }
            setonoutofmemeryerrorcallback.IAuthTabCallback(new GetClipboardTextHandler$.ExternalSyntheticLambda2());
        } catch (Throwable unused) {
            setonoutofmemeryerrorcallback.IAuthTabCallback(new GetClipboardTextHandler$.ExternalSyntheticLambda3());
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 49;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int offsetBefore = TextUtils.getOffsetBefore("", i3) + 10;
                        int iRgb = (-16764782) - Color.rgb(i3, i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, offsetBefore, iRgb, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 10 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $11 + 99;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 16015), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, Gravity.getAbsoluteGravity(0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 35;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
