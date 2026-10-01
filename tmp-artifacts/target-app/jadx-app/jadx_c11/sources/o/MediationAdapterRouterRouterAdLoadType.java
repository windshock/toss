package o;

import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.RenderEffectKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.tds.compose.foundation.anim.rally.RallyGraphicsLayerModifier;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MediationAdapterRouterRouterAdLoadType {
    private static int ICustomTabsCallback = 0;
    private static int extraCallback = 1;
    private Float IAuthTabCallback;
    private Float IAuthTabCallbackDefault;
    private Float IAuthTabCallbackStub;
    private Float IAuthTabCallbackStubProxy;
    private Float IAuthTabCallback_Parcel;
    private Float access000;
    private Float access100;
    private Float asBinder;
    private RenderEffect asInterface;
    private Float extraCallbackWithResult;
    private Float getInterfaceDescriptor;
    private final Map<RallyGraphicsLayerModifier, Function0<Unit>> onExtraCallback = new LinkedHashMap();
    private Float onExtraCallbackWithResult;
    private Float onNavigationEvent;
    private Float onTransact;
    private Float onWarmupCompleted;
    private Float readTypedObject;
    private Float writeTypedObject;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = i7 | i;
        int i9 = ~(i8 | i4);
        int i10 = (~i4) | (~((~i) | i5));
        int i11 = (~(i4 | i)) | (~(i7 | i4)) | (~i8);
        int i12 = i5 + i + i6 + ((-953487067) * i3) + ((-1992133889) * i2);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i5) + 1765277696 + (1051104396 * i) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i6) + ((-1703411712) * i3) + (1961361408 * i2) + (907935744 * i13);
        int i15 = ((i5 * 272661978) - 2115615402) + (i * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i6 * 272662391) + (i3 * 2077717299) + (i2 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        if (i16 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i16 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 4) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 != 5) {
            return onExtraCallback(objArr);
        }
        MediationAdapterRouterRouterAdLoadType mediationAdapterRouterRouterAdLoadType = (MediationAdapterRouterRouterAdLoadType) objArr[0];
        int i17 = 2 % 2;
        int i18 = ICustomTabsCallback + 35;
        int i19 = i18 % 128;
        extraCallback = i19;
        int i20 = i18 % 2;
        Float f = mediationAdapterRouterRouterAdLoadType.onTransact;
        int i21 = i19 + 33;
        ICustomTabsCallback = i21 % 128;
        int i22 = i21 % 2;
        return f;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MediationAdapterRouterRouterAdLoadType mediationAdapterRouterRouterAdLoadType = (MediationAdapterRouterRouterAdLoadType) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        mediationAdapterRouterRouterAdLoadType.readTypedObject = f;
        if (i3 != 0) {
            return null;
        }
        int i4 = 22 / 0;
        return null;
    }

    public final Float extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Float f = this.readTypedObject;
        int i5 = i3 + 41;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final void access000(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 35;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.getInterfaceDescriptor = f;
        int i5 = i2 + 37;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Float getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 65;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.getInterfaceDescriptor;
        int i5 = i2 + 101;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final Float ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Float f = this.writeTypedObject;
        int i5 = i3 + 3;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void extraCallbackWithResult(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 19;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.writeTypedObject = f;
        int i5 = i2 + 113;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback_Parcel(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        this.extraCallbackWithResult = f;
        int i5 = i3 + 33;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Float readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Float f = this.extraCallbackWithResult;
        int i4 = i3 + 17;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final void onWarmupCompleted(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.onTransact = f;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 123;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackDefault(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = f;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
    }

    public final Float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        int i3 = i2 % 128;
        extraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Float f = this.IAuthTabCallbackDefault;
        int i4 = i3 + 69;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MediationAdapterRouterRouterAdLoadType mediationAdapterRouterRouterAdLoadType = (MediationAdapterRouterRouterAdLoadType) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        mediationAdapterRouterRouterAdLoadType.asBinder = f;
        int i5 = i3 + 121;
        ICustomTabsCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Float f = this.asBinder;
        int i4 = i3 + 71;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final Float onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Float f = this.onWarmupCompleted;
        int i5 = i3 + 89;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void onNavigationEvent(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 97;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = f;
        int i5 = i2 + 61;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Float asInterface() {
        Float f;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 == 0) {
            f = this.IAuthTabCallbackStub;
            int i4 = 89 / 0;
        } else {
            f = this.IAuthTabCallbackStub;
        }
        int i5 = i3 + 49;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final void onTransact(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = f;
        if (i3 == 0) {
            throw null;
        }
    }

    public final Float IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 57;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Float f = this.access000;
        int i4 = i2 + 35;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return f;
    }

    public final void asBinder(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        this.access000 = f;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 117;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MediationAdapterRouterRouterAdLoadType mediationAdapterRouterRouterAdLoadType = (MediationAdapterRouterRouterAdLoadType) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 65;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        mediationAdapterRouterRouterAdLoadType.IAuthTabCallbackStubProxy = f;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 15;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final Float access100() {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Float f = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 21;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final void IAuthTabCallbackStubProxy(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.access100 = f;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float access000() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 77;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.access100;
        int i5 = i2 + 87;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final Float IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void access100(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback_Parcel = f;
        if (i3 == 0) {
            throw null;
        }
    }

    public final Float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 93;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.onExtraCallbackWithResult;
        int i5 = i2 + 37;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return f;
    }

    public final void onExtraCallbackWithResult(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = f;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MediationAdapterRouterRouterAdLoadType mediationAdapterRouterRouterAdLoadType = (MediationAdapterRouterRouterAdLoadType) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 125;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Float f = mediationAdapterRouterRouterAdLoadType.onNavigationEvent;
        int i5 = i2 + 37;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        readLine readlineOnWarmupCompleted;
        MediationAdapterRouterRouterAdLoadType mediationAdapterRouterRouterAdLoadType = (MediationAdapterRouterRouterAdLoadType) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        int i3 = i2 % 128;
        extraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            mediationAdapterRouterRouterAdLoadType.onNavigationEvent = f;
            if (f != null) {
                int i4 = i3 + 77;
                ICustomTabsCallback = i4 % 128;
                readlineOnWarmupCompleted = (i4 % 2 == 0 ? !(true ^ Intrinsics.areEqual(f, 0.0f)) : Intrinsics.areEqual(f, 2.0f)) ? null : RenderEffectKt.onWarmupCompleted(f.floatValue(), f.floatValue(), createURational.Companion.onExtraCallback());
            }
            mediationAdapterRouterRouterAdLoadType.asInterface = readlineOnWarmupCompleted;
            return null;
        }
        mediationAdapterRouterRouterAdLoadType.onNavigationEvent = f;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = f;
        int i5 = i3 + 57;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Float f = this.IAuthTabCallback;
        int i5 = i3 + 107;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final RenderEffect asBinder() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 73;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        RenderEffect renderEffect = this.asInterface;
        int i5 = i2 + 45;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return renderEffect;
        }
        throw null;
    }

    public final Map<RallyGraphicsLayerModifier, Function0<Unit>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 49;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<RallyGraphicsLayerModifier, Function0<Unit>> map = this.onExtraCallback;
        int i5 = i2 + 1;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Float onExtraCallbackWithResult() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Float) IAuthTabCallback(851764046, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, -851764046, iOnNavigationEvent2, new Object[]{this});
    }

    public final Float onTransact() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Float) IAuthTabCallback(-1650384927, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, 1650384932, iOnNavigationEvent2, new Object[]{this});
    }

    public final void onExtraCallback(@Nullable Float f) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        IAuthTabCallback(500355780, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, -500355777, iOnNavigationEvent2, new Object[]{this, f});
    }

    public final void asInterface(@Nullable Float f) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        IAuthTabCallback(-290158022, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, 290158026, iOnNavigationEvent2, new Object[]{this, f});
    }

    public final void IAuthTabCallbackStub(@Nullable Float f) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        IAuthTabCallback(1128941242, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, -1128941240, iOnNavigationEvent2, new Object[]{this, f});
    }

    public final void getInterfaceDescriptor(@Nullable Float f) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        IAuthTabCallback(-111626881, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, 111626882, iOnNavigationEvent2, new Object[]{this, f});
    }
}
