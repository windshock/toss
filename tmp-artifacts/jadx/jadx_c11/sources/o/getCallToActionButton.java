package o;

import android.view.animation.Interpolator;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getCallToActionButton {
    private static final getMediaContentViewGroup IAuthTabCallback;
    private static final getMediaContentViewGroup IAuthTabCallbackDefault;
    private static final getMediaContentViewGroup IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static final getMediaContentViewGroup asBinder;
    private static final getMediaContentViewGroup asInterface;
    private static int getInterfaceDescriptor = 1;
    public static final getCallToActionButton onExtraCallback = new getCallToActionButton();
    private static final getMediaContentViewGroup onExtraCallbackWithResult;
    private static final getMediaContentViewGroup onNavigationEvent;
    private static final getMediaContentViewGroup onTransact;
    private static final getMediaContentViewGroup onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i5));
        int i11 = ~(i7 | i9);
        int i12 = i6 | i11;
        int i13 = (~(i5 | i)) | i11 | (~(i8 | i));
        int i14 = i + i6 + i2 + (296844165 * i3) + (1729652556 * i4);
        int i15 = i14 * i14;
        int i16 = ((i * 599922083) - 580124672) + (599922083 * i6) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i2) + ((-279707648) * i3) + ((-265289728) * i4) + (2117271552 * i15);
        int i17 = (i * (-1181628991)) + 1322814002 + (i6 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i2 * (-1181629109)) + (i3 * (-698251017)) + (i4 * 1773125444) + (i15 * 938541056);
        return i16 + ((i17 * i17) * (-109772800)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ float onExtraCallback(setOnQueryTextListener setonquerytextlistener, float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Float) IAuthTabCallback(601433873, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{setonquerytextlistener, Float.valueOf(f)}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -601433872)).floatValue();
        int i4 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getCallToActionButton() {
    }

    static {
        Address address = Address.onNavigationEvent;
        IAuthTabCallbackDefault = new getMediaContentViewGroup(address.asInterface());
        asInterface = new getMediaContentViewGroup(address.IAuthTabCallbackStub());
        IAuthTabCallback = new getMediaContentViewGroup(address.onWarmupCompleted());
        asBinder = new getMediaContentViewGroup(address.asBinder());
        onTransact = new getMediaContentViewGroup(address.onExtraCallbackWithResult());
        onExtraCallbackWithResult = new getMediaContentViewGroup(address.IAuthTabCallback());
        onWarmupCompleted = new getMediaContentViewGroup((Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 338196445, new Object[]{address}, nSetPosition.onExtraCallbackWithResult(), -338196445));
        IAuthTabCallbackStub = new getMediaContentViewGroup(address.IAuthTabCallbackDefault());
        onNavigationEvent = new getMediaContentViewGroup(address.onNavigationEvent());
        int i = access100 + 1;
        access000 = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
    }

    public final getMediaContentViewGroup IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getMediaContentViewGroup getmediacontentviewgroup = IAuthTabCallbackDefault;
        int i4 = i3 + 63;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getmediacontentviewgroup;
    }

    public final getMediaContentViewGroup asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        getMediaContentViewGroup getmediacontentviewgroup = asInterface;
        int i5 = i2 + 21;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return getmediacontentviewgroup;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getMediaContentViewGroup onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getMediaContentViewGroup onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 117;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getMediaContentViewGroup getmediacontentviewgroup = onTransact;
        int i4 = i2 + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return getmediacontentviewgroup;
        }
        throw null;
    }

    public final getMediaContentViewGroup onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        getMediaContentViewGroup getmediacontentviewgroup = onExtraCallbackWithResult;
        int i5 = i3 + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return getmediacontentviewgroup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getMediaContentViewGroup onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getMediaContentViewGroup getmediacontentviewgroup = onWarmupCompleted;
        int i4 = i3 + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return getmediacontentviewgroup;
    }

    public final getMediaContentViewGroup IAuthTabCallback(float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        Interpolator interpolatorIAuthTabCallback = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(f, f2, f3, f4);
        Intrinsics.checkNotNullExpressionValue(interpolatorIAuthTabCallback, "");
        getMediaContentViewGroup getmediacontentviewgroup = new getMediaContentViewGroup(interpolatorIAuthTabCallback);
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return getmediacontentviewgroup;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setOnQueryTextListener setonquerytextlistener = (setOnQueryTextListener) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i2 % 128;
        return Float.valueOf(i2 % 2 == 0 ? 1.0f / setonquerytextlistener.transform(fFloatValue * 0.0f) : 1.0f - setonquerytextlistener.transform(1.0f - fFloatValue));
    }

    private static final float onWarmupCompleted(setOnQueryTextListener setonquerytextlistener, float f) {
        return ((Float) IAuthTabCallback(601433873, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{setonquerytextlistener, Float.valueOf(f)}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -601433872)).floatValue();
    }

    public final getMediaContentViewGroup onWarmupCompleted() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (getMediaContentViewGroup) IAuthTabCallback(-1178288673, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1178288673);
    }
}
