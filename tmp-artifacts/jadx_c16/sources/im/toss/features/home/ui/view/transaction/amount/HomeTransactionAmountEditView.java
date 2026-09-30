package im.toss.features.home.ui.view.transaction.amount;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.otaliastudios.cameraview.R$styleable;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.features.home.core.hds.view.HomeTextBoardView;
import im.toss.features.home.ui.view.transaction.amount.HomeTransactionAmountEditView$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.R;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.NetConverter3;
import o.PageExitListener;
import o.RemoteDebugBridgeExtension1;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.clearTid;
import o.isOneShot;
import o.noStore;
import o.varyFields;
import o.writeRaw;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeTransactionAmountEditView extends ConstraintLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static long IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static int getInterfaceDescriptor;
    public static final int onExtraCallback;
    private final RemoteDebugBridgeExtension1 IAuthTabCallback;
    private Runnable IAuthTabCallbackStub;
    private boolean asBinder;
    private Function0<Unit> asInterface;
    private boolean onExtraCallbackWithResult;
    private final List<onWarmupCompleted> onNavigationEvent;
    private boolean onTransact;
    private boolean onWarmupCompleted;

    static {
        onWarmupCompleted();
        Companion = new onNavigationEvent((DefaultConstructorMarker) null);
        onExtraCallback = 8;
        int i = getInterfaceDescriptor + 37;
        access000 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeTransactionAmountEditView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeTransactionAmountEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(context, homeTransactionAmountEditView, view);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            return ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, -918623173, 918623183, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
        }
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, -918623173, 918623183, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3)).booleanValue();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        asBinder(homeTransactionAmountEditView, view);
        int i4 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized(context, homeTransactionAmountEditView, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallbackDefault(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(homeTransactionAmountEditView, view, motionEvent);
        }
        IAuthTabCallback_Parcel(homeTransactionAmountEditView, view, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onMessageChannelReady(context, homeTransactionAmountEditView, view);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(context, homeTransactionAmountEditView, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zWriteTypedObject = writeTypedObject(homeTransactionAmountEditView, view, motionEvent);
        int i4 = IAuthTabCallback_Parcel + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zWriteTypedObject;
        }
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallbackStubProxy(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallbackWithResult = extraCallbackWithResult(homeTransactionAmountEditView, view, motionEvent);
        int i4 = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(context, homeTransactionAmountEditView, view);
        int i4 = IAuthTabCallbackStubProxy + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    public static /* synthetic */ void access000(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        access100(context, homeTransactionAmountEditView, view);
        int i4 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asBinder(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage(context, homeTransactionAmountEditView, view);
        int i4 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean asBinder(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            access000(homeTransactionAmountEditView, view, motionEvent);
            throw null;
        }
        boolean zAccess000 = access000(homeTransactionAmountEditView, view, motionEvent);
        int i3 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return zAccess000;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {homeTransactionAmountEditView, view};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        if (i3 == 0) {
            onNavigationEvent(objArr2, -366496010, 366496025, iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(objArr2, -366496010, 366496025, iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
        int i4 = IAuthTabCallbackStubProxy + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(context, homeTransactionAmountEditView, view);
        int i4 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean asInterface(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, -1163639885, 1163639898, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Throwable {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(homeTransactionAmountEditView, str);
        int i4 = IAuthTabCallback_Parcel + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ CharSequence onExtraCallback(onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        CharSequence charSequence = (CharSequence) onNavigationEvent(new Object[]{onwarmupcompleted}, -1526097769, 1526097771, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
        int i4 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequence;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(th);
        }
        onNavigationEvent(th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(context, homeTransactionAmountEditView, view);
        int i4 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            onNavigationEvent(new Object[]{homeTransactionAmountEditView, view}, -2050446166, 2050446167, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
            return;
        }
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{homeTransactionAmountEditView, view}, -2050446166, 2050446167, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3);
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnActivityResized = onActivityResized(homeTransactionAmountEditView, view, motionEvent);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 17;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnActivityResized;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, HomeTransactionAmountEditView homeTransactionAmountEditView, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, homeTransactionAmountEditView, setDetectableSize);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, homeTransactionAmountEditView, setDetectableSize);
        int i3 = IAuthTabCallbackStubProxy + 49;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{homeTransactionAmountEditView, view}, 1070113517, -1070113509, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
        int i4 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, -1114120374, 1114120388, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        View view = (View) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnActivityLayout = onActivityLayout(homeTransactionAmountEditView, view, motionEvent);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 25;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zOnActivityLayout);
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        Object obj;
        int i7 = ~i6;
        int i8 = ~(i7 | i);
        int i9 = ~i2;
        int i10 = ~i;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i6 | i)) | (~(i7 | i9 | i10));
        int i13 = i2 + i + i5 + ((-1136091917) * i4) + (376669458 * i3);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i2) + 1718550528 + ((-1748215485) * i) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i5) + ((-2044854272) * i4) + (41156608 * i3) + (1721171968 * i14);
        int i16 = ((i2 * (-924404593)) - 1636593565) + (i * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i5 * (-924404175)) + (i4 * (-2083730301)) + (i3 * 182666354) + (i14 * (-51970048));
        switch (i15 + (i16 * i16 * (-653721600))) {
            case 1:
                HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
                int i17 = 2 % 2;
                int i18 = IAuthTabCallbackStubProxy + 81;
                IAuthTabCallback_Parcel = i18 % 128;
                int i19 = i18 % 2;
                homeTransactionAmountEditView.onWarmupCompleted("÷");
                int i20 = IAuthTabCallbackStubProxy + 67;
                IAuthTabCallback_Parcel = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                HomeTransactionAmountEditView homeTransactionAmountEditView2 = (HomeTransactionAmountEditView) objArr[0];
                View view = (View) objArr[1];
                MotionEvent motionEvent = (MotionEvent) objArr[2];
                int i22 = 2 % 2;
                int i23 = IAuthTabCallbackStubProxy + 105;
                IAuthTabCallback_Parcel = i23 % 128;
                int i24 = i23 % 2;
                Intrinsics.checkNotNull(view);
                Intrinsics.checkNotNull(motionEvent);
                char[] cArr = {61618, 61570, 49715, 31808, 13938};
                if (i24 == 0) {
                    Object[] objArr2 = new Object[1];
                    a(cArr, -(ExpandableListView.getPackedPositionForChild(1, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 1L ? 0 : -1)), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a(cArr, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
                    obj = objArr3[0];
                }
                return Boolean.valueOf(homeTransactionAmountEditView2.IAuthTabCallback(view, motionEvent, ((String) obj).intern()));
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return asInterface(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(View view, HomeTransactionAmountEditView homeTransactionAmountEditView, String str, Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {view, homeTransactionAmountEditView, str, l};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(objArr, 1665744736, -1665744732, iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback);
        int i4 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(context, homeTransactionAmountEditView, view);
        int i4 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        asInterface(homeTransactionAmountEditView, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnMessageChannelReady = onMessageChannelReady(homeTransactionAmountEditView, view, motionEvent);
        int i4 = IAuthTabCallbackStubProxy + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnMessageChannelReady;
    }

    public static /* synthetic */ void onTransact(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        readTypedObject(context, homeTransactionAmountEditView, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onTransact(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {homeTransactionAmountEditView, view, motionEvent};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        if (i3 != 0) {
            ((Boolean) onNavigationEvent(objArr, 590118217, -590118210, iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) onNavigationEvent(objArr, 590118217, -590118210, iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(context, homeTransactionAmountEditView, view);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{function1, obj}, -226394241, 226394244, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
        int i4 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean typedObject = readTypedObject(homeTransactionAmountEditView, view, motionEvent);
        int i4 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeTransactionAmountEditView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        String string;
        super(context, attributeSet, i);
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        RemoteDebugBridgeExtension1 remoteDebugBridgeExtension1OnWarmupCompleted = RemoteDebugBridgeExtension1.onWarmupCompleted(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(remoteDebugBridgeExtension1OnWarmupCompleted, "");
        this.IAuthTabCallback = remoteDebugBridgeExtension1OnWarmupCompleted;
        this.onNavigationEvent = new ArrayList();
        boolean zOnWarmupCompleted = PageExitListener.onWarmupCompleted(context);
        remoteDebugBridgeExtension1OnWarmupCompleted.access100.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda7(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.IAuthTabCallback_Parcel.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda18(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.IAuthTabCallbackStubProxy.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda29(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.extraCallbackWithResult.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda30(this));
        HomeTextBoardView homeTextBoardView = remoteDebugBridgeExtension1OnWarmupCompleted.writeTypedObject;
        if (zOnWarmupCompleted) {
            string = "";
        } else {
            string = context.getString(R.string.money_won_symbol);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i2 = IAuthTabCallbackStubProxy + 27;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        homeTextBoardView.setPrefix(string);
        if (zOnWarmupCompleted) {
            String string2 = context.getString(viva.republica.toss.R.string.korea_currency);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            str = string2;
        }
        homeTextBoardView.setSuffix(str);
        homeTextBoardView.setOnClear(new HomeTransactionAmountEditView$.ExternalSyntheticLambda31(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.ICustomTabsCallback.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda32(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.IAuthTabCallback.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda33(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onNavigationEvent.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda34(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onExtraCallback.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda35(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.IAuthTabCallbackDefault.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda36(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onTransact.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda8(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.asInterface.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda9(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.IAuthTabCallbackStub.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda10(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.asBinder.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda11(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.access000.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda12(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onExtraCallbackWithResult.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda13(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onWarmupCompleted.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda14(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.getInterfaceDescriptor.setOnTouchListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda15(this));
        remoteDebugBridgeExtension1OnWarmupCompleted.IAuthTabCallback.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda16(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onNavigationEvent.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda17(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onExtraCallback.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda19(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.IAuthTabCallbackDefault.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda20(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onTransact.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda21(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.asInterface.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda22(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.IAuthTabCallbackStub.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda23(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.asBinder.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda24(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.access000.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda25(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onExtraCallbackWithResult.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda26(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.onWarmupCompleted.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda27(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.getInterfaceDescriptor.setOnClickListener(new HomeTransactionAmountEditView$.ExternalSyntheticLambda28(context, this));
        remoteDebugBridgeExtension1OnWarmupCompleted.readTypedObject.setGradientVisibility(8);
        int i5 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HomeTransactionAmountEditView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStubProxy + 113;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackStubProxy;
            int i7 = i6 + 99;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 27;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long jOnNavigationEvent;
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0 ? homeTransactionAmountEditView.onNavigationEvent.size() != 1 : homeTransactionAmountEditView.onNavigationEvent.size() != 1) {
            jOnNavigationEvent = -1;
        } else if (CollectionsKt.firstOrNull(homeTransactionAmountEditView.onNavigationEvent) instanceof onWarmupCompleted.onExtraCallbackWithResult) {
            int i3 = IAuthTabCallbackStubProxy + 63;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            Object objFirst = CollectionsKt.first(homeTransactionAmountEditView.onNavigationEvent);
            Intrinsics.checkNotNull(objFirst, "");
            jOnNavigationEvent = ((onWarmupCompleted.onExtraCallbackWithResult) objFirst).onNavigationEvent();
        }
        return Long.valueOf(jOnNavigationEvent);
    }

    public final void setAmount(long j) {
        int i = 2 % 2;
        this.onNavigationEvent.clear();
        this.onNavigationEvent.add(new onWarmupCompleted.onExtraCallbackWithResult(j));
        this.IAuthTabCallback.writeTypedObject.setText(onNavigationEvent((List<? extends onWarmupCompleted>) this.onNavigationEvent));
        this.IAuthTabCallback.readTypedObject.asInterface().setEnabled(!this.onNavigationEvent.isEmpty());
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setOnRevert(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.asInterface = function0;
        int i5 = i3 + 77;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackDefault ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 93;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 59;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45812), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 83, 21233 - View.combineMeasuredStates(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 19 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        homeTransactionAmountEditView.onWarmupCompleted("-");
        int i4 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void asBinder(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        homeTransactionAmountEditView.onWarmupCompleted("x");
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
    }

    private static final void asInterface(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        homeTransactionAmountEditView.onWarmupCompleted("=");
        int i4 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    public static Unit onExtraCallback(HomeTransactionAmountEditView homeTransactionAmountEditView) {
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        boolean zIsEmpty;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            homeTransactionAmountEditView.onNavigationEvent.clear();
            tdsButtonV1ViewAsInterface = homeTransactionAmountEditView.IAuthTabCallback.readTypedObject.asInterface();
            zIsEmpty = homeTransactionAmountEditView.onNavigationEvent.isEmpty();
        } else {
            homeTransactionAmountEditView.onNavigationEvent.clear();
            tdsButtonV1ViewAsInterface = homeTransactionAmountEditView.IAuthTabCallback.readTypedObject.asInterface();
            zIsEmpty = !homeTransactionAmountEditView.onNavigationEvent.isEmpty();
        }
        tdsButtonV1ViewAsInterface.setEnabled(zIsEmpty);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = homeTransactionAmountEditView.asInterface;
        if (function0 != null) {
            function0.invoke();
        }
        int i4 = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final boolean onActivityResized(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        Object[] objArr = new Object[1];
        a(new char[]{56736, 56721, 23983, 36350, 14659}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, ((String) objArr[0]).intern());
        int i4 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    private static final boolean onActivityLayout(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        char[] cArr = {48598, 48612, 37294, 30057, 22921};
        if (i3 != 0) {
            Object[] objArr = new Object[1];
            a(cArr, -ImageFormat.getBitsPerPixel(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(cArr, -ImageFormat.getBitsPerPixel(0), objArr2);
            obj = objArr2[0];
        }
        return homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, ((String) obj).intern());
    }

    private static final boolean onMessageChannelReady(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "3");
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return zIAuthTabCallback;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        View view = (View) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "4");
        int i4 = IAuthTabCallbackStubProxy + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    private static final boolean IAuthTabCallback_Parcel(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "5");
        int i4 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        View view = (View) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        if (i3 != 0) {
            homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "6");
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "6");
        int i4 = IAuthTabCallbackStubProxy + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zIAuthTabCallback);
        }
        throw null;
    }

    private static final boolean access000(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "7");
        int i4 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[0];
        View view = (View) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "8");
        int i4 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    private static final boolean writeTypedObject(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "9");
        int i4 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return zIAuthTabCallback;
    }

    private static final boolean extraCallbackWithResult(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "00");
        int i4 = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean readTypedObject(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        Intrinsics.checkNotNull(motionEvent);
        boolean zIAuthTabCallback = homeTransactionAmountEditView.IAuthTabCallback(view, motionEvent, "back");
        int i4 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    private static final void getInterfaceDescriptor(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        if (varyFields.onWarmupCompleted(context)) {
            int i2 = IAuthTabCallback_Parcel + 75;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{56736, 56721, 23983, 36350, 14659}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr);
            homeTransactionAmountEditView.IAuthTabCallback(((String) objArr[0]).intern());
            homeTransactionAmountEditView.IAuthTabCallback();
            int i4 = IAuthTabCallbackStubProxy + 33;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 2;
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 67 / 0;
        }
    }

    private static final void access100(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        if (varyFields.onWarmupCompleted(context)) {
            int i2 = IAuthTabCallbackStubProxy + 67;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{48598, 48612, 37294, 30057, 22921}, TextUtils.getTrimmedLength("") + 1, objArr);
            homeTransactionAmountEditView.IAuthTabCallback(((String) objArr[0]).intern());
            homeTransactionAmountEditView.IAuthTabCallback();
            int i4 = IAuthTabCallbackStubProxy + 29;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void IAuthTabCallbackStubProxy(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        if (!(!varyFields.onWarmupCompleted(context))) {
            int i2 = IAuthTabCallbackStubProxy + 25;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                homeTransactionAmountEditView.IAuthTabCallback("3");
                homeTransactionAmountEditView.IAuthTabCallback();
                throw null;
            }
            homeTransactionAmountEditView.IAuthTabCallback("3");
            homeTransactionAmountEditView.IAuthTabCallback();
            int i3 = IAuthTabCallback_Parcel + 87;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static final void extraCallbackWithResult(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            varyFields.onWarmupCompleted(context);
            throw null;
        }
        if (varyFields.onWarmupCompleted(context)) {
            int i3 = IAuthTabCallback_Parcel + 17;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                homeTransactionAmountEditView.IAuthTabCallback("4");
                homeTransactionAmountEditView.IAuthTabCallback();
                throw null;
            }
            homeTransactionAmountEditView.IAuthTabCallback("4");
            homeTransactionAmountEditView.IAuthTabCallback();
        }
        int i4 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    private static final void writeTypedObject(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (varyFields.onWarmupCompleted(context)) {
            int i2 = IAuthTabCallback_Parcel + 49;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                homeTransactionAmountEditView.IAuthTabCallback("5");
                homeTransactionAmountEditView.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            homeTransactionAmountEditView.IAuthTabCallback("5");
            homeTransactionAmountEditView.IAuthTabCallback();
        }
        int i3 = IAuthTabCallbackStubProxy + 61;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static final void ICustomTabsCallback(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            if (!varyFields.onWarmupCompleted(context)) {
                return;
            }
            homeTransactionAmountEditView.IAuthTabCallback("6");
            homeTransactionAmountEditView.IAuthTabCallback();
            int i3 = IAuthTabCallbackStubProxy + 39;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        varyFields.onWarmupCompleted(context);
        throw null;
    }

    private static final void readTypedObject(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (varyFields.onWarmupCompleted(context)) {
            int i4 = IAuthTabCallbackStubProxy + 123;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                homeTransactionAmountEditView.IAuthTabCallback("7");
                homeTransactionAmountEditView.IAuthTabCallback();
            } else {
                homeTransactionAmountEditView.IAuthTabCallback("7");
                homeTransactionAmountEditView.IAuthTabCallback();
                throw null;
            }
        }
    }

    private static final void extraCallback(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!(!varyFields.onWarmupCompleted(context))) {
            int i4 = IAuthTabCallbackStubProxy + 111;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                homeTransactionAmountEditView.IAuthTabCallback("8");
                homeTransactionAmountEditView.IAuthTabCallback();
                int i5 = 26 / 0;
            } else {
                homeTransactionAmountEditView.IAuthTabCallback("8");
                homeTransactionAmountEditView.IAuthTabCallback();
            }
        }
        int i6 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onMinimized(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
            if (!varyFields.onWarmupCompleted(context)) {
                return;
            }
        } else if (!varyFields.onWarmupCompleted(context)) {
            return;
        }
        homeTransactionAmountEditView.IAuthTabCallback("9");
        homeTransactionAmountEditView.IAuthTabCallback();
        int i4 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onMessageChannelReady(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            varyFields.onWarmupCompleted(context);
            throw null;
        }
        if (varyFields.onWarmupCompleted(context)) {
            int i3 = IAuthTabCallbackStubProxy + 99;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            homeTransactionAmountEditView.IAuthTabCallback("00");
            homeTransactionAmountEditView.IAuthTabCallback();
            int i5 = IAuthTabCallbackStubProxy + 3;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final void onActivityResized(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (varyFields.onWarmupCompleted(context)) {
            Object[] objArr = new Object[1];
            a(new char[]{61618, 61570, 49715, 31808, 13938}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            homeTransactionAmountEditView.IAuthTabCallback(((String) objArr[0]).intern());
            homeTransactionAmountEditView.IAuthTabCallback();
        }
        int i4 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onPostMessage(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (varyFields.onWarmupCompleted(context)) {
            homeTransactionAmountEditView.IAuthTabCallback("back");
            homeTransactionAmountEditView.IAuthTabCallback();
        }
        int i4 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean IAuthTabCallback(View view, MotionEvent motionEvent, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (!view.isClickable()) {
            int i4 = IAuthTabCallback_Parcel + 85;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (!view.isPressed()) {
                int i6 = IAuthTabCallback_Parcel + 111;
                IAuthTabCallbackStubProxy = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 36 / 0;
                    if (this.asBinder) {
                        IAuthTabCallback();
                    }
                } else if (this.asBinder) {
                }
                return false;
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.onTransact = false;
            view.setPressed(true);
            writeRaw.onExtraCallback(200L, TimeUnit.MILLISECONDS).onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback()).onNavigationEvent(new HomeTransactionAmountEditView$.ExternalSyntheticLambda4(new HomeTransactionAmountEditView$.ExternalSyntheticLambda3(view, this, str)), new HomeTransactionAmountEditView$.ExternalSyntheticLambda6(new HomeTransactionAmountEditView$.ExternalSyntheticLambda5()));
            return true;
        }
        if (action == 1) {
            view.setPressed(false);
            if (!this.onTransact) {
                int i8 = IAuthTabCallback_Parcel + 71;
                IAuthTabCallbackStubProxy = i8 % 128;
                if (i8 % 2 != 0) {
                    IAuthTabCallback(str);
                    int i9 = 94 / 0;
                } else {
                    IAuthTabCallback(str);
                }
            }
            IAuthTabCallback();
            return true;
        }
        int i10 = IAuthTabCallbackStubProxy;
        int i11 = i10 + 117;
        IAuthTabCallback_Parcel = i11 % 128;
        if (i11 % 2 != 0 ? action != 2 : action != 4) {
            if (action == 3 || action == 4) {
                view.setPressed(false);
                IAuthTabCallback();
                return true;
            }
            int i12 = i10 + 9;
            IAuthTabCallback_Parcel = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        float width = view.getWidth();
        float x = motionEvent.getX();
        if (0.0f > x || x > width) {
            this.onTransact = true;
            view.setPressed(false);
            IAuthTabCallback();
        } else {
            int i14 = IAuthTabCallbackStubProxy + 7;
            IAuthTabCallback_Parcel = i14 % 128;
            int i15 = i14 % 2;
            float height = view.getHeight();
            float y = motionEvent.getY();
            if (0.0f > y || y > height) {
            }
        }
        return true;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        View view = (View) objArr[0];
        HomeTransactionAmountEditView homeTransactionAmountEditView = (HomeTransactionAmountEditView) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            boolean zIsPressed = view.isPressed();
            int i3 = 66 / 0;
            if (!(!zIsPressed)) {
                homeTransactionAmountEditView.IAuthTabCallback(str);
                int i4 = IAuthTabCallbackStubProxy + 107;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (view.isPressed()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallbackWithResult(HomeTransactionAmountEditView homeTransactionAmountEditView, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        homeTransactionAmountEditView.onWarmupCompleted(str);
        Handler handler = homeTransactionAmountEditView.getHandler();
        Runnable runnable = homeTransactionAmountEditView.IAuthTabCallbackStub;
        Intrinsics.checkNotNull(runnable);
        handler.postDelayed(runnable, 50L);
        int i4 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
            if (this.asBinder) {
                return;
            }
        } else if (this.asBinder) {
            return;
        }
        this.asBinder = true;
        this.IAuthTabCallbackStub = new HomeTransactionAmountEditView$.ExternalSyntheticLambda2(this, str);
        onWarmupCompleted(str);
        Handler handler = getHandler();
        Runnable runnable = this.IAuthTabCallbackStub;
        Intrinsics.checkNotNull(runnable);
        handler.postDelayed(runnable, 300L);
        int i4 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.asBinder = false;
        Runnable runnable = this.IAuthTabCallbackStub;
        if (runnable != null) {
            int i5 = i3 + 87;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                getHandler().removeCallbacks(runnable);
            } else {
                getHandler().removeCallbacks(runnable);
                throw null;
            }
        }
        this.IAuthTabCallbackStub = null;
    }

    private static final Unit IAuthTabCallback(String str, HomeTransactionAmountEditView homeTransactionAmountEditView, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_text", str);
            setDetectableSize.onExtraCallback("amount_board", homeTransactionAmountEditView.IAuthTabCallback.writeTypedObject.onWarmupCompleted());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_text", str);
        setDetectableSize.onExtraCallback("amount_board", homeTransactionAmountEditView.IAuthTabCallback.writeTypedObject.onWarmupCompleted());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(String str) throws Throwable {
        onWarmupCompleted.onNavigationEvent.onNavigationEvent onnavigationevent;
        onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult;
        Object obj;
        int i;
        int i2 = 2 % 2;
        if (!CollectionsKt.listOf(new String[]{"back", "="}).contains(str) && !onWarmupCompleted((List<? extends onWarmupCompleted>) this.onNavigationEvent)) {
            String string = getContext().getString(im.toss.features.home.ui.R.string.home_ui_amount_edit_no_more_input_error);
            Intrinsics.checkNotNullExpressionValue(string, "");
            onNavigationEvent(string);
            return;
        }
        this.onWarmupCompleted = false;
        int iHashCode = str.hashCode();
        if (iHashCode != 45) {
            if (iHashCode != 61) {
                if (iHashCode != 120) {
                    if (iHashCode != 247) {
                        if (iHashCode != 1536) {
                            if (iHashCode != 3015911) {
                                int i3 = IAuthTabCallback_Parcel + 67;
                                IAuthTabCallbackStubProxy = i3 % 128;
                                int i4 = i3 % 2;
                                switch (iHashCode) {
                                    case R$styleable.CameraView_cameraVideoMaxSize /* 48 */:
                                        Object[] objArr = new Object[1];
                                        a(new char[]{61618, 61570, 49715, 31808, 13938}, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                                        if (!str.equals(((String) objArr[0]).intern())) {
                                            i = IAuthTabCallback_Parcel + 1;
                                            IAuthTabCallbackStubProxy = i % 128;
                                            int i5 = i % 2;
                                            break;
                                        }
                                        if (!this.onExtraCallbackWithResult) {
                                            Object[] objArr2 = new Object[1];
                                            a(new char[]{61618, 61570, 49715, 31808, 13938}, 1 - TextUtils.getTrimmedLength(""), objArr2);
                                            if (!CollectionsKt.listOf(new String[]{"00", ((String) objArr2[0]).intern()}).contains(str)) {
                                                this.onNavigationEvent.clear();
                                            }
                                        }
                                        onextracallbackwithresult = (onWarmupCompleted) CollectionsKt.lastOrNull(this.onNavigationEvent);
                                        if (!(onextracallbackwithresult instanceof onWarmupCompleted.onExtraCallbackWithResult)) {
                                            if (!(onextracallbackwithresult instanceof onWarmupCompleted.onNavigationEvent)) {
                                                int i6 = IAuthTabCallbackStubProxy + 41;
                                                IAuthTabCallback_Parcel = i6 % 128;
                                                if (i6 % 2 == 0) {
                                                    throw null;
                                                }
                                                if (onextracallbackwithresult != null) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                            this.onNavigationEvent.add(new onWarmupCompleted.onExtraCallbackWithResult(Long.parseLong(str)));
                                            this.IAuthTabCallback.writeTypedObject.setText(onNavigationEvent((List<? extends onWarmupCompleted>) this.onNavigationEvent));
                                            break;
                                        } else {
                                            try {
                                                Result.Companion companion = Result.Companion;
                                                long j = Long.parseLong(onextracallbackwithresult.onNavigationEvent() + str);
                                                if (j > 10000000000L) {
                                                    String string2 = getContext().getString(im.toss.features.home.ui.R.string.home_ui_amount_edit_huge_amount_input_error);
                                                    Intrinsics.checkNotNullExpressionValue(string2, "");
                                                    onNavigationEvent(string2);
                                                } else {
                                                    onextracallbackwithresult.onExtraCallbackWithResult(j);
                                                    this.IAuthTabCallback.writeTypedObject.setText(onNavigationEvent((List<? extends onWarmupCompleted>) this.onNavigationEvent));
                                                }
                                                obj = Result.constructor-impl(Unit.INSTANCE);
                                            } catch (Throwable th) {
                                                Result.Companion companion2 = Result.Companion;
                                                obj = Result.constructor-impl(ResultKt.createFailure(th));
                                            }
                                            Result.IAuthTabCallback(obj);
                                            break;
                                        }
                                    case 49:
                                        Object[] objArr3 = new Object[1];
                                        a(new char[]{56736, 56721, 23983, 36350, 14659}, TextUtils.getOffsetAfter("", 0) + 1, objArr3);
                                        if (str.equals(((String) objArr3[0]).intern())) {
                                            if (!this.onExtraCallbackWithResult) {
                                            }
                                            onextracallbackwithresult = (onWarmupCompleted) CollectionsKt.lastOrNull(this.onNavigationEvent);
                                            if (!(onextracallbackwithresult instanceof onWarmupCompleted.onExtraCallbackWithResult)) {
                                            }
                                        }
                                        break;
                                    case 50:
                                        Object[] objArr4 = new Object[1];
                                        a(new char[]{48598, 48612, 37294, 30057, 22921}, -ImageFormat.getBitsPerPixel(0), objArr4);
                                        if (str.equals(((String) objArr4[0]).intern())) {
                                        }
                                        break;
                                    case 51:
                                        if (str.equals("3")) {
                                        }
                                        break;
                                    case 52:
                                        if (str.equals("4")) {
                                        }
                                        break;
                                    case 53:
                                        if (str.equals("5")) {
                                        }
                                        break;
                                    case 54:
                                        if (str.equals("6")) {
                                        }
                                        break;
                                    case 55:
                                        if (!str.equals("7")) {
                                            i = IAuthTabCallbackStubProxy + 33;
                                            IAuthTabCallback_Parcel = i % 128;
                                            int i52 = i % 2;
                                            break;
                                        }
                                        if (!this.onExtraCallbackWithResult) {
                                        }
                                        onextracallbackwithresult = (onWarmupCompleted) CollectionsKt.lastOrNull(this.onNavigationEvent);
                                        if (!(onextracallbackwithresult instanceof onWarmupCompleted.onExtraCallbackWithResult)) {
                                        }
                                        break;
                                    case 56:
                                        if (str.equals("8")) {
                                        }
                                        break;
                                    case 57:
                                        if (str.equals("9")) {
                                        }
                                        break;
                                }
                            } else if (str.equals("back")) {
                                onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult2 = (onWarmupCompleted) CollectionsKt.lastOrNull(this.onNavigationEvent);
                                if (onextracallbackwithresult2 instanceof onWarmupCompleted.onExtraCallbackWithResult) {
                                    onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2;
                                    onextracallbackwithresult3.onExtraCallbackWithResult(onextracallbackwithresult3.onNavigationEvent() / 10);
                                    if (onextracallbackwithresult3.onNavigationEvent() == 0) {
                                        List<onWarmupCompleted> list = this.onNavigationEvent;
                                        list.remove(CollectionsKt.getLastIndex(list));
                                    }
                                } else if (Intrinsics.areEqual(onextracallbackwithresult2, onWarmupCompleted.onNavigationEvent.onNavigationEvent.onWarmupCompleted) || Intrinsics.areEqual(onextracallbackwithresult2, onWarmupCompleted.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent) || Intrinsics.areEqual(onextracallbackwithresult2, onWarmupCompleted.onNavigationEvent.onExtraCallback.onNavigationEvent)) {
                                    List<onWarmupCompleted> list2 = this.onNavigationEvent;
                                    list2.remove(CollectionsKt.getLastIndex(list2));
                                } else if (onextracallbackwithresult2 != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.IAuthTabCallback.writeTypedObject.setText(onNavigationEvent((List<? extends onWarmupCompleted>) this.onNavigationEvent));
                            }
                        } else if (str.equals("00")) {
                        }
                    } else if (str.equals("÷")) {
                        int iHashCode2 = str.hashCode();
                        if (iHashCode2 != 45) {
                            if (iHashCode2 != 120) {
                                int i7 = IAuthTabCallbackStubProxy + 23;
                                IAuthTabCallback_Parcel = i7 % 128;
                                int i8 = i7 % 2;
                                if (iHashCode2 != 247 || !str.equals("÷")) {
                                    return;
                                } else {
                                    onnavigationevent = onWarmupCompleted.onNavigationEvent.onNavigationEvent.onWarmupCompleted;
                                }
                            } else if (!str.equals("x")) {
                                return;
                            } else {
                                onnavigationevent = onWarmupCompleted.onNavigationEvent.onExtraCallback.onNavigationEvent;
                            }
                        } else if (!str.equals("-")) {
                            return;
                        } else {
                            onnavigationevent = onWarmupCompleted.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent;
                        }
                        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) CollectionsKt.lastOrNull(this.onNavigationEvent);
                        if (onwarmupcompleted instanceof onWarmupCompleted.onExtraCallbackWithResult) {
                            this.onNavigationEvent.add(onnavigationevent);
                        } else if (Intrinsics.areEqual(onwarmupcompleted, onWarmupCompleted.onNavigationEvent.onNavigationEvent.onWarmupCompleted) || Intrinsics.areEqual(onwarmupcompleted, onWarmupCompleted.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent) || Intrinsics.areEqual(onwarmupcompleted, onWarmupCompleted.onNavigationEvent.onExtraCallback.onNavigationEvent)) {
                            List<onWarmupCompleted> list3 = this.onNavigationEvent;
                            list3.set(CollectionsKt.getLastIndex(list3), onnavigationevent);
                        } else {
                            int i9 = IAuthTabCallbackStubProxy + 83;
                            IAuthTabCallback_Parcel = i9 % 128;
                            int i10 = i9 % 2;
                            if (onwarmupcompleted != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String string3 = getContext().getString(im.toss.features.home.ui.R.string.home_ui_amount_edit_require_number_first_error);
                            Intrinsics.checkNotNullExpressionValue(string3, "");
                            onNavigationEvent(string3);
                        }
                        if (!this.onWarmupCompleted) {
                            int i11 = IAuthTabCallbackStubProxy + 119;
                            IAuthTabCallback_Parcel = i11 % 128;
                            if (i11 % 2 == 0) {
                                this.IAuthTabCallback.writeTypedObject.setText(onNavigationEvent((List<? extends onWarmupCompleted>) this.onNavigationEvent));
                                int i12 = 0 / 0;
                            } else {
                                this.IAuthTabCallback.writeTypedObject.setText(onNavigationEvent((List<? extends onWarmupCompleted>) this.onNavigationEvent));
                            }
                        }
                    }
                } else if (str.equals("x")) {
                }
            } else if (str.equals("=")) {
                onNavigationEvent();
            }
        } else if (str.equals("-")) {
        }
        if (!this.onWarmupCompleted) {
            isOneShot.onExtraCallbackWithResult(this, noStore.Companion.asBinder());
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1233671L, false, (String) null, (Map) null, new HomeTransactionAmountEditView$.ExternalSyntheticLambda1(str, this), 14, (Object) null);
        this.IAuthTabCallback.readTypedObject.asInterface().setEnabled(!this.onNavigationEvent.isEmpty());
        this.onExtraCallbackWithResult = true;
        HomeTextBoardView homeTextBoardView = this.IAuthTabCallback.writeTypedObject;
        homeTextBoardView.announceForAccessibility(homeTextBoardView.onWarmupCompleted());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent() {
        Object obj;
        onWarmupCompleted onwarmupcompleted;
        onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            onwarmupcompleted = (onWarmupCompleted) CollectionsKt.lastOrNull(this.onNavigationEvent);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (onwarmupcompleted == null) {
            int i2 = IAuthTabCallback_Parcel + 95;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                String string = getContext().getString(im.toss.features.home.ui.R.string.home_ui_amount_edit_require_number_error);
                Intrinsics.checkNotNullExpressionValue(string, "");
                onNavigationEvent(string);
                return;
            } else {
                String string2 = getContext().getString(im.toss.features.home.ui.R.string.home_ui_amount_edit_require_number_error);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                onNavigationEvent(string2);
                throw null;
            }
        }
        if (onwarmupcompleted instanceof onWarmupCompleted.onNavigationEvent) {
            List<onWarmupCompleted> list = this.onNavigationEvent;
            list.remove(CollectionsKt.getLastIndex(list));
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult2 = this.onNavigationEvent.get(0);
        Intrinsics.checkNotNull(onextracallbackwithresult2, "");
        onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2;
        for (int i3 = 1; i3 < this.onNavigationEvent.size(); i3 += 2) {
            int i4 = IAuthTabCallbackStubProxy + 33;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted.onNavigationEvent onnavigationevent = this.onNavigationEvent.get(i3);
            Intrinsics.checkNotNull(onnavigationevent, "");
            onWarmupCompleted.onNavigationEvent onnavigationevent2 = onnavigationevent;
            if (Intrinsics.areEqual(onnavigationevent2, onWarmupCompleted.onNavigationEvent.onNavigationEvent.onWarmupCompleted)) {
                onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult4 = this.onNavigationEvent.get(i3 + 1);
                Intrinsics.checkNotNull(onextracallbackwithresult4, "");
                onextracallbackwithresult = new onWarmupCompleted.onExtraCallbackWithResult(onextracallbackwithresult3.onNavigationEvent() / onextracallbackwithresult4.onNavigationEvent());
            } else if (Intrinsics.areEqual(onnavigationevent2, onWarmupCompleted.onNavigationEvent.onExtraCallback.onNavigationEvent)) {
                onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult5 = this.onNavigationEvent.get(i3 + 1);
                Intrinsics.checkNotNull(onextracallbackwithresult5, "");
                onextracallbackwithresult = new onWarmupCompleted.onExtraCallbackWithResult(onextracallbackwithresult3.onNavigationEvent() * onextracallbackwithresult5.onNavigationEvent());
                int i6 = IAuthTabCallback_Parcel + 109;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
            } else {
                if (!Intrinsics.areEqual(onnavigationevent2, onWarmupCompleted.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                listCreateListBuilder.add(onextracallbackwithresult3);
                listCreateListBuilder.add(this.onNavigationEvent.get(i3));
                onWarmupCompleted onwarmupcompleted2 = this.onNavigationEvent.get(i3 + 1);
                Intrinsics.checkNotNull(onwarmupcompleted2, "");
                onextracallbackwithresult3 = (onWarmupCompleted.onExtraCallbackWithResult) onwarmupcompleted2;
            }
            onextracallbackwithresult3 = onextracallbackwithresult;
        }
        listCreateListBuilder.add(onextracallbackwithresult3);
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        Object objFirst = CollectionsKt.first(listBuild);
        Intrinsics.checkNotNull(objFirst, "");
        long jOnNavigationEvent = ((onWarmupCompleted.onExtraCallbackWithResult) objFirst).onNavigationEvent();
        for (int i8 = 1; i8 < listBuild.size(); i8 += 2) {
            Object obj2 = listBuild.get(i8);
            Intrinsics.checkNotNull(obj2, "");
            onWarmupCompleted.onNavigationEvent onnavigationevent3 = (onWarmupCompleted.onNavigationEvent) obj2;
            Object obj3 = listBuild.get(i8 + 1);
            Intrinsics.checkNotNull(obj3, "");
            long jOnNavigationEvent2 = ((onWarmupCompleted.onExtraCallbackWithResult) obj3).onNavigationEvent();
            if (!(!Intrinsics.areEqual(onnavigationevent3, onWarmupCompleted.onNavigationEvent.onNavigationEvent.onWarmupCompleted))) {
                jOnNavigationEvent /= jOnNavigationEvent2;
            } else if (Intrinsics.areEqual(onnavigationevent3, onWarmupCompleted.onNavigationEvent.onExtraCallback.onNavigationEvent)) {
                jOnNavigationEvent *= jOnNavigationEvent2;
                int i9 = IAuthTabCallback_Parcel + 87;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
            } else {
                if (!Intrinsics.areEqual(onnavigationevent3, onWarmupCompleted.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                jOnNavigationEvent -= jOnNavigationEvent2;
            }
        }
        obj = Result.constructor-impl(Long.valueOf(jOnNavigationEvent));
        if (Result.onNavigationEvent(obj)) {
            int i11 = IAuthTabCallback_Parcel + 21;
            IAuthTabCallbackStubProxy = i11 % 128;
            int i12 = i11 % 2;
            long jLongValue = ((Number) obj).longValue();
            if (jLongValue < 0) {
                String string3 = getContext().getString(im.toss.features.home.ui.R.string.home_ui_amount_edit_no_negative_number_error);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                onNavigationEvent(string3);
                int i13 = IAuthTabCallback_Parcel + 91;
                IAuthTabCallbackStubProxy = i13 % 128;
                int i14 = i13 % 2;
            } else {
                setAmount(jLongValue);
            }
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            zzaj.onNavigationEvent().onActivityLayout();
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "HomeTransactionAmountEditView_result", th2.getMessage(), th2, (Map) null, 8, (Object) null);
            String string4 = getContext().getString(im.toss.features.home.ui.R.string.home_ui_amount_edit_unknown_error);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            onNavigationEvent(string4);
        }
    }

    private final String onNavigationEvent(List<? extends onWarmupCompleted> list) {
        int i = 2 % 2;
        String strJoinToString$default = CollectionsKt.joinToString$default(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new HomeTransactionAmountEditView$.ExternalSyntheticLambda0(), 30, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return strJoinToString$default;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult = (onWarmupCompleted) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            boolean z = onextracallbackwithresult instanceof onWarmupCompleted.onExtraCallbackWithResult;
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult instanceof onWarmupCompleted.onExtraCallbackWithResult) {
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            decimalFormat.setNegativePrefix("-");
            String str = decimalFormat.format(onextracallbackwithresult.onNavigationEvent());
            Intrinsics.checkNotNull(str);
            return str;
        }
        if (Intrinsics.areEqual(onextracallbackwithresult, onWarmupCompleted.onNavigationEvent.onNavigationEvent.onWarmupCompleted)) {
            int i3 = IAuthTabCallback_Parcel + 71;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 99 / 0;
            }
            return "÷";
        }
        if (!Intrinsics.areEqual(onextracallbackwithresult, onWarmupCompleted.onNavigationEvent.onExtraCallbackWithResult.onNavigationEvent)) {
            if (!Intrinsics.areEqual(onextracallbackwithresult, onWarmupCompleted.onNavigationEvent.onExtraCallback.onNavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            return "x";
        }
        int i5 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return "-";
        }
        obj.hashCode();
        throw null;
    }

    private final boolean onWarmupCompleted(List<? extends onWarmupCompleted> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int length = onNavigationEvent(list).length();
        if (i3 != 0 ? length >= 50 : length >= 21) {
            return false;
        }
        int i4 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return true;
    }

    public static /* synthetic */ void setCta$default(HomeTransactionAmountEditView homeTransactionAmountEditView, CharSequence charSequence, Function1 function1, TdsButtonV1View.asInterface asinterface, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel;
        int i4 = i3 + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0 ? (i & 4) != 0 : (i & 4) != 0) {
            int i5 = i3 + 35;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            asinterface = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        homeTransactionAmountEditView.setCta(charSequence, function1, asinterface, z);
        int i7 = IAuthTabCallback_Parcel + 39;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final void setCta(@NotNull CharSequence charSequence, @NotNull Function1<? super View, Unit> function1, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback.readTypedObject.setCta(charSequence, function1, asinterface, z);
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback.readTypedObject.setCta(charSequence, function1, asinterface, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ void setSecondary$default(HomeTransactionAmountEditView homeTransactionAmountEditView, CharSequence charSequence, Function1 function1, TdsButtonV1View.asInterface asinterface, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 3) != 0) {
            asinterface = null;
        }
        homeTransactionAmountEditView.setSecondary(charSequence, function1, asinterface);
        int i4 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void setSecondary(@NotNull CharSequence charSequence, @NotNull Function1<? super View, Unit> function1, @Nullable TdsButtonV1View.asInterface asinterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback.readTypedObject.setSecondary(charSequence, function1, asinterface);
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback.readTypedObject.setSecondary(charSequence, function1, asinterface);
            throw null;
        }
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted = true;
        this.IAuthTabCallback.writeTypedObject.onWarmupCompleted(str);
        this.IAuthTabCallback.writeTypedObject.announceForAccessibility(str);
        int i4 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(boolean z) {
        int i;
        int i2 = 2 % 2;
        TdsTextButtonV0View tdsTextButtonV0View = this.IAuthTabCallback.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTextButtonV0View, "");
        if (!z) {
            int i3 = IAuthTabCallback_Parcel + 109;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            i = 8;
        } else {
            int i5 = IAuthTabCallback_Parcel + 101;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        tdsTextButtonV0View.setVisibility(i);
        int i7 = IAuthTabCallbackStubProxy + 57;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Context context, HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{context, homeTransactionAmountEditView, view}, 1718565844, -1718565838, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    public static /* synthetic */ void IAuthTabCallback(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{homeTransactionAmountEditView, view}, 1026988390, -1026988379, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    public static /* synthetic */ void onWarmupCompleted(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{homeTransactionAmountEditView, view}, 498761129, -498761120, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    public static /* synthetic */ boolean getInterfaceDescriptor(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, 1391105014, -1391105014, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    public static /* synthetic */ void IAuthTabCallback(HomeTransactionAmountEditView homeTransactionAmountEditView, String str) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{homeTransactionAmountEditView, str}, 2019774824, -2019774812, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    private static final void onTransact(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{homeTransactionAmountEditView, view}, -366496010, 366496025, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    private static final void IAuthTabCallbackDefault(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{homeTransactionAmountEditView, view}, -2050446166, 2050446167, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    private static final boolean access100(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, -918623173, 918623183, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    private static final boolean extraCallback(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, -1163639885, 1163639898, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    private static final boolean ICustomTabsCallback(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, 590118217, -590118210, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    private static final void IAuthTabCallbackStub(HomeTransactionAmountEditView homeTransactionAmountEditView, View view) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{homeTransactionAmountEditView, view}, 1070113517, -1070113509, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    private static final boolean onPostMessage(HomeTransactionAmountEditView homeTransactionAmountEditView, View view, MotionEvent motionEvent) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(new Object[]{homeTransactionAmountEditView, view, motionEvent}, -1114120374, 1114120388, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).booleanValue();
    }

    private static final CharSequence onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (CharSequence) onNavigationEvent(new Object[]{onwarmupcompleted}, -1526097769, 1526097771, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    private static final Unit onWarmupCompleted(View view, HomeTransactionAmountEditView homeTransactionAmountEditView, String str, Long l) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{view, homeTransactionAmountEditView, str, l}, 1665744736, -1665744732, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(new Object[]{function1, obj}, -226394241, 226394244, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback);
    }

    public final long onExtraCallbackWithResult() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return ((Long) onNavigationEvent(new Object[]{this}, -1569632701, 1569632706, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback)).longValue();
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = -2202441536248304323L;
    }
}
