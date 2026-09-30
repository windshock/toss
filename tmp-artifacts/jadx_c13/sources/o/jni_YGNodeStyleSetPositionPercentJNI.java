package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.jni_YGNodeStyleSetPaddingPercentJNI;
import o.jni_YGNodeStyleSetWidthJNI;
import o.setRevisionBytes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetPositionPercentJNI {
    private final sya41 IAuthTabCallbackDefault;
    private final sya41 IAuthTabCallbackStub;
    private final sya41 IAuthTabCallbackStubProxy;
    private final sya41 IAuthTabCallback_Parcel;
    private final sya41 access100;
    private final sya41 asBinder;
    private final sya41 asInterface;
    private final xym onExtraCallback;
    private final jni_YGNodeStyleSetPositionAutoJNI onExtraCallbackWithResult;
    private final sya41 onNavigationEvent;
    private final sya41 onTransact;
    private final sya41 onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "day", "getDay()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "dayOfYear", "getDayOfYear()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "hour", "getHour()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "minute", "getMinute()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "second", "getSecond()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jni_YGNodeStyleSetPositionPercentJNI.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0))};
    public static final onExtraCallback Companion = new onExtraCallback(null);

    /* JADX WARN: Multi-variable type inference failed */
    public jni_YGNodeStyleSetPositionPercentJNI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetPositionPercentJNI> onNavigationEvent(@NotNull Function1<? super jni_YGNodeStyleSetWidthJNI.onExtraCallback, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            jni_YGNodeStyleSetPaddingPercentJNI.IAuthTabCallback iAuthTabCallback = new jni_YGNodeStyleSetPaddingPercentJNI.IAuthTabCallback(new jw3());
            function1.invoke(iAuthTabCallback);
            return new jni_YGNodeStyleSetPaddingPercentJNI(iAuthTabCallback.onNavigationEvent());
        }
    }

    public jni_YGNodeStyleSetPositionPercentJNI(@NotNull jni_YGNodeStyleSetPositionAutoJNI jni_ygnodestylesetpositionautojni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetpositionautojni, "");
        this.onExtraCallbackWithResult = jni_ygnodestylesetpositionautojni;
        jni_ygnodestylesetpositionautojni.asInterface();
        this.IAuthTabCallbackStub = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.asInterface()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.asBinder
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((removeAllViewsInLayout) this.receiver).access100();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((removeAllViewsInLayout) this.receiver).IAuthTabCallbackStub((Integer) obj);
            }
        });
        this.onWarmupCompleted = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.asInterface()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.onWarmupCompleted
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((removeAllViewsInLayout) this.receiver).onWarmupCompleted();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((removeAllViewsInLayout) this.receiver).onNavigationEvent((Integer) obj);
            }
        });
        this.onNavigationEvent = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.asInterface()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.onExtraCallbackWithResult
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((removeAllViewsInLayout) this.receiver).onWarmupCompleted();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((removeAllViewsInLayout) this.receiver).onNavigationEvent((Integer) obj);
            }
        });
        this.onExtraCallback = new xym(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.asInterface()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.IAuthTabCallback
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((removeAllViewsInLayout) this.receiver).onExtraCallbackWithResult();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((removeAllViewsInLayout) this.receiver).onExtraCallback((Integer) obj);
            }
        });
        this.onTransact = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.extraCallback()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.IAuthTabCallbackDefault
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((hpv) this.receiver).onTransact();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((hpv) this.receiver).IAuthTabCallback((Integer) obj);
            }
        });
        this.asInterface = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.extraCallback()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.onTransact
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((hpv) this.receiver).IAuthTabCallbackStub();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((hpv) this.receiver).onWarmupCompleted((Integer) obj);
            }
        });
        jni_ygnodestylesetpositionautojni.extraCallback();
        this.asBinder = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.extraCallback()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.asInterface
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((hpv) this.receiver).IAuthTabCallback_Parcel();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((hpv) this.receiver).onTransact((Integer) obj);
            }
        });
        this.access100 = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.extraCallback()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.getInterfaceDescriptor
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((hpv) this.receiver).extraCallbackWithResult();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((hpv) this.receiver).getInterfaceDescriptor((Integer) obj);
            }
        });
        jni_ygnodestylesetpositionautojni.getInterfaceDescriptor();
        this.IAuthTabCallbackDefault = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.getInterfaceDescriptor()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.IAuthTabCallbackStub
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((bba) this.receiver).access000();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((bba) this.receiver).asBinder((Integer) obj);
            }
        });
        this.IAuthTabCallback_Parcel = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.getInterfaceDescriptor()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.access100
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((bba) this.receiver).writeTypedObject();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((bba) this.receiver).IAuthTabCallbackDefault((Integer) obj);
            }
        });
        this.IAuthTabCallbackStubProxy = new sya41(new MutablePropertyReference0Impl(jni_ygnodestylesetpositionautojni.getInterfaceDescriptor()) { // from class: o.jni_YGNodeStyleSetPositionPercentJNI.IAuthTabCallbackStubProxy
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.addAllMemoryMappings
            public Object get() {
                return ((bba) this.receiver).readTypedObject();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.access5700
            public void set(Object obj) {
                ((bba) this.receiver).IAuthTabCallbackStubProxy((Integer) obj);
            }
        });
    }

    public /* synthetic */ jni_YGNodeStyleSetPositionPercentJNI(jni_YGNodeStyleSetPositionAutoJNI jni_ygnodestylesetpositionautojni, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new jni_YGNodeStyleSetPositionAutoJNI(null, null, null, null, 15, null) : jni_ygnodestylesetpositionautojni);
    }

    public final void onExtraCallbackWithResult(@NotNull jni_YGNodeStyleSetFlexBasisJNI jni_ygnodestylesetflexbasisjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetflexbasisjni, "");
        this.onExtraCallbackWithResult.asInterface().onExtraCallbackWithResult(jni_ygnodestylesetflexbasisjni.onNavigationEvent());
        this.onExtraCallbackWithResult.extraCallback().onExtraCallback(jni_ygnodestylesetflexbasisjni.asBinder());
    }

    public final void IAuthTabCallback(@NotNull jni_YGNodeStyleSetMarginAutoJNI jni_ygnodestylesetmarginautojni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetmarginautojni, "");
        this.onExtraCallbackWithResult.getInterfaceDescriptor().onExtraCallbackWithResult(jni_ygnodestylesetmarginautojni);
    }

    public final void onNavigationEvent(@NotNull setRevisionBytes setrevisionbytes, @NotNull jni_YGNodeStyleSetMarginAutoJNI jni_ygnodestylesetmarginautojni) {
        Intrinsics.checkNotNullParameter(setrevisionbytes, "");
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetmarginautojni, "");
        onExtraCallbackWithResult(jni_YGNodeStyleSetGapPercentJNI.onNavigationEvent(setRevisionBytes.Companion.IAuthTabCallback(setrevisionbytes.onExtraCallback() % 315569520000L, setrevisionbytes.onNavigationEvent()), jni_ygnodestylesetmarginautojni));
        IAuthTabCallback(jni_ygnodestylesetmarginautojni);
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult();
        Intrinsics.checkNotNull(numOnExtraCallbackWithResult);
        onExtraCallback(Integer.valueOf(numOnExtraCallbackWithResult.intValue() + ((int) ((setrevisionbytes.onExtraCallback() / 315569520000L) * 10000))));
    }

    public final void onExtraCallback(@Nullable Integer num) {
        this.onExtraCallbackWithResult.asInterface().IAuthTabCallback_Parcel(num);
    }

    public final Integer onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.asInterface().onActivityLayout();
    }

    public final Integer onExtraCallback() {
        return this.onExtraCallbackWithResult.extraCallback().IAuthTabCallbackStubProxy();
    }

    public final jni_YGNodeStyleSetMarginAutoJNI onWarmupCompleted() {
        return this.onExtraCallbackWithResult.getInterfaceDescriptor().IAuthTabCallback();
    }

    public final jni_YGNodeStyleSetFlexBasisPercentJNI IAuthTabCallback() {
        return this.onExtraCallbackWithResult.extraCallback().IAuthTabCallback();
    }

    public static /* synthetic */ setRevisionBytes onWarmupCompleted(jni_YGNodeStyleSetPositionPercentJNI jni_ygnodestylesetpositionpercentjni, jni_YGNodeStyleSetGapJNI jni_ygnodestylesetgapjni, int i, Object obj) {
        if ((i & 1) != 0) {
            jni_ygnodestylesetgapjni = jni_YGNodeStyleSetGapJNI.Companion.onExtraCallback();
        }
        return jni_ygnodestylesetpositionpercentjni.onNavigationEvent(jni_ygnodestylesetgapjni);
    }

    public final setRevisionBytes onNavigationEvent(@NotNull jni_YGNodeStyleSetGapJNI jni_ygnodestylesetgapjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetgapjni, "");
        jni_YGNodeStyleSetMarginAutoJNI jni_ygnodestylesetmarginautojniOnWarmupCompleted = onWarmupCompleted();
        jni_YGNodeStyleSetFlexBasisPercentJNI jni_ygnodestylesetflexbasispercentjniIAuthTabCallback = IAuthTabCallback();
        removeAllViewsInLayout removeallviewsinlayoutOnNavigationEvent = this.onExtraCallbackWithResult.asInterface().onExtraCallback();
        removeallviewsinlayoutOnNavigationEvent.IAuthTabCallback_Parcel(Integer.valueOf(((Number) jw11.onWarmupCompleted(removeallviewsinlayoutOnNavigationEvent.onActivityLayout(), "year")).intValue() % 10000));
        try {
            Intrinsics.checkNotNull(onExtraCallbackWithResult());
            long jOnWarmupCompleted = jw12.onWarmupCompleted(jw12.onNavigationEvent(r3.intValue() / 10000, 315569520000L), ((removeallviewsinlayoutOnNavigationEvent.IAuthTabCallbackStub().asBinder() * 86400) + jni_ygnodestylesetflexbasispercentjniIAuthTabCallback.IAuthTabCallbackStub()) - jni_ygnodestylesetmarginautojniOnWarmupCompleted.onWarmupCompleted());
            setRevisionBytes.onExtraCallback onextracallback = setRevisionBytes.Companion;
            Integer numOnExtraCallback = onExtraCallback();
            setRevisionBytes setrevisionbytesIAuthTabCallback = onextracallback.IAuthTabCallback(jOnWarmupCompleted, numOnExtraCallback != null ? numOnExtraCallback.intValue() : 0);
            if (setrevisionbytesIAuthTabCallback.onExtraCallback() == jOnWarmupCompleted) {
                return setrevisionbytesIAuthTabCallback;
            }
            throw new jni_YGNodeStyleGetMaxHeightJNI("The parsed date is outside the range representable by Instant");
        } catch (ArithmeticException e) {
            throw new jni_YGNodeStyleGetMaxHeightJNI("The parsed date is outside the range representable by Instant", e);
        }
    }
}
