package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getSegmentCollection {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onNavigationEvent;

    public interface IAuthTabCallback {
    }

    public interface onNavigationEvent {
        getSegmentCollection AppCompatDialog();
    }

    JsonReaderUnknownNumberParsing<onExtraCallback> IAuthTabCallback(boolean z);

    void onEvent(@NotNull onWarmupCompleted onwarmupcompleted);

    onExtraCallback onExtraCallbackWithResult();

    boolean onWarmupCompleted();

    public static abstract class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onExtraCallbackWithResult extends onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

            static {
                int i = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 19 / 0;
                }
            }

            private onExtraCallbackWithResult() {
                super(null);
            }
        }

        private onExtraCallback() {
        }

        public static final class IAuthTabCallbackStub extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            public static final IAuthTabCallbackStub onWarmupCompleted = new IAuthTabCallbackStub();

            static {
                int i = onNavigationEvent + 29;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private IAuthTabCallbackStub() {
                super(null);
            }
        }

        public static final class onNavigationEvent extends onExtraCallback implements IAuthTabCallback {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final onWarmupCompleted onExtraCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 91;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i4 + 3;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
                if (obj instanceof onNavigationEvent) {
                    return Intrinsics.areEqual(this.onExtraCallback, ((onNavigationEvent) obj).onExtraCallback);
                }
                int i8 = i2 + 51;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 31;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    iHashCode = this.onExtraCallback.hashCode();
                    int i3 = 48 / 0;
                } else {
                    iHashCode = this.onExtraCallback.hashCode();
                }
                int i4 = onWarmupCompleted + 79;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            @Override // o.getSegmentCollection.onExtraCallback
            public String toString() {
                int i = 2 % 2;
                String str = "Blocked(reason=" + this.onExtraCallback + ")";
                int i2 = onNavigationEvent + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(@NotNull onWarmupCompleted onwarmupcompleted) {
                super(null);
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                this.onExtraCallback = onwarmupcompleted;
            }

            public final onWarmupCompleted IAuthTabCallback() {
                onWarmupCompleted onwarmupcompleted;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 81;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 != 0) {
                    onwarmupcompleted = this.onExtraCallback;
                    int i4 = 40 / 0;
                } else {
                    onwarmupcompleted = this.onExtraCallback;
                }
                int i5 = i3 + 67;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onwarmupcompleted;
            }
        }

        public static final class asInterface extends onExtraCallback implements IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            public static final asInterface onNavigationEvent = new asInterface();
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 83;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            private asInterface() {
                super(null);
            }
        }

        public static final class onWarmupCompleted extends onExtraCallback implements IAuthTabCallback {
            public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            static {
                int i = onNavigationEvent + 93;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            private onWarmupCompleted() {
                super(null);
            }
        }

        public static final class asBinder extends onExtraCallback implements IAuthTabCallback {
            private static int onExtraCallbackWithResult = 1;
            public static final asBinder onNavigationEvent = new asBinder();
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            private asBinder() {
                super(null);
            }
        }

        public static final class IAuthTabCallback extends onExtraCallback implements IAuthTabCallback {
            private static int onExtraCallback = 1;
            public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
            private static int onNavigationEvent;

            static {
                int i = onNavigationEvent + 65;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private IAuthTabCallback() {
                super(null);
            }
        }

        public static final class IAuthTabCallbackDefault extends onExtraCallback implements IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final IAuthTabCallbackDefault onWarmupCompleted = new IAuthTabCallbackDefault();

            static {
                int i = onExtraCallback + 105;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            private IAuthTabCallbackDefault() {
                super(null);
            }
        }

        /* renamed from: o.getSegmentCollection$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0025onExtraCallback extends onExtraCallback implements IAuthTabCallback {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final C0025onExtraCallback onWarmupCompleted = new C0025onExtraCallback();

            static {
                int i = onExtraCallbackWithResult + 121;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private C0025onExtraCallback() {
                super(null);
            }
        }

        public static final class onTransact extends onExtraCallback implements IAuthTabCallback {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private final onWarmupCompleted onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onTransact)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onWarmupCompleted, ((onTransact) obj).onWarmupCompleted)) {
                    return true;
                }
                int i3 = onExtraCallback + 113;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    iHashCode = this.onWarmupCompleted.hashCode();
                    int i3 = 52 / 0;
                } else {
                    iHashCode = this.onWarmupCompleted.hashCode();
                }
                int i4 = onNavigationEvent + 11;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            @Override // o.getSegmentCollection.onExtraCallback
            public String toString() {
                int i = 2 % 2;
                String str = "InvalidAndroidId(reason=" + this.onWarmupCompleted + ")";
                int i2 = onExtraCallback + 23;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onTransact(@NotNull onWarmupCompleted onwarmupcompleted) {
                super(null);
                Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
                this.onWarmupCompleted = onwarmupcompleted;
            }

            public final onWarmupCompleted IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 73;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
                int i5 = i2 + 63;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onwarmupcompleted;
            }
        }

        public String toString() {
            String simpleName;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                int i3 = 38 / 0;
            } else {
                simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
            }
            int i4 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return simpleName;
        }
    }

    public static abstract class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class asInterface extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            public static final asInterface onWarmupCompleted = new asInterface();

            static {
                int i = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            private asInterface() {
                super(null);
            }
        }

        private onWarmupCompleted() {
        }

        public static final class onTransact extends onWarmupCompleted {
            public static final onTransact onExtraCallback = new onTransact();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            static {
                int i = onNavigationEvent + 37;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 18 / 0;
                }
            }

            private onTransact() {
                super(null);
            }
        }

        public static final class asBinder extends onWarmupCompleted {
            private static int onExtraCallback = 0;
            public static final asBinder onExtraCallbackWithResult = new asBinder();
            private static int onNavigationEvent = 1;

            static {
                int i = onExtraCallback + 11;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            private asBinder() {
                super(null);
            }
        }

        /* renamed from: o.getSegmentCollection$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0026onWarmupCompleted extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            public static final C0026onWarmupCompleted onExtraCallback = new C0026onWarmupCompleted();
            private static int onNavigationEvent;

            static {
                int i = IAuthTabCallback + 85;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            private C0026onWarmupCompleted() {
                super(null);
            }
        }

        public static final class onExtraCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
            private static int onWarmupCompleted = 1;

            static {
                int i = onWarmupCompleted + 5;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallback() {
                super(null);
            }
        }

        public static final class IAuthTabCallback extends onWarmupCompleted {
            public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 61;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 12 / 0;
                }
            }

            private IAuthTabCallback() {
                super(null);
            }
        }

        public static final class IAuthTabCallback_Parcel extends onWarmupCompleted {
            public static final IAuthTabCallback_Parcel IAuthTabCallback = new IAuthTabCallback_Parcel();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            static {
                int i = onNavigationEvent + 43;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallback_Parcel() {
                super(null);
            }
        }

        public static final class onExtraCallbackWithResult extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

            static {
                int i = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallbackWithResult() {
                super(null);
            }
        }

        public static final class access100 extends onWarmupCompleted {
            public static final access100 onExtraCallback = new access100();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 99;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 85 / 0;
                }
            }

            private access100() {
                super(null);
            }
        }

        public static final class IAuthTabCallbackStubProxy extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            public static final IAuthTabCallbackStubProxy onNavigationEvent = new IAuthTabCallbackStubProxy();
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 125;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallbackStubProxy() {
                super(null);
            }
        }

        public static final class getInterfaceDescriptor extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            public static final getInterfaceDescriptor onExtraCallbackWithResult = new getInterfaceDescriptor();
            private static int onWarmupCompleted = 1;

            static {
                int i = onWarmupCompleted + 87;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            private getInterfaceDescriptor() {
                super(null);
            }
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onNavigationEvent() {
                super(null);
            }
        }

        public static final class IAuthTabCallbackDefault extends onWarmupCompleted {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            public static final IAuthTabCallbackDefault onWarmupCompleted = new IAuthTabCallbackDefault();

            static {
                int i = onNavigationEvent + 93;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 65 / 0;
                }
            }

            private IAuthTabCallbackDefault() {
                super(null);
            }
        }

        public static final class IAuthTabCallbackStub extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            public static final IAuthTabCallbackStub onNavigationEvent = new IAuthTabCallbackStub();

            static {
                int i = IAuthTabCallback + 11;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private IAuthTabCallbackStub() {
                super(null);
            }
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            int i4 = onNavigationEvent + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return simpleName;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        static final /* synthetic */ onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 49;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallbackWithResult() {
        }

        public final getSegmentCollection onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            getSegmentCollection getsegmentcollectionAppCompatDialog = ((onNavigationEvent) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), onNavigationEvent.class)).AppCompatDialog();
            int i4 = onExtraCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getsegmentcollectionAppCompatDialog;
        }
    }
}
