package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI onWarmupCompleted = new r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI();

    public interface onNavigationEvent {
        Function1<String, Number> IAuthTabCallback();

        Function1<Number, String> onExtraCallbackWithResult();
    }

    static {
        int i = IAuthTabCallback + 85;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult Auto = new onExtraCallbackWithResult("Auto", 0);
        public static final onExtraCallbackWithResult Up = new onExtraCallbackWithResult("Up", 1);
        public static final onExtraCallbackWithResult Down = new onExtraCallbackWithResult("Down", 2);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {Auto, Up, Down};
            int i5 = i2 + 5;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onExtraCallback + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 27;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    public interface onExtraCallback {
        int onExtraCallback();

        onItemClicked<Float> onExtraCallback(int i);

        onItemClicked<Float> onExtraCallback(int i, int i2);

        int onExtraCallbackWithResult();

        onItemClicked<Float> onExtraCallbackWithResult(int i);

        int onNavigationEvent();

        onItemClicked<Float> onNavigationEvent(int i);

        onItemClicked<Float> onNavigationEvent(int i, int i2);

        int onWarmupCompleted();

        onItemClicked<Float> onWarmupCompleted(int i);

        public static abstract class onNavigationEvent implements onExtraCallback {
            private static int IAuthTabCallbackStub = 0;
            private static int asInterface = 1;
            private final int IAuthTabCallback;
            private final int onExtraCallback;
            private final int onExtraCallbackWithResult;
            private final int onNavigationEvent;
            private final int onWarmupCompleted;

            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onNavigationEvent() {
                this.onExtraCallback = 35;
                this.onWarmupCompleted = 10;
                this.onNavigationEvent = 20;
                this.onExtraCallbackWithResult = 10;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 121;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.IAuthTabCallback;
                int i6 = i2 + 83;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 25;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onExtraCallback;
                int i6 = i2 + 89;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    return i5;
                }
                throw null;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 91;
                asInterface = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = this.onWarmupCompleted;
                int i5 = i2 + 77;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    return i4;
                }
                obj.hashCode();
                throw null;
            }

            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface + 53;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.onNavigationEvent;
                }
                throw null;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 15;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onExtraCallbackWithResult;
                int i6 = i2 + 29;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    return i5;
                }
                throw null;
            }

            public static final class onExtraCallbackWithResult extends onNavigationEvent {
                private static int IAuthTabCallback = 0;
                public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                static {
                    int i = onWarmupCompleted + 27;
                    onNavigationEvent = i % 128;
                    int i2 = i % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 81;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    if (this == obj) {
                        return true;
                    }
                    if (!(!(obj instanceof onExtraCallbackWithResult))) {
                        int i5 = i2 + 29;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        return true;
                    }
                    int i7 = i2 + 77;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 13;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 98 / 0;
                    }
                    int i5 = i2 + 23;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return 1307087144;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 107;
                    int i3 = i2 % 128;
                    IAuthTabCallback = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i4 = i3 + 25;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return "Normal";
                }

                private onExtraCallbackWithResult() {
                    super(null);
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onWarmupCompleted(), i);
                    int i5 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return getthumbpositionOnExtraCallbackWithResult;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onWarmupCompleted(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 87;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), i);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), i);
                    int i4 = onExtraCallbackWithResult + 43;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 38 / 0;
                    }
                    return getthumbpositionOnExtraCallbackWithResult;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onTransact(), i);
                    int i5 = onExtraCallbackWithResult + 73;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return getthumbpositionOnExtraCallbackWithResult;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onExtraCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 49;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.asBinder(), i);
                    int i5 = onExtraCallbackWithResult + 111;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return getthumbpositionOnExtraCallbackWithResult;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onNavigationEvent(int i, int i2) {
                    getMediaContentViewGroup getmediacontentviewgroupOnExtraCallback;
                    int i3;
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int iIAuthTabCallback = IAuthTabCallback();
                        getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                        i3 = (i >>> iIAuthTabCallback) - 3330;
                    } else {
                        int iIAuthTabCallback2 = IAuthTabCallback();
                        getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                        i3 = (i * iIAuthTabCallback2) + 500;
                    }
                    return onQueryRefine.onExtraCallback(i3, i2, getmediacontentviewgroupOnExtraCallback);
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onExtraCallback(int i, int i2) {
                    getMediaContentViewGroup getmediacontentviewgroupOnExtraCallback;
                    int i3;
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 51;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
                        getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                        i3 = (i >> iOnExtraCallbackWithResult) << 25106;
                    } else {
                        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
                        getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                        i3 = (i * iOnExtraCallbackWithResult2) + 400;
                    }
                    return onQueryRefine.onExtraCallback(i3, i2, getmediacontentviewgroupOnExtraCallback);
                }
            }
        }

        /* renamed from: o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static abstract class AbstractC0060onExtraCallback implements onExtraCallback {
            private static int asInterface = 1;
            private static int onTransact;
            private final int IAuthTabCallback;
            private final int onExtraCallback;
            private final int onExtraCallbackWithResult;
            private final int onNavigationEvent;
            private final int onWarmupCompleted;

            public /* synthetic */ AbstractC0060onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0060onExtraCallback() {
                this.onExtraCallback = 1;
                this.onWarmupCompleted = 40;
                this.onExtraCallbackWithResult = 30;
                this.onNavigationEvent = 50;
                this.IAuthTabCallback = 60;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public /* synthetic */ onItemClicked onExtraCallback(int i, int i2) {
                int i3 = 2 % 2;
                int i4 = onTransact + 39;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    IAuthTabCallback(i, i2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getThumbPosition<Float> getthumbpositionIAuthTabCallback = IAuthTabCallback(i, i2);
                int i5 = asInterface + 31;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return getthumbpositionIAuthTabCallback;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 9;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onExtraCallback;
                int i6 = i2 + 21;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface + 89;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                int i5 = this.onWarmupCompleted;
                int i6 = i3 + 27;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    return i5;
                }
                throw null;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onTransact + 17;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.onExtraCallbackWithResult;
                if (i3 == 0) {
                    int i5 = 48 / 0;
                }
                return i4;
            }

            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 55;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.onNavigationEvent;
                int i6 = i2 + 63;
                onTransact = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 17 / 0;
                }
                return i5;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 63;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.IAuthTabCallback;
                int i6 = i2 + 1;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public onItemClicked<Float> onNavigationEvent(int i, int i2) {
                getMediaContentViewGroup getmediacontentviewgroupOnExtraCallback;
                int i3;
                int i4 = 2 % 2;
                int i5 = onTransact + 123;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    int iIAuthTabCallback = IAuthTabCallback();
                    getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                    i3 = (i << iIAuthTabCallback) << 22877;
                } else {
                    int iIAuthTabCallback2 = IAuthTabCallback();
                    getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                    i3 = (i * iIAuthTabCallback2) + 600;
                }
                getThumbPosition getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback(i3, i2, getmediacontentviewgroupOnExtraCallback);
                int i6 = asInterface + 87;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return getthumbpositionOnExtraCallback;
            }

            public getThumbPosition<Float> IAuthTabCallback(int i, int i2) {
                int i3 = 2 % 2;
                int i4 = onTransact + 27;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                getThumbPosition<Float> getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback((i * onExtraCallbackWithResult()) + 550, i2, getCallToActionButton.onExtraCallback.onExtraCallback());
                int i6 = onTransact + 111;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return getthumbpositionOnExtraCallback;
            }

            /* renamed from: o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI$onExtraCallback$onExtraCallback$onExtraCallbackWithResult */
            public static final class onExtraCallbackWithResult extends AbstractC0060onExtraCallback {
                private static int IAuthTabCallback = 1;
                public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                static {
                    int i = onNavigationEvent + 79;
                    IAuthTabCallback = i % 128;
                    int i2 = i % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 91;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    int i4 = i2 % 2;
                    if (this != obj) {
                        return !((obj instanceof onExtraCallbackWithResult) ^ true);
                    }
                    int i5 = i3 + 49;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 15;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 9;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return -32405561;
                    }
                    throw null;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 3;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = i2 + 41;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return "Normal";
                }

                private onExtraCallbackWithResult() {
                    super(null);
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.IAuthTabCallback(), i);
                    int i5 = onWarmupCompleted + 59;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return getthumbpositionOnExtraCallbackWithResult;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onWarmupCompleted(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 125;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onTransact(), i);
                    int i5 = onExtraCallbackWithResult + 97;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return getthumbpositionOnExtraCallbackWithResult;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.IAuthTabCallback(), i);
                    int i5 = onWarmupCompleted + 19;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return getthumbpositionOnExtraCallbackWithResult;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onExtraCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 67;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onTransact(), i);
                    int i5 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return getthumbpositionOnExtraCallbackWithResult;
                }
            }

            /* renamed from: o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI$onExtraCallback$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
            public static final class C0061onExtraCallback extends AbstractC0060onExtraCallback {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 0;
                public static final C0061onExtraCallback onNavigationEvent = new C0061onExtraCallback();
                private static int onWarmupCompleted = 1;

                static {
                    int i = IAuthTabCallback + 9;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 51 / 0;
                    }
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 75;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    if (i2 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (this == obj) {
                        int i4 = i3 + 55;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return true;
                    }
                    if (!(obj instanceof C0061onExtraCallback)) {
                        return false;
                    }
                    int i6 = i3 + 75;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 89;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = i2 + 65;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return -375864984;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 21;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    if (i2 % 2 == 0) {
                        int i4 = 34 / 0;
                    }
                    int i5 = i3 + 57;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return "Bounce";
                }

                private C0061onExtraCallback() {
                    super(null);
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(new getStarRatingContentViewGroup(180.0d, 22.0d), i);
                    int i3 = onWarmupCompleted + 45;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getthumbpositionOnExtraCallbackWithResult;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onWarmupCompleted(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 53;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    getStarRatingContentViewGroup getstarratingcontentviewgroupOnTransact = getIconContentView.onWarmupCompleted.onTransact();
                    if (i4 != 0) {
                        return getSplitTrack.onExtraCallbackWithResult(getstarratingcontentviewgroupOnTransact, i);
                    }
                    getSplitTrack.onExtraCallbackWithResult(getstarratingcontentviewgroupOnTransact, i);
                    throw null;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 85;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.IAuthTabCallback(), i);
                    int i5 = onExtraCallback + 43;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return getthumbpositionOnExtraCallbackWithResult;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
                public onItemClicked<Float> onExtraCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 15;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onTransact(), i);
                        throw null;
                    }
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallbackWithResult(getIconContentView.onWarmupCompleted.onTransact(), i);
                    int i4 = onWarmupCompleted + 89;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return getthumbpositionOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }
        }

        public static final class onWarmupCompleted implements onExtraCallback {
            private static int IAuthTabCallbackDefault = 0;
            private static int onTransact = 1;
            private final int IAuthTabCallback;
            private final int onNavigationEvent = 50;
            private final int onExtraCallbackWithResult = 40;
            private final int onExtraCallback = 80;
            private final int onWarmupCompleted = 20;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this != obj) {
                    return (obj instanceof onWarmupCompleted) && this.IAuthTabCallback == ((onWarmupCompleted) obj).IAuthTabCallback;
                }
                int i2 = onTransact + 123;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 7;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 91;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.IAuthTabCallback;
                if (i3 != 0) {
                    return Integer.hashCode(i4);
                }
                Integer.hashCode(i4);
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Custom(loopCount=" + this.IAuthTabCallback + ")";
                int i2 = IAuthTabCallbackDefault + 11;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public onWarmupCompleted(int i) {
                this.IAuthTabCallback = i;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onExtraCallback() {
                int i;
                int i2 = 2 % 2;
                int i3 = onTransact;
                int i4 = i3 + 65;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    i = this.IAuthTabCallback;
                    int i5 = 78 / 0;
                } else {
                    i = this.IAuthTabCallback;
                }
                int i6 = i3 + 53;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                return i;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onTransact + 115;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = this.onNavigationEvent;
                int i5 = i3 + 5;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onTransact + 1;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                int i4 = this.onExtraCallbackWithResult;
                if (i3 != 0) {
                    int i5 = 94 / 0;
                }
                return i4;
            }

            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onTransact + 37;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = this.onExtraCallback;
                int i5 = i3 + 3;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 49;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public onItemClicked<Float> onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackDefault + 59;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallback = onExtraCallback();
                return onQueryRefine.onExtraCallback(i4 == 0 ? iOnExtraCallback - 29240 : iOnExtraCallback * 600, i, getCallToActionButton.onExtraCallback.onExtraCallback());
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public onItemClicked<Float> onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackDefault + 25;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                getThumbPosition getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback(600, i, getCallToActionButton.onExtraCallback.onExtraCallback());
                int i5 = IAuthTabCallbackDefault + 3;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    return getthumbpositionOnExtraCallback;
                }
                throw null;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public onItemClicked<Float> onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackDefault + 7;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return onQueryRefine.onExtraCallback(i4 == 0 ? 24045 : 600, i, getCallToActionButton.onExtraCallback.onExtraCallback());
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public onItemClicked<Float> onExtraCallback(int i) {
                getMediaContentViewGroup getmediacontentviewgroupOnExtraCallback;
                int i2;
                int i3 = 2 % 2;
                int i4 = onTransact + 105;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                    i2 = 28799;
                } else {
                    getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                    i2 = 200;
                }
                getThumbPosition getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback(i2, i, getmediacontentviewgroupOnExtraCallback);
                int i5 = onTransact + 123;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return getthumbpositionOnExtraCallback;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public onItemClicked<Float> onNavigationEvent(int i, int i2) {
                int i3 = 2 % 2;
                int i4 = onTransact + 123;
                IAuthTabCallbackDefault = i4 % 128;
                Object obj = null;
                getThumbPosition getthumbpositionOnExtraCallbackWithResult = i4 % 2 != 0 ? onQueryRefine.onExtraCallbackWithResult(((onExtraCallback() / IAuthTabCallback()) % 28488) % (i + 52), 0, getCallToActionButton.onExtraCallback.onExtraCallback(), 5, (Object) null) : onQueryRefine.onExtraCallbackWithResult((onExtraCallback() * IAuthTabCallback()) + 900 + (i * 40), 0, getCallToActionButton.onExtraCallback.onExtraCallback(), 2, (Object) null);
                int i5 = IAuthTabCallbackDefault + 101;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    return getthumbpositionOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback
            public onItemClicked<Float> onExtraCallback(int i, int i2) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallbackDefault + 45;
                onTransact = i4 % 128;
                getThumbPosition getthumbpositionOnExtraCallbackWithResult = i4 % 2 == 0 ? onQueryRefine.onExtraCallbackWithResult(((onExtraCallback() >>> onExtraCallbackWithResult()) << 5775) << (i + 92), 0, getCallToActionButton.onExtraCallback.onExtraCallback(), 3, (Object) null) : onQueryRefine.onExtraCallbackWithResult((onExtraCallback() * onExtraCallbackWithResult()) + 700 + (i * 100), 0, getCallToActionButton.onExtraCallback.onExtraCallback(), 2, (Object) null);
                int i5 = IAuthTabCallbackDefault + 69;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return getthumbpositionOnExtraCallbackWithResult;
            }
        }
    }
}
