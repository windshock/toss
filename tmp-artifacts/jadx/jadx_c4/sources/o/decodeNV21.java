package o;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.tmoney.LiveCheckConstants;
import im.toss.core.webkit.bridge.ShowBridgeHandler$;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class decodeNV21 implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 3075;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 10294;
    private static char onExtraCallbackWithResult = 62124;
    private static int onNavigationEvent = 0;
    private static char onWarmupCompleted = 17389;

    public static /* synthetic */ Unit onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(uIKitBaseActivity);
        int i4 = IAuthTabCallbackDefault + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super.onExtraCallback();
        int i3 = onNavigationEvent + 75;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return onoutofmemoryOnExtraCallback;
        }
        throw null;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.onExtraCallbackWithResult();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i3 = IAuthTabCallbackDefault + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 57;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 31;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity != null) {
            int i4 = IAuthTabCallbackDefault + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (activity.isFinishing()) {
                return;
            }
            int i6 = onNavigationEvent + 53;
            IAuthTabCallbackDefault = i6 % 128;
            String str2 = null;
            if (i6 % 2 == 0) {
                boolean z = activity instanceof UIKitBaseActivity;
                throw null;
            }
            UIKitBaseActivity uIKitBaseActivity = activity instanceof UIKitBaseActivity ? (UIKitBaseActivity) activity : null;
            if (uIKitBaseActivity != null) {
                setText settext = new setText(jsonObject);
                Object[] objArr = new Object[1];
                a(new char[]{64169, 49568, 30073, 15167, 5186, 6041, 22300, 21743, 41884, 51642}, Color.red(0) + 10, objArr);
                String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
                if (strOnNavigationEvent.length() == 0) {
                    return;
                }
                Object[] objArr2 = new Object[1];
                a(new char[]{64169, 49568, 30073, 15167, 5186, 6041, 9937, 59125, 63239, 34972, 41899, 35478, 17810, 13779}, 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
                if (strOnNavigationEvent2.length() != 0) {
                    int i7 = onNavigationEvent;
                    int i8 = i7 + 35;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i7 + 125;
                    IAuthTabCallbackDefault = i10 % 128;
                    int i11 = i10 % 2;
                    str2 = strOnNavigationEvent2;
                }
                onExtraCallback(uIKitBaseActivity, getRegisteredModules.Companion.IAuthTabCallback(strOnNavigationEvent), str2);
            }
        }
    }

    private final void onExtraCallback(UIKitBaseActivity uIKitBaseActivity, getRegisteredModules getregisteredmodules, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
            if (uIKitBaseActivity.MediaSessionCompatQueueItem()) {
                return;
            }
        } else if (uIKitBaseActivity.MediaSessionCompatQueueItem()) {
            return;
        }
        uIKitBaseActivity.IAuthTabCallback(getregisteredmodules, str, 2000L, new ShowBridgeHandler$.ExternalSyntheticLambda0(uIKitBaseActivity));
        int i4 = IAuthTabCallbackDefault + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 2;
        }
    }

    private static final Unit onNavigationEvent(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        UIKitBaseActivity.onWarmupCompleted(uIKitBaseActivity, true, (Function0) null, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 101;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return unit;
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
                int i6 = $10 + 83;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i3);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i3) + 11;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iLastIndexOf, iLastIndexOf2, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), TextUtils.getOffsetBefore("", 0) + 10, 12433 - Process.getGidForName(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getSize(0) + 14, TextUtils.lastIndexOf("", '0', 0) + 19902, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i10 = $10 + 75;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }
}
