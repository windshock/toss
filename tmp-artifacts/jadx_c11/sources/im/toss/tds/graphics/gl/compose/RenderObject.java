package im.toss.tds.graphics.gl.compose;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.opengl.EGLConfig;
import android.opengl.EGLSurface;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonContextMenuAreaKtExternalSyntheticLambda7;
import o.ComposableSingletonsBasicTextFieldKtExternalSyntheticLambda3;
import o.ComposableSingletonsCoreTextFieldKtExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.deprecated_secure;
import o.getMemoryDumpCount;
import o.getTlsVersionsokhttp;
import o.setUseCaseDetached;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RenderObject {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static long onTransact;
    public static final int onWarmupCompleted;
    private getTlsVersionsokhttp IAuthTabCallback;
    private final RenderObject$openGLCallback$1 IAuthTabCallbackDefault;
    private Function1<? super RenderObject, Unit> IAuthTabCallbackStub;
    private CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent asBinder;
    private final ReadWriteProperty asInterface;
    private final String onExtraCallback;
    private Rect onExtraCallbackWithResult;

    static {
        asInterface();
        Object[] objArr = new Object[1];
        a(new char[]{22727, 38829, 50711, 13983, 25957}, 53100 - TextUtils.lastIndexOf("", '0'), objArr);
        onNavigationEvent = new addAllCommandLine[]{new MutablePropertyReference1Impl<>(RenderObject.class, ((String) objArr[0]).intern(), "getStyle()Lim/toss/tds/graphics/gl/compose/BlurStyle;", 0)};
        Companion = new Companion(null);
        onWarmupCompleted = 8;
        int i = getInterfaceDescriptor + 117;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~i3;
        int i11 = (~(i7 | i10)) | (~(i8 | i2 | i3));
        int i12 = (~(i3 | i7)) | (~(i8 | i10));
        int i13 = i2 + i4 + i5 + ((-1255669517) * i6) + (533247121 * i);
        int i14 = i13 * i13;
        int i15 = ((i2 * (-1895547823)) - 858849280) + ((-1895547823) * i4) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i5) + (760610816 * i6) + ((-1057882112) * i) + (1344208896 * i14);
        int i16 = ((i2 * (-122328301)) - 2132886715) + (i4 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i5 * (-122328029)) + (i6 * (-1196579527)) + (i * 656595923) + (i14 * 138215424);
        int i17 = i15 + (i16 * i16 * (-833028096));
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [im.toss.tds.graphics.gl.compose.RenderObject$openGLCallback$1] */
    public RenderObject(@NotNull String str, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rect, "");
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = rect;
        this.IAuthTabCallbackDefault = new CommonContextMenuAreaKtExternalSyntheticLambda7.onWarmupCompleted() { // from class: im.toss.tds.graphics.gl.compose.RenderObject$openGLCallback$1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* bridge */ EGLSurface onWarmupCompleted(ComposableSingletonsCoreTextFieldKtExternalSyntheticLambda0 composableSingletonsCoreTextFieldKtExternalSyntheticLambda0, EGLConfig eGLConfig, Surface surface, int i, int i2) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                EGLSurface eGLSurfaceOnWarmupCompleted = super.onWarmupCompleted(composableSingletonsCoreTextFieldKtExternalSyntheticLambda0, eGLConfig, surface, i, i2);
                int i6 = IAuthTabCallback + 93;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return eGLSurfaceOnWarmupCompleted;
            }

            public void onExtraCallbackWithResult(ComposableSingletonsBasicTextFieldKtExternalSyntheticLambda3 composableSingletonsBasicTextFieldKtExternalSyntheticLambda3) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(composableSingletonsBasicTextFieldKtExternalSyntheticLambda3, "");
                Function1 function1OnWarmupCompleted = RenderObject.onWarmupCompleted(this.onExtraCallback);
                if (function1OnWarmupCompleted != null) {
                    int i2 = onWarmupCompleted + 91;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    function1OnWarmupCompleted.invoke(this.onExtraCallback);
                    int i4 = onWarmupCompleted + 85;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        };
        getMemoryDumpCount getmemorydumpcount = getMemoryDumpCount.onNavigationEvent;
        final deprecated_secure deprecated_secureVarIAuthTabCallback = deprecated_secure.Companion.IAuthTabCallback();
        this.asInterface = new ObservableProperty<deprecated_secure>(deprecated_secureVarIAuthTabCallback) { // from class: im.toss.tds.graphics.gl.compose.RenderObject$special$$inlined$observable$1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public void afterChange(addAllCommandLine<?> addallcommandline, deprecated_secure deprecated_secureVar, deprecated_secure deprecated_secureVar2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 45;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(addallcommandline, "");
                    Intrinsics.areEqual(deprecated_secureVar, deprecated_secureVar2);
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(addallcommandline, "");
                if (!Intrinsics.areEqual(deprecated_secureVar, deprecated_secureVar2)) {
                    RenderObject.onExtraCallbackWithResult(this, null, 1, null);
                }
                int i3 = onWarmupCompleted + 21;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 45 / 0;
                }
            }
        };
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RenderObject renderObject = (RenderObject) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        RenderObject$openGLCallback$1 renderObject$openGLCallback$1 = renderObject.IAuthTabCallbackDefault;
        if (i3 != 0) {
            return renderObject$openGLCallback$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Function1 onWarmupCompleted(RenderObject renderObject) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        Function1<? super RenderObject, Unit> function1 = renderObject.IAuthTabCallbackStub;
        int i5 = i3 + 3;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RenderObject renderObject = (RenderObject) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 61;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        String str = renderObject.onExtraCallback;
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
        int i6 = i2 + 35;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Rect IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 97;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Rect rect = this.onExtraCallbackWithResult;
        int i5 = i3 + 67;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return rect;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ReadWriteProperty readWriteProperty;
        addAllCommandLine<Object> addallcommandline;
        RenderObject renderObject = (RenderObject) objArr[0];
        deprecated_secure deprecated_secureVar = (deprecated_secure) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 107;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            readWriteProperty = renderObject.asInterface;
            addallcommandline = onNavigationEvent[0];
        } else {
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            readWriteProperty = renderObject.asInterface;
            addallcommandline = onNavigationEvent[0];
        }
        readWriteProperty.setValue(renderObject, addallcommandline, deprecated_secureVar);
        int i3 = access000 + 19;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 82 / 0;
        }
        return null;
    }

    public final deprecated_secure onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        deprecated_secure deprecated_secureVar = (deprecated_secure) this.asInterface.getValue(this, onNavigationEvent[0]);
        int i4 = access000 + 13;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_secureVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getTlsVersionsokhttp onExtraCallback() {
        getTlsVersionsokhttp gettlsversionsokhttp;
        int i = 2 % 2;
        int i2 = access100 + 57;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 != 0) {
            gettlsversionsokhttp = this.IAuthTabCallback;
            int i4 = 45 / 0;
        } else {
            gettlsversionsokhttp = this.IAuthTabCallback;
        }
        int i5 = i3 + 9;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return gettlsversionsokhttp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable getTlsVersionsokhttp gettlsversionsokhttp) {
        int i = 2 % 2;
        int i2 = access000 + 1;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = gettlsversionsokhttp;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 5;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }

    public final void IAuthTabCallback(@Nullable CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 33;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = onnavigationevent;
        int i5 = i2 + 45;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
    }

    public final CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 115;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asBinder;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallbackWithResult(RenderObject renderObject, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 11;
        access000 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 73;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            function1 = null;
        }
        renderObject.onExtraCallbackWithResult((Function1<? super CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent, Unit>) function1);
    }

    public final void onExtraCallbackWithResult(@Nullable Function1<? super CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 75;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent = this.asBinder;
        if (onnavigationevent != null) {
            int i4 = i2 + 61;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            onnavigationevent.onNavigationEvent(function1);
        }
        int i6 = access100 + 39;
        access000 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onWarmupCompleted(@Nullable Function1<? super RenderObject, Unit> function1) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 31;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = function1;
        int i5 = i2 + 13;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallback(RenderObject renderObject, long j, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = access100;
            int i4 = i3 + 117;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 1;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        renderObject.onNavigationEvent(j, z);
    }

    public final void onNavigationEvent(long j, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Rect rect = this.onExtraCallbackWithResult;
        float fIAuthTabCallback_Parcel = rect.IAuthTabCallback_Parcel();
        float fIAuthTabCallbackStubProxy = rect.IAuthTabCallbackStubProxy();
        Rect rect2 = this.onExtraCallbackWithResult;
        float fIAuthTabCallbackDefault = rect2.IAuthTabCallbackDefault();
        float fExtraCallback = rect2.extraCallback();
        this.onExtraCallbackWithResult = RectKt.IAuthTabCallback(j, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fIAuthTabCallback_Parcel - fIAuthTabCallbackStubProxy) << 32) | (Float.floatToRawIntBits(fIAuthTabCallbackDefault - fExtraCallback) & 4294967295L)));
        onExtraCallbackWithResult(this, null, 1, null);
        int i4 = access100 + 79;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RenderObject(id='" + this.onExtraCallback + "', rect='" + this.onExtraCallbackWithResult + "'')";
        int i2 = access100 + 95;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 113;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent = this.asBinder;
        if (onnavigationevent != null) {
            int i5 = i3 + 19;
            access000 = i5 % 128;
            CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onExtraCallback(onnavigationevent, true, (Function1) null, i5 % 2 != 0 ? 5 : 2, (Object) null);
        }
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i2 = access000 + 95;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            cls = obj.getClass();
        } else {
            int i4 = access000 + 79;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            cls = null;
        }
        if (!Intrinsics.areEqual(RenderObject.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        RenderObject renderObject = (RenderObject) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, renderObject.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, renderObject.onExtraCallbackWithResult)) {
            return Intrinsics.areEqual(onTransact(), renderObject.onTransact());
        }
        int i6 = access000 + 73;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = access100 + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + onTransact().hashCode();
        int i4 = access100 + 37;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RenderObject onExtraCallback(@NotNull String str, @NotNull CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda7, @NotNull Surface surface, @NotNull Rect rect) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(commonContextMenuAreaKtExternalSyntheticLambda7, "");
            Intrinsics.checkNotNullParameter(surface, "");
            Intrinsics.checkNotNullParameter(rect, "");
            RenderObject renderObject = new RenderObject(str, rect);
            int iIAuthTabCallback_Parcel = (int) (rect.IAuthTabCallback_Parcel() - rect.IAuthTabCallbackStubProxy());
            int iIAuthTabCallbackDefault = (int) (rect.IAuthTabCallbackDefault() - rect.extraCallback());
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
            int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
            renderObject.IAuthTabCallback(commonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent(surface, iIAuthTabCallback_Parcel, iIAuthTabCallbackDefault, (RenderObject$openGLCallback$1) RenderObject.onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -651463413, iOnNavigationEvent, 651463415, iOnNavigationEvent2, new Object[]{renderObject}, iOnNavigationEvent3)));
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return renderObject;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = $11 + 51;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, Process.getGidForName("") + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onTransact ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59, 6383 - Gravity.getAbsoluteGravity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 69;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 59, 6383 - Drawable.resolveOpacity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - KeyEvent.normalizeMetaState(0), 6383 - View.combineMeasuredStates(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public static final /* synthetic */ RenderObject$openGLCallback$1 onExtraCallbackWithResult(RenderObject renderObject) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        return (RenderObject$openGLCallback$1) onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -651463413, iOnNavigationEvent, 651463415, iOnNavigationEvent2, new Object[]{renderObject}, iOnNavigationEvent3);
    }

    public final String onExtraCallbackWithResult() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        return (String) onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), -1674398856, iOnNavigationEvent, 1674398857, iOnNavigationEvent2, new Object[]{this}, iOnNavigationEvent3);
    }

    public final void IAuthTabCallback(@NotNull deprecated_secure deprecated_secureVar) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        onWarmupCompleted(RNSScreenManagerDelegate.onNavigationEvent(), 434526393, iOnNavigationEvent, -434526393, iOnNavigationEvent2, new Object[]{this, deprecated_secureVar}, iOnNavigationEvent3);
    }

    static void asInterface() {
        onTransact = -4878774873536471677L;
    }
}
