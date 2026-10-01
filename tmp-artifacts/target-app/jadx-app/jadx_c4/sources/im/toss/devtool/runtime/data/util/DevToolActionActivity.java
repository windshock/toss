package im.toss.devtool.runtime.data.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tmoney.LiveCheckConstants;
import im.toss.devtool.domain.usecase.RunDevToolActionUseCase;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.RequestProgress;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.getScopeType;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.putChannelInfo;
import o.setPatch;
import o.setRandomHost;
import o.zzad;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DevToolActionActivity extends Hilt_DevToolActionActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Object Companion;
    private static final String IAuthTabCallbackDefault;
    public static final int IAuthTabCallbackStub;
    private static char IAuthTabCallbackStubProxy = 0;
    private static final String IAuthTabCallback_Parcel;
    private static int[] ICustomTabsCallback = null;
    private static final String access000;
    private static char[] access100 = null;
    public static final String asBinder;
    public static final String asInterface;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static final String onTransact;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;

    @Inject
    public Object controller;

    @Inject
    public zzad environments;
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.devtool.runtime.data.util.DevToolActionActivity$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = ((i2 ^ 37) | (i2 & 37)) << 1;
            int i4 = -(((~i2) & 37) | (i2 & (-38)));
            int i5 = (i3 & i4) + (i4 | i3);
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                DevToolActionActivity.onExtraCallback(this.f$0);
                throw null;
            }
            RunDevToolActionUseCase runDevToolActionUseCaseOnExtraCallback = DevToolActionActivity.onExtraCallback(this.f$0);
            int i6 = onExtraCallback;
            int i7 = i6 ^ 35;
            int i8 = -(-((i6 & 35) << 1));
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                return runDevToolActionUseCaseOnExtraCallback;
            }
            throw null;
        }
    });

    @Inject
    public getScopeType repository;

    static {
        setEngagementSignalsCallback();
        Object[] objArr = new Object[1];
        a(new char[]{'%', 17, '/', 15, 22, '8', 17, '\"', 13829}, (byte) (View.combineMeasuredStates(0, 0) + 28), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, objArr);
        access000 = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{'7', 24, '?', '6', 22, '\"', 24, '1', 31, 3}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 63), Process.getGidForName("") + 11, objArr2);
        asInterface = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{'\'', 25, 31, 15, 31, 3, 15, '\"', '8', 24, '3', 24, 13868}, (byte) (View.resolveSize(0, 0) + 67), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, objArr3);
        IAuthTabCallback_Parcel = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        c(new int[]{762437043, -19935076, 112964233, 1696085946}, 6 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
        asBinder = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new char[]{'7', 1, '%', 18, '7', '\n', ':', 22, 21, '2', 13836}, (byte) (View.resolveSizeAndState(0, 0, 0) + 35), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, objArr5);
        onTransact = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{'7', 1, '.', '=', 13922, 13922, '3', 21, '\'', 25, 31, 15, 31, 3}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 109), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14, objArr6);
        IAuthTabCallbackDefault = ((String) objArr6[0]).intern();
        try {
            Object[] objArr7 = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(511290622);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 62896), KeyEvent.getDeadChar(0, 0) + 72, (ViewConfiguration.getWindowTouchSlop() >> 8) + 11923, 792285806, false, (String) null, new Class[]{DefaultConstructorMarker.class});
            }
            Companion = ((Constructor) objOnExtraCallback).newInstance(objArr7);
            IAuthTabCallbackStub = 8;
            int i = writeTypedObject + 115;
            readTypedObject = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback$f3db318(Object obj, DevToolActionActivity devToolActionActivity, String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult$f3db318 = onExtraCallbackWithResult$f3db318(obj, devToolActionActivity, str, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return unitOnExtraCallbackWithResult$f3db318;
    }

    public static /* synthetic */ RunDevToolActionUseCase onExtraCallback(DevToolActionActivity devToolActionActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(devToolActionActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RunDevToolActionUseCase runDevToolActionUseCaseOnExtraCallbackWithResult = onExtraCallbackWithResult(devToolActionActivity);
        int i3 = extraCallback + 27;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return runDevToolActionUseCaseOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        DevToolActionActivity devToolActionActivity = (DevToolActionActivity) objArr[0];
        String str = (String) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(devToolActionActivity, str, dialogInterface);
        }
        onExtraCallbackWithResult(devToolActionActivity, str, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~i5) | i8;
        int i10 = ~(i5 | i8);
        int i11 = i4 + i3 + i6 + ((-714989572) * i) + (1142003473 * i2);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i4) - 1983905792) + (1136689320 * i3) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i6) + ((-1891631104) * i) + ((-1355808768) * i2) + ((-1882259456) * i12);
        int i14 = (i4 * (-1158907614)) + 1427560840 + (i3 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i6 * (-1158906635)) + (i * 1387703340) + (i2 * 1202573125) + (i12 * (-451215360));
        int i15 = i13 + (i14 * i14 * (-310837248));
        return i15 != 1 ? i15 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 69;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return -1L;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(DevToolActionActivity devToolActionActivity, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = devToolActionActivity.onNavigationEvent((access13800<? super Unit>) access13800Var);
        int i4 = extraCallbackWithResult + 17;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 1;
        im.toss.devtool.runtime.data.util.DevToolActionActivity.extraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback$15da5ecc() {
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            obj = this.controller;
            int i4 = 50 / 0;
        } else {
            obj = this.controller;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r3 = r3 + 13;
        im.toss.devtool.runtime.data.util.DevToolActionActivity.extraCallbackWithResult = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DevToolActionActivity devToolActionActivity = (DevToolActionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        getScopeType getscopetype = devToolActionActivity.repository;
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
    }

    public final zzad onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 33;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 23;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    private final RunDevToolActionUseCase ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.getInterfaceDescriptor.getValue();
        if (i3 == 0) {
            return (RunDevToolActionUseCase) value;
        }
        int i4 = 78 / 0;
        return (RunDevToolActionUseCase) value;
    }

    private static final RunDevToolActionUseCase onExtraCallbackWithResult(DevToolActionActivity devToolActionActivity) {
        int i = 2 % 2;
        RunDevToolActionUseCase runDevToolActionUseCase = new RunDevToolActionUseCase(devToolActionActivity.IAuthTabCallback$15da5ecc(), (getScopeType) onNavigationEvent(new Object[]{devToolActionActivity}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1570091790, -1570091788, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback()));
        int i2 = extraCallbackWithResult + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return runDevToolActionUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.devtool.runtime.data.util.Hilt_DevToolActionActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this);
        setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
        try {
            Object[] objArr = {this, null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-458675580);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43607 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 74 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.rgb(0, 0, 0) + 16789211, -706096108, false, (String) null, new Class[]{DevToolActionActivity.class, access13800.class});
            }
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, setpatchOnExtraCallback, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback).newInstance(objArr), 2, (Object) null);
            int i2 = extraCallbackWithResult + 119;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0579 A[Catch: all -> 0x0ad8, TryCatch #2 {all -> 0x0ad8, blocks: (B:97:0x04ff, B:169:0x08f6, B:175:0x0930, B:177:0x093d, B:178:0x0963, B:180:0x0975, B:181:0x099b, B:183:0x09aa, B:184:0x09d2, B:186:0x09e1, B:187:0x0a09, B:189:0x0a1b, B:190:0x0a41, B:192:0x0a4f, B:193:0x0a73, B:195:0x0a81, B:196:0x0aa7, B:200:0x0ac0, B:202:0x0ac6, B:203:0x0ac7, B:143:0x074c, B:145:0x0752, B:146:0x0779, B:148:0x078b, B:149:0x07b1, B:151:0x07bc, B:152:0x07e0, B:154:0x07eb, B:155:0x0811, B:157:0x0823, B:158:0x0849, B:160:0x0857, B:161:0x087f, B:163:0x088d, B:164:0x08b5, B:205:0x0ac9, B:207:0x0acf, B:208:0x0ad0, B:209:0x0ad1, B:56:0x0297, B:79:0x03f8, B:100:0x0507, B:104:0x0541, B:109:0x054e, B:112:0x05a7, B:114:0x05b8, B:115:0x05de, B:117:0x05f0, B:118:0x0612, B:120:0x061d, B:121:0x0643, B:123:0x0652, B:124:0x0676, B:126:0x0684, B:127:0x06ab, B:129:0x06b9, B:130:0x06df, B:111:0x0579, B:105:0x0546, B:106:0x054a, B:135:0x070a, B:137:0x0710, B:138:0x0736, B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:225:0x0180, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0903 A[Catch: all -> 0x0abf, TryCatch #3 {all -> 0x0abf, blocks: (B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:226:0x08fd, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x093d A[Catch: all -> 0x0ad8, TryCatch #2 {all -> 0x0ad8, blocks: (B:97:0x04ff, B:169:0x08f6, B:175:0x0930, B:177:0x093d, B:178:0x0963, B:180:0x0975, B:181:0x099b, B:183:0x09aa, B:184:0x09d2, B:186:0x09e1, B:187:0x0a09, B:189:0x0a1b, B:190:0x0a41, B:192:0x0a4f, B:193:0x0a73, B:195:0x0a81, B:196:0x0aa7, B:200:0x0ac0, B:202:0x0ac6, B:203:0x0ac7, B:143:0x074c, B:145:0x0752, B:146:0x0779, B:148:0x078b, B:149:0x07b1, B:151:0x07bc, B:152:0x07e0, B:154:0x07eb, B:155:0x0811, B:157:0x0823, B:158:0x0849, B:160:0x0857, B:161:0x087f, B:163:0x088d, B:164:0x08b5, B:205:0x0ac9, B:207:0x0acf, B:208:0x0ad0, B:209:0x0ad1, B:56:0x0297, B:79:0x03f8, B:100:0x0507, B:104:0x0541, B:109:0x054e, B:112:0x05a7, B:114:0x05b8, B:115:0x05de, B:117:0x05f0, B:118:0x0612, B:120:0x061d, B:121:0x0643, B:123:0x0652, B:124:0x0676, B:126:0x0684, B:127:0x06ab, B:129:0x06b9, B:130:0x06df, B:111:0x0579, B:105:0x0546, B:106:0x054a, B:135:0x070a, B:137:0x0710, B:138:0x0736, B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:225:0x0180, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0975 A[Catch: all -> 0x0ad8, TryCatch #2 {all -> 0x0ad8, blocks: (B:97:0x04ff, B:169:0x08f6, B:175:0x0930, B:177:0x093d, B:178:0x0963, B:180:0x0975, B:181:0x099b, B:183:0x09aa, B:184:0x09d2, B:186:0x09e1, B:187:0x0a09, B:189:0x0a1b, B:190:0x0a41, B:192:0x0a4f, B:193:0x0a73, B:195:0x0a81, B:196:0x0aa7, B:200:0x0ac0, B:202:0x0ac6, B:203:0x0ac7, B:143:0x074c, B:145:0x0752, B:146:0x0779, B:148:0x078b, B:149:0x07b1, B:151:0x07bc, B:152:0x07e0, B:154:0x07eb, B:155:0x0811, B:157:0x0823, B:158:0x0849, B:160:0x0857, B:161:0x087f, B:163:0x088d, B:164:0x08b5, B:205:0x0ac9, B:207:0x0acf, B:208:0x0ad0, B:209:0x0ad1, B:56:0x0297, B:79:0x03f8, B:100:0x0507, B:104:0x0541, B:109:0x054e, B:112:0x05a7, B:114:0x05b8, B:115:0x05de, B:117:0x05f0, B:118:0x0612, B:120:0x061d, B:121:0x0643, B:123:0x0652, B:124:0x0676, B:126:0x0684, B:127:0x06ab, B:129:0x06b9, B:130:0x06df, B:111:0x0579, B:105:0x0546, B:106:0x054a, B:135:0x070a, B:137:0x0710, B:138:0x0736, B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:225:0x0180, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09aa A[Catch: all -> 0x0ad8, TryCatch #2 {all -> 0x0ad8, blocks: (B:97:0x04ff, B:169:0x08f6, B:175:0x0930, B:177:0x093d, B:178:0x0963, B:180:0x0975, B:181:0x099b, B:183:0x09aa, B:184:0x09d2, B:186:0x09e1, B:187:0x0a09, B:189:0x0a1b, B:190:0x0a41, B:192:0x0a4f, B:193:0x0a73, B:195:0x0a81, B:196:0x0aa7, B:200:0x0ac0, B:202:0x0ac6, B:203:0x0ac7, B:143:0x074c, B:145:0x0752, B:146:0x0779, B:148:0x078b, B:149:0x07b1, B:151:0x07bc, B:152:0x07e0, B:154:0x07eb, B:155:0x0811, B:157:0x0823, B:158:0x0849, B:160:0x0857, B:161:0x087f, B:163:0x088d, B:164:0x08b5, B:205:0x0ac9, B:207:0x0acf, B:208:0x0ad0, B:209:0x0ad1, B:56:0x0297, B:79:0x03f8, B:100:0x0507, B:104:0x0541, B:109:0x054e, B:112:0x05a7, B:114:0x05b8, B:115:0x05de, B:117:0x05f0, B:118:0x0612, B:120:0x061d, B:121:0x0643, B:123:0x0652, B:124:0x0676, B:126:0x0684, B:127:0x06ab, B:129:0x06b9, B:130:0x06df, B:111:0x0579, B:105:0x0546, B:106:0x054a, B:135:0x070a, B:137:0x0710, B:138:0x0736, B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:225:0x0180, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x09e1 A[Catch: all -> 0x0ad8, TryCatch #2 {all -> 0x0ad8, blocks: (B:97:0x04ff, B:169:0x08f6, B:175:0x0930, B:177:0x093d, B:178:0x0963, B:180:0x0975, B:181:0x099b, B:183:0x09aa, B:184:0x09d2, B:186:0x09e1, B:187:0x0a09, B:189:0x0a1b, B:190:0x0a41, B:192:0x0a4f, B:193:0x0a73, B:195:0x0a81, B:196:0x0aa7, B:200:0x0ac0, B:202:0x0ac6, B:203:0x0ac7, B:143:0x074c, B:145:0x0752, B:146:0x0779, B:148:0x078b, B:149:0x07b1, B:151:0x07bc, B:152:0x07e0, B:154:0x07eb, B:155:0x0811, B:157:0x0823, B:158:0x0849, B:160:0x0857, B:161:0x087f, B:163:0x088d, B:164:0x08b5, B:205:0x0ac9, B:207:0x0acf, B:208:0x0ad0, B:209:0x0ad1, B:56:0x0297, B:79:0x03f8, B:100:0x0507, B:104:0x0541, B:109:0x054e, B:112:0x05a7, B:114:0x05b8, B:115:0x05de, B:117:0x05f0, B:118:0x0612, B:120:0x061d, B:121:0x0643, B:123:0x0652, B:124:0x0676, B:126:0x0684, B:127:0x06ab, B:129:0x06b9, B:130:0x06df, B:111:0x0579, B:105:0x0546, B:106:0x054a, B:135:0x070a, B:137:0x0710, B:138:0x0736, B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:225:0x0180, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0a1b A[Catch: all -> 0x0ad8, TryCatch #2 {all -> 0x0ad8, blocks: (B:97:0x04ff, B:169:0x08f6, B:175:0x0930, B:177:0x093d, B:178:0x0963, B:180:0x0975, B:181:0x099b, B:183:0x09aa, B:184:0x09d2, B:186:0x09e1, B:187:0x0a09, B:189:0x0a1b, B:190:0x0a41, B:192:0x0a4f, B:193:0x0a73, B:195:0x0a81, B:196:0x0aa7, B:200:0x0ac0, B:202:0x0ac6, B:203:0x0ac7, B:143:0x074c, B:145:0x0752, B:146:0x0779, B:148:0x078b, B:149:0x07b1, B:151:0x07bc, B:152:0x07e0, B:154:0x07eb, B:155:0x0811, B:157:0x0823, B:158:0x0849, B:160:0x0857, B:161:0x087f, B:163:0x088d, B:164:0x08b5, B:205:0x0ac9, B:207:0x0acf, B:208:0x0ad0, B:209:0x0ad1, B:56:0x0297, B:79:0x03f8, B:100:0x0507, B:104:0x0541, B:109:0x054e, B:112:0x05a7, B:114:0x05b8, B:115:0x05de, B:117:0x05f0, B:118:0x0612, B:120:0x061d, B:121:0x0643, B:123:0x0652, B:124:0x0676, B:126:0x0684, B:127:0x06ab, B:129:0x06b9, B:130:0x06df, B:111:0x0579, B:105:0x0546, B:106:0x054a, B:135:0x070a, B:137:0x0710, B:138:0x0736, B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:225:0x0180, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0a4f A[Catch: all -> 0x0ad8, TryCatch #2 {all -> 0x0ad8, blocks: (B:97:0x04ff, B:169:0x08f6, B:175:0x0930, B:177:0x093d, B:178:0x0963, B:180:0x0975, B:181:0x099b, B:183:0x09aa, B:184:0x09d2, B:186:0x09e1, B:187:0x0a09, B:189:0x0a1b, B:190:0x0a41, B:192:0x0a4f, B:193:0x0a73, B:195:0x0a81, B:196:0x0aa7, B:200:0x0ac0, B:202:0x0ac6, B:203:0x0ac7, B:143:0x074c, B:145:0x0752, B:146:0x0779, B:148:0x078b, B:149:0x07b1, B:151:0x07bc, B:152:0x07e0, B:154:0x07eb, B:155:0x0811, B:157:0x0823, B:158:0x0849, B:160:0x0857, B:161:0x087f, B:163:0x088d, B:164:0x08b5, B:205:0x0ac9, B:207:0x0acf, B:208:0x0ad0, B:209:0x0ad1, B:56:0x0297, B:79:0x03f8, B:100:0x0507, B:104:0x0541, B:109:0x054e, B:112:0x05a7, B:114:0x05b8, B:115:0x05de, B:117:0x05f0, B:118:0x0612, B:120:0x061d, B:121:0x0643, B:123:0x0652, B:124:0x0676, B:126:0x0684, B:127:0x06ab, B:129:0x06b9, B:130:0x06df, B:111:0x0579, B:105:0x0546, B:106:0x054a, B:135:0x070a, B:137:0x0710, B:138:0x0736, B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:225:0x0180, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a81 A[Catch: all -> 0x0ad8, TryCatch #2 {all -> 0x0ad8, blocks: (B:97:0x04ff, B:169:0x08f6, B:175:0x0930, B:177:0x093d, B:178:0x0963, B:180:0x0975, B:181:0x099b, B:183:0x09aa, B:184:0x09d2, B:186:0x09e1, B:187:0x0a09, B:189:0x0a1b, B:190:0x0a41, B:192:0x0a4f, B:193:0x0a73, B:195:0x0a81, B:196:0x0aa7, B:200:0x0ac0, B:202:0x0ac6, B:203:0x0ac7, B:143:0x074c, B:145:0x0752, B:146:0x0779, B:148:0x078b, B:149:0x07b1, B:151:0x07bc, B:152:0x07e0, B:154:0x07eb, B:155:0x0811, B:157:0x0823, B:158:0x0849, B:160:0x0857, B:161:0x087f, B:163:0x088d, B:164:0x08b5, B:205:0x0ac9, B:207:0x0acf, B:208:0x0ad0, B:209:0x0ad1, B:56:0x0297, B:79:0x03f8, B:100:0x0507, B:104:0x0541, B:109:0x054e, B:112:0x05a7, B:114:0x05b8, B:115:0x05de, B:117:0x05f0, B:118:0x0612, B:120:0x061d, B:121:0x0643, B:123:0x0652, B:124:0x0676, B:126:0x0684, B:127:0x06ab, B:129:0x06b9, B:130:0x06df, B:111:0x0579, B:105:0x0546, B:106:0x054a, B:135:0x070a, B:137:0x0710, B:138:0x0736, B:171:0x08fd, B:173:0x0903, B:174:0x0929), top: B:225:0x0180, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(access13800<? super Unit> access13800Var) throws Throwable {
        Uri uri;
        DevToolActionActivity devToolActionActivity;
        String str;
        int i;
        Uri uri2;
        Map<String, List<String>> map;
        DevToolActionActivity devToolActionActivity2;
        String str2;
        Map<String, List<String>> map2;
        Object obj;
        Uri uri3;
        int i2;
        RunDevToolActionUseCase runDevToolActionUseCaseICustomTabsServiceDefault;
        Object objOnExtraCallback;
        Object objInvoke;
        Object objOnExtraCallback2;
        Object objOnExtraCallback3;
        Object objOnExtraCallback4;
        Object objOnExtraCallback5;
        Object objOnExtraCallback6;
        Object objOnExtraCallback7;
        Object objOnExtraCallback8;
        access13800<? super Unit> access13800Var2 = access13800Var;
        int i3 = 2 % 2;
        Object obj2 = null;
        if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((-1) - TextUtils.lastIndexOf("", '0')), 73 - TextUtils.getTrimmedLength(""), 12068 - (ViewConfiguration.getLongPressTimeout() >> 16))).isInstance(access13800Var2)) {
            int i4 = extraCallback + 7;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                Object objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
                if (objOnExtraCallback9 == null) {
                    objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 74 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 12068 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1293905602, false, "label", (Class[]) null);
                }
                ((Field) objOnExtraCallback9).getInt(access13800Var2);
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback10 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
            if (objOnExtraCallback10 == null) {
                objOnExtraCallback10 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 74, 12067 - MotionEvent.axisFromString(""), -1293905602, false, "label", (Class[]) null);
            }
            int i5 = ((Field) objOnExtraCallback10).getInt(access13800Var2);
            if ((Integer.MIN_VALUE & i5) != 0) {
                int i6 = i5 - 2147483648;
                Object objOnExtraCallback11 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
                if (objOnExtraCallback11 == null) {
                    objOnExtraCallback11 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 74, 12069 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1293905602, false, "label", (Class[]) null);
                }
                ((Field) objOnExtraCallback11).setInt(access13800Var2, i6);
            } else {
                try {
                    Object[] objArr = {this, access13800Var};
                    Object objOnExtraCallback12 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-925692673);
                    if (objOnExtraCallback12 == null) {
                        objOnExtraCallback12 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (Process.myPid() >> 22) + 73, View.getDefaultSize(0, 0) + 12068, -107744657, false, (String) null, new Class[]{DevToolActionActivity.class, access13800.class});
                    }
                    access13800Var2 = (access13800) ((Constructor) objOnExtraCallback12).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        Object objOnExtraCallback13 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(803280977);
        if (objOnExtraCallback13 == null) {
            objOnExtraCallback13 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 72, 12068 - View.MeasureSpec.getMode(0), 513926849, false, "result", (Class[]) null);
        }
        Object obj3 = ((Field) objOnExtraCallback13).get(access13800Var2);
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        Object objOnExtraCallback14 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
        if (objOnExtraCallback14 == null) {
            objOnExtraCallback14 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0') + 74, 12116 - AndroidCharacter.getMirror('0'), -1293905602, false, "label", (Class[]) null);
        }
        int i7 = ((Field) objOnExtraCallback14).getInt(access13800Var2);
        try {
        } catch (Throwable th2) {
            Result.Companion companion = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (i7 == 0) {
            ResultKt.onNavigationEvent(obj3);
            Result.Companion companion2 = Result.Companion;
            Intent intent = getIntent();
            Object[] objArr2 = new Object[1];
            a(new char[]{'3', 31, 22, '<', 17, '\"', '$', 17, '7', 1, 15, '/', '\r', '2', '6', '\'', '*', 14, 22, 17, 13907}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 96), TextUtils.lastIndexOf("", '0', 0) + 22, objArr2);
            String stringExtra = intent.getStringExtra(((String) objArr2[0]).intern());
            if (stringExtra != null) {
                int i8 = extraCallback + 3;
                extraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    Uri.parse(stringExtra);
                    throw null;
                }
                uri = Uri.parse(stringExtra);
            } else {
                uri = null;
            }
            if (uri != null) {
                Object[] objArr3 = new Object[1];
                a(new char[]{'7', 24, '?', '6', 22, '\"', 24, '1', 31, 3}, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 62), TextUtils.lastIndexOf("", '0') + 11, objArr3);
                String stringExtra2 = uri.getQueryParameter(((String) objArr3[0]).intern());
                if (stringExtra2 == null) {
                    Intent intent2 = getIntent();
                    Object[] objArr4 = new Object[1];
                    c(new int[]{762437043, -19935076, 112964233, 1696085946}, View.MeasureSpec.getMode(0) + 6, objArr4);
                    stringExtra2 = intent2.getStringExtra(((String) objArr4[0]).intern());
                    Intrinsics.checkNotNull(stringExtra2);
                }
                Map<String, List<String>> mapOnExtraCallbackWithResult = onExtraCallbackWithResult(uri);
                RunDevToolActionUseCase runDevToolActionUseCaseICustomTabsServiceDefault2 = ICustomTabsServiceDefault();
                Object objOnExtraCallback15 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(57913682);
                if (objOnExtraCallback15 == null) {
                    objOnExtraCallback15 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 73, 12068 - TextUtils.indexOf("", "", 0), 842223554, false, "L$0", (Class[]) null);
                }
                ((Field) objOnExtraCallback15).set(access13800Var2, this);
                Object objOnNavigationEvent = access15400.onNavigationEvent(stringExtra2);
                Object objOnExtraCallback16 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(58837203);
                if (objOnExtraCallback16 == null) {
                    objOnExtraCallback16 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0') + 74, TextUtils.indexOf("", "") + 12068, 851523139, false, "L$1", (Class[]) null);
                }
                ((Field) objOnExtraCallback16).set(access13800Var2, objOnNavigationEvent);
                Object objOnExtraCallback17 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(59760724);
                if (objOnExtraCallback17 == null) {
                    objOnExtraCallback17 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 73 - TextUtils.getOffsetAfter("", 0), 12069 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 852434628, false, "L$2", (Class[]) null);
                }
                ((Field) objOnExtraCallback17).set(access13800Var2, mapOnExtraCallbackWithResult);
                Object objOnNavigationEvent2 = access15400.onNavigationEvent(uri);
                Object objOnExtraCallback18 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(60684245);
                if (objOnExtraCallback18 == null) {
                    objOnExtraCallback18 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0', 0) + 74, 12068 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 853346629, false, "L$3", (Class[]) null);
                }
                ((Field) objOnExtraCallback18).set(access13800Var2, objOnNavigationEvent2);
                Object objOnExtraCallback19 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1690369935);
                if (objOnExtraCallback19 == null) {
                    objOnExtraCallback19 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 73, KeyEvent.getDeadChar(0, 0) + 12068, 1434452255, false, "I$0", (Class[]) null);
                }
                ((Field) objOnExtraCallback19).setInt(access13800Var2, 0);
                Object objOnExtraCallback20 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
                if (objOnExtraCallback20 == null) {
                    objOnExtraCallback20 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 73, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12068, -1293905602, false, "label", (Class[]) null);
                }
                ((Field) objOnExtraCallback20).setInt(access13800Var2, 1);
                Object objIAuthTabCallback = runDevToolActionUseCaseICustomTabsServiceDefault2.IAuthTabCallback(stringExtra2, access13800Var2);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    int i9 = extraCallback + 113;
                    extraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    devToolActionActivity = this;
                    str = stringExtra2;
                    i = 0;
                    uri2 = uri;
                    obj3 = objIAuthTabCallback;
                    map = mapOnExtraCallbackWithResult;
                }
                return objOnWarmupCompleted;
            }
            return Unit.INSTANCE;
        }
        int i11 = extraCallbackWithResult + 49;
        extraCallback = i11 % 128;
        if (i11 % 2 == 0 ? i7 != 1 : i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    Object[] objArr5 = new Object[1];
                    a(new char[]{24, '7', 13823, 13823, 22, ';', 19, 20, 0, 24, 1, '\'', 19, 29, 0, '?', 18, '#', 3, '7', 19, 17, 3, 23, '?', '0', '%', '.', 22, '*', 0, '?', 20, 11, '6', '?', 16, 20, 26, 23, 17, 19, 22, '=', '6', '\'', 13832}, (byte) (9 - Gravity.getAbsoluteGravity(0, 0)), 47 - View.combineMeasuredStates(0, 0), objArr5);
                    throw new IllegalStateException(((String) objArr5[0]).intern());
                }
                Object objOnExtraCallback21 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(61607766);
                if (objOnExtraCallback21 == null) {
                    objOnExtraCallback21 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 74 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 12068 - (ViewConfiguration.getWindowTouchSlop() >> 8), 854389190, false, "L$4", (Class[]) null);
                }
                Object objOnExtraCallback22 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(60684245);
                if (objOnExtraCallback22 == null) {
                    objOnExtraCallback22 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 72 - MotionEvent.axisFromString(""), 12068 - (ViewConfiguration.getJumpTapTimeout() >> 16), 853346629, false, "L$3", (Class[]) null);
                }
                ((Field) objOnExtraCallback22).get(access13800Var2);
                Object objOnExtraCallback23 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(59760724);
                if (objOnExtraCallback23 == null) {
                    objOnExtraCallback23 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), AndroidCharacter.getMirror('0') + 25, 12067 - Process.getGidForName(""), 852434628, false, "L$2", (Class[]) null);
                }
                Object objOnExtraCallback24 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(58837203);
                if (objOnExtraCallback24 == null) {
                    objOnExtraCallback24 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 73 - (ViewConfiguration.getTouchSlop() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12068, 851523139, false, "L$1", (Class[]) null);
                }
                Object objOnExtraCallback25 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(57913682);
                if (objOnExtraCallback25 == null) {
                    objOnExtraCallback25 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 73 - TextUtils.getOffsetAfter("", 0), 12067 - ImageFormat.getBitsPerPixel(0), 842223554, false, "L$0", (Class[]) null);
                }
                ResultKt.onNavigationEvent(obj3);
                Result.constructor-impl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            Object objOnExtraCallback26 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1690369935);
            if (objOnExtraCallback26 == null) {
                objOnExtraCallback26 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 73 - ExpandableListView.getPackedPositionGroup(0L), 12068 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1434452255, false, "I$0", (Class[]) null);
            }
            i2 = ((Field) objOnExtraCallback26).getInt(access13800Var2);
            Object objOnExtraCallback27 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(61607766);
            if (objOnExtraCallback27 == null) {
                objOnExtraCallback27 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 72 - TextUtils.indexOf((CharSequence) "", '0'), 12069 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 854389190, false, "L$4", (Class[]) null);
            }
            uri3 = (Uri) ((Field) objOnExtraCallback27).get(access13800Var2);
            Object objOnExtraCallback28 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(60684245);
            if (objOnExtraCallback28 == null) {
                objOnExtraCallback28 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 73, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12068, 853346629, false, "L$3", (Class[]) null);
            }
            obj = ((Field) objOnExtraCallback28).get(access13800Var2);
            Object objOnExtraCallback29 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(59760724);
            if (objOnExtraCallback29 == null) {
                objOnExtraCallback29 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), View.MeasureSpec.getMode(0) + 73, TextUtils.indexOf("", "", 0) + 12068, 852434628, false, "L$2", (Class[]) null);
            }
            map2 = (Map) ((Field) objOnExtraCallback29).get(access13800Var2);
            Object objOnExtraCallback30 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(58837203);
            if (objOnExtraCallback30 == null) {
                objOnExtraCallback30 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 73 - View.getDefaultSize(0, 0), Color.rgb(0, 0, 0) + 16789284, 851523139, false, "L$1", (Class[]) null);
            }
            str2 = (String) ((Field) objOnExtraCallback30).get(access13800Var2);
            Object objOnExtraCallback31 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(57913682);
            if (objOnExtraCallback31 == null) {
                objOnExtraCallback31 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionType(0L) + 73, 12068 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 842223554, false, "L$0", (Class[]) null);
            }
            devToolActionActivity2 = (DevToolActionActivity) ((Field) objOnExtraCallback31).get(access13800Var2);
            ResultKt.onNavigationEvent(obj3);
            obj3 = obj;
            str = str2;
            devToolActionActivity = devToolActionActivity2;
            uri2 = uri3;
            i = i2;
            runDevToolActionUseCaseICustomTabsServiceDefault = devToolActionActivity.ICustomTabsServiceDefault();
            try {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1404304175);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0', 0) + 14, 11119 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1660093887, false, "onNavigationEvent", new Class[0]);
                }
                objInvoke = ((Method) objOnExtraCallback).invoke(obj3, null);
                Object objOnNavigationEvent3 = access15400.onNavigationEvent(devToolActionActivity);
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(57913682);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 72 - TextUtils.lastIndexOf("", '0', 0), 12068 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 842223554, false, "L$0", (Class[]) null);
                }
                ((Field) objOnExtraCallback2).set(access13800Var2, objOnNavigationEvent3);
                Object objOnNavigationEvent4 = access15400.onNavigationEvent(str);
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(58837203);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 72 - TextUtils.lastIndexOf("", '0'), (KeyEvent.getMaxKeyCode() >> 16) + 12068, 851523139, false, "L$1", (Class[]) null);
                }
                ((Field) objOnExtraCallback3).set(access13800Var2, objOnNavigationEvent4);
                Object objOnNavigationEvent5 = access15400.onNavigationEvent(map2);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(59760724);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 73 - KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(0) + 12068, 852434628, false, "L$2", (Class[]) null);
                }
                ((Field) objOnExtraCallback4).set(access13800Var2, objOnNavigationEvent5);
                Object objOnNavigationEvent6 = access15400.onNavigationEvent(obj3);
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(60684245);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 74, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12068, 853346629, false, "L$3", (Class[]) null);
                }
                ((Field) objOnExtraCallback5).set(access13800Var2, objOnNavigationEvent6);
                Object objOnNavigationEvent7 = access15400.onNavigationEvent(uri2);
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(61607766);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionChild(0L) + 74, TextUtils.getCapsMode("", 0, 0) + 12068, 854389190, false, "L$4", (Class[]) null);
                }
                ((Field) objOnExtraCallback6).set(access13800Var2, objOnNavigationEvent7);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1690369935);
                if (objOnExtraCallback7 == null) {
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) + 74, 12068 - Color.red(0), 1434452255, false, "I$0", (Class[]) null);
                }
                ((Field) objOnExtraCallback7).setInt(access13800Var2, i);
                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
                if (objOnExtraCallback8 == null) {
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 74 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 12067 - MotionEvent.axisFromString(""), -1293905602, false, "label", (Class[]) null);
                }
                ((Field) objOnExtraCallback8).setInt(access13800Var2, 3);
                if (RunDevToolActionUseCase.onExtraCallback$5a2aa680(runDevToolActionUseCaseICustomTabsServiceDefault, objInvoke, map2, null, access13800Var2, 4, null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                Result.constructor-impl(Unit.INSTANCE);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        }
        Object objOnExtraCallback32 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1690369935);
        if (objOnExtraCallback32 == null) {
            objOnExtraCallback32 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 73 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12067 - TextUtils.indexOf((CharSequence) "", '0'), 1434452255, false, "I$0", (Class[]) null);
        }
        i = ((Field) objOnExtraCallback32).getInt(access13800Var2);
        Object objOnExtraCallback33 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(60684245);
        if (objOnExtraCallback33 == null) {
            objOnExtraCallback33 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 73, 12068 - View.MeasureSpec.getSize(0), 853346629, false, "L$3", (Class[]) null);
        }
        uri2 = (Uri) ((Field) objOnExtraCallback33).get(access13800Var2);
        Object objOnExtraCallback34 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(59760724);
        if (objOnExtraCallback34 == null) {
            objOnExtraCallback34 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), Drawable.resolveOpacity(0, 0) + 73, TextUtils.getCapsMode("", 0, 0) + 12068, 852434628, false, "L$2", (Class[]) null);
        }
        map = (Map) ((Field) objOnExtraCallback34).get(access13800Var2);
        Object objOnExtraCallback35 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(58837203);
        if (objOnExtraCallback35 == null) {
            objOnExtraCallback35 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 73 - ExpandableListView.getPackedPositionGroup(0L), 12068 - (ViewConfiguration.getWindowTouchSlop() >> 8), 851523139, false, "L$1", (Class[]) null);
        }
        str = (String) ((Field) objOnExtraCallback35).get(access13800Var2);
        Object objOnExtraCallback36 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(57913682);
        if (objOnExtraCallback36 == null) {
            objOnExtraCallback36 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 72, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12069, 842223554, false, "L$0", (Class[]) null);
        }
        devToolActionActivity = (DevToolActionActivity) ((Field) objOnExtraCallback36).get(access13800Var2);
        ResultKt.onNavigationEvent(obj3);
        if (obj3 != null) {
            int i12 = extraCallbackWithResult + 39;
            extraCallback = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object objOnExtraCallback37 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1672155308);
                if (objOnExtraCallback37 == null) {
                    objOnExtraCallback37 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 12 - TextUtils.lastIndexOf("", '0'), 11118 - TextUtils.lastIndexOf("", '0'), -1391193660, false, "onWarmupCompleted", new Class[0]);
                }
                if (!(!((Boolean) ((Method) objOnExtraCallback37).invoke(obj3, null)).booleanValue())) {
                    Object objOnExtraCallback38 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(57913682);
                    if (objOnExtraCallback38 == null) {
                        objOnExtraCallback38 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 73 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12068 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 842223554, false, "L$0", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback38).set(access13800Var2, devToolActionActivity);
                    Object objOnNavigationEvent8 = access15400.onNavigationEvent(str);
                    Object objOnExtraCallback39 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(58837203);
                    if (objOnExtraCallback39 == null) {
                        objOnExtraCallback39 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 73 - KeyEvent.normalizeMetaState(0), 12069 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 851523139, false, "L$1", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback39).set(access13800Var2, objOnNavigationEvent8);
                    Object objOnExtraCallback40 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(59760724);
                    if (objOnExtraCallback40 == null) {
                        objOnExtraCallback40 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 73 - View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 12069, 852434628, false, "L$2", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback40).set(access13800Var2, map);
                    Object objOnExtraCallback41 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(60684245);
                    if (objOnExtraCallback41 == null) {
                        objOnExtraCallback41 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 72 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getEdgeSlop() >> 16) + 12068, 853346629, false, "L$3", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback41).set(access13800Var2, obj3);
                    Object objOnNavigationEvent9 = access15400.onNavigationEvent(uri2);
                    Object objOnExtraCallback42 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(61607766);
                    if (objOnExtraCallback42 == null) {
                        objOnExtraCallback42 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 73 - ExpandableListView.getPackedPositionType(0L), Color.alpha(0) + 12068, 854389190, false, "L$4", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback42).set(access13800Var2, objOnNavigationEvent9);
                    Object objOnExtraCallback43 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1690369935);
                    if (objOnExtraCallback43 == null) {
                        objOnExtraCallback43 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 72, KeyEvent.keyCodeFromString("") + 12068, 1434452255, false, "I$0", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback43).setInt(access13800Var2, i);
                    Object objOnExtraCallback44 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
                    if (objOnExtraCallback44 == null) {
                        objOnExtraCallback44 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 73 - Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12069, -1293905602, false, "label", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback44).setInt(access13800Var2, 2);
                    Object objOnNavigationEvent10 = onNavigationEvent(new Object[]{devToolActionActivity, obj3, map, access13800Var2}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1001657335, 1001657335, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                    Object obj4 = objOnNavigationEvent10;
                    if (objOnNavigationEvent10 != objOnWarmupCompleted) {
                        int i14 = extraCallbackWithResult + 19;
                        extraCallback = i14 % 128;
                        int i15 = i14 % 2;
                        i2 = i;
                        uri3 = uri2;
                        map2 = map;
                        str2 = str;
                        devToolActionActivity2 = devToolActionActivity;
                        obj = obj3;
                        obj3 = obj;
                        str = str2;
                        devToolActionActivity = devToolActionActivity2;
                        uri2 = uri3;
                        i = i2;
                        runDevToolActionUseCaseICustomTabsServiceDefault = devToolActionActivity.ICustomTabsServiceDefault();
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1404304175);
                        if (objOnExtraCallback == null) {
                        }
                        objInvoke = ((Method) objOnExtraCallback).invoke(obj3, null);
                        Object objOnNavigationEvent32 = access15400.onNavigationEvent(devToolActionActivity);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(57913682);
                        if (objOnExtraCallback2 == null) {
                        }
                        ((Field) objOnExtraCallback2).set(access13800Var2, objOnNavigationEvent32);
                        Object objOnNavigationEvent42 = access15400.onNavigationEvent(str);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(58837203);
                        if (objOnExtraCallback3 == null) {
                        }
                        ((Field) objOnExtraCallback3).set(access13800Var2, objOnNavigationEvent42);
                        Object objOnNavigationEvent52 = access15400.onNavigationEvent(map2);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(59760724);
                        if (objOnExtraCallback4 == null) {
                        }
                        ((Field) objOnExtraCallback4).set(access13800Var2, objOnNavigationEvent52);
                        Object objOnNavigationEvent62 = access15400.onNavigationEvent(obj3);
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(60684245);
                        if (objOnExtraCallback5 == null) {
                        }
                        ((Field) objOnExtraCallback5).set(access13800Var2, objOnNavigationEvent62);
                        Object objOnNavigationEvent72 = access15400.onNavigationEvent(uri2);
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(61607766);
                        if (objOnExtraCallback6 == null) {
                        }
                        ((Field) objOnExtraCallback6).set(access13800Var2, objOnNavigationEvent72);
                        objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1690369935);
                        if (objOnExtraCallback7 == null) {
                        }
                        ((Field) objOnExtraCallback7).setInt(access13800Var2, i);
                        objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
                        if (objOnExtraCallback8 == null) {
                        }
                        ((Field) objOnExtraCallback8).setInt(access13800Var2, 3);
                        if (RunDevToolActionUseCase.onExtraCallback$5a2aa680(runDevToolActionUseCaseICustomTabsServiceDefault, objInvoke, map2, null, access13800Var2, 4, null) == objOnWarmupCompleted) {
                        }
                    }
                    return objOnWarmupCompleted;
                }
                map2 = map;
                runDevToolActionUseCaseICustomTabsServiceDefault = devToolActionActivity.ICustomTabsServiceDefault();
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1404304175);
                if (objOnExtraCallback == null) {
                }
                objInvoke = ((Method) objOnExtraCallback).invoke(obj3, null);
                Object objOnNavigationEvent322 = access15400.onNavigationEvent(devToolActionActivity);
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(57913682);
                if (objOnExtraCallback2 == null) {
                }
                ((Field) objOnExtraCallback2).set(access13800Var2, objOnNavigationEvent322);
                Object objOnNavigationEvent422 = access15400.onNavigationEvent(str);
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(58837203);
                if (objOnExtraCallback3 == null) {
                }
                ((Field) objOnExtraCallback3).set(access13800Var2, objOnNavigationEvent422);
                Object objOnNavigationEvent522 = access15400.onNavigationEvent(map2);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(59760724);
                if (objOnExtraCallback4 == null) {
                }
                ((Field) objOnExtraCallback4).set(access13800Var2, objOnNavigationEvent522);
                Object objOnNavigationEvent622 = access15400.onNavigationEvent(obj3);
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(60684245);
                if (objOnExtraCallback5 == null) {
                }
                ((Field) objOnExtraCallback5).set(access13800Var2, objOnNavigationEvent622);
                Object objOnNavigationEvent722 = access15400.onNavigationEvent(uri2);
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(61607766);
                if (objOnExtraCallback6 == null) {
                }
                ((Field) objOnExtraCallback6).set(access13800Var2, objOnNavigationEvent722);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1690369935);
                if (objOnExtraCallback7 == null) {
                }
                ((Field) objOnExtraCallback7).setInt(access13800Var2, i);
                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2086637650);
                if (objOnExtraCallback8 == null) {
                }
                ((Field) objOnExtraCallback8).setInt(access13800Var2, 3);
                if (RunDevToolActionUseCase.onExtraCallback$5a2aa680(runDevToolActionUseCaseICustomTabsServiceDefault, objInvoke, map2, null, access13800Var2, 4, null) == objOnWarmupCompleted) {
                }
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th4;
            }
        }
        Result.constructor-impl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(DevToolActionActivity devToolActionActivity, String str, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 113;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            devToolActionActivity.onExtraCallbackWithResult(str);
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        devToolActionActivity.onExtraCallbackWithResult(str);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult$f3db318(Object obj, final DevToolActionActivity devToolActionActivity, final String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        Object[] objArr = new Object[1];
        a(new char[]{15, '9', 23, '+', 27, '\r', 11, 21, '\"', '+', '\n', '.', 62275}, (byte) (AndroidCharacter.getMirror('0') + 5), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, objArr);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(((String) objArr[0]).intern());
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(911219105);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 11119, 118548273, false, "onExtraCallbackWithResult", new Class[0]);
            }
            String str2 = (String) ((Method) objOnExtraCallback).invoke(obj, null);
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(new char[]{'(', '$', ';', 20}, (byte) (25 - Color.alpha(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str2);
            Object[] objArr3 = new Object[1];
            a(new char[]{22, 3, 27, 11, 28, 22, '/', '3', '0', '\b', '&', '%', '!', '6', 17, 19, '0', '2', 18, '+', ',', 1, ';', 21, ':', '=', 18, 3, '?', '*', 20, 27, 28, 22}, (byte) (63 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 34 - TextUtils.indexOf("", "", 0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(sb.toString());
            Object[] objArr4 = new Object[1];
            c(new int[]{-1582500587, 683649911, -1130684056, -1736378491}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, objArr4);
            Object[] objArr5 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, ((String) objArr4[0]).intern(), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: im.toss.devtool.runtime.data.util.DevToolActionActivity$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback;
                    int i4 = (i3 & 107) + (i3 | 107);
                    onWarmupCompleted = i4 % 128;
                    Object obj3 = null;
                    if (i4 % 2 != 0) {
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unit = (Unit) DevToolActionActivity.onNavigationEvent(new Object[]{this.f$0, str, (DialogInterface) obj2}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -591857343, 591857344, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                    int i5 = IAuthTabCallback;
                    int i6 = i5 & 45;
                    int i7 = i6 + ((i5 ^ 45) | i6);
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            }, 6, (Object) null)};
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr5, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            Object[] objArr6 = new Object[1];
            a(new char[]{22, '1'}, (byte) (48 - TextUtils.getCapsMode("", 0, 0)), 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr6);
            Object[] objArr7 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, ((String) objArr6[0]).intern(), (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)};
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr7, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            int i2 = extraCallbackWithResult + 117;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.devtool.runtime.data.util.DevToolActionActivity] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        final ?? r1 = (DevToolActionActivity) objArr[0];
        final Object obj = objArr[1];
        Map map = (Map) objArr[2];
        access13800 access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(911219105);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 12 - TextUtils.lastIndexOf("", '0', 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11119, 118548273, false, "onExtraCallbackWithResult", new Class[0]);
            }
            final String strIAuthTabCallback = r1.IAuthTabCallback((String) ((Method) objOnExtraCallback).invoke(obj, null), map);
            Object objOnExtraCallback2 = RequestProgress.onExtraCallback(CommonModule_setLeftEdgeTouchEnabled.Companion.onWarmupCompleted((Context) r1, (initMiniApp) null, new Function1() { // from class: im.toss.devtool.runtime.data.util.DevToolActionActivity$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 81;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback$f3db318 = DevToolActionActivity.IAuthTabCallback$f3db318(obj, r1, strIAuthTabCallback, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                    int i4 = onExtraCallback;
                    int i5 = (((i4 ^ 25) | (i4 & 25)) << 1) - (((~i4) & 25) | (i4 & (-26)));
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 82 / 0;
                    }
                    return unitIAuthTabCallback$f3db318;
                }
            }), access13800Var);
            if (objOnExtraCallback2 == access14300.onWarmupCompleted()) {
                int i2 = extraCallback + 107;
                extraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 94 / 0;
                }
                return objOnExtraCallback2;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = extraCallback + 29;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private final String IAuthTabCallback(String str, Map<String, ? extends List<String>> map) throws Throwable {
        int i = 2 % 2;
        Uri.Builder builder = new Uri.Builder();
        Object[] objArr = new Object[1];
        a(new char[]{'%', 17, '/', 15, 22, '8', 17, '\"', 13829}, (byte) (28 - (ViewConfiguration.getEdgeSlop() >> 16)), 9 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        Uri.Builder builderScheme = builder.scheme(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new char[]{'7', 1, '%', 18, '7', '\n', ':', 22, 21, '2', 13836}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34), Color.red(0) + 11, objArr2);
        Uri.Builder builderAuthority = builderScheme.authority(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{'7', 24, '?', '6', 22, '\"', 24, '1', 31, 3}, (byte) (Color.blue(0) + 63), TextUtils.getOffsetAfter("", 0) + 10, objArr3);
        Uri.Builder builderAppendQueryParameter = builderAuthority.appendQueryParameter(((String) objArr3[0]).intern(), str);
        Iterator<Map.Entry<String, ? extends List<String>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = extraCallback + 115;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Map.Entry<String, ? extends List<String>> next = it.next();
                next.getKey();
                next.getValue().iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Map.Entry<String, ? extends List<String>> next2 = it.next();
            String key = next2.getKey();
            Iterator<T> it2 = next2.getValue().iterator();
            while (it2.hasNext()) {
                int i3 = extraCallbackWithResult + 75;
                extraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    builderAppendQueryParameter.appendQueryParameter(key, (String) it2.next());
                    int i4 = 18 / 0;
                } else {
                    builderAppendQueryParameter.appendQueryParameter(key, (String) it2.next());
                }
            }
        }
        String string = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i5 = extraCallbackWithResult + 63;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 59;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{29, '7', '?', '/', '*', 26, '8', 24, 13850}, (byte) (Color.red(0) + 28), 9 - View.combineMeasuredStates(0, 0), objArr);
        Object systemService = getSystemService(((String) objArr[0]).intern());
        Intrinsics.checkNotNull(systemService, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{'7', 1, '.', '=', 13922, 13922, '3', 21, '\'', 25, 31, 15, 31, 3}, (byte) (109 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 14 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(((String) objArr2[0]).intern(), str));
        if (Build.VERSION.SDK_INT < 33) {
            int i4 = extraCallbackWithResult + 117;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr3 = new Object[1];
            a(new char[]{3, 21, 19, '>', 3, 22, 25, 27, 2, ')', 62302}, (byte) (80 - View.resolveSizeAndState(0, 0, 0)), 11 - TextUtils.indexOf("", ""), objArr3);
            onJsBridgeReady.onNavigationEvent(this, ((String) objArr3[0]).intern(), 0, 2, null);
        }
        int i6 = extraCallback + 63;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<String, List<String>> onExtraCallbackWithResult(Uri uri) throws Throwable {
        int i = 2 % 2;
        if (uri == null) {
            Intent intent = getIntent();
            Object[] objArr = new Object[1];
            a(new char[]{'\'', 25, 31, 15, 31, 3, 15, '\"', '8', 24, '3', 24, 13868}, (byte) (67 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, objArr);
            Bundle bundleExtra = intent.getBundleExtra(((String) objArr[0]).intern());
            if (bundleExtra == null) {
                int i2 = extraCallbackWithResult + 105;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                return access8100.onNavigationEvent();
            }
            Map mapOnExtraCallback = access8100.onExtraCallback();
            Set<String> setKeySet = bundleExtra.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            for (String str : setKeySet) {
                int i4 = extraCallbackWithResult + 1;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                ArrayList<String> stringArrayList = bundleExtra.getStringArrayList(str);
                if (stringArrayList != null) {
                    Intrinsics.checkNotNull(str);
                    mapOnExtraCallback.put(str, CollectionsKt.toList(stringArrayList));
                }
            }
            return access8100.onExtraCallbackWithResult(mapOnExtraCallback);
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{'7', 24, '?', '6', 22, '\"', 24, '1', 31, 3}, (byte) (63 - TextUtils.getCapsMode("", 0, 0)), 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{'7', 24, '?', '6', 22, '\"', 24, '1', 31, 3}, (byte) (63 - View.getDefaultSize(0, 0)), TextUtils.getTrimmedLength("") + 10, objArr3);
        if (uri.getQueryParameter(((String) objArr3[0]).intern()) == null) {
            Object[] objArr4 = new Object[1];
            c(new int[]{762437043, -19935076, 112964233, 1696085946}, View.MeasureSpec.makeMeasureSpec(0, 0) + 6, objArr4);
            strIntern = ((String) objArr4[0]).intern();
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        ArrayList arrayList = new ArrayList();
        int i6 = extraCallbackWithResult + 67;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        for (Object obj : queryParameterNames) {
            if (!Intrinsics.areEqual((String) obj, strIntern)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            int i8 = extraCallbackWithResult + 5;
            extraCallback = i8 % 128;
            int i9 = i8 % 2;
            linkedHashMap.put(obj2, uri.getQueryParameters((String) obj2));
            int i10 = extraCallbackWithResult + 9;
            extraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = extraCallbackWithResult + 121;
        extraCallback = i12 % 128;
        int i13 = i12 % 2;
        return linkedHashMap;
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ICustomTabsCallback;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 72, MotionEvent.axisFromString("") + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ICustomTabsCallback;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 87;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i9]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, i5) + 1), View.combineMeasuredStates(i5, i5) + 72, ExpandableListView.getPackedPositionType(0L) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9 >>= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), Color.red(0) + 72, ((Process.getThreadPriority(0) + 20) >> 6) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i9++;
                }
                c = '0';
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i11 = $10 + 51;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 22252), 39 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16781249), 77 - TextUtils.indexOf((CharSequence) "", '0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        long j;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = access100;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $11 + 83;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 26 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStubProxy)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        long j2 = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 26 - View.MeasureSpec.getMode(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 25;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 79;
                cArr4[i2] = (char) (cArr[i2] >>> b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i8 = $11 + 105;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i10 = $11 + 53;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >> b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    j = j2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 74, 8088 - KeyEvent.normalizeMetaState(0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                j = 0;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.getTrimmedLength("") + 30, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19487, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                j = 0;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            int i12 = $10 + 57;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        j = 0;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            int i16 = $11 + 119;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                        } else {
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                j2 = j;
            }
        }
        int i20 = 0;
        while (i20 < i) {
            int i21 = $10 + 89;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                cArr4[i20] = (char) (cArr4[i20] ^ 2425);
                i20 += 106;
            } else {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onExtraCallback(DevToolActionActivity devToolActionActivity, String str, DialogInterface dialogInterface) {
        return (Unit) onNavigationEvent(new Object[]{devToolActionActivity, str, dialogInterface}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -591857343, 591857344, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    private final Object onWarmupCompleted$3de71c81(Object obj, Map<String, ? extends List<String>> map, access13800<? super Unit> access13800Var) {
        return onNavigationEvent(new Object[]{this, obj, map, access13800Var}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1001657335, 1001657335, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    public final getScopeType onNavigationEvent() {
        return (getScopeType) onNavigationEvent(new Object[]{this}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1570091790, -1570091788, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
    }

    @Override // im.toss.devtool.runtime.data.util.Hilt_DevToolActionActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallback + 67;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.devtool.runtime.data.util.Hilt_DevToolActionActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallback + 115;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    @Override // im.toss.devtool.runtime.data.util.Hilt_DevToolActionActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // im.toss.devtool.runtime.data.util.Hilt_DevToolActionActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 25;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
    }

    static void setEngagementSignalsCallback() {
        access100 = new char[]{64992, 10299, 11239, 16091, 15535, 15739, 17615, 64982, 64995, 15291, 65004, 14991, 64964, 17903, 15335, 64926, 64961, 20855, 64988, 64915, 64925, 64966, 17522, 64987, 16710, 65021, 15647, 64990, 18451, 17463, 15143, 64976, 21435, 64960, 64977, 18775, 65010, 64772, 64989, 64963, 65020, 18599, 14343, 64953, 13427, 64965, 64984, 15047, 64978, 64983, 64980, 64981, 64994, 64991, 15422, 64986, 64916, 20906, 18375, 11743, 15091, 18771, 64967, 13751};
        IAuthTabCallbackStubProxy = (char) 51233;
        ICustomTabsCallback = new int[]{-1964450208, -1717883309, 2116271216, -568126075, -777868966, -1404297951, -1636405991, 244771144, 172908658, 1143295313, 1708860951, -1034126939, -1425008057, -1273231258, -1707823790, 1555918951, 570797236, -18788233};
    }
}
