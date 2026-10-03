package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Targets;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.PinShortcutHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Targets implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static char IAuthTabCallback = 0;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100;
    private static char asBinder;
    private static int asInterface;
    private static char[] onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static char onTransact;
    private static BroadcastReceiver onWarmupCompleted;
    private final Lazy onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.PinShortcutHandler$$ExternalSyntheticLambda0
        public final Object invoke() {
            return Integer.valueOf(Targets.IAuthTabCallback());
        }
    });

    static {
        onTransact();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        onExtraCallbackWithResult = 8;
        int i = IAuthTabCallbackStubProxy + 67;
        access100 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub();
        }
        IAuthTabCallbackStub();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i8 | i3));
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i6 | i4));
        int i12 = i6 | i4;
        int i13 = i10 | i12;
        int i14 = (~(i3 | i6)) | (~i12);
        int i15 = i6 + i4 + i2 + (1068639271 * i) + ((-1919980423) * i5);
        int i16 = i15 * i15;
        int i17 = ((i6 * 1648758371) - 594280448) + (1648758371 * i4) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i2) + ((-1693188096) * i) + (611057664 * i5) + ((-810221568) * i16);
        int i18 = (i6 * 982247175) + 1844138806 + (i4 * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i2 * 982246413) + (i * 1533776379) + (i5 * 1016546853) + (i16 * (-1070530560));
        return i17 + ((i18 * i18) * 1708326912) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(onWarmupCompleted(str, str2));
        }
        onWarmupCompleted(str, str2);
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(BroadcastReceiver broadcastReceiver) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 93;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted = broadcastReceiver;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 11;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(Context context, String str, String str2, Targets targets, String str3, Bitmap bitmap) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(context, str, str2, targets, str3, bitmap);
        int i4 = IAuthTabCallbackStub + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ BroadcastReceiver onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        BroadcastReceiver broadcastReceiver = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return broadcastReceiver;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asInterface + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = asInterface + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 78 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = asInterface + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackStub + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 95;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackStub + 67;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Targets targets = (Targets) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) targets.onNavigationEvent.getValue()).intValue();
        int i4 = asInterface + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iIntValue);
    }

    private static final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        int drawable = ((SubjectDirectoryAttributes) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SubjectDirectoryAttributes.class)).getDrawable();
        int i4 = IAuthTabCallbackStub + 25;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return drawable;
        }
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new PinShortcutHandler$.ExternalSyntheticLambda1());
        int i2 = IAuthTabCallbackStub + 77;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return iAuthTabCallback;
    }

    private static final boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            filterCreatePageParams.onTransact(Uri.parse(str));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(Uri.parse(str));
        int i3 = asInterface + 79;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
        return zOnTransact;
    }

    public static final class onExtraCallback extends BroadcastReceiver {
        final /* synthetic */ setOnOutOfMemeryErrorCallback IAuthTabCallback;

        onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
            this.IAuthTabCallback = setonoutofmemeryerrorcallback;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {this.IAuthTabCallback, Boolean.TRUE};
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            ALCFaceBox.onWarmupCompleted(-2103726265, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, iIAuthTabCallback2, 2103726265);
        }
    }

    static /* synthetic */ void IAuthTabCallback(Context context, String str, String str2, Targets targets, String str3, Bitmap bitmap, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 32) != 0) {
            int i6 = i3 + 5;
            asInterface = i6 % 128;
            bitmap = null;
            if (i6 % 2 != 0) {
                bitmap.hashCode();
                throw null;
            }
        }
        onNavigationEvent(context, str, str2, targets, str3, bitmap);
        int i7 = asInterface + 27;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 91;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i5 = $11 + 85;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            int i8 = i3;
            while (i8 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i7) ^ ((c2 << 4) + ((char) (onTransact ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int deadChar = 10 - KeyEvent.getDeadChar(i3, i3);
                        int i11 = (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, deadChar, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (-16777206) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "", 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - Process.getGidForName("")), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, 19901 - View.MeasureSpec.makeMeasureSpec(0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final void onNavigationEvent(Context context, String str, String str2, Targets targets, String str3, Bitmap bitmap) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (bitmap == null) {
            enableEagerRootViewAttachment enableeagerrootviewattachment = enableEagerRootViewAttachment.onNavigationEvent;
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iIntValue = ((Integer) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, 221235652, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -221235651, new Object[]{targets})).intValue();
            Object[] objArr = new Object[1];
            a(new int[]{0, 26, 128, 21}, true, new byte[]{0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0}, objArr);
            enableEagerRootViewAttachment.onExtraCallbackWithResult(enableeagerrootviewattachment, context, str, str2, (String) null, iIntValue, new Intent(((String) objArr[0]).intern(), Uri.parse(str3)), 8, (Object) null);
            return;
        }
        enableEagerRootViewAttachment enableeagerrootviewattachment2 = enableEagerRootViewAttachment.onNavigationEvent;
        Object[] objArr2 = new Object[1];
        a(new int[]{0, 26, 128, 21}, true, new byte[]{0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0}, objArr2);
        enableEagerRootViewAttachment.onExtraCallback(enableeagerrootviewattachment2, context, str, str2, (String) null, bitmap, new Intent(((String) objArr2[0]).intern(), Uri.parse(str3)), 8, (Object) null);
        int i4 = IAuthTabCallbackStub + 117;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent implements ReusableRememberObserverHolder {
        final /* synthetic */ Targets IAuthTabCallback;
        final /* synthetic */ String onExtraCallback;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ Context onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        onNavigationEvent(Context context, String str, String str2, Targets targets, String str3) {
            this.onNavigationEvent = context;
            this.onExtraCallback = str;
            this.onWarmupCompleted = str2;
            this.IAuthTabCallback = targets;
            this.onExtraCallbackWithResult = str3;
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
        }

        public void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) throws Throwable {
            Targets.IAuthTabCallback(this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted, this.IAuthTabCallback, this.onExtraCallbackWithResult, null, 32, null);
        }

        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) throws Throwable {
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            Targets.IAuthTabCallback(this.onNavigationEvent, this.onExtraCallback, this.onWarmupCompleted, this.IAuthTabCallback, this.onExtraCallbackWithResult, CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7, 0, 0, 3, (Object) null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r5 r7
      0x0049: PHI (r5v6 java.lang.Integer) = (r5v5 int), (r5v24 int) binds: [B:8:0x0047, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r7v1 android.content.Context) = (r7v0 android.content.Context), (r7v16 android.content.Context) binds: [B:8:0x0047, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull final o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r26, @org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r28, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Targets.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallback;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 5;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 35283), 35 - Drawable.resolveOpacity(0, 0), 14239 - ((Process.getThreadPriority(0) + 20) >> 6), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
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
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getEdgeSlop() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65, 16718 - KeyEvent.normalizeMetaState(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                    int i11 = $10 + 51;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, 17657 - View.resolveSize(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 49467), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 70, 12485 - TextUtils.lastIndexOf("", '0'), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            int i15 = $11 + 21;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i4];
            loop2: while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i17 = $10 + 35;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        break;
                    }
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) / 0];
                int i18 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i19 = $10 + 7;
            $11 = i19 % 128;
            char c2 = 2;
            int i20 = i19 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[c2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i21 = $11 + 25;
                $10 = i21 % 128;
                c2 = 2;
                int i22 = i21 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, 1032593585, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1032593585, new Object[]{str, str2})).booleanValue();
    }

    private final int asInterface() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Integer) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, 221235652, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -221235651, new Object[]{this})).intValue();
    }

    static void onTransact() {
        onExtraCallback = new char[]{27193, 27296, 27298, 27296, 27301, 27308, 27273, 27295, 27327, 27303, 27298, 27327, 27301, 27269, 27271, 27304, 27298, 27326, 27301, 27303, 27305, 27282, 27264, 27273, 27265, 27276, 27153, 27376, 27384, 27387, 27379, 27380, 27387, 27369, 27364, 27387, 27368, 27365, 27386, 27360, 27159, 27360, 27367, 27391, 27391, 27365, 27390, 27362, 27369, 27168, 27287, 27281, 27286, 27292, 27310, 27307, 27302, 27310, 27311, 27303, 27257, 27168, 27183, 27181, 27169, 27172, 27176, 27236, 27162, 27138, 27141, 27165, 27166, 27141, 27139, 27159, 27164, 27138, 27140, 27149, 27141, 27140, 27254, 27136, 27168, 27170, 27168, 27173, 27180, 27145, 27167, 27199, 27175, 27170, 27199, 27173, 27141, 27143, 27176, 27170, 27198, 27173, 27175, 27177};
        IAuthTabCallback = (char) 10665;
        IAuthTabCallbackDefault = (char) 37755;
        onTransact = (char) 45518;
        asBinder = (char) 13362;
    }
}
